/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package testparamgen;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author legranma
 */
public abstract class  Param extends javax.swing.JPanel {

    /**
     * Creates new form Param
     */ 
      
    public Param() {
        initComponents();
        
        panel_Perso.setLayout(new FlowLayout());
        setPanel(personliserParams());
       
    }

    public abstract JPanel personliserParams();
    
    private void setPanel(JPanel panelPerso_)
    {
        
        panel_Perso.add(panelPerso_);
        
       repaint();
       validate();
        
    }
    
    public void setTitle(String text)
    {
        lbl_titreParam.setText(text);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Valider = new javax.swing.JButton();
        btn_Annuler = new javax.swing.JButton();
        btn_Appliquer = new javax.swing.JButton();
        lbl_titreParam = new javax.swing.JLabel();
        panel_Perso = new javax.swing.JPanel();

        btn_Valider.setText("Valider");
        btn_Valider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ValiderActionPerformed(evt);
            }
        });

        btn_Annuler.setText("Annuler");

        btn_Appliquer.setText("Appliquer");

        lbl_titreParam.setText("Titre du param�tre");

        javax.swing.GroupLayout panel_PersoLayout = new javax.swing.GroupLayout(panel_Perso);
        panel_Perso.setLayout(panel_PersoLayout);
        panel_PersoLayout.setHorizontalGroup(
            panel_PersoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 417, Short.MAX_VALUE)
        );
        panel_PersoLayout.setVerticalGroup(
            panel_PersoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Valider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Annuler)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_Appliquer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_titreParam)
                            .addComponent(panel_Perso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titreParam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Perso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Valider)
                    .addComponent(btn_Annuler)
                    .addComponent(btn_Appliquer))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_ValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ValiderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_ValiderActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Annuler;
    private javax.swing.JButton btn_Appliquer;
    private javax.swing.JButton btn_Valider;
    private javax.swing.JLabel lbl_titreParam;
    private javax.swing.JPanel panel_Perso;
    // End of variables declaration//GEN-END:variables
}
