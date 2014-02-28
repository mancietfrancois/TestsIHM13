/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options;

import java.awt.Color;
import java.awt.Font;
import menu.complet.TestBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author legranma
 */
public class MainTabsAndBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

    
        TestBar t = new TestBar();
<<<<<<< HEAD
        
        try {
            // Set System L&F
            /*UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());*/
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
             SwingUtilities.updateComponentTreeUI(t);  
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }

=======
    
>>>>>>> b72e597a0bd8c81e8d6801d49a06bb8933b620ba

         
        
      // TabsParam t2 = new TabsParam();
        t.setVisible(true);
    }
}
