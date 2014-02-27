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
    
    public static final Dimension DEFAULT_ILLUSTRATION_SIZE = new Dimension(50, 50);
    public static final Dimension DEFAULT_COLOR_PANEL_SIZE = new Dimension(13, 53);
    public static final Dimension DEFAULT_PANEL_SIZE = new Dimension(275, 55);
    public static final Dimension DEFAULT_TITLE_SIZE = new Dimension(140, 15);
    
    public VitipiDiscretMenu(String name, ImageIcon icon, Color color) {
        this.setSize(DEFAULT_PANEL_SIZE);
        this.setIcon(icon);        
        this.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK),
                BorderFactory.createMatteBorder(0, 13, 0, 0, color)));
        this.setText(name);
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
