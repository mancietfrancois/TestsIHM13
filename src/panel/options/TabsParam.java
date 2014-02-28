package panel.options;

import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import panel.options.hand.design.AbstractSpecificPanel;

public class TabsParam extends JFrame {

    public TabsParam() {
        super();

        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = new ImageIcon("U:\\cadis.gif");
        ImageIcon tabIcon = new ImageIcon("U:\\tab_icon.gif");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] nomParams = new String[]{"Général", "Barre d'outils", "Claviers & clics",
            "Commandes VITIPI", "Complétion", "Dictionnaires", "Feedbacks", "Profils"};

        AbstractSpecificPanel[] params = new AbstractSpecificPanel[]{new PanelGeneral("Général"), new PanelToolBar("Barre d'outils"), new PanelKeyboard("Claviers & clics"), new PanelCommandes("Commandes VITIPI"), new PanelCompletion("Complétion"), new PanelDicos("Dictionnaires"), new PanelFeedbacks("Feedbacks"), new PanelProfil("Profils")};


        int i = 0;
        for (String s : nomParams) {

            tabbedPane.addTab(s, tabIcon, params[i]);
            i++;
        }

        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);

        tabbedPane.setTabPlacement(JTabbedPane.LEFT);
        setSize(700, 500);
        //Add the tabbed pane to this panel.
        add(tabbedPane);

        //The following line enables to use scrolling tabs.
        //tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        setVisible(true);
    }

    protected JPanel makeTextPanel(String text) {
        /*
         JPanel panel = new JPanel(false);
         JLabel filler = new JLabel(text);
         filler.setHorizontalAlignment(JLabel.CENTER);
         panel.setLayout(new GridLayout(1, 1));
         panel.add(filler);
         */
        return new PanelToolBar("Barre d'outils");
    }

    /**
     * Returns an ImageIcon, or null if the path was invalid.
     */
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = TabsParam.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    /**
     * Create the GUI and show it. For thread safety, this method should be
     * invoked from the event dispatch thread.
     */
    private static void createAndShowGUI() {
        new TabsParam();
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        //Turn off metal's use of bold fonts
//        SwingUtilities.invokeLater(new Runnable() {
//            public void run() {
        //Turn off metal's use of bold fonts
        // My own font
        Font myFont = new Font("Segoe UI Semibold", Font.PLAIN, 12);

        // Replacing global component fonts
        UIManager.put("Button.font", myFont);
        UIManager.put("Checkbox.font", myFont);
        UIManager.put("RadioButton.font", myFont);
        UIManager.put("Button.background", Color.white);
        UIManager.put("ToggleButton.font", myFont);
        UIManager.put("Label.font", myFont);
        createAndShowGUI();
//            }
//        });
    }
}