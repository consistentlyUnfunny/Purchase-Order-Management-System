
package assignmentproject;

import javax.swing.JFrame;

public class LogoutHandler {

    public LogoutHandler(JFrame exitFrame) {
        exitFrame.dispose();
        Login loginPage = new Login();
        loginPage.setVisible(true);
    }

}
