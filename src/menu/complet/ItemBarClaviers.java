/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.complet;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;

/**
 *
 * @author legranma
 */
public class ItemBarClaviers extends ItemBar{
    
    private JComponent comp_clavier;
    
    public ItemBarClaviers()
    {
        title.setText("Claviers");
        colorPanel.setBackground(utils.Constantes.DEFAULT_VIRTUAL_KEYBOARDS_COLOR);
        
        ImageIcon ico_clavier = new ImageIcon(utils.Constantes.PATH_DIR_IMAGES+"Vitipi_Clavier2.png");
        comp_clavier = new JButton(resize(ico_clavier));
        
        items.add(comp_clavier);
        
       addCompCenter();

    }
}
