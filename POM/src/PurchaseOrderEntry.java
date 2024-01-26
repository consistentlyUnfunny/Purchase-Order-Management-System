
package assignmentproject;

import java.io.IOException;


public class PurchaseOrderEntry extends Entry {
    private String poId;
    private String[] poDetails;
    private static final String[] COLNAMES = {"PO ID", "Item code", "Quantity", "Price/unit", "Total", "Date", "Supplier ID", "Raised by"};
    private static final String FILENAME = "purchaseorders.txt";
    
    public PurchaseOrderEntry(String[] details){
        poDetails = details;
        poId = details[0];
    }
    
    public PurchaseOrderEntry(String id){
        poId = id;
    }
    public PurchaseOrderEntry (){
        
    }
    
    String[] getColNames() {
        return COLNAMES;
    }

    void viewPo(){
        viewItems(FILENAME, COLNAMES);
    }
    
    boolean addPo(){
        return addItem(FILENAME, poDetails);
    }
    
    boolean delPo(){
        return delItem(FILENAME, poId);
    }
    
    boolean editPo() {
        return editItem(FILENAME, poDetails, poId);
    }
    
    boolean poExists(){
        return super.itemExists(FILENAME, poId);
    }
    

    String[] getDetails(){
        return getLine(FILENAME, poId);
    }
    
       
}
