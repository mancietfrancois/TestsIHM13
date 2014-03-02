/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options.hand.design;

import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

/**
 *
 * @author cantual
 */
public class ParamsCompletion extends JPanel{
    
    public ParamsCompletion() {
        
        // ------------- Instenciations des éléments graphiques ----------------

        // Panel 1 et contenu
        JPanel panel1 = new JPanel();
        
        // (régler la taille)                ---!!
        comboBox = new JComboBox();
        letter1 = new JRadioButton("Letter1");
        letter2 = new JRadioButton("Letter2");

        // Panel 2 et contenu
        JPanel panel2 = new JPanel();
        
        frappes = new JCheckBox("Frappes");
        orthographe = new JCheckBox("Orthographe");
        morphologie = new JCheckBox("Morphologie");
        // Panel 3 et contenu
        JPanel panel3 = new JPanel();
        
        espaces = new JCheckBox("Espaces");
        majuscules = new JCheckBox("Majuscules");
        accents = new JCheckBox("Accents");
        
        // Mise en place des titres    (respecter guideline soit, juste un trait)  ---!!
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Langue");
        panel1.setBorder(title);

        title = BorderFactory.createTitledBorder("Correction de fautes");
        panel2.setBorder(title);

        title = BorderFactory.createTitledBorder("Génération automatiques");
        panel3.setBorder(title);
        
        // ------------- Attribution des layouts -------------------------------
        
        // Layout principal : BoxLayout
        GridLayout mainLayout = new GridLayout(3,1);
        this.setLayout(mainLayout);
        
        // Layout du panel1 : BoxLayout
        BoxLayout panel1Layout = new BoxLayout(panel1, BoxLayout.X_AXIS);
        panel1.setLayout(panel1Layout);
        
        // Layout du panel2 : BoxLayout
        BoxLayout panel2Layout = new BoxLayout(panel2, BoxLayout.X_AXIS);
        panel2.setLayout(panel2Layout);
        
        // Layout du panel3 : BoxLayout
        BoxLayout panel3Layout = new BoxLayout(panel3, BoxLayout.X_AXIS);
        panel3.setLayout(panel3Layout);
        
        // ---------------- Association des éléments graphiques ----------------
        
        this.add(panel1);
            panel1.add(comboBox);
            panel1.add(letter1);
            panel1.add(letter2);
        this.add(panel2);
            panel2.add(frappes);
            panel2.add(orthographe);
            panel2.add(morphologie);
        this.add(panel3);
            panel3.add(espaces);
            panel3.add(majuscules);
            panel3.add(accents);
    }
    
    private JComboBox comboBox;
    private JRadioButton letter1;
    private JRadioButton letter2;
    private JCheckBox frappes;
    private JCheckBox orthographe;
    private JCheckBox morphologie;
    private JCheckBox espaces;
    private JCheckBox majuscules;
    private JCheckBox accents;
    
    //respect de la guideline Windows : http://msdn.microsoft.com/en-us/library/windows/desktop/aa511279.aspx
    // ou de moins tentative
}


