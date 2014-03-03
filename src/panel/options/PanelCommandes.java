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
public class PanelCommandes extends AbstractSpecificPanel {

    private static final long serialVersionUID = 1L;

    public PanelCommandes(String title) {
        super(title);
    }

    @Override
    protected JPanel generateSpecificPanel() {
        return new ParamsCommandes();
    }

}