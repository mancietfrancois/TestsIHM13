/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;


/**
 *
 * @author manciefr
 */
public class CustomCheckBox extends JCheckBox {
    
    public static final String CHECKBOX_EMPTY_IMAGE_PATH = "./images/checkbox/checkbox-empty_small2.png";
    public static final String CHECKBOX_SELECTED_IMAGE_PATH = "./images/checkbox/checkbox-ticked_small2.png";
    
    private Dimension CHECKBOX_DIMENSION;
    
    public CustomCheckBox(Dimension d) {
        super();
        CHECKBOX_DIMENSION = d;
        setIcon(new ImageIcon(CHECKBOX_EMPTY_IMAGE_PATH));
        setSelectedIcon(new ImageIcon(CHECKBOX_SELECTED_IMAGE_PATH));
    }
    
        public CustomCheckBox() {
            this(new Dimension(25, 25));
    }
    
    @Override
    public Dimension getPreferredSize() {
        return CHECKBOX_DIMENSION;
    }
    
    @Override
    public Dimension getMinimumSize() {
        return CHECKBOX_DIMENSION;
    }
    
    @Override
    public Dimension getMaximumSize() {
        return CHECKBOX_DIMENSION;
    }    
}
