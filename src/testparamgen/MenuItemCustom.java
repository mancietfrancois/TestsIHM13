/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testparamgen;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;

/**
 *
 * @author Pierre
 */
public class MenuItemCustom extends javax.swing.JPanel {

    /**
     * Creates new form MenuItemCustom
     */
    public MenuItemCustom(String name, ImageIcon icon, Color color) {
        initComponents();
        jLabelNomItem.setText(name);
        illustrationOption.setIcon(icon);
        jPanelBorderColor.setBackground(color);
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

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        setMaximumSize(new java.awt.Dimension(250, 55));
        setMinimumSize(new java.awt.Dimension(250, 55));

        jPanelBorderColor.setBackground(new java.awt.Color(255, 255, 0));

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
        jLabelNomItem.setText("jLabel1");

        illustrationOption.setMaximumSize(new java.awt.Dimension(50, 50));
        illustrationOption.setMinimumSize(new java.awt.Dimension(50, 50));
        illustrationOption.setName(""); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBorderColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(illustrationOption, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNomItem, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomItem)
                .addContainerGap(27, Short.MAX_VALUE))
            .addComponent(illustrationOption, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
            .addComponent(jPanelBorderColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel illustrationOption;
    private javax.swing.JLabel jLabelNomItem;
    private javax.swing.JPanel jPanelBorderColor;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public Dimension getPreferredSize() {
        return new Dimension(252, 55);
    }
}
