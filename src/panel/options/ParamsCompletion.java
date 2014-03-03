/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options;

import java.awt.GridLayout;
import java.awt.Insets;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.border.TitledBorder;
import panel.options.hand.design.MyPanel;

/**
 *
 * @author cantual
 */
public class ParamsCompletion extends MyPanel{
    
    public ParamsCompletion() {
        
        // ------------- Instenciations des éléments graphiques ----------------

        // Panel 1 et contenu
        JPanel panel1 = new JPanel();
        comboBox = new JComboBox(new String[]{"Français","Anglais"}); //régler la taille)                ---!!
        setSize(comboBox);
        
        // Panel 2 et contenu
        JPanel panel2 = new JPanel();
        Box hBox1 = Box.createHorizontalBox();
        labelCarac = new JLabel("Caractères");
        spinnCarac = new JSpinner();
        setSize(spinnCarac);
        Box hBox2 = Box.createHorizontalBox();
        labelMots = new JLabel("Mots");
        spinnMots = new JSpinner();
        setSize(spinnMots);
        phrase = new JCheckBox("Phrase");
        
        // Panel 3 et contenu
        JPanel panel3 = new JPanel();
        abreviation = new JRadioButton("Abreviation");
        lettre = new JRadioButton("Lettre");
        phoneme = new JRadioButton("Phonème");
        pictogramme = new JRadioButton("Pictogramme");
        buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(abreviation);
        buttonGroup1.add(lettre);
        buttonGroup1.add(phoneme);
        buttonGroup1.add(pictogramme);
        
        // Panel 4 et contenu
        JPanel panel4 = new JPanel();
        frappes = new JCheckBox("Frappes");
        orthographe = new JCheckBox("Orthographe");
        morphologie = new JCheckBox("Morphologie");
        
        // Panel 5 et contenu
        JPanel panel5 = new JPanel();
        espaces = new JCheckBox("Espaces");
        majuscules = new JCheckBox("Majuscules");
        accents = new JCheckBox("Accents");
        
        // Mise en place des titres    (respecter guideline soit, juste un trait)  ---!!
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Langue");
        panel1.setBorder(title);

        title = BorderFactory.createTitledBorder("Completion");
        panel2.setBorder(title);

        title = BorderFactory.createTitledBorder("Type d'entrée");
        panel3.setBorder(title);
        
        title = BorderFactory.createTitledBorder("Correction de fautes");
        panel4.setBorder(title);
        
        title = BorderFactory.createTitledBorder("Génération automatiques");
        panel5.setBorder(title);
        
        // ------------- Attribution des layouts -------------------------------
        
        // Layout principal : GridLayout
        GridLayout mainLayout = new GridLayout(5,1);
        this.setLayout(mainLayout);
        
        // Layout du panel1 : BoxLayout
        BoxLayout panel1Layout = new BoxLayout(panel1, BoxLayout.X_AXIS);
        panel1.setLayout(panel1Layout);
        
        // Layout du panel2 : BoxLayout
        BoxLayout panel2Layout = new BoxLayout(panel2, BoxLayout.Y_AXIS);
        panel2.setLayout(panel2Layout);
        
        // Layout du panel3 : BoxLayout
        BoxLayout panel3Layout = new BoxLayout(panel3, BoxLayout.X_AXIS);
        panel3.setLayout(panel3Layout);
        
        // Layout du panel4 : BoxLayout
        BoxLayout panel4Layout = new BoxLayout(panel4, BoxLayout.X_AXIS);
        panel4.setLayout(panel4Layout);
        
        // Layout du panel3 : BoxLayout
        BoxLayout panel5Layout = new BoxLayout(panel5, BoxLayout.X_AXIS);
        panel5.setLayout(panel5Layout);
        
        // ---------------- Association des éléments graphiques ----------------
        
        this.add(panel1);
            panel1.add(comboBox);
        this.add(panel2);
            panel2.add(hBox1);
                hBox1.add(labelCarac);
                hBox1.add(Box.createGlue());
                hBox1.add(spinnCarac);
            panel2.add(hBox2);
                hBox2.add(labelMots);
                hBox2.add(Box.createGlue());
                hBox2.add(spinnMots);
            panel2.add(phrase);
        this.add(panel3);
            panel3.add(abreviation);
            panel3.add(lettre);
            panel3.add(phoneme);
            panel3.add(pictogramme);
        this.add(panel4);
            panel4.add(frappes);
            panel4.add(orthographe);
            panel4.add(morphologie);
        this.add(panel5);
            panel5.add(espaces);
            panel5.add(majuscules);
            panel5.add(accents);
    }
    
    // ----------------- Accesseurs ------------------------
    //get et set langue
    public String getLangue() {
        return (String) comboBox.getSelectedItem();
    }
    public void setLangue(String l) {
        comboBox.setSelectedItem(l);
    }
    //get et set completion
    public int getCompletionCarac() {
        return (int) spinnCarac.getValue();
    }
    public void setCompletionCarac(int i) {
        spinnCarac.setValue(i);
    }
    public int getCompletionMots() {
        return (int) spinnMots.getValue();
    }
    public void setCompletionMots(int i) {
        spinnMots.setValue(i);
    }
    public boolean getCompletionPhrase() {
        return phrase.isSelected();
    }
    public void setCompletionPhrase(boolean b) {
        phrase.setSelected(b);
    }
    //get et set type entrée
    public String getTypeEntree() {
        return ((JRadioButton) buttonGroup1.getSelection().getSelectedObjects()[0]).getText();
    }
    public void setTypeEntree(String s) {
        buttonGroup1.clearSelection();
        if (s.equals("Abreviation"))
            buttonGroup1.setSelected(abreviation.getModel(), true);
        if (s.equals("Lettre"))
            buttonGroup1.setSelected(lettre.getModel(), true);
        if (s.equals("Phonème"))
            buttonGroup1.setSelected(phoneme.getModel(), true);
        if (s.equals("Pictogramme"))
            buttonGroup1.setSelected(pictogramme.getModel(), true);
    }
    //get et set correction fautes
    public ArrayList<String> getCorrectionFaute() {
        ArrayList<String> data = new ArrayList<>();
        if (frappes.isSelected())
            data.add("Frappes");
        if (orthographe.isSelected())
            data.add("Orthographe");
        if (morphologie.isSelected())
            data.add("Morphologie");
        return data;
    }
    public void setCorrectionFaute(String s) {
        if (s.equals("Frappes"))
            frappes.setSelected(true);
        else
            frappes.setSelected(false);
        if (s.equals("Orthographe"))
            orthographe.setSelected(true);
        else
            orthographe.setSelected(false);
        if (s.equals("Morphologie"))
            morphologie.setSelected(true);
        else
            morphologie.setSelected(false);
    }
    //get et set generation
    public ArrayList<String> getGeneration() {
        ArrayList<String> data = new ArrayList<>();
        if (espaces.isSelected())
            data.add("Espaces");
        if (majuscules.isSelected())
            data.add("Majuscules");
        if (accents.isSelected())
            data.add("Accents");
        return data;
    }
    public void setGeneration(String s) {
        if (s.equals("Espaces"))
            espaces.setSelected(true);
        else
            espaces.setSelected(false);
        if (s.equals("Majuscules"))
            majuscules.setSelected(true);
        else
            majuscules.setSelected(false);
        if (s.equals("Accents"))
            accents.setSelected(true);
        else
            accents.setSelected(false);
    }
      
    // ----------------- Attributs ---------------------------
    
    private JComboBox comboBox;
    
    private JLabel labelCarac;
    private JSpinner spinnCarac;
    private JLabel labelMots;
    private JSpinner spinnMots;
    private JCheckBox phrase;
    
    private ButtonGroup buttonGroup1;
    private JRadioButton abreviation;
    private JRadioButton lettre;
    private JRadioButton phoneme;
    private JRadioButton pictogramme;
    
    private JCheckBox frappes;
    private JCheckBox orthographe;
    private JCheckBox morphologie;
    
    private JCheckBox espaces;
    private JCheckBox majuscules;
    private JCheckBox accents;
    
    //respect de la guideline Windows : http://msdn.microsoft.com/en-us/library/windows/desktop/aa511279.aspx
    // ou de moins tentative
}


