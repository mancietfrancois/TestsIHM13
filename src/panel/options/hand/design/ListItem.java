/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options.hand.design;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author cantual
 */
public class ListItem extends JPanel{
    
    public ListItem(boolean add, boolean create, boolean delete) {
        
        // ------------- Instenciations des éléments graphiques ----------------
        
        // Panel 1 et contenu
        JScrollPane panel1 = new JScrollPane();

        // Panel 2 et contenu
        JPanel panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(10, 10, 10, 10) );
        
        btnAdd = new Bouton("Ajouter");
        btnCreate = new Bouton("Créer");
        btnSuppr = new Bouton("Supprimer");
        
        // ------------- Attribution des layouts -------------------------------
        
        // Layout principal : Border Layout
        this.setLayout(new BorderLayout());

        // Layout associé au panel2 : BoxLayout 
        BoxLayout panel2Layout = new BoxLayout(panel2, BoxLayout.Y_AXIS);
        panel2.setLayout(panel2Layout);
        
        // ---------------- Association des éléments graphiques ----------------
        
        this.add(panel1, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.EAST);
            if (add)
                panel2.add(btnAdd);
            if (create)
                panel2.add(btnCreate);
            if (delete)
                panel2.add(btnSuppr);
    }
    
    public class Bouton extends JButton{
    
        public Bouton(String name) {
            
            super(name);
            
            this.setMaximumSize(new Dimension(150, 25));
            this.setMaximumSize(new Dimension(150, 25));
            this.setMaximumSize(new Dimension(150, 25));

        }
    }
    
    private Bouton btnAdd;
    private Bouton btnCreate;
    private Bouton btnSuppr;
    
    
    //respect de la guideline Windows : http://msdn.microsoft.com/en-us/library/windows/desktop/aa511279.aspx
    // ou de moins tentative
}
