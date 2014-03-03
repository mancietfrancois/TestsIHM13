/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import panel.options.hand.design.MyPanel;

/**
 *
 * @author cantual
 */
public class ParamsGeneral extends MyPanel{
    
    public ParamsGeneral() {
    // ------------- Instenciations des éléments graphiques ----------------
        
        // Element 1
        lancement = new JCheckBox("Lancement au démarrage de VITIPI");

        // Element 2 et contenu
        Box hBox = Box.createHorizontalBox();
        label = new JLabel("Profils par défaut:");
        comboBox = new JComboBox();
        setSize(comboBox);
 
        // Element 3
        afficher = new JCheckBox("Afficher la barre d'outils");
        
        // ------------- Attribution des layouts -------------------------------
        
        // Layout principal : Box Layout
        BoxLayout mainLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(mainLayout);
        
        // ---------------- Association des éléments graphiques ----------------
        
        this.add(lancement);
        this.add(hBox);
            hBox.add(label);
            hBox.add(Box.createGlue());
            hBox.add(comboBox);
        this.add(afficher);
        
    }
    
    // ----------------- Accesseurs ------------------------
    
       
    // ----------------- Attributs ---------------------------
    
    private JCheckBox lancement;
    private JLabel label;
    private JComboBox comboBox;
    private JCheckBox afficher;
    
    
    //respect de la guideline Windows : http://msdn.microsoft.com/en-us/library/windows/desktop/aa511279.aspx
    // ou de moins tentative
}
