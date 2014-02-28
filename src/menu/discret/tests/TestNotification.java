/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.tests;

import java.awt.Font;
import javax.swing.UIManager;
import menu.discret.components.VitipiNotificationMenu;

/**
 *
 * @author legranma
 */
public class TestNotification {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Font myFont = new Font("Segoe UI Semibold", Font.PLAIN, 12);
        UIManager.put("Label.font", myFont);
        UIManager.put("Menu.font", myFont);
        new VitipiNotificationMenu();
    }
}
