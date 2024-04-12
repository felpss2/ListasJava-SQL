
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author 05136425016
 */

public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        JrPedra = new javax.swing.JRadioButton();
        JrPapel = new javax.swing.JRadioButton();
        JrTesoura = new javax.swing.JRadioButton();
        JbJogar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jLabel1.setText("Pedra, Papel ou Tesoura?");

        JrPedra.setText("Pedra");
        JrPedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JrPedraActionPerformed(evt);
            }
        });

        JrPapel.setText("Papel");

        JrTesoura.setText("Tesoura");

        JbJogar.setText("Jogar");
        JbJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbJogarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JrTesoura)
                    .addComponent(JrPapel)
                    .addComponent(JbJogar)
                    .addComponent(jLabel1)
                    .addComponent(JrPedra))
                .addContainerGap(134, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JrPedra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JrPapel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JrTesoura)
                .addGap(18, 18, 18)
                .addComponent(JbJogar)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JrPedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JrPedraActionPerformed

    }//GEN-LAST:event_JrPedraActionPerformed

    private void JbJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbJogarActionPerformed
        int numeroAleatorio;

        boolean pedra = (boolean) JrPedra.isSelected();
        boolean papel = (boolean) JrPapel.isSelected();
        boolean tesoura = (boolean) JrTesoura.isSelected();

        if (pedra) {
            JrPedra.setSelected(false);
            numeroAleatorio = radInt(0, 2);
            if (numeroAleatorio == 0) {
                JrPedra.doClick();
                JOptionPane.showMessageDialog(null, "Empate");
                JrPedra.setSelected(false);

            } else if (numeroAleatorio == 1) {
                JrPapel.doClick();
                JOptionPane.showMessageDialog(null, "Perdeu");
                JrPapel.setSelected(false);

            } else if (numeroAleatorio == 2) {
                JrTesoura.doClick();
                JOptionPane.showMessageDialog(null, "Venceu");
                JrTesoura.setSelected(false);
            }

        } else if (papel) {
            JrPapel.setSelected(false);
            numeroAleatorio = radInt(0, 2);
            if (numeroAleatorio == 0) {
                JrPedra.doClick();
                JOptionPane.showMessageDialog(null, "Venceu");
                JrPedra.setSelected(false);

            } else if (numeroAleatorio == 1) {
                JrPapel.doClick();
                JOptionPane.showMessageDialog(null, "Empate");
                JrPapel.setSelected(false);

            } else if (numeroAleatorio == 2) {
                JrTesoura.doClick();
                JOptionPane.showMessageDialog(null, "Perdeu");
                JrTesoura.setSelected(false);
            }

        } else if (tesoura) {
            JrTesoura.setSelected(false);
            numeroAleatorio = radInt(0, 2);
            if (numeroAleatorio == 0) {
                JrPedra.doClick();
                JOptionPane.showMessageDialog(null, "Perdeu");
                JrPedra.setSelected(false);

            } else if (numeroAleatorio == 1) {
                JrPapel.doClick();
                JOptionPane.showMessageDialog(null, "Venceu");
                JrPapel.setSelected(false);

            } else if (numeroAleatorio == 2) {
                JrTesoura.doClick();
                JOptionPane.showMessageDialog(null, "Empatou");
                JrTesoura.setSelected(false);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione alguma opção");
        }
    
    }//GEN-LAST:event_JbJogarActionPerformed

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

    public static int radInt(int min, int max) {
    java.util.Random rand = new java.util.Random();
    int randomNum = rand.nextInt((max - min) + 1) + min;
    return randomNum;
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JbJogar;
    private javax.swing.JRadioButton JrPapel;
    private javax.swing.JRadioButton JrPedra;
    private javax.swing.JRadioButton JrTesoura;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
