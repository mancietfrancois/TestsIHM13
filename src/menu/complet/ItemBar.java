/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.complet;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author legranma
 */
public class ItemBar extends JPanel {

    protected JLabel title;
    protected ArrayList<JComponent> items;
    protected JPanel colorPanel;
    protected JButton buttonParam;
    protected JPanel panelItem;

    public ItemBar() {
        setLayout(new BorderLayout());
        
        panelItem = new JPanel();

        panelItem.setLayout(new BorderLayout());
        panelItem.setPreferredSize(new Dimension(100,100));
        title = new JLabel("Titre");
        items = new ArrayList<>();
        colorPanel = new JPanel();
        buttonParam = new JButton("Parametre");
        buttonParam.setVisible(false);
        buttonParam.setPreferredSize(new Dimension(100,30));
        panelItem.add(title, BorderLayout.PAGE_START);
        panelItem.add(colorPanel, BorderLayout.PAGE_END);

        add(panelItem,BorderLayout.NORTH);
        add(buttonParam,BorderLayout.SOUTH);

        buttonParam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            buttonParam.setVisible(false);
            }
        });
    }
}
