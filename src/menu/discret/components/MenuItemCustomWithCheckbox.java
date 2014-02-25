/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package menu.discret.components;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

/**
 *
 * @author Pierre
 */
public class MenuItemCustomWithCheckbox extends javax.swing.JPanel {
    
    private static final Color DEFAULT_FOCUSED_COLOR = new Color(228, 239, 243);
    private static final Color DEFAULT_FOCUSED_BORDER_COLOR = new Color(168, 216, 235);
    private static final Color DEFAULT_COLOR = new Color(240, 240, 240, 255);
    
    private static final String CHECKBOX_EMPTY_IMAGE_PATH = "./images/checkbox/checkbox-empty_small.png";
    private static final String CHECKBOX_SELECTED_IMAGE_PATH = "./images/checkbox/checkbox-ticked_small.png";
    
    private static final Dimension DEFAULT_CHECKBOX_SIZE = new Dimension(21, 21);
    private static final Dimension DEFAULT_ILLUSTRATION_SIZE = new Dimension(50, 50);
    private static final Dimension DEFAULT_COLOR_PANEL_SIZE = new Dimension(13, 54);
    private static final Dimension DEFAULT_PANEL_SIZE = new Dimension(276, 55);
    
    /**
     * Creates new form MenuItemCustom
     */
    public MenuItemCustomWithCheckbox(String name, ImageIcon icon, Color color) {
        initComponents();
        setComponentsPreferredSize();
        jCheckBox1.setIcon(new ImageIcon(CHECKBOX_EMPTY_IMAGE_PATH));
        jCheckBox1.setSelectedIcon(new ImageIcon(CHECKBOX_SELECTED_IMAGE_PATH));
        jLabelNomItem.setText(name);
        illustrationOption.setIcon(icon);
        jPanelBorderColor.setBackground(color);
        
        this.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setFocusOnPanel(true);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setFocusOnPanel(false);
            }
            
            @Override
            public void mouseClicked(MouseEvent e) {
                if (jCheckBox1.isSelected()) {
                    jCheckBox1.setSelected(false);
                } else {
                    jCheckBox1.setSelected(true);
                }
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBorderColor = new javax.swing.JPanel();
        jLabelNomItem = new javax.swing.JLabel();
        illustrationOption = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();

        setMaximumSize(new java.awt.Dimension(276, 55));
        setMinimumSize(new java.awt.Dimension(276, 55));
        setPreferredSize(new java.awt.Dimension(276, 55));

        jPanelBorderColor.setBackground(new java.awt.Color(255, 255, 0));
        jPanelBorderColor.setMaximumSize(new java.awt.Dimension(13, 54));
        jPanelBorderColor.setMinimumSize(new java.awt.Dimension(13, 54));
        jPanelBorderColor.setPreferredSize(new java.awt.Dimension(13, 54));

        javax.swing.GroupLayout jPanelBorderColorLayout = new javax.swing.GroupLayout(jPanelBorderColor);
        jPanelBorderColor.setLayout(jPanelBorderColorLayout);
        jPanelBorderColorLayout.setHorizontalGroup(
            jPanelBorderColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        jPanelBorderColorLayout.setVerticalGroup(
            jPanelBorderColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabelNomItem.setFont(new java.awt.Font("Myriad Pro", 0, 14)); // NOI18N
        jLabelNomItem.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNomItem.setText("Activer Commande");

        illustrationOption.setMaximumSize(new java.awt.Dimension(36, 36));
        illustrationOption.setMinimumSize(new java.awt.Dimension(36, 36));
        illustrationOption.setName(""); // NOI18N
        illustrationOption.setPreferredSize(new java.awt.Dimension(36, 36));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBorderColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(illustrationOption, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNomItem, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox1)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(illustrationOption, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox1)
                            .addComponent(jLabelNomItem))
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addComponent(jPanelBorderColor, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel illustrationOption;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabelNomItem;
    private javax.swing.JPanel jPanelBorderColor;
    // End of variables declaration//GEN-END:variables

    @Override
    public Dimension getPreferredSize() {
        return DEFAULT_PANEL_SIZE;
    }

    private void setComponentsPreferredSize() {
        jCheckBox1.setPreferredSize(DEFAULT_CHECKBOX_SIZE);
        jPanelBorderColor.setPreferredSize(DEFAULT_COLOR_PANEL_SIZE);
        illustrationOption.setSize(DEFAULT_ILLUSTRATION_SIZE);
    }
    
    private void setFocusOnPanel(boolean isFocused) {
        if (isFocused) {
            this.setBackground(DEFAULT_FOCUSED_COLOR);
            this.setBorder(BorderFactory.createLineBorder(DEFAULT_FOCUSED_BORDER_COLOR, 1, true));
            this.jCheckBox1.setBackground(DEFAULT_FOCUSED_COLOR);
        } else {
            this.setBackground(DEFAULT_COLOR);
            this.setBorder(BorderFactory.createEmptyBorder());
            this.jCheckBox1.setBackground(DEFAULT_COLOR);
        }
        this.validate();
        this.repaint();
    }
    
    private void fireActionPerformed() {
        ActionEvent event = new ActionEvent(this, ActionEvent.ACTION_PERFORMED,
                "");
        for (ActionListener listener : getListeners(ActionListener.class)) {
            listener.actionPerformed(event);
        }
    }

    /**
     * Ajout de listener.
     *
     * @param listener : listener
     */
    public void addActionListener(ActionListener listener) {
        this.listenerList.add(ActionListener.class, listener);
    }

    /**
     * Suppression de listener
     *
     * @param listener : listener
     */
    public void removeActionListener(ActionListener listener) {
        this.listenerList.remove(ActionListener.class, listener);
    }
}
