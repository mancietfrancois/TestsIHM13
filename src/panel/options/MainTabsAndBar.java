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

    
     

    public static void main(String[] args)  {
        TestBar t = new TestBar();
        try {

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




       // TabsParam t2 = new TabsParam();
        t.setVisible(true);
    }
}
