
package assignmentproject;


public class UserEntry extends Entry {
    private String id;
    private String[] userDetails;
    private static final String[] COLNAMES = {"User ID", "Password", "Role", "Username"};
    private static final String FILENAME = "login.txt";
    
    public UserEntry(String id){
        this.id = id;
    }
    
    public UserEntry(String[] userDetails){
        this.userDetails = userDetails;
    }    
    public UserEntry(){
    }
    

    void viewUsers(){
        super.viewItems(FILENAME, COLNAMES);
    }
    
    boolean addUser(){
        return super.addItem(FILENAME, userDetails);
    }
    
    boolean delUser(){
        return super.delItem(FILENAME, id);
    }
    
    boolean editUser() {
        return editItem(FILENAME, userDetails, id);
    }
    
    String[] getDetails(){
        return getLine(FILENAME, id);
    }
    
    String[] getColNames(){
        return COLNAMES;
    }
    
}
