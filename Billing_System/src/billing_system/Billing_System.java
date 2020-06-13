
package billing_system;

import billing_system.applicationUIs.App;
import java.sql.SQLException;
import javax.swing.JFrame;

/**
 *
 * @author ASHAN
 */
public class Billing_System {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
//            MainFrame mf = new MainFrame();
//            mf.setVisible(true);
//            mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            //Ashan nanayakkara
            
            App a = new App();
            a.setVisible(true);
            a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
