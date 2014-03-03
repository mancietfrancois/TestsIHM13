/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JTabbedPane;
import javax.swing.border.TitledBorder;

/**
 *
 * @author cantual
 */
public class ParamsFeedbacks extends JPanel{
    
    public ParamsFeedbacks() {
        
        // ------------- Instenciations des éléments graphiques ----------------
        
        // TabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();
        
        // Tab audio et contenu
        JPanel panelAudio = new JPanel();
        
        JPanel panelLettre = new JPanel();
        JRadioButton rbLettre[] = new JRadioButton[3];
        rbLettre[LECTURE] = new JRadioButton("Lecture orale");
        rbLettre[SON] = new JRadioButton("Son");
        rbLettre[AUCUN] = new JRadioButton("Aucun");
        
        JPanel panelMot = new JPanel();
        JRadioButton rbMot[] = new JRadioButton[3];
        rbMot[LECTURE] = new JRadioButton("Lecture orale");
        rbMot[SON] = new JRadioButton("Son");
        rbMot[AUCUN] = new JRadioButton("Aucun");
        
        JPanel panelParagraphe = new JPanel();
        JRadioButton rbParagraphe[] = new JRadioButton[3];
        rbParagraphe[LECTURE] = new JRadioButton("Lecture orale");
        rbParagraphe[SON] = new JRadioButton("Son");
        rbParagraphe[AUCUN] = new JRadioButton("Aucun");

        // Tab visuel et contenu
        JPanel panelVisuel = new JPanel();
        
        JPanel panelPolice = new JPanel();
        automatique = new JCheckBox("Automatique");
        police = new JComboBox();
        police.setModel(new DefaultComboBoxModel(new String[] { "Arial", "Item 2", "Item 3", "Item 4" }));
        size = new JSpinner();
        gras = new JButton("A");
        italique = new JButton("A");
        souligne = new JButton("A");
        
        JPanel panelApercu = new JPanel();
        apercu = new JLabel("Bonjour");
        
        // Mise en place des titres    (respecter guideline soit, juste un trait)  ---!!
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Lettre");
        panelLettre.setBorder(title);

        title = BorderFactory.createTitledBorder("Mot");
        panelMot.setBorder(title);
        
        title = BorderFactory.createTitledBorder("Paragraphe");
        panelParagraphe.setBorder(title);

        title = BorderFactory.createTitledBorder("Police");
        panelPolice.setBorder(title);
        
        title = BorderFactory.createTitledBorder("Aperçu");
        panelApercu.setBorder(title);
        
        // ------------- Attribution des layouts -------------------------------
        
        // Layout principal : GridLayout 
        GridLayout rootLayout = new GridLayout();
        this.setLayout(rootLayout);
        
        // Layout associé au panelAudio : BoxLayout 
        BoxLayout panelAudioLayout = new BoxLayout(panelAudio, BoxLayout.Y_AXIS);
        panelAudio.setLayout(panelAudioLayout);
        
        // Layout associé au panelVisuel : BoxLayout 
        BorderLayout panelVisuelLayout = new BorderLayout();
        panelVisuel.setLayout(panelVisuelLayout);
        
        
        // ---------------- Association des éléments graphiques ----------------
        
        this.add(tabbedPane);
            tabbedPane.addTab("Retour Audio", panelAudio);
                panelAudio.add(panelLettre);
                    for (int i=0; i<3; i++) {
                        panelLettre.add(rbLettre[i]);
                    }
                panelAudio.add(panelMot);
                    for (int i=0; i<3; i++) {
                        panelMot.add(rbMot[i]);
                    }
                panelAudio.add(panelParagraphe);
                    for (int i=0; i<3; i++) {
                        panelParagraphe.add(rbParagraphe[i]);
                    }
            tabbedPane.addTab("Retour Visuel", panelVisuel);
                panelVisuel.add(panelPolice, BorderLayout.CENTER);
                    panelPolice.add(automatique);
                    panelPolice.add(police);
                    panelPolice.add(size);
                    panelPolice.add(gras);
                    panelPolice.add(italique);
                    panelPolice.add(souligne);
                panelVisuel.add(panelApercu, BorderLayout.SOUTH);
                    panelApercu.add(apercu);
                        
    }
    
    @Override
    public Insets getInsets() {
      return new Insets(10,10,10,10);
    }
    
    // ----------------------- Accesseur ------------------------
    public void setRetourAudioLettre(int lettre) {
    }
    
    public void setRetourAudioMot(int mot) {
    }
    
    public void setRetourAudioParagraphe(int paragraphe) {
    }
    
    public int getRetourAudioLettre() {
        return 0;
    }
    
    public int getRetourAudioMot() {
        return 0;
    }
    
    public int getRetourAudioParagraphe() {
        return 0;
    }
    
    private JCheckBox automatique;
    private JComboBox police;
    private JSpinner size;
    private JButton gras;
    private JButton italique;
    private JButton souligne;
    private JLabel apercu;
    
    private final static int LECTURE = 0;
    private final static int SON = 1;
    private final static int AUCUN = 2;
    
    //respect de la guideline Windows : http://msdn.microsoft.com/en-us/library/windows/desktop/aa511279.aspx
    // ou de moins tentative
}


