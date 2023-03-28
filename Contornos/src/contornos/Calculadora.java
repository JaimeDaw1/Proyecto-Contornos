/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package contornos;

/**
 *
 * @author jaimesm
 */
public class Calculadora extends javax.swing.JFrame {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
        btnCalcular.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        tfResul = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfOp2 = new javax.swing.JTextField();
        rdbSumar = new javax.swing.JRadioButton();
        rdbRestar = new javax.swing.JRadioButton();
        rdbmultiplicar = new javax.swing.JRadioButton();
        rdbDividir = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        tfOp1 = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        btnFin = new javax.swing.JButton();
        lblResul = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CALCULADORA");

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("OPERANDO 1:");

        jLabel2.setText("OPERANDO 2:");

        tfOp2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOp2KeyReleased(evt);
            }
        });

        buttonGroup1.add(rdbSumar);
        rdbSumar.setText("SUMAR");
        rdbSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSumarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbRestar);
        rdbRestar.setText("RESTAR");
        rdbRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbRestarActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbmultiplicar);
        rdbmultiplicar.setText("MULTIPLICAR");

        buttonGroup1.add(rdbDividir);
        rdbDividir.setText("DIVIDIR");

        jLabel3.setText("RESULTADO:");

        tfOp1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfOp1KeyReleased(evt);
            }
        });

        btnCalcular.setText("CALCULAR");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        btnFin.setText("FIN");
        btnFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinActionPerformed(evt);
            }
        });

        jButton1.setText("LIMPIAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdbSumar)
                            .addComponent(rdbRestar)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnCalcular)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                .addComponent(jButton1))
                            .addComponent(rdbmultiplicar))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(btnFin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(rdbDividir)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfOp2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfOp1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblResul)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfOp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(tfOp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(rdbSumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdbRestar)
                        .addGap(18, 18, 18)
                        .addComponent(rdbmultiplicar)
                        .addGap(18, 18, 18)
                        .addComponent(rdbDividir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(lblResul))
                        .addGap(108, 108, 108)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCalcular)
                    .addComponent(btnFin)
                    .addComponent(jButton1))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnFinActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double resultado = 0;
        String Op1=tfOp1.getText();
        String Op2= tfOp2.getText();
        try{
            double o1=Double.parseDouble(Op1);
            double o2=Double.parseDouble(Op2);
            if(rdbSumar.isSelected()){
                resultado= o1+o2;
                
            
                
            } 
            if(rdbRestar.isSelected()){
                resultado=o1-o2;
            }
            if(rdbmultiplicar.isSelected()){
                resultado=o1*o2;
            }
              if(rdbDividir.isSelected()){
                resultado=o1/o2;
            }
             
            lblResul.setText(Double.toString(resultado));
        }catch(NumberFormatException nfe){
            System.out.println("Error");
        }
        
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void tfOp1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOp1KeyReleased
         if(tfOp1.getText().equals("") || tfOp2.getText().equals(""))
            btnCalcular.setEnabled(false);
        else    
            btnCalcular.setEnabled(true);
    }//GEN-LAST:event_tfOp1KeyReleased

    private void tfOp2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfOp2KeyReleased
        if(tfOp1.getText().equals("") || tfOp2.getText().equals(""))
            btnCalcular.setEnabled(false);
        else    
            btnCalcular.setEnabled(true);
    }//GEN-LAST:event_tfOp2KeyReleased

    private void rdbRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbRestarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbRestarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        tfOp1.setText(null);
        tfOp2.setText(null);
        
       buttonGroup1.clearSelection();
     
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void rdbSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSumarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbSumarActionPerformed

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
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnFin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblResul;
    private javax.swing.JRadioButton rdbDividir;
    private javax.swing.JRadioButton rdbRestar;
    private javax.swing.JRadioButton rdbSumar;
    private javax.swing.JRadioButton rdbmultiplicar;
    private javax.swing.JTextField tfOp1;
    private javax.swing.JTextField tfOp2;
    private javax.swing.JTextField tfResul;
    // End of variables declaration//GEN-END:variables
}
