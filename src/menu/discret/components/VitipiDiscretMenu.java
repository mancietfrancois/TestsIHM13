/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.components;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author manciefr
 */
public class VitipiDiscretMenu extends JMenu {
    
    public static final Dimension DEFAULT_COLOR_PANEL_SIZE = VitipiDiscretMenuItem.DEFAULT_COLOR_PANEL_SIZE;
    public static final Dimension DEFAULT_PANEL_SIZE = VitipiDiscretMenuItem.DEFAULT_PANEL_SIZE;
    
    public VitipiDiscretMenu(String name, ImageIcon icon, Color color) {
        this.setSize(DEFAULT_PANEL_SIZE);
        this.setIcon(icon);
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK),
                BorderFactory.createMatteBorder(0, DEFAULT_COLOR_PANEL_SIZE.width, 0, 0, color)));
        this.setText(name);
        System.out.println(getFont());
    }
   
    @Override
    public Dimension getPreferredSize() {
        return DEFAULT_PANEL_SIZE;
    }
    
    @Override
    public Dimension getMinimumSize() {
        return DEFAULT_PANEL_SIZE;
    }
    
    @Override
    public Dimension getMaximumSize() {
        return DEFAULT_PANEL_SIZE;
    }

}
