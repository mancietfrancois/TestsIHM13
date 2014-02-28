package panel.options;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JTabbedPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class TabsParam extends JFrame {

    public TabsParam() {
        super();

        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = new ImageIcon("U:\\cadis.gif");
        ImageIcon tabIcon = new ImageIcon("U:\\tab_icon.gif");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] nomParams = new String[]{"Général", "Barre d'outils", "Claviers & clis",
            "Commandes VITIPI", "Complétion", "Dictionnaires", "Feedbacks", "Profils"};
        Param[] params = new Param[]{new panelGeneral(), new panelToolBar(), new panelKeyboard(), new panelCommandes(), new panelCompletion(), new panelDicos(), new panelFeedbacks(), new panelProfil()};

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
        return new panelToolBar();
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

        try {
            for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus is not available, you can set the GUI to another look and feel.
        }

        UIManager.put("Label.font", new Font("Segoe UI Semibold", Font.PLAIN, 13));
        UIManager.put("Button.background", Color.WHITE);
        UIManager.put("RadioButton.icon", new ImageIcon("./images/radioButton/radiobutton-unchecked.png"));
        UIManager.put("CheckBox.icon", new ImageIcon("./images/checkbox/checkbox-empty_small2.png"));
        UIManager.put("CheckBox[Selected].checkIcon", new ImageIcon("./images/checkbox/checkbox-ticked_small2.png"));
        createAndShowGUI();
    }
}