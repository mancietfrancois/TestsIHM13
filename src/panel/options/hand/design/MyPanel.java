/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options.hand.design;

import java.awt.Insets;
import javax.swing.JComponent;
import javax.swing.JPanel;

/**
 *
 * @author cantual
 */
public class MyPanel extends JPanel{
    
    public void setSize(JComponent jc) { 
        jc.setMaximumSize(jc.getPreferredSize()); 
    }
    
    @Override
    public Insets getInsets() {
      return new Insets(10,10,10,10);
    }
    
}
