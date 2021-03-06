/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.components;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author manciefr
 */
public class VitipiDiscretMenuItem extends JMenuItem {
    
    public static final Dimension DEFAULT_ILLUSTRATION_SIZE = new Dimension(50, 50);
    public static final Dimension DEFAULT_COLOR_PANEL_SIZE = new Dimension(10, 53);
    public static final Dimension DEFAULT_PANEL_SIZE = new Dimension(285, 55);
    public static final Dimension DEFAULT_TITLE_SIZE = new Dimension(155, 15);
    
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
        this.add(Box.createRigidArea(new Dimension(10,0)));
        
        this.applyComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 1));
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
    
    @Override
    public void setText(String txt) {
        jLabelNomItem.setText(txt);
    }
    
    public String getLabelText() {
        return jLabelNomItem.getText();
    }
    
    public void changeIcon(Icon icon) {
        illustrationOption.setIcon(icon);
    }
    

}
