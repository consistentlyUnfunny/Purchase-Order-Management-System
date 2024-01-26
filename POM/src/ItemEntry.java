
package assignmentproject;


public class ItemEntry extends Entry {
    private String code;
    private String[] itemDetails;
    private static final String[] COLNAMES = {"Item ID", "Name", "Category", "Price (RM)", "Stock", "Supplier ID"};
    private static final String FILENAME = "items.txt";
    
    public ItemEntry(String code){
        this.code = code;
    }
    
    public ItemEntry(String[] itemDetails){
        this.itemDetails = itemDetails;
    }
    
    public ItemEntry(){
    }
    

    void viewItems(){
        super.viewItems(FILENAME, COLNAMES);
    }
    
    boolean addItem(){
        if (!validSupplier()) return false;
        return super.addItem(FILENAME, itemDetails);
    }
    
    boolean delItem(){
        return super.delItem(FILENAME, code);
    }
    
    boolean editItem() {
        if (!validSupplier()) return false;
        return editItem(FILENAME, itemDetails, code);
    }
    
    String[] getDetails(){
        return getLine(FILENAME, code);
    }
    
    String[] getColNames(){
        return COLNAMES;
    }
    
    private boolean validSupplier(){
        String supplierId = itemDetails[5];
        SupplierEntry checkSupplier = new SupplierEntry(supplierId);
        return checkSupplier.supplierExists();
    }
    
    boolean itemExists(){
        return super.itemExists(FILENAME, code);
    }
    
    void manageStock(int quantity, boolean increment){
        itemDetails = getDetails();
        int stock = Integer.parseInt(itemDetails[4]);
        
        //deduct stock
        if (!increment) itemDetails[4] = Integer.toString(stock - quantity);
        else itemDetails[4] = Integer.toString(stock + quantity);
        editItem();
        
    }
    
}
