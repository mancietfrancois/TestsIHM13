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
    protected JPanel panelButtonParam;
    protected JButton buttonParam;
    protected JPanel panelItem;
    protected JPanel panelCenter;

    public ItemBar() {


        setLayout(new BorderLayout());
        setBackground(new Color(0, 0, 0, 0));
        JPanel panelTitre = new JPanel();
        setOpaque(false);
        panelButtonParam = new JPanel(new BorderLayout());
        panelButtonParam.setOpaque(false);

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
        panelButtonParam.add(buttonParam, BorderLayout.CENTER);

        panelTitre.add(title);

        panelItem.add(panelTitre, BorderLayout.PAGE_START);
        panelItem.add(panelCenter, BorderLayout.CENTER);
        panelItem.add(colorPanel, BorderLayout.PAGE_END);

        add(panelItem, BorderLayout.NORTH);
        add(panelButtonParam, BorderLayout.SOUTH);


        panelTitre.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                //System.out.println("color Enter");
                buttonParam.setVisible(false);
            }
        });
        
        colorPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                //System.out.println("color Enter");
                buttonParam.setVisible(true);
            }
        });
        
        buttonParam.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("button Exit");
                buttonParam.setVisible(false);
            }
        });
        
        buttonParam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonParam.setVisible(false);
                System.out.println("btn_param");

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
        items.get(0).addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                if (e.getPoint().x <= -1) {
                    System.out.println("Exit");
                    buttonParam.setVisible(false);
                }
            }
        });

        items.get(items.size()-1).addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                if (e.getPoint().x >= 100) {
                    System.out.println("Exit");
                    buttonParam.setVisible(false);

                    System.out.println(e.getPoint().x);
                }
            }
        });
    }
}