/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.complet;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;

/**
 *
 * @author legranma
 */
public class ItemBarProfil extends ItemBar {

    private JButton btn_save;
    private JComboBox cmb_pro;

    public ItemBarProfil() {
        title.setText("Profil");
        panelItem.setPreferredSize(new Dimension(200, 100));

        colorPanel.setBackground(utils.Constantes.DEFAULT_PROFILE_COLOR);
        ImageIcon ico_save = new ImageIcon(utils.Constantes.PATH_DIR_IMAGES+"Vitipi_Enregistrer.png");
        btn_save = new JButton(resize(ico_save));
        cmb_pro = new JComboBox();
        
        items.add(cmb_pro);
        items.add(btn_save);
        
        addCompCenter();

    }
}
