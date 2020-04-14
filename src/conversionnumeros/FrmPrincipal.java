/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversionnumeros;

import javax.swing.JOptionPane;

/**
 *
 * @author tesoem
 */
public class FrmPrincipal extends javax.swing.JFrame {
    
    private void cerrar(){String botones [] = { "Cerrar" , "Cancelar"};
        int respuesta = JOptionPane.showOptionDialog(this,"Deseas cerrar el programa", "Confirmacion", 0, 0, null, botones, this);
        if (respuesta== JOptionPane.YES_OPTION);
        this.dispose();
    }

    /**
     * Creates new form FrmPrincipal
     */
    public FrmPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }
     public static boolean controlSuma = false;
    public static boolean controlResta = false;
    public static boolean controlDivision = false;
    public static boolean controlMultiplicacion = false;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        suma = new javax.swing.JButton();
        resta = new javax.swing.JButton();
        division = new javax.swing.JButton();
        multiplicacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setText(" Menu");

        suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversionnumeros/imagenes/more_32.png"))); // NOI18N
        suma.setText("Suma");
        suma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sumaMouseClicked(evt);
            }
        });
        suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumaActionPerformed(evt);
            }
        });

        resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversionnumeros/imagenes/button_minus_red.png"))); // NOI18N
        resta.setText("Resta");
        resta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restaMouseClicked(evt);
            }
        });
        resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restaActionPerformed(evt);
            }
        });

        division.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversionnumeros/imagenes/key_fw_slash.png"))); // NOI18N
        division.setText("Division");
        division.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                divisionMouseClicked(evt);
            }
        });

        multiplicacion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/conversionnumeros/imagenes/cross.png"))); // NOI18N
        multiplicacion.setText("Multiplicacion");
        multiplicacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                multiplicacionMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(multiplicacion)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(division)
                    .addComponent(suma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(resta)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(suma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(division)
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resta)
                            .addComponent(multiplicacion))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  //  public static boolean controlsuma = false;
    // public static boolean controlresta= false;
    private void restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_restaActionPerformed

    private void sumaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sumaMouseClicked
        // TODO add your handling code here:
        
        FrmSuma frmSuma =  new FrmSuma();
        frmSuma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_sumaMouseClicked

    private void restaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restaMouseClicked
        // TODO add your handling code here:
       FrmResta frmResta = new FrmResta();
       frmResta.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_restaMouseClicked

    private void multiplicacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_multiplicacionMouseClicked
        // TODO add your handling code here:
        FrmMultiplicacion frmMultiplicacion = new FrmMultiplicacion();
        frmMultiplicacion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_multiplicacionMouseClicked

    private void divisionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_divisionMouseClicked
        // TODO add your handling code here:
        FrmDivision frmDivision = new FrmDivision();
        frmDivision.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_divisionMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_formWindowClosing

    private void sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sumaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton division;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton multiplicacion;
    private javax.swing.JButton resta;
    private javax.swing.JButton suma;
    // End of variables declaration//GEN-END:variables
}
