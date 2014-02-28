/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;


/**
 *
 * @author manciefr
 */
public class CustomRadioButton extends JRadioButton {
    
    public static final String RADIO_BUTTON_EMPTY_IMAGE_PATH = "./images/radioButton/radiobutton-unchecked.png";
    public static final String RADIO_BUTTON_SELECTED_IMAGE_PATH = "./images/radioButton/radiobutton-checked.png";
    
    private Dimension RADIO_BUTTON_DIMENSION;
    
    public CustomRadioButton() {
        this(new Dimension(25, 25));
    }
    
    public CustomRadioButton(Dimension d) {
        super();
        RADIO_BUTTON_DIMENSION = d;
        setIcon(new ImageIcon(RADIO_BUTTON_EMPTY_IMAGE_PATH));
        setSelectedIcon(new ImageIcon(RADIO_BUTTON_EMPTY_IMAGE_PATH));
    }
    
    @Override
    public Dimension getPreferredSize() {
        return RADIO_BUTTON_DIMENSION;
    }
    
    @Override
    public Dimension getMinimumSize() {
        return RADIO_BUTTON_DIMENSION;
    }
    
    @Override
    public Dimension getMaximumSize() {
        return RADIO_BUTTON_DIMENSION;
    }    
}
