/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options.hand.design.utils;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;

/**
 *
 * @author cantual
 */
public class TitledSeparator extends JPanel {
    
    public TitledSeparator(String titre) {
        
        label = new JLabel(" " + titre + " ");
        separator = new JSeparator();
        
        //BorderLayout layout = new BorderLayout();
        //this.setLayout(layout);
        label.setAlignmentX(LEFT_ALIGNMENT);
        this.add(label);
        //this.add(separator, BorderLayout.CENTER);
        
    }
    
    JLabel label;
    JSeparator separator;
}
