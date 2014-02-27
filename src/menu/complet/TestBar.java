/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.complet;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author legranma
 */
public class TestBar extends JFrame {

    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JPanel params;

    public TestBar() {
        super("GradientTranslucentWindow");
        setBackground(new Color(0, 0, 0, 0));
        setSize(410, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button1 = new JButton("Bouton");
        button1.setVisible(true);
        button2 = new JButton("Bouton");
        button2.setVisible(true);
        button3 = new JButton("Bouton");
        button3.setVisible(true);
        button4 = new JButton("Bouton");
        button4.setVisible(true);
        button5 = new JButton("Bouton");
        button5.setVisible(true);
        button6 = new JButton("Bouton");
        button6.setVisible(true);
        button7 = new JButton("Bouton");
        button7.setVisible(true);
        button8 = new JButton("Bouton");
        button8.setVisible(true);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                params.setVisible(true);
                button6.setVisible(false);
                button7.setVisible(false);
                button8.setVisible(false);
                pack();
            }
        });

        button5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                params.setVisible(false);
                pack();
            }
        });
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;

        JPanel buttons = new JPanel() {
            protected void paintComponent(Graphics g) {
                if (g instanceof Graphics2D) {
                    final int R = 255;
                    final int G = 255;
                    final int B = 255;

                    Paint p =
                            new GradientPaint(0.0f, 0.0f, new Color(R, G, B, 0),
                            0.0f, getHeight(), new Color(R, G, B, 255), true);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setPaint(p);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            }
        };
        GridLayout buttonsGrid = new GridLayout(1, 4);
        buttons.setLayout(buttonsGrid);
        params = new JPanel() {
            protected void paintComponent(Graphics g) {
                if (g instanceof Graphics2D) {
                    final int R = 255;
                    final int G = 255;
                    final int B = 255;

                    Paint p =
                            new GradientPaint(0.0f, 0.0f, new Color(R, G, B, 0),
                            0.0f, getHeight(), new Color(R, G, B, 0), true);
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.setPaint(p);
                    g2d.fillRect(0, 0, getWidth(), getHeight());
                }
            }
        };

        GridLayout paramsGrid = new GridLayout(1, 4);
        params.setLayout(paramsGrid);

        add(buttons, gbc);
        buttons.add(button1);
        buttons.add(button2);
        buttons.add(button3);
        buttons.add(button4);

        gbc.gridy = 1;
        add(params, gbc);


        params.add(button5);
        params.add(button6);
        params.add(button7);
        params.add(button8);

        buttons.setVisible(true);
        params.setVisible(false);
        pack();
    }
}
