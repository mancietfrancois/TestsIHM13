/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.components;

import java.awt.AWTException;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JPopupMenu;
import javax.swing.UIManager;
import utils.PopupPositionCalculator;

/**
 *
 * @author manciefr
 */
public class VitipiNotificationMenu {

    private TrayIcon trayIcon;
    private SystemTray tray;
    
    private JPopupMenu popup;
    private PopupPositionCalculator positionCalculator;
    private JDialog hiddenDialog;
    private Dimension screenSize;
    
    private VitipiDiscretMenu menuProfil;
    private VitipiDiscretMenu menuDictionnaire;
    private VitipiDiscretMenuItem menuItemAfficherBarre;
    private VitipiDiscretMenuItem menuItemParametre;
    private VitipiDiscretMenuItem menuItemEteindreVitipi;
    private VitipiDiscretMenuItemWithCheckBox menuItemCommandeVocale;
    private VitipiDiscretMenuItemWithCheckBox menuItemGomme;
    
    public static final String DEFAULT_MENU_PROFIL_TITLE = "Profil : ";
    public static final String DEFAULT_MENUITEM_AFFICHER_BARRE_TITLE = "Afficher barre";
    public static final String DEFAULT_MENUITEM_PARAMETRE_TITLE = "Paramètres";
    public static final String DEFAULT_MENUITEM_VOCALE_ENABLED = "Activer Commande Vocale";
    public static final String DEFAULT_MENUITEM_VOCALE_DISABLED = "Désactiver Commande Vocale";
    public static final String DEFAULT_MENUITEM_GOMME_ENABLED = "Activer Gomme";
    public static final String DEFAULT_MENUITEM_GOMME_DISABLED = "Désactiver Gomme";
    public static final String DEFAULT_MENU_DICTIONNAIRE_TITLE = "Changer dictionnaire";
    public static final String DEFAULT_MENUITEM_ETEINDRE_VITIPI_TITLE = "Eteindre VITIPI";
    public static final String DEFAULT_MENUITEM_AllUMER_VITIPI_TITLE = "Allumer VITIPI";
    
    public static final Color DEFAULT_DICTIONNARIES_COLOR = new Color(109, 137, 192);
    public static final Color DEFAULT_VIRTUAL_KEYBOARDS_COLOR = new Color(109, 96, 163);
    public static final Color DEFAULT_CORRECTIONS_COLOR = new Color(237, 120, 98);
    public static final Color DEFAULT_FEEDBACK_COLOR = new Color(245, 166, 99);
    public static final Color DEFAULT_SYSTEM_COLOR = new Color(255, 223, 128);
    public static final Color DEFAULT_PROFILE_COLOR = new Color(190, 209, 80);
    public static final Color DEFAULT_TOOLBAR_COLOR = new Color(131, 187, 84);
    
    public static final String DISCRET_MENU_ICON_PATH = "./images/menu_discret/";
    public static final String ICON_PROFIL_PATH = DISCRET_MENU_ICON_PATH + "Vitipi_Profil.png";
    public static final String ICON_BARRE_PATH = DISCRET_MENU_ICON_PATH + "Vitipi_Rotate.png";
    public static final String ICON_PARAMETRES_PATH = DISCRET_MENU_ICON_PATH + "Vitipi_Parametres.png";
    public static final String ICON_VOCALE_PATH = DISCRET_MENU_ICON_PATH + "Vitipi_Micro.png";
    public static final String ICON_GOMME_PATH = DISCRET_MENU_ICON_PATH + "Vitipi_Gomme.gif";
    public static final String ICON_DICTIONNAIRE_PATH = DISCRET_MENU_ICON_PATH + "Vitipi_Dictionnaire.gif";
    public static final String ICON_VITIPI_ACTIF_PATH = DISCRET_MENU_ICON_PATH + "Vitipi_Actif.png";
    public static final String ICON_VITIPI_INACTIF_PATH = DISCRET_MENU_ICON_PATH + "Vitipi_Inactif.png";

    public VitipiNotificationMenu() {
        positionCalculator = new PopupPositionCalculator();
        Toolkit tk = Toolkit.getDefaultToolkit();
        screenSize = tk.getScreenSize();
        tray = SystemTray.getSystemTray();
        createHiddenDialog();
        createPopup();
        initializeMenu();
        if (SystemTray.isSupported()) {
            addSystemTray();
        }
    }

    private void createHiddenDialog() {
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
    }

    private void addSystemTray() {
        Image image = Toolkit.getDefaultToolkit().getImage(ICON_VITIPI_ACTIF_PATH);
        trayIcon = new TrayIcon(image, "Vitipi", null);
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
    }

    private void createPopup() {
        popup = new JPopupMenu();
        popup.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
    }

    private void initializeMenu() {
        menuProfil = new VitipiDiscretMenu(
                DEFAULT_MENU_PROFIL_TITLE,
                new ImageIcon(ICON_PROFIL_PATH),
                DEFAULT_PROFILE_COLOR);
        popup.add(menuProfil);

        menuItemAfficherBarre = new VitipiDiscretMenuItem(
                DEFAULT_MENUITEM_AFFICHER_BARRE_TITLE,
                new ImageIcon(ICON_BARRE_PATH),
                DEFAULT_TOOLBAR_COLOR);
        popup.add(menuItemAfficherBarre);

        menuItemParametre = new VitipiDiscretMenuItem(
                DEFAULT_MENUITEM_PARAMETRE_TITLE,
                new ImageIcon(ICON_PARAMETRES_PATH),
                DEFAULT_SYSTEM_COLOR);
        popup.add(menuItemParametre);

        menuItemCommandeVocale = new VitipiDiscretMenuItemWithCheckBox(
                DEFAULT_MENUITEM_VOCALE_ENABLED,
                new ImageIcon(ICON_VOCALE_PATH),
                DEFAULT_CORRECTIONS_COLOR);
        popup.add(menuItemCommandeVocale);

        menuItemGomme = new VitipiDiscretMenuItemWithCheckBox(
                DEFAULT_MENUITEM_GOMME_ENABLED,
                new ImageIcon(ICON_GOMME_PATH),
                DEFAULT_CORRECTIONS_COLOR);
        popup.add(menuItemGomme);
        
        menuDictionnaire = new VitipiDiscretMenu(
                DEFAULT_MENU_DICTIONNAIRE_TITLE,
                new ImageIcon(ICON_DICTIONNAIRE_PATH),
                DEFAULT_DICTIONNARIES_COLOR);
        popup.add(menuDictionnaire);

        menuItemEteindreVitipi = new VitipiDiscretMenuItem(
                DEFAULT_MENUITEM_ETEINDRE_VITIPI_TITLE,
                new ImageIcon(ICON_VITIPI_INACTIF_PATH),
                UIManager.getColor("MenuItem.background"));
        
        menuItemEteindreVitipi.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionPerformed VITIPI Eteindre");
                Image image = null;
                if (menuItemEteindreVitipi.getLabelText().equals(DEFAULT_MENUITEM_ETEINDRE_VITIPI_TITLE)) {
                    image = Toolkit.getDefaultToolkit().getImage(ICON_VITIPI_INACTIF_PATH);
                    menuItemEteindreVitipi.setText(DEFAULT_MENUITEM_AllUMER_VITIPI_TITLE);
                    menuItemEteindreVitipi.changeIcon(new ImageIcon(ICON_VITIPI_ACTIF_PATH));
                } else {
                    image = Toolkit.getDefaultToolkit().getImage(ICON_VITIPI_ACTIF_PATH);
                    menuItemEteindreVitipi.setText(DEFAULT_MENUITEM_ETEINDRE_VITIPI_TITLE);
                    menuItemEteindreVitipi.changeIcon(new ImageIcon(ICON_VITIPI_INACTIF_PATH));
                }
                trayIcon.setImage(image);
            }
        });
        
        popup.add(menuItemEteindreVitipi);
        
        
    }
}
