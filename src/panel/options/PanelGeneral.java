/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options;

import javax.swing.JPanel;
import panel.options.hand.design.AbstractSpecificPanel;

/**
 *
 * @author legranma
 */
public class PanelGeneral extends AbstractSpecificPanel {

    public PanelGeneral(String title) {
        super(title);
    }

    @Override
    protected JPanel generateSpecificPanel() {
        return new ParamsGeneral();
    }

}