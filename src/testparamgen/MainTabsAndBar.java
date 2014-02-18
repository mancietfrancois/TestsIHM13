/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testparamgen;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.UnsupportedLookAndFeelException;
import static java.awt.GraphicsDevice.WindowTranslucency.*;

/**
 *
 * @author legranma
 */
public class MainTabsAndBar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {

        JFrame.setDefaultLookAndFeelDecorated(true);
        TestBar t = new TestBar();
        
        try {
            // Set System L&F
            UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
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


        
        TabsParam t2 = new TabsParam();
        t.setVisible(true);
    }
}
