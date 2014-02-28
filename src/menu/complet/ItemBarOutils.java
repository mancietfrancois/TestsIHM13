/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.complet;

import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author legranma
 */
public class ItemBarOutils extends ItemBar{
    
    private JButton btn_tools;
    
    public ItemBarOutils()
    {
        title.setText("Barre d'outils");
        colorPanel.setBackground(utils.Constantes.DEFAULT_TOOLBAR_COLOR);
        
        ImageIcon ico_tool = new ImageIcon(utils.Constantes.PATH_DIR_IMAGES+"Vitipi_Rotate.png");
        btn_tools = new JButton(resize(ico_tool));
        
        items.add(btn_tools);
        
        addCompCenter();
               
    }
    
}
