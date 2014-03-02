/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options.hand.design;

import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;

/**
 *
 * @author cantual
 */
public class ParamsFeedbacks extends JPanel{
    
    public ParamsFeedbacks() {
        
        // ------------- Instenciations des éléments graphiques ----------------
        
        // TabbedPane
        tabbedPane = new JTabbedPane();
        
        // Panel 1 et contenu
        JPanel panel1 = new JPanel();

        // Panel 2 et contenu
        JPanel panel2 = new JPanel();
        
        // ------------- Attribution des layouts -------------------------------
        
        // Layout associé au panel1 : BoxLayout 
        BoxLayout panel1Layout = new BoxLayout(panel2, BoxLayout.Y_AXIS);
        panel2.setLayout(panel1Layout);
        
        // Layout associé au panel2 :  
        
        
        // ---------------- Association des éléments graphiques ----------------
        
        this.add(tabbedPane);
            tabbedPane.addTab("Retour Audio", panel1);
                //panel1.add();
            tabbedPane.addTab("Retour Visuel", panel2);
    }
    
    private JTabbedPane tabbedPane;
    private JLabel labelLettre;
    private JLabel labelMot;
    private JLabel labelParagraphe;
    private JRadioButton rbLettre[];
    private JRadioButton rbMot[];
    private JRadioButton rbParagraphe[];
    
    private final static int LECTURE = 0;
    private final static int SON = 1;
    private final static int AUCUN = 2;
    
    //respect de la guideline Windows : http://msdn.microsoft.com/en-us/library/windows/desktop/aa511279.aspx
    // ou de moins tentative
}


