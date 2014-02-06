
package testparamgen;



import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;


public class TabsParam extends JFrame {

    public TabsParam() {
        super();

        JTabbedPane tabbedPane = new JTabbedPane();
        ImageIcon icon = new ImageIcon("U:\\cadis.gif");
        ImageIcon tabIcon = new ImageIcon("U:\\tab_icon.gif");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String[] nomParams = new String[]{"Général", "Barre d'outils", "Claviers & clis",
            "Commandes VITIPI", "Complétion", "Dictionnaires", "Feedbacks", "Profils"};
      
        int i = 0;
        for (String s : nomParams) {
            i++;
            tabbedPane.addTab(s, tabIcon, makeTextPanel("Panel"+i));
        }

       

        tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);      

        tabbedPane.setTabPlacement(JTabbedPane.LEFT);
        setSize(410, 500);
        //Add the tabbed pane to this panel.
        add(tabbedPane);

        //The following line enables to use scrolling tabs.
        //tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
        setVisible(true);
    }

    protected JPanel makeTextPanel(String text) {
        JPanel panel = new JPanel(false);
        JLabel filler = new JLabel(text);
        filler.setHorizontalAlignment(JLabel.CENTER);
        panel.setLayout(new GridLayout(1, 1));
        panel.add(filler);
        return panel;
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
        //Create and set up the window.
        JFrame frame = new JFrame("TabbedPaneDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add content to the window.
        frame.add(new TabsParam(), BorderLayout.CENTER);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        //Schedule a job for the event dispatch thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                //Turn off metal's use of bold fonts
                UIManager.put("swing.boldMetal", Boolean.FALSE);
                createAndShowGUI();
            }
        });
    }
}