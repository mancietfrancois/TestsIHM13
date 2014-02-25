/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testnotification;

import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import testparamgen.MenuItemCustom;
import testparamgen.MenuItemCustomWithCheckbox;

/**
 *
 * @author legranma
 */
public class TestNotification {

    /**
     * @param args the command line arguments
     */
    public static CheckboxMenuItem barVisible;
    private static JPopupMenu popup;
    private static ActionListener actionListener;
    private static PopupPositionCalculator positionCalculator;

    public static void main(String[] args) {
        final TrayIcon trayIcon;
        JFrame.setDefaultLookAndFeelDecorated(true);
        positionCalculator = new PopupPositionCalculator();
        if (SystemTray.isSupported()) {

            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().getImage("./images/iconBarre.png");

            ActionListener exitListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            };
            popup = new JPopupMenu();

            for (int i = 0; i < 5; i++) {
                JMenuItem defaultItem = new JMenuItem("", null);
                MenuItemCustomWithCheckbox p = new MenuItemCustomWithCheckbox("Dictionnaire", new ImageIcon("./images/iconBarre.png"), Color.GREEN);
                defaultItem.setPreferredSize(p.getPreferredSize());
                defaultItem.add(p);
                defaultItem.addActionListener(exitListener);
                popup.add(defaultItem);
            }


            trayIcon = new TrayIcon(image, "VITIPI", null);

            trayIcon.addMouseListener(new MouseListener() {
                @Override
                public void mouseReleased(MouseEvent e) {
                    if (popup.isVisible()) {
                        popup.setVisible(false);
                        popup.setInvoker(null);
                    } else {
                        Point p = positionCalculator.setPopUpMenuLocation(e.getPoint(), popup.getPreferredSize());
                        popup.setLocation(p.x, p.y);
                        popup.setInvoker(popup);
                        popup.setVisible(true);
                    }
                }

                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                }

                @Override
                public void mouseExited(MouseEvent e) {
                }
            });
            trayIcon.setImageAutoSize(true);
            trayIcon.addActionListener(actionListener);
            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.err.println("TrayIcon could not be added.");
            }
        } else {
            //  System Tray is not supported
        }
    }
}
