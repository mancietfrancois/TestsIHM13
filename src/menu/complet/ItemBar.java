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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
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
    private PropertyChangeSupport support;

    public ItemBar() {

        support = new PropertyChangeSupport(this);

        /**
         * ********** Créer les panels *********
         */
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
        buttonParam.setFocusable(true);

        panelButtonParam.setPreferredSize(new Dimension(100, 30));
        panelButtonParam.add(buttonParam, BorderLayout.CENTER);

        panelTitre.add(title);

        panelItem.add(panelTitre, BorderLayout.PAGE_START);
        panelItem.add(panelCenter, BorderLayout.CENTER);
        panelItem.add(colorPanel, BorderLayout.PAGE_END);

        add(panelItem, BorderLayout.NORTH);
        add(panelButtonParam, BorderLayout.SOUTH);

        /**
         * ******* Ajoute les Listener *******
         */
        // On affiche le bouton paramètre si il rentre dans le colorPanel
        colorPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                support.firePropertyChange("changeFocus", null, title.getText());
                buttonParam.setVisible(true);
                buttonParam.requestFocusInWindow();
            }
        });

        // On cache le bouton paramètre si il sort du panelTitre
        panelTitre.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                buttonParam.setVisible(false);
            }
        });

        // On cache le bouton paramètre si il sort du boutonParametre
        buttonParam.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                if (e.getPoint().y > buttonParam.getHeight() ||
                        e.getPoint().x < 0 || e.getPoint().x > getWidth()) {
                    buttonParam.setVisible(false);
                }
            }
        });

        // On cache le bouton paramètre si on clique dessus
        buttonParam.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonParam.setVisible(false);
            }
        });

        // On cache le bouton paramètre si on appuie sur la touche UP
        buttonParam.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    items.get(0).requestFocusInWindow();
                    buttonParam.setVisible(false);
                }
            }
        });

        // On cache le bouton paramètre si on perd le focus
        buttonParam.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                buttonParam.setVisible(false);
            }
        });
    }

    protected ImageIcon resize(ImageIcon ico) {
        Image img = ico.getImage();
        Image newimg = img.getScaledInstance(50, 50, java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(newimg);
    }

    // Ajoute les composants dans le panel center
    // tous les composants écoutent un keyListener et un focusListener pour afficher ou cacher
    // le bouton paramètre. 
    protected void addCompCenter() {
        Iterator<JComponent> it = items.iterator();

        while (it.hasNext()) {
            JComponent j = it.next();

            //j.setFocusable(false);

            panelCenter.add(j);
            buttonParam.setVisible(false);

            // Quand on gagne le focus sur un composant on lance un événement
            // change focus qui est récupéré par la Frame et qui s'occupe de 
            // cacher tous les boutons paramètres.            
            j.addFocusListener(new FocusAdapter() {
                @Override
                public void focusGained(FocusEvent e) {
                     support.firePropertyChange("changeFocus", null, title.getText());
                    buttonParam.setVisible(true);
                }
            });


            // On affiche ou on cache le bouton paramètre si on appuie
            // sur les touches DOWN ou UP
            j.addKeyListener(
                    new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {

                    if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                        buttonParam.setVisible(true);
                        buttonParam.requestFocusInWindow();
                    }

                    if (e.getKeyCode() == KeyEvent.VK_UP) {

                        items.get(0).requestFocusInWindow();
                        buttonParam.setVisible(false);
                    }
                }
            });
        }

        // Quand la souris sort par le premier composant on cache le bouton paramètre
        // uniquement si il sort par la gauche
        items.get(0).addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                if (e.getPoint().x <= -1) {
                    buttonParam.setVisible(false);
                }
            }
        });

        // Quand la souris sort par le dernier composant on cache le bouton paramètre
        // uniquement si il sort par la droite
        items.get(items.size() - 1).addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                if (e.getPoint().x >= 100) {
                    buttonParam.setVisible(false);
                    System.out.println(e.getPoint().x);
                }
            }
        });
    }

    @Override
    public void addPropertyChangeListener(String pro, PropertyChangeListener listener) {
        support.addPropertyChangeListener(pro, listener);
    }

    @Override
    public void removePropertyChangeListener(String pro, PropertyChangeListener listener) {
        support.removePropertyChangeListener(pro, listener);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    @Override
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
}