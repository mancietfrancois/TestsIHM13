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
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Paint;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.ImageIcon;
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
    protected JPanel panelCenter;

    public ItemBar() {        
        setLayout(new BorderLayout());
        //setBackground(new Color(0, 0, 0, 0));
        JPanel panelTitre = new JPanel();

        JPanel panelButtonParam = new JPanel(new BorderLayout());

        panelItem = new JPanel(new FlowLayout());
        panelCenter = new JPanel(new GridLayout());

        panelItem.setLayout(new BorderLayout());
        panelItem.setPreferredSize(new Dimension(100, 100));
        title = new JLabel("Titre");
        items = new ArrayList<>();

        colorPanel = new JPanel();
        buttonParam = new JButton("Parametre");
        buttonParam.setVisible(false);
        panelButtonParam.setPreferredSize(new Dimension(100, 30));

        panelTitre.add(title);
        panelTitre.setBackground(new Color(0, 0, 0, 0));
        panelItem.add(panelTitre, BorderLayout.PAGE_START);
        panelItem.add(panelCenter, BorderLayout.CENTER);
        panelItem.add(colorPanel, BorderLayout.PAGE_END);

        panelButtonParam.add(buttonParam, BorderLayout.CENTER);
        panelButtonParam.setBackground(new Color(0, 0, 0, 0));

        add(panelItem, BorderLayout.NORTH);
        add(panelButtonParam, BorderLayout.SOUTH);

        buttonParam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonParam.setVisible(false);
            }
        });

        colorPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                buttonParam.setVisible(true);
            }
        });
    }

    protected ImageIcon resize(ImageIcon ico) {
        Image img = ico.getImage();
        Image newimg = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);
    }

    protected void addCompCenter() {
        Iterator<JComponent> it = items.iterator();

        while (it.hasNext()) {
            JComponent j = it.next();

            panelCenter.add(j);
        }
    }
    
}