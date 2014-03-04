/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.complet;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.KeyboardFocusManager;
import java.awt.Paint;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

/**
 *
 * @author legranma
 */
public class TestBar extends JFrame {

    private ItemBar[] itemsBar;
    PropertyChangeSupport support = new PropertyChangeSupport(this);

    public TestBar() {
        super("GradientTranslucentWindow");
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        setSize(1500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Set forwardKeys = getFocusTraversalKeys(
                KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS);
        Set newForwardKeys = new HashSet(forwardKeys);
        newForwardKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_RIGHT, 0));
        setFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS,
                newForwardKeys);

        Set backwardKeys = getFocusTraversalKeys(
                KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS);
        Set newBackwardKeys = new HashSet(backwardKeys);
        newBackwardKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_LEFT, 0));
        setFocusTraversalKeys(KeyboardFocusManager.BACKWARD_TRAVERSAL_KEYS,
                newBackwardKeys);

        ItemBar tableau[] = {new ItemBarDico(), new ItemBarClaviers(), new ItemBarCommandes(),
            new ItemBarRelecture(), new ItemBarRetours(), new ItemBarStop(), new ItemBarProfil(),
            new ItemBarOutils()};


        itemsBar = tableau;

        setLayout(new FlowLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridx = 0;
        gbc.gridy = 0;

        JPanel buttons = new JPanel();

        buttons.setLayout(new GridBagLayout());
        buttons.setOpaque(false);
        add(buttons);

        for (int i = 0; i < itemsBar.length; i++) {

            buttons.add(itemsBar[i], gbc);
            gbc.gridx++;

            itemsBar[i].addPropertyChangeListener("changeFocus", new PropertyChangeListener() {
                @Override
                public void propertyChange(PropertyChangeEvent evt) {

                    for (int i = 0; i < itemsBar.length; i++) {
                        String title = (String) evt.getNewValue();
                        System.out.println(title);
                        if (!title.equals(itemsBar[i].title.getText())) {
                            itemsBar[i].buttonParam.setVisible(false);
                            System.out.println(itemsBar[i].title.getText());
                        }
                    }
                }
            });
        }
        
        buttons.setVisible(true);
        //itemsBar[0].title.requestFocusInWindow();
    }
}
