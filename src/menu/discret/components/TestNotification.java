/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.components;

import utils.PopupPositionCalculator;
import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.*;
import javax.swing.*;

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
    private static JDialog hiddenDialog;

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
                    popup.setVisible(false);
                }
            };
            hiddenDialog = new JDialog();
            hiddenDialog.setSize(10, 10);
            hiddenDialog.setUndecorated(true);
            hiddenDialog.addWindowFocusListener(new WindowFocusListener() {

                @Override
                public void windowGainedFocus(WindowEvent we) {
                }

                @Override
                public void windowLostFocus(WindowEvent we) {
                    hiddenDialog.setVisible(false);
                }
            });

            popup = new JPopupMenu();
            popup.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

            for (int i = 0; i < 5; i++) {
                JMenuItem defaultItem = new JMenuItem("", null);
                MenuItemCustomWithCheckbox p = new MenuItemCustomWithCheckbox("Dictionnaire",
                        new ImageIcon("./images/iconBarre.png"), Color.GREEN);
                p.addActionListener(exitListener);
                defaultItem.setPreferredSize(p.getPreferredSize());
                defaultItem.add(p);
                defaultItem.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                defaultItem.addActionListener(exitListener);
                popup.add(defaultItem);
            }

            trayIcon = new TrayIcon(image, "VITIPI", null);

            trayIcon.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseReleased(MouseEvent e) {
                    Point p = positionCalculator.setPopUpMenuLocation(e.getPoint(), popup.getPreferredSize());
                    popup.setLocation(p.x, p.y);
                    popup.setInvoker(hiddenDialog);
                    hiddenDialog.setVisible(true);
                    popup.setVisible(true);
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
