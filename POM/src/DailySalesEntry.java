
package assignmentproject;


public class DailySalesEntry extends Entry{
    private String salesId;
    private String[] salesDetails;
    private static final String[] COLNAMES = {"Sales ID", "Item code", "Quantity", "Sales"};
    private static final String FILENAME = "dailysales.txt";
    
    public DailySalesEntry(String[] details){
        salesDetails = details;
        salesId = details[0];
    }
    
    public DailySalesEntry(String code){
        salesId = code;
    }
    public DailySalesEntry(){
        
    }

    void viewDailySales(){
        viewItems(FILENAME, COLNAMES);
    }
    
    boolean addDailySales(){
        return addItem(FILENAME, salesDetails);
    }
    
    boolean delDailySales(){
        String[] salesEntryDetails = getDetails();

        if (salesEntryDetails == null) {
            // Handle the case when the daily sales entry doesn't exist
            return false;
        }
        // Extract the item code and quantity sold from the daily sales entry details
        String itemCode = salesEntryDetails[1]; 
        int quantity = Integer.parseInt(salesEntryDetails[2]); 

        // Update the stock count for the item
        ItemEntry itemEntry = new ItemEntry(itemCode);
        itemEntry.manageStock(quantity, true); // Increment stock count by the quantity sold

        //delete the daily sales entry
        return delItem(FILENAME, salesId);
    }
    
    boolean editDailySales() {
        // Get the previous details of the daily sales entry
        String[] previousDetails = getDetails();

        // Extract the previous quantity sold from the daily sales entry details
        int previousQuantity = Integer.parseInt(previousDetails[2]);
        int newQuantity = Integer.parseInt(salesDetails[2]);
        int difference = previousQuantity - newQuantity;

        // Update the stock count for the item by adding back the previous quantity sold
        ItemEntry itemEntry = new ItemEntry(previousDetails[1]);
        itemEntry.manageStock(difference, true);

        // Now, update the daily sales entry itself
        return editItem(FILENAME, salesDetails, salesId);
    }
    
    String[] getDetails(){
        return getLine(FILENAME, salesId);
    }
    
    String[] getColNames(){
        return COLNAMES;
    }
    
    String[] getItemDetail(){
        return new ItemEntry(salesDetails[1]).getDetails();
    }
    
    boolean validItem(){
        String itemId = salesDetails[1];
        ItemEntry checkItem = new ItemEntry(itemId);
        return checkItem.itemExists();
    }
    
    boolean validQuantity() {
        String itemCode = salesDetails[1];
        String quantityStr = salesDetails[2];

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
