/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.components;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

/**
 *
 * @author manciefr
 */
public class CustomCheckBox extends JCheckBox {
    
    private final ImageIcon empty;
    private final ImageIcon checked;

    public CustomCheckBox() {
        this(new ImageIcon("./images/checkbox/checkbox-empty_small.png"), 
                new ImageIcon("./images/checkbox/checkbox-ticked_small.png"));
    }
    
    public CustomCheckBox(ImageIcon empty, ImageIcon checked) {
        super("", empty);
        this.empty = empty;
        this.checked = checked;
        this.setSelectedIcon(checked);
    }
    
    public ImageIcon getEmpty() {
        return empty;
    }

    public ImageIcon getChecked() {
        return checked;
    }
}
