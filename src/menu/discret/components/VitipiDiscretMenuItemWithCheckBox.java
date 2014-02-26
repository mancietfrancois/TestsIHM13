/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.components;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

/**
 *
 * @author manciefr
 */
public class VitipiDiscretMenuItemWithCheckBox extends VitipiDiscretMenuItem {

    private static final String CHECKBOX_EMPTY_IMAGE_PATH = "./images/checkbox/checkbox-empty_small.png";
    private static final String CHECKBOX_SELECTED_IMAGE_PATH = "./images/checkbox/checkbox-ticked_small.png";
    private static final Dimension DEFAULT_CHECKBOX_SIZE = new Dimension(36, 36);
    protected JCheckBox checkbox;

    public VitipiDiscretMenuItemWithCheckBox(String name, ImageIcon icon, Color color) {
        super(name, icon, color);
        initCheckboxComponent();
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
    
    @Override
    public void setFocusOnPanel(boolean isFocused) {
        if (isFocused) {
            this.setBackground(DEFAULT_FOCUSED_COLOR);
            this.checkbox.setBackground(DEFAULT_FOCUSED_COLOR);
        } else {
            this.setBackground(DEFAULT_COLOR);
            this.checkbox.setBackground(DEFAULT_COLOR);
        }
        this.validate();
        this.repaint();
    }
}
