/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswing;

/**
 *
 * @author SAYA
 */
public class doc extends javax.swing.JFrame {

    /**
     * Creates new form doc
     */
    public doc() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabDoc = new javax.swing.JTable();
        jTextZone = new javax.swing.JTextField();
        jLabZon = new javax.swing.JLabel();
        jLabWeight = new javax.swing.JLabel();
        jTextWeight = new javax.swing.JTextField();
        jButSubmit2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextConversionValue = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "RM 4.90", "RM0.80"},
                {"2", "RM5.40", "RM1.00"},
                {"3", "RM6.90", "RM1.50"},
                {"4", "RM7.40", "RM1.50"},
                {"5", "RM7.90", "RM2.00"}
            },
            new String [] {
                "ZONE", "FIRST 500GM", "SUBSEQUENT 250GM"
            }
        ));
        jScrollPane1.setViewportView(jTabDoc);

        jTextZone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextZoneActionPerformed(evt);
            }
        });

        jLabZon.setText("ENTER YOUR ZONE");

        jLabWeight.setText("ENTER YOUR WEIGHT");

        jButSubmit2.setText("SUBMIT");
        jButSubmit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSubmit2ActionPerformed(evt);
            }
        });

        jLabel1.setText("TOTAL (RM)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(13, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabWeight)
                            .addComponent(jLabZon, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextZone, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jButSubmit2)
                                            .addComponent(jTextWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextConversionValue)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabZon)
                .addGap(8, 8, 8)
                .addComponent(jTextZone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabWeight)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButSubmit2)
                    .addComponent(jLabel1)
                    .addComponent(jTextConversionValue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextZoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextZoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextZoneActionPerformed

    private void jButSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSubmit2ActionPerformed
    String value = jTextZone.getText(); 
        String conversionValue = jTextWeight.getText();
String documentsPrice ;
 
        if (jLabZon.get){
            measurementUnits = jRdButton1.getText();
             double k = Double.parseDouble(JTxtConvertValue.getText());
             double g = (double) (k *1000);
             jTxtCoversionValue.setText(String.valueOf(g));
                     
        }
        else if(jRadioButton1.isSelected()) {
            measurementUnits = jRadioButton1.getText();
            double c = Double.parseDouble(JTxtConvertValue.getText());
             double f = (double) (c * 1.8 + 32);
             jTxtCoversionValue.setText(String.valueOf(f));
                     
        }
        else if (jRadioButton2.isSelected()){
            measurementUnits = jRadioButton2.getText();
            double cm = Double.parseDouble(JTxtConvertValue.getText());
             double ic = (double) (cm / 2.54);
             jTxtCoversionValue.setText(String.valueOf(ic));
                     
        }
    }//GEN-LAST:event_jButSubmit2ActionPerformed

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
            java.util.logging.Logger.getLogger(doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(doc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new doc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButSubmit2;
    private javax.swing.JLabel jLabWeight;
    private javax.swing.JLabel jLabZon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabDoc;
    private javax.swing.JTextField jTextConversionValue;
    private javax.swing.JTextField jTextWeight;
    private javax.swing.JTextField jTextZone;
    // End of variables declaration//GEN-END:variables
}
