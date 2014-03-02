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
import java.awt.Paint;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.AWTEventListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

/**
 *
 * @author legranma
 */
public class TestBar extends JFrame {

    private ItemBar[] itemsBar;

    public TestBar() {
        super("GradientTranslucentWindow");
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        setSize(1500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ItemBar tableau[] = {new ItemBarDico(), new ItemBarClaviers(), new ItemBarCorrections(),
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

        }


        buttons.setVisible(true);

    }
}
