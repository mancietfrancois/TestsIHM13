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
public class ItemBarRelecture extends ItemBar {

    private JButton btn_rel;

    public ItemBarRelecture() {
        title.setText("Relectures");
        colorPanel.setBackground(utils.Constantes.DEFAULT_CORRECTIONS_COLOR);

        ImageIcon ico_relect = new ImageIcon(utils.Constantes.PATH_DIR_IMAGES + "Vitipi_Play1.png");
        btn_rel = new JButton(resize(ico_relect));
        items.add(btn_rel);
        
        addCompCenter();
    }
}
