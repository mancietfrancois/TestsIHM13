/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testnotification;

import java.awt.AWTException;
import java.awt.CheckboxMenuItem;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Insets;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static testnotification.TestNotification.barVisible;
import static testnotification.TestNotification.frame;
import static testnotification.TestNotification.popup;
import static testnotification.TestNotification.removeMinMaxClose;

/**
 *
 * @author legranma
 */
public class TestNotification {

    /**
     * @param args the command line arguments
     */
    public static CheckboxMenuItem barVisible;
    public static PopupMenu popup;
    public static JFrame frame;
    private static ActionListener actionListener;

    public static void main(String[] args) {
        final TrayIcon trayIcon;

        GraphicsConfiguration gconf;
        gconf = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Insets insetsToolbar = toolkit.getScreenInsets(gconf);

        int heightScreen = toolkit.getScreenSize().height;
        int widthScreen = toolkit.getScreenSize().width;

        int yPopup = heightScreen - insetsToolbar.bottom - 500 - 8;
        int xPopup = widthScreen - 500 - 8;

        System.out.println();

        frame = new JFrame("");
        frame.setSize(500, 500);
        frame.setLocation(xPopup, yPopup);
        frame.setResizable(true);
        JPanel borderedPanel = new JPanel();
        removeMinMaxClose(frame);
        frame.setVisible(false);
        
        if (SystemTray.isSupported()) {

            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().getImage("U:\\cadis.gif");

            MouseListener mouseListener = new MouseListener() {
                public void mouseClicked(MouseEvent e) {
                    if (e.getButton() == MouseEvent.BUTTON1) {
                        frame.setVisible(true);
                        //popup.show(frame, e.getXOnScreen(), e.getYOnScreen());
                    }
                    System.out.println("Tray Icon - Mouse clicked!");
                }

                public void mouseEntered(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse entered!");
                }

                public void mouseExited(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse exited!");
                }

                public void mousePressed(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse pressed!");
                }

                public void mouseReleased(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse released!");
                }
            };

            ActionListener exitListener = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Exiting...");
                    System.exit(0);
                }
            };

            ItemListener changeStateBarListener = new ItemListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("fdtyh");
                    System.out.println(barVisible.getState());

                }

                @Override
                public void itemStateChanged(ItemEvent e) {
                    System.out.println("fdtyh");
                    System.out.println(barVisible.getState());
                }
            };

            popup = new PopupMenu();
            MenuItem defaultItem = new MenuItem("Exit");
            defaultItem.addActionListener(exitListener);
            popup.add(defaultItem);

            barVisible = new CheckboxMenuItem("Afficher Barre");
            barVisible.addItemListener((ItemListener) changeStateBarListener);
            popup.add(barVisible);

            trayIcon = new TrayIcon(image, "Tray Demo", popup);

            ActionListener actionItemListener = new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    trayIcon.displayMessage("Action Event",
                            "An Action Event Has Been Performed!",
                            TrayIcon.MessageType.INFO);
                }
            };

            trayIcon.setImageAutoSize(true);
            trayIcon.addActionListener(actionListener);
            trayIcon.addMouseListener(mouseListener);

            try {
                tray.add(trayIcon);
            } catch (AWTException e) {
                System.err.println("TrayIcon could not be added.");
            }

        } else {
            //  System Tray is not supported
        }
    }

    // Ca à pas l'air de fonctionner
    public static void removeMinMaxClose(Component comp) {
        if (comp instanceof JButton) {
            String accName = ((JButton) comp).getAccessibleContext().getAccessibleName();
            System.out.println(accName);
            if (accName.equals("Maximize") || accName.equals("Iconify")
                    || accName.equals("Close")) {
                comp.getParent().remove(comp);
            }
        }
        if (comp instanceof Container) {
            Component[] comps = ((Container) comp).getComponents();
            for (int x = 0, y = comps.length; x < y; x++) {
                removeMinMaxClose(comps[x]);
            }
        }
    }
}
