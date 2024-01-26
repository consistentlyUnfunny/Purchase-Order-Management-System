
package assignmentproject;


public class SupplierEntry extends Entry{
    private String code;
    private String[] supplierDetails;
    private static final String[] COLNAMES = {"Supplier ID", "Name", "Contact No.", "Location"};
    private static final String FILENAME = "suppliers.txt";
    
    public SupplierEntry(String code){
        this.code = code;
    }
    
    public SupplierEntry(String[] details){
        supplierDetails = details;
    }
    
    public SupplierEntry(){
        
    }

    void viewSuppliers(){
        super.viewItems(FILENAME, COLNAMES);
    }
    
    boolean addSupplier(){
        return super.addItem(FILENAME, supplierDetails);
    }
    
    boolean delSuppliers(){
        return super.delItem(FILENAME, code);
    }
    
    boolean editSupplier() {
        return editItem(FILENAME, supplierDetails, code);
    }
    
    String[] getDetails(){
        return getLine(FILENAME, code);
    }
    
    String[] getColNames(){
        return COLNAMES;
    }
    
    boolean supplierExists(){
        return itemExists(FILENAME, code);
    }
}
