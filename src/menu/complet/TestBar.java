/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.complet;

import java.awt.BorderLayout;
import java.awt.Color;
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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author legranma
 */
public class TestBar extends JFrame {

  

    public TestBar() {
        super("GradientTranslucentWindow");
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        setSize(1500, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ItemBar itemDico = new ItemBarDico();        
        ItemBar itemClav = new ItemBarClaviers();
        
   
        setLayout(new FlowLayout());
        GridBagConstraints gbc = new GridBagConstraints();
       
        gbc.fill = GridBagConstraints.BOTH;
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
        
        buttons.setLayout(new GridBagLayout());
       
        add(buttons);
        buttons.add(itemDico,gbc);
        gbc.gridx = 1;
        buttons.add(itemClav,gbc);
        
        gbc.gridx = 2;
        buttons.add(new ItemBarCorrections(),gbc);
        
        gbc.gridx = 3;
        buttons.add(new ItemBarRelecture(),gbc);
        
        gbc.gridx = 4;
        buttons.add(new ItemBarRetours());
        
        gbc.gridx = 5;
        buttons.add(new ItemBarStop());
        
        gbc.gridx = 6;        
        buttons.add(new ItemBarProfil());
        
        gbc.gridx = 7;        
        buttons.add(new ItemBarOutils());
              
    }
}
