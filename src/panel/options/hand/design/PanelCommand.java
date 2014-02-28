/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options.hand.design;

import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author manciefr
 */
public class PanelCommand extends JPanel {

    private JLabel keysTitle;
    private JLabel cancelWord;
    private JLabel cancelLetter;
    private JLabel vocal;
    private JTextField cancelCompletionKey;
    private JTextField cancelLastLetterKey;
    private JToggleButton vocalButton;

    public PanelCommand() {
        super();

        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        
        layout.setHorizontalGroup(null);
    }
}
