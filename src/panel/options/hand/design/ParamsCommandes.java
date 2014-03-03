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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;

/**
 *
 * @author cantual
 */
public class ParamsCommandes extends JPanel{
    
    public ParamsCommandes() {
        
        // ------------- Instenciations des éléments graphiques ----------------

        // Panel 1 et contenu
        JPanel panel1 = new JPanel();
        
        ligne1 = new Ligne(new JLabel("Effacer mot complété :"), new JTextField("F5"));
        ligne2 = new Ligne(new JLabel("Effacer dernière lettre du mot complété :"), new JTextField("F8"));

        // Panel 2 et contenu
        JPanel panel2 = new JPanel();
        
        button = new JToggleButton("On");
        ligne3 = new Ligne(new JLabel("Effacer mot complété :"), new JTextField("Suprimer"));
        ligne4 = new Ligne(new JLabel("Effacer dernière lettre du mot complété :"), new JTextField("Effacer"));
        
        // Panel 3 : panel tampon
        //JPanel panel3 = new JPanel();

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
        
        // Layout principal : BoxLayout
        BoxLayout mainLayout = new BoxLayout(this, BoxLayout.Y_AXIS);
        this.setLayout(mainLayout);
        
        // Layout du panel1 : GridLayout
        GridLayout panel1Layout = new GridLayout(2,1);
        panel1.setLayout(panel1Layout);
        
        // Layout du panel2 : GridLayout
        GridLayout panel2Layout = new GridLayout(3,1);
        panel2.setLayout(panel2Layout);
        
        // ---------------- Association des éléments graphiques ----------------
        
        this.add(panel1);
            panel1.add(ligne1);
            panel1.add(ligne2);
        this.add(panel2);
            button.setAlignmentX(Component.RIGHT_ALIGNMENT);
            panel2.add(button);
            panel2.add(ligne3);
            panel2.add(ligne4);
        this.add(Box.createGlue());
    }
    
    @Override
    public Insets getInsets() {
      return new Insets(10,10,10,10);
    }
    
    public class Ligne extends JPanel{
    
        public Ligne(JLabel label, JTextField textField) {
            
            this.textField = textField;

            BorderLayout layout = new BorderLayout();
            this.setLayout(layout);
            
            // se débrouiller pour que la haute ne change pas ---!!!!!!!!!
                    
            this.add(label, BorderLayout.WEST);
            this.add(textField, BorderLayout.EAST);

        }
        
        @Override
        public Insets getInsets() {
          return new Insets(10,10,10,10);
        }
        
        // Attributs
        JTextField textField;

        private void addActionListener(ActionListener actionListener) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
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
