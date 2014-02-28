/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.components;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import utils.CustomCheckBox;

/**
 *
 * @author manciefr
 */
public class VitipiDiscretMenuItemWithCheckBox extends VitipiDiscretMenuItem {

    private static final Dimension DEFAULT_CHECKBOX_SIZE = new Dimension(25, 25);
    protected CustomCheckBox checkbox;

    public VitipiDiscretMenuItemWithCheckBox(String name, ImageIcon icon, Color color) {
        super(name, icon, color);
        initCheckboxComponent();
        
        //Permet d'homogénéiser le rendu graphique
        this.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (((VitipiDiscretMenuItem) e.getSource()).isArmed()) {
                    checkbox.setBackground(UIManager.getColor("MenuItem.selectionBackground"));
                } else {
                    checkbox.setBackground(UIManager.getColor("MenuItem.background"));
                }
            }
        });
    }

    public final void initCheckboxComponent() {
        checkbox = new CustomCheckBox(DEFAULT_CHECKBOX_SIZE);
        checkbox.setPreferredSize(DEFAULT_CHECKBOX_SIZE);
        checkbox.setMaximumSize(DEFAULT_CHECKBOX_SIZE);
        checkbox.setMinimumSize(DEFAULT_CHECKBOX_SIZE);

        this.add(checkbox);
        this.validate();
        this.repaint();
    }
}
