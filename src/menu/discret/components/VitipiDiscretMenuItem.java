/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.components;

import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author manciefr
 */
public class VitipiDiscretMenuItem extends JPanel {
    
    public static final Dimension DEFAULT_ILLUSTRATION_SIZE = new Dimension(50, 50);
    public static final Dimension DEFAULT_COLOR_PANEL_SIZE = new Dimension(13, 55);
    public static final Dimension DEFAULT_PANEL_SIZE = new Dimension(275, 55);
    public static final Dimension DEFAULT_TITLE_SIZE = new Dimension(140, 15);
    
    public static final Color DEFAULT_FOCUSED_COLOR = new Color(202, 217, 236);
    public static final Color DEFAULT_COLOR = new Color(240, 240, 240, 255);
    
    protected JLabel illustrationOption;
    protected JLabel jLabelNomItem;
    protected JPanel jPanelBorderColor;
    protected FlowLayout flowLayout;
    
    public VitipiDiscretMenuItem(String name, ImageIcon icon, Color color) {
        initComponents();
        jLabelNomItem.setText(name);
        illustrationOption.setIcon(icon);
        jPanelBorderColor.setBackground(color);
    }
    
    
    public final void initComponents() {
        illustrationOption = new JLabel();
        jPanelBorderColor = new JPanel();
        jLabelNomItem = new JLabel();
        
        setComponentsPreferredSize();
        flowLayout = new FlowLayout(FlowLayout.LEFT, 0, 0);
        
        
        this.setLayout(flowLayout);
        
        this.add(jPanelBorderColor);
        this.add(Box.createRigidArea(new Dimension(10,0)));
        this.add(illustrationOption);
        this.add(Box.createRigidArea(new Dimension(10,0)));
        this.add(jLabelNomItem);

        this.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        
        this.validate();
        this.repaint();
    }
    
    public void setComponentsPreferredSize() {
        jPanelBorderColor.setPreferredSize(DEFAULT_COLOR_PANEL_SIZE);
        jPanelBorderColor.setMaximumSize(DEFAULT_COLOR_PANEL_SIZE);
        jPanelBorderColor.setMinimumSize(DEFAULT_COLOR_PANEL_SIZE);
        jPanelBorderColor.validate();
        jPanelBorderColor.repaint();
        illustrationOption.setPreferredSize(DEFAULT_ILLUSTRATION_SIZE);
        illustrationOption.setMaximumSize(DEFAULT_ILLUSTRATION_SIZE);
        illustrationOption.setMinimumSize(DEFAULT_ILLUSTRATION_SIZE);
        jLabelNomItem.setPreferredSize(DEFAULT_TITLE_SIZE);
        jLabelNomItem.setMaximumSize(DEFAULT_TITLE_SIZE);
        jLabelNomItem.setMinimumSize(DEFAULT_TITLE_SIZE);
        this.setSize(DEFAULT_PANEL_SIZE);
    }

    
    @Override
    public Dimension getPreferredSize() {
        return DEFAULT_PANEL_SIZE;
    }
    
    @Override
    public Dimension getMinimumSize() {
        return DEFAULT_PANEL_SIZE;
    }
    
    @Override
    public Dimension getMaximumSize() {
        return DEFAULT_PANEL_SIZE;
    }
    
    public void setFocusOnPanel(boolean isFocused) {
        if (isFocused) {
            this.setBackground(DEFAULT_FOCUSED_COLOR);
        } else {
            this.setBackground(DEFAULT_COLOR);
        }
        this.validate();
        this.repaint();
    }

}
