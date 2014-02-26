/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.components;

import utils.PopupPositionCalculator;
import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author legranma
 */
public class TestNotification {

    /**
     * @param args the command line arguments
     */
    private static JPopupMenu popup;
    private static PopupPositionCalculator positionCalculator;
    private static JDialog hiddenDialog;
    private static Dimension screenSize;

    public static void main(String[] args) {
        final TrayIcon trayIcon;
        JFrame.setDefaultLookAndFeelDecorated(true);
        positionCalculator = new PopupPositionCalculator();
        Toolkit tk = Toolkit.getDefaultToolkit();
        screenSize = tk.getScreenSize();

        if (SystemTray.isSupported()) {

            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().getImage("./images/menu_discret/iconBarre.png");

            hiddenDialog = new JDialog();
            hiddenDialog.setSize(1, 1);
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
                /*JMenuItem defaultItem = new JMenuItem("", null);
                final VitipiDiscretMenuItemWithCheckBox vitipiMenuItem =
                        new VitipiDiscretMenuItemWithCheckBox("Test",
                        new ImageIcon("./images/menu_discret/iconBarre.png"),
                        Color.yellow);
                defaultItem.setPreferredSize(vitipiMenuItem.getPreferredSize());
                defaultItem.add(vitipiMenuItem);
                defaultItem.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
                defaultItem.addChangeListener(new ChangeListener() {

                    @Override
                    public void stateChanged(ChangeEvent e) {
                        if (((JMenuItem) e.getSource()).isArmed()) {
                            vitipiMenuItem.setFocusOnPanel(true);
                        } else {
                            vitipiMenuItem.setFocusOnPanel(false);
                        }
                    }
                });*/
                //popup.add(defaultItem);
                popup.add(new VitipiDiscretMenuItem("Test",
                        new ImageIcon("./images/menu_discret/iconBarre.png"),
                        Color.yellow));
            }
            VitipiDiscretMenu menuTest = new VitipiDiscretMenu("Test", new ImageIcon("./images/menu_discret/iconBarre.png"), Color.yellow);
            
            menuTest.add(new VitipiDiscretMenu("Test1", new ImageIcon("./images/menu_discret/iconBarre.png"), Color.yellow));
            menuTest.add(new VitipiDiscretMenu("Test2", new ImageIcon("./images/menu_discret/iconBarre.png"), Color.yellow));
            popup.add(menuTest);
            
            trayIcon = new TrayIcon(image, "VITIPI", null);

            trayIcon.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseReleased(MouseEvent e) {
                    if (e.getButton() == MouseEvent.BUTTON1) {
                        Point p = positionCalculator.setPopUpMenuLocation(
                                e.getPoint(),
                                popup.getPreferredSize());
                        popup.setLocation(p.x, p.y);
                        popup.setInvoker(hiddenDialog);
                        hiddenDialog.setVisible(true);
                        popup.setVisible(true);
                    } else {
                        System.exit(0);
                    }
                }
            });
            trayIcon.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
                    Point p = positionCalculator.setPopUpMenuLocation(
                            new Point(screenSize.width, screenSize.height),
                            popup.getPreferredSize());
                    popup.setLocation(p.x, p.y);
                    popup.setInvoker(hiddenDialog);
                    hiddenDialog.setVisible(true);
                    popup.setVisible(true);
                }
            });
            trayIcon.setImageAutoSize(true);
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
