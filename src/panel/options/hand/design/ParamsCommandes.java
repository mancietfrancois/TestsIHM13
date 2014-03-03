/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options.hand.design;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;

/**
 *
 * @author cantual
 */
public class ParamsCommandes extends MyPanel{
    
    public ParamsCommandes() {
        
        // ------------- Instenciations des éléments graphiques ----------------

        // Panel 1 et contenu
        JPanel panel1 = new JPanel();
        
        ligne1 = new Ligne(new JLabel("Effacer mot complété :"), new JTextField("F5"));
        setSize(ligne1);
        ligne2 = new Ligne(new JLabel("Effacer dernière lettre du mot complété :"), new JTextField("F8"));
        setSize(ligne2);

        // Panel 2 et contenu
        JPanel panel2 = new JPanel();
        
        button = new JToggleButton("On");
        setSize(button);
        ligne3 = new Ligne(new JLabel("Effacer mot complété :"), new JTextField("Suprimer"));
        setSize(ligne3);
        ligne4 = new Ligne(new JLabel("Effacer dernière lettre du mot complété :"), new JTextField("Effacer"));
        setSize(ligne4);

        // Mise en place des titres    (respecter guideline soit, juste un trait)  ---!!
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Touches du clavier");
        panel1.setBorder(title);

        title = BorderFactory.createTitledBorder("Commande vocale");
        panel2.setBorder(title);
        
        // ------------- Mise en place de listeners ----------------------------
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                commandeVocaleMouseClicked();
            }
        });
        
        ligne1.textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicCompletionMotClavier();
            }
        });
        
        ligne2.textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicCompletionLettreClavier();
            }
        });
        
        ligne3.textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicCompletionMotVocale();
            }
        });
        
        ligne4.textField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicCompletionLettreVocale();
            }
        });
        
        // ------------- Attribution des layouts -------------------------------
        
        // Layout principal : GridLayout
        GridLayout mainLayout = new GridLayout(2,1);
        this.setLayout(mainLayout);
        
        // Layout du panel1 : BoxLayout
        BoxLayout panel1Layout = new BoxLayout(panel1, BoxLayout.Y_AXIS);
        panel1.setLayout(panel1Layout);
        
        // Layout du panel2 : BoxLayout
        BoxLayout panel2Layout = new BoxLayout(panel2, BoxLayout.Y_AXIS);
        panel2.setLayout(panel2Layout);
        
        // ---------------- Association des éléments graphiques ----------------
        
        this.add(panel1);
            panel1.add(ligne1);
            panel1.add(ligne2);
        this.add(panel2);
            panel2.add(button);
            panel2.add(ligne3);
            panel2.add(ligne4);
    }
    
    public class Ligne extends Box{
    
        public Ligne(JLabel label, JTextField textField) {
            super(BoxLayout.X_AXIS);
            
            this.textField = textField;

            this.add(label);
            this.add(Box.createGlue());
            this.add(textField);

        }
        
        // Attributs
        JTextField textField;
    }
    
    // ----------------- Accesseurs ------------------------
    public String getCompletionMotClavier() {
        return ligne1.textField.getText();
    }
    public String getCompletionLettreClavier() {
        return ligne2.textField.getText();
    }
    public String getCompletionMotVocale() {
        return ligne3.textField.getText();
    }
    public String getCompletionLettreVocale() {
        return ligne4.textField.getText();
    }
    
    public void setCompletionMotClavier(String s) {
        ligne1.textField.setText(s);
    }
    public void setCompletionLettreClavier(String s) {
        ligne2.textField.setText(s);
    }
    public void setCompletionMotVocale(String s) {
        ligne3.textField.setText(s);
    }
    public void setCompletionLettreVocale(String s) {
        ligne4.textField.setText(s);
    }
    
    public boolean commVocaleIsOn() {
        return button.isSelected();
    }
    public void setCommVocale(boolean c) {
        button.setSelected(c);
    }
    
    // -------------------- Events -------------------------
    
    public void commandeVocaleMouseClicked() {
        setCommVocale(commVocaleIsOn());
    }
    public void clicCompletionMotClavier() {
    }
    public void clicCompletionLettreClavier() {
    }
    public void clicCompletionMotVocale() {
    }
    public void clicCompletionLettreVocale() {
    }
    
    // ----------------- Attributs ---------------------------
    
    private Ligne ligne1;
    private Ligne ligne2;
    private Ligne ligne3;
    private Ligne ligne4;
    private JToggleButton button;
    
    //respect de la guideline Windows : http://msdn.microsoft.com/en-us/library/windows/desktop/aa511279.aspx
    // ou de moins tentative
}
