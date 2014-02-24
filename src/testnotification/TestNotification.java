/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testnotification;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static testnotification.TestNotification.*;
import testparamgen.TestBar;

/**
 *
 * @author legranma
 */
public class TestNotification {

    /**
     * @param args the command line arguments
     */
    public static CheckboxMenuItem barVisible;
    public static JPopupMenu popup;
    public static TestBar t;
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

        JFrame.setDefaultLookAndFeelDecorated(true);
        t = new TestBar();
        t.setSize(500, 500);
        t.setLocation(xPopup, yPopup);
        t.setResizable(true);
        removeMinMaxClose(t);
        t.setVisible(false);

        if (SystemTray.isSupported()) {

            SystemTray tray = SystemTray.getSystemTray();
            Image image = Toolkit.getDefaultToolkit().getImage("./images/iconBarre.png");

            MouseListener mouseListener = new MouseListener() {

                @Override
                public void mouseClicked(MouseEvent e) {
                    if (e.getButton() == MouseEvent.BUTTON1) {
                        if (t.isVisible()) {
                            t.setVisible(false);
                        } else {
                            t.setVisible(true);
                        }
                        //popup.show(frame, e.getXOnScreen(), e.getYOnScreen());
                    }
                    System.out.println("Tray Icon - Mouse clicked!");
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse entered!");
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse exited!");
                }

                @Override
                public void mousePressed(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse pressed!");
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                    System.out.println("Tray Icon - Mouse released!");
                }
            };

            ActionListener exitListener = new ActionListener() {

                @Override
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

            popup = new JPopupMenu();
            JMenuItem defaultItem = new JMenuItem("Exit", new ImageIcon("./images/iconBarre.png"));
            defaultItem.addActionListener(exitListener);
            popup.add(defaultItem);

            barVisible = new CheckboxMenuItem("Afficher Barre");
            barVisible.addItemListener((ItemListener) changeStateBarListener);
            //popup.add(barVisible);
            trayIcon = new TrayIcon(image, "Tray Demo", null);

            trayIcon.addMouseListener(new MouseAdapter() {

                @Override
                public void mouseReleased(MouseEvent e) {
                    popup.setLocation(e.getX(), e.getY());
                    popup.setInvoker(popup);
                    popup.setVisible(true);
                }
            });



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
    public static void removeMinMaxClose(JFrame comp) {
        /*
         * if (comp instanceof JButton) { String accName = ((JButton)
         * comp).getAccessibleContext().getAccessibleName();
         * System.out.println(accName); if (accName.equals("Maximize") ||
         * accName.equals("Iconify") || accName.equals("Close")) {
         * comp.getParent().remove(comp); } } if (comp instanceof Container) {
         * Component[] comps = ((Container) comp).getComponents(); for (int x =
         * 0, y = comps.length; x < y; x++) { removeMinMaxClose(comps[x]); } }
         */



        try {
            // Set System L&F
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(comp);
        } catch (UnsupportedLookAndFeelException e) {
            // handle exception
        } catch (ClassNotFoundException e) {
            // handle exception
        } catch (InstantiationException e) {
            // handle exception
        } catch (IllegalAccessException e) {
            // handle exception
        }
    }
}
