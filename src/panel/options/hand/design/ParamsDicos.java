/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options.hand.design;

import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JPanel;

/**
 *
 * @author cantual
 */
public class ParamsDicos extends JPanel {
    
    public ParamsDicos() {
        ListItem panelList = new ListItem(true, true, true);
        
        GridLayout layout = new GridLayout();
        this.setLayout(layout);
        
        this.add(panelList);
    }
    
    @Override
    public Insets getInsets() {
      return new Insets(10,10,10,10);
    }
}