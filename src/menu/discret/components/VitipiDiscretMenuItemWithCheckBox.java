/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.components;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author manciefr
 */
public class VitipiDiscretMenuItemWithCheckBox extends VitipiDiscretMenuItem {

    private static final String CHECKBOX_EMPTY_IMAGE_PATH = "./images/checkbox/checkbox-empty_small2.png";
    private static final String CHECKBOX_SELECTED_IMAGE_PATH = "./images/checkbox/checkbox-ticked_small2.png";
    private static final Dimension DEFAULT_CHECKBOX_SIZE = new Dimension(25, 25);
    protected JCheckBox checkbox;

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
        checkbox = new JCheckBox();
        checkbox.setPreferredSize(DEFAULT_CHECKBOX_SIZE);
        checkbox.setMaximumSize(DEFAULT_CHECKBOX_SIZE);
        checkbox.setMinimumSize(DEFAULT_CHECKBOX_SIZE);

        checkbox.setIcon(new ImageIcon(CHECKBOX_EMPTY_IMAGE_PATH));
        checkbox.setSelectedIcon(new ImageIcon(CHECKBOX_SELECTED_IMAGE_PATH));
        this.add(checkbox);
        this.validate();
        this.repaint();
    }
}
