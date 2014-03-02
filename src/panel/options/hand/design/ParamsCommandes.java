/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options.hand.design;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import panel.options.hand.design.utils.TitledSeparator;

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
        
        button = new JButton("Off");
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
    }
    
    private Ligne ligne1;
    private Ligne ligne2;
    private Ligne ligne3;
    private Ligne ligne4;
    private JButton button;
    
    //respect de la guideline Windows : http://msdn.microsoft.com/en-us/library/windows/desktop/aa511279.aspx
    // ou de moins tentative
}
