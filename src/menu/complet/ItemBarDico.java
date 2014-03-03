/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.complet;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author legranma
 */
public class ItemBarDico extends ItemBar {

    private JButton lbl_dico;

    public ItemBarDico() {

        title.setText("Dictionnaire");
        colorPanel.setBackground(utils.Constantes.DEFAULT_DICTIONNARIES_COLOR);
        ImageIcon icon_dico = new ImageIcon(utils.Constantes.PATH_IMAGES_BARRE_DICO);
        lbl_dico = new JButton(icon_dico);

        items.add(lbl_dico);

        addCompCenter();

        lbl_dico.addActionListener(new ActionListener()
        {

            @Override
            public void actionPerformed(ActionEvent e) {
                lbl_dico.setFocusable(false);
            }
            
        });
    }
}
