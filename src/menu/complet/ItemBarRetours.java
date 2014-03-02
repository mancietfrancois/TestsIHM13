/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.complet;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JSlider;

/**
 *
 * @author legranma
 */
public class ItemBarRetours extends ItemBar{
    
    private JButton btn_son;
    private JSlider slider;
    
    public ItemBarRetours()
    {
        title.setText("Retours");
        colorPanel.setBackground(utils.Constantes.DEFAULT_FEEDBACK_COLOR);
        panelItem.setPreferredSize(new Dimension(200,100));
        ImageIcon icon_son = new ImageIcon(utils.Constantes.PATH_DIR_IMAGES+"Vitipi_Son_coupe.png");
        
        btn_son = new JButton(resize(icon_son));
        slider = new JSlider();
        
        items.add(slider);
        items.add(btn_son);
        
        addCompCenter();
    }
    
}
