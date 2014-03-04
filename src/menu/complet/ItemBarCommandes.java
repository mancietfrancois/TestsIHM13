/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.complet;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author legranma
 */
public class ItemBarCommandes extends ItemBar {

    private JButton btn_gomme;
    private JButton btn_micro;
    
    public ItemBarCommandes() {
        title.setText("Commandes");
        widthItem = 200;
        panelItem.setPreferredSize(new Dimension(widthItem,heighItem));
        ImageIcon icon_gomme = new ImageIcon(utils.Constantes.PATH_DIR_IMAGES_BARRE+"Vitipi_Gomme.gif");
        ImageIcon icon_micro = new ImageIcon(utils.Constantes.PATH_DIR_IMAGES_BARRE+"Vitipi_Micro.png");

        colorPanel.setBackground(utils.Constantes.DEFAULT_CORRECTIONS_COLOR);
    
        btn_gomme = new JButton(icon_gomme);
        btn_micro = new JButton(icon_micro);
                
        items.add(btn_gomme);
        items.add(btn_micro);
        
        addCompCenter();
        
         
        
    }
}
