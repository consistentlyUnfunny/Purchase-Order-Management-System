
package assignmentproject;


public final class CurrentUser {
    private String username;
    private String role;
    private String uid;


    public CurrentUser(String username, String role, String uid){
        setUsername(username);
        setRole(role);
        setUid(uid);
    }
     void setUid(String uid) {
        this.uid = uid;
    }
    
    void setUsername(String username){
        this.username = username;
    }
    
    void setRole(String role){
        this.role = role;
    }
    
    public String getUsername() {
        return username;
    }

    public String getRole() {
        return role;
    }
    
    public String getUid() {
        return uid;
    }
}

