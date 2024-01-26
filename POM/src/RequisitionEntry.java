
package assignmentproject;

public class RequisitionEntry extends Entry{
    private String reqId;
    private String[] reqDetails;
    private static final String[] COLNAMES = {"Requisition ID", "Item ID", "Quantity", "Price/unit", "Total", "Date", "Supplier ID", "Raised by"};
    private static final String FILENAME = "requisitions.txt";
    
    public RequisitionEntry(String[] details){
        reqDetails = details;
        reqId = details[0];
    }
    
    public RequisitionEntry(String id){
        reqId = id;
    }
    public RequisitionEntry (){
        
    }

    void viewRequsition(){
        viewItems(FILENAME, COLNAMES);
    }
    
    boolean addRequisition(){
        return addItem(FILENAME, reqDetails);
    }
    
    boolean delRequsition(){
        String[] requisitionDetails = getDetails();
        
        if (requisitionDetails == null){
            return false;
        }
        String itemCode = requisitionDetails[1];
        int quantity = Integer.parseInt(requisitionDetails[2]);
        
        ItemEntry itemEntry = new ItemEntry(itemCode);
        itemEntry.manageStock(quantity, true);
        return delItem(FILENAME, reqId);
    }
    
    
    boolean editRequisition() {
        String[] previousDetails = getDetails();
        int previousQuantity = Integer.parseInt(previousDetails[2]);
        int newQuantity = Integer.parseInt(reqDetails[2]);
        int difference = previousQuantity - newQuantity; 
        
        ItemEntry itemEntry = new ItemEntry(previousDetails[1]);
        itemEntry.manageStock(difference, true);
        
        return editItem(FILENAME, reqDetails, reqId);
    }
    
    String[] getDetails(){
        return getLine(FILENAME, reqId);
    }
        
    String[] getColNames(){
        return COLNAMES;
    }
    
    boolean validItem(){
        String itemId = reqDetails[1];
        ItemEntry checkItem = new ItemEntry(itemId);
        return checkItem.itemExists();
    }
    
    String[] getItemDetail(){
        return new ItemEntry(reqDetails[1]).getDetails();
    }
    
    boolean validQuantity() {
        String itemCode = reqDetails[1];
        String quantityStr = reqDetails[2];

        // Fetch the stock quantity from the ItemEntry class
        ItemEntry itemEntry = new ItemEntry(itemCode);
        String[] itemDetails = itemEntry.getDetails();

        if (itemDetails == null) {
            // Handle the case when item details are not available
            return false;
        }

        try {
            int requestedQuantity = Integer.parseInt(quantityStr);
            int stock = Integer.parseInt(itemDetails[4]); // Assuming stock is at index 4 in the item details array
            return stock >= requestedQuantity;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
