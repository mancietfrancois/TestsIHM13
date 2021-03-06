/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options;

import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JPanel;
import panel.options.hand.design.ListItem;

/**
 *
 * @author cantual
 */
public class ParamsProfil extends JPanel {
    
    public ParamsProfil() {
        
        panelList = new ListItem(true, true, true);
        
        GridLayout layout = new GridLayout();
        this.setLayout(layout);
        
        this.add(panelList);
    }
    
    @Override
    public Insets getInsets() {
      return new Insets(10,10,10,10);
    }
    
    // ----------------- Accesseurs ------------------------
    public String getItemSelected() {
        return panelList.getItemSelected();
    }
    
    public void setItems(String[] data) {
        panelList.setItems(data);
    }

    // -------------------- Events -------------------------
    
    public void btnAddMouseClicked() { 
        panelList.btnAddMouseClicked();
    }
    public void btnCreateMouseClicked() { 
        panelList.btnCreateMouseClicked();
    }
    public void btnSupprMouseClicked() { 
        panelList.btnSupprMouseClicked();
    }
    public void itemSelected(int i) { 
        panelList.itemSelected(i);
    }
    
    // ----------------- Attributs ---------------------------
    ListItem panelList;
}