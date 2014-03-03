/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author cantual
 */
public class ParamsToolBar extends JPanel{
    
    public ParamsToolBar() {
        
        // ------------- Instenciations des �l�ments graphiques ----------------
        
        // Panel 1 et contenu
        JPanel panel1 = new JPanel();
        panel1.setBorder(new EmptyBorder(10, 10, 10, 10) );
        
        scrollPane = new JScrollPane();

        // Panel 2 et contenu
        JPanel panel2 = new JPanel();
        panel2.setBorder(new EmptyBorder(10, 10, 10, 10) );
        
        btnAdd = new JButton("Ajouter");
        btnCreate = new JButton("Cr�er");
        btnSuppr = new JButton("Supprimer");
        
        // D�finition des attributs des �l�ments (� revoir)
        btnAdd.setPreferredSize(new Dimension(100, 25));
        btnCreate.setPreferredSize(new Dimension(100, 25));
        btnSuppr.setPreferredSize(new Dimension(100, 25));
        
        btnAdd.setMaximumSize(new Dimension(100, 25));
        btnCreate.setMaximumSize(new Dimension(100, 25));
        btnSuppr.setMaximumSize(new Dimension(100, 25));
        
        btnAdd.setMinimumSize(new Dimension(100, 25));
        btnCreate.setMinimumSize(new Dimension(100, 25));
        btnSuppr.setMinimumSize(new Dimension(100, 25));
        
        // ------------- Attribution des layouts -------------------------------
        
        // Layout principal : Border Layout
        this.setLayout(new BorderLayout());

        // Layout associ� au panel : BoxLayout 
        BoxLayout btnsLayout = new BoxLayout(panel2, BoxLayout.Y_AXIS);
        panel2.setLayout(btnsLayout);
        
        // ---------------- Association des �l�ments graphiques ----------------
        
        this.add(panel1, BorderLayout.CENTER);
            panel1.add(scrollPane);
        this.add(panel2, BorderLayout.EAST);
            panel2.setPreferredSize(new Dimension (100, 0));
            panel2.add(btnAdd);
            panel2.add(btnCreate);
            panel2.add(btnSuppr);
    }
    
    private JScrollPane scrollPane;
    private JButton btnAdd;
    private JButton btnCreate;
    private JButton btnSuppr;
    
    //respect de la guideline Windows : http://msdn.microsoft.com/en-us/library/windows/desktop/aa511279.aspx
    // ou de moins tentative
}

