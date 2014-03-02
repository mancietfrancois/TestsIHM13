/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options.hand.design;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Insets;
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
public class ParamsKeyboard extends JPanel {
    
    public ParamsKeyboard() {
        
        // ------------- Instenciations des éléments graphiques ----------------
        
        // Panel 1 et contenu
        ListItem panelList = new ListItem(true, false, true);

        // Panel 2 et contenu
        JPanel clicAuto = new JPanel();
        
        button = new JToggleButton("ON");
        moins = new JButton("-");
        moins.setEnabled(false);
        duree = new JTextField("0");
        duree.setEnabled(false);
        plus = new JButton("+");
        plus.setEnabled(false);
        seconde = new JLabel(" seconde");
        
        // Mise en place des titres    (respecter guideline soit, juste un trait)  ---!!
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Clic automatique");
        clicAuto.setBorder(title);
        
        // ------------- Attribution des layouts -------------------------------
        
        // Layout principal : Grid Layout
        BorderLayout layout = new BorderLayout();
        this.setLayout(layout);
        
        // Layout du panel2 : Box Layout
        BoxLayout clicAutoLayout = new BoxLayout(clicAuto, BoxLayout.X_AXIS);
        clicAuto.setLayout(clicAutoLayout);
        
        // ---------------- Association des éléments graphiques ----------------
        
        this.add(panelList, BorderLayout.CENTER);
        this.add(clicAuto, BorderLayout.SOUTH);
            clicAuto.add(button);
            clicAuto.add(Box.createHorizontalGlue());
            clicAuto.add(moins);
            clicAuto.add(duree);
            clicAuto.add(plus);
            clicAuto.add(seconde);
    }
    
    @Override
    public Insets getInsets() {
      return new Insets(10,10,10,10);
    }
    
    JToggleButton button;
    JButton moins;
    JTextField duree;
    JButton plus;
    JLabel seconde;
}


