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
public class ItemBarStop extends ItemBar {

    JButton btn_stop;

    public ItemBarStop() {
        
        title.setText("      ");
        colorPanel.setBackground(utils.Constantes.DEFAULT_SYSTEM_COLOR);

        ImageIcon ico_stop = new ImageIcon(utils.Constantes.PATH_DIR_IMAGES + "Vitipi_Stop.png");
        
        btn_stop = new JButton(resize(ico_stop));
        
        items.add(btn_stop);
        
        addCompCenter();
    }
}
