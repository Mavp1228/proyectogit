/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositoio1;

/**
 *
 * @author user
 */
public class pricipal extends javax.swing.JFrame {

    /**
     * Creates new form pricipal
     */
    public pricipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmdcalcular = new javax.swing.JButton();
        cmdborrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtvalor1 = new javax.swing.JTextField();
        txtvalor2 = new javax.swing.JTextField();
        txtvalor3 = new javax.swing.JTextField();
        txtresultado = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 308, -1, -1));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("OBTENGA SU PORCENTAJE");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 160, 30));

        jLabel3.setText("PERSONA 1");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel4.setText("PERSONA 2");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel5.setText("PERSONA 3");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        cmdcalcular.setText("OBTENER PORCENTAJE");
        cmdcalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdcalcularActionPerformed(evt);
            }
        });
        jPanel4.add(cmdcalcular, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        cmdborrar.setText("BORRAR");
        cmdborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdborrarActionPerformed(evt);
            }
        });
        jPanel4.add(cmdborrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));

        jLabel6.setText("RESULTADO");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));
        jPanel4.add(txtvalor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 120, -1));
        jPanel4.add(txtvalor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 120, -1));
        jPanel4.add(txtvalor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 120, -1));

        txtresultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresultadoActionPerformed(evt);
            }
        });
        jPanel4.add(txtresultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 130, 20));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 420, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmdcalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdcalcularActionPerformed
        double valor1,valor2,valor3,pv1,pv2,pv3,vlt;
        String n1,n2,n3,ress;
        
        valor1 = Double.parseDouble(txtvalor1.getText());
        valor2 = Double.parseDouble(txtvalor2.getText());
        valor3 = Double.parseDouble(txtvalor3.getText());
        
        vlt = valor1 + valor2 + valor3;
        
        pv1 = valor1 + vlt / 100;
        
        pv2 = valor2 + vlt / 100;
        
        pv3 = valor3 + vlt / 100;
        
        ress= String.valueOf(cmdcalcular);
        
         txtresultado.setText(ress);
    }//GEN-LAST:event_cmdcalcularActionPerformed

    private void txtresultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtresultadoActionPerformed

    private void cmdborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdborrarActionPerformed
       txtvalor1.setText("");
      txtvalor2.setText("");
      txtvalor3.setText("");
      txtresultado.setText("");
      
      txtvalor1.requestFocusInWindow();
     
    }//GEN-LAST:event_cmdborrarActionPerformed

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
            java.util.logging.Logger.getLogger(pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pricipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pricipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdborrar;
    private javax.swing.JButton cmdcalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtresultado;
    private javax.swing.JTextField txtvalor1;
    private javax.swing.JTextField txtvalor2;
    private javax.swing.JTextField txtvalor3;
    // End of variables declaration//GEN-END:variables
}
