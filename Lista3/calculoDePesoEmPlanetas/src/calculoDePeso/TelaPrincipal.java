/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculoDePeso;

import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        JtelaPrincipal = new javax.swing.JPanel();
        JblPesoNaTerra = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jbnCalcularPeso = new javax.swing.JButton();
        JlbSelecionaPlaneta = new javax.swing.JLabel();
        cbxMercurio = new javax.swing.JCheckBox();
        cbxMarte = new javax.swing.JCheckBox();
        cbxSaturno = new javax.swing.JCheckBox();
        cbxVenus = new javax.swing.JCheckBox();
        cbxJupiter = new javax.swing.JCheckBox();
        cbxUrano = new javax.swing.JCheckBox();

        jCheckBox1.setText("jCheckBox1");

        jCheckBox7.setText("jCheckBox7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JblPesoNaTerra.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JblPesoNaTerra.setText("Peso na Terra (Kg):");

        txtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesoActionPerformed(evt);
            }
        });

        jbnCalcularPeso.setText("Calcular Peso");
        jbnCalcularPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbnCalcularPesoActionPerformed(evt);
            }
        });

        JlbSelecionaPlaneta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JlbSelecionaPlaneta.setText("Selecione o Planeta:");

        cbxMercurio.setText("Mercúrio");
        cbxMercurio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxMercurioMouseClicked(evt);
            }
        });

        cbxMarte.setText("Marte");

        cbxSaturno.setText("Saturno");

        cbxVenus.setText("Vênus");

        cbxJupiter.setText("Júpiter");

        cbxUrano.setText("Urano");
        cbxUrano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxUranoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JtelaPrincipalLayout = new javax.swing.GroupLayout(JtelaPrincipal);
        JtelaPrincipal.setLayout(JtelaPrincipalLayout);
        JtelaPrincipalLayout.setHorizontalGroup(
            JtelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JtelaPrincipalLayout.createSequentialGroup()
                .addGap(171, 171, 171)
                .addGroup(JtelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JlbSelecionaPlaneta)
                    .addComponent(JblPesoNaTerra)
                    .addGroup(JtelaPrincipalLayout.createSequentialGroup()
                        .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jbnCalcularPeso))
                    .addGroup(JtelaPrincipalLayout.createSequentialGroup()
                        .addGroup(JtelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxMercurio)
                            .addComponent(cbxVenus))
                        .addGap(18, 18, 18)
                        .addGroup(JtelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxJupiter)
                            .addComponent(cbxMarte))
                        .addGap(18, 18, 18)
                        .addGroup(JtelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxSaturno)
                            .addComponent(cbxUrano))))
                .addContainerGap(377, Short.MAX_VALUE))
        );
        JtelaPrincipalLayout.setVerticalGroup(
            JtelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JtelaPrincipalLayout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(JblPesoNaTerra)
                .addGap(18, 18, 18)
                .addGroup(JtelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbnCalcularPeso))
                .addGap(28, 28, 28)
                .addComponent(JlbSelecionaPlaneta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JtelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxMercurio)
                    .addComponent(cbxMarte)
                    .addComponent(cbxSaturno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JtelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxVenus)
                    .addComponent(cbxJupiter)
                    .addComponent(cbxUrano))
                .addContainerGap(245, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JtelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JtelaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesoActionPerformed

    }//GEN-LAST:event_txtPesoActionPerformed

    private void jbnCalcularPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbnCalcularPesoActionPerformed
        double pesoNoPlaneta;

        boolean mercurio = (boolean) cbxMercurio.isSelected();
        boolean marte = (boolean) cbxMarte.isSelected();
        boolean saturno = (boolean) cbxSaturno.isSelected();
        boolean jupiter = (boolean) cbxJupiter.isSelected();
        boolean urano = (boolean) cbxUrano.isSelected();
        boolean venus = (boolean) cbxVenus.isSelected();

        try {

            double pesoTerra = Double.parseDouble(txtPeso.getText());

            if (mercurio) {
                pesoNoPlaneta = pesoTerra * 0.37;
                JOptionPane.showMessageDialog(null, "Seu peso em Mercúrio é: " + pesoNoPlaneta + " Kg");
            } else if (marte) {
                pesoNoPlaneta = pesoTerra * 0.38;
                JOptionPane.showMessageDialog(null, "Seu peso em Marte é: " + pesoNoPlaneta + " Kg");
            } else if (saturno) {
                pesoNoPlaneta = pesoTerra * 1.15; 
                JOptionPane.showMessageDialog(null, "Seu peso em Saturno é: " + pesoNoPlaneta + " Kg");
            } else if (jupiter) {
                pesoNoPlaneta = pesoTerra * 2.64; 
                JOptionPane.showMessageDialog(null, "Seu peso em Júpiter é: " + pesoNoPlaneta + " Kg");
            } else if (urano) {
                pesoNoPlaneta = pesoTerra * 1.17;
                JOptionPane.showMessageDialog(null, "Seu peso em Urano é: " + pesoNoPlaneta + " Kg");
            } else if (venus) {
                pesoNoPlaneta = pesoTerra * 0.88;
                JOptionPane.showMessageDialog(null, "Seu peso em Vênus é: " + pesoNoPlaneta + " Kg");
            } else {
                
                JOptionPane.showMessageDialog(null, "Selecione um planeta para calcular o peso.");
            }
        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Por favor, digite um peso válido.", "Erro de entrada", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jbnCalcularPesoActionPerformed

    private void cbxUranoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxUranoActionPerformed

    }//GEN-LAST:event_cbxUranoActionPerformed

    private void cbxMercurioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMercurioMouseClicked

    }//GEN-LAST:event_cbxMercurioMouseClicked

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JblPesoNaTerra;
    private javax.swing.JLabel JlbSelecionaPlaneta;
    private javax.swing.JPanel JtelaPrincipal;
    private javax.swing.JCheckBox cbxJupiter;
    private javax.swing.JCheckBox cbxMarte;
    private javax.swing.JCheckBox cbxMercurio;
    private javax.swing.JCheckBox cbxSaturno;
    private javax.swing.JCheckBox cbxUrano;
    private javax.swing.JCheckBox cbxVenus;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JButton jbnCalcularPeso;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables
}
