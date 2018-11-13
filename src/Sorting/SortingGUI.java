
package Sorting;

import javax.swing.DefaultListModel;


public class SortingGUI extends javax.swing.JFrame {

    int nums[] = new int [50000];
    //DefaultListModel list = new DefaultListModel();
    
    public SortingGUI() {
        initComponents();
        btnbub.setEnabled(false);
        btnex.setEnabled(false);
        btnin.setEnabled(false);
        btnqu.setEnabled(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txtnums = new javax.swing.JTextArea();
        btngen = new javax.swing.JButton();
        btnbub = new javax.swing.JButton();
        btnex = new javax.swing.JButton();
        btnin = new javax.swing.JButton();
        btnqu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtnums.setColumns(20);
        txtnums.setRows(5);
        jScrollPane1.setViewportView(txtnums);

        btngen.setText("Generate Numbers");
        btngen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngenActionPerformed(evt);
            }
        });

        btnbub.setText("Bubble Sort");
        btnbub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbubActionPerformed(evt);
            }
        });

        btnex.setText("Exchange Sort");
        btnex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnexActionPerformed(evt);
            }
        });

        btnin.setText("Insertion Sort");
        btnin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninActionPerformed(evt);
            }
        });

        btnqu.setText("Quick Sort");

        jLabel1.setText("Time Taken:");

        lbltime.setText("???");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btngen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnqu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltime, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btngen)
                        .addGap(18, 18, 18)
                        .addComponent(btnbub)
                        .addGap(18, 18, 18)
                        .addComponent(btnex)
                        .addGap(18, 18, 18)
                        .addComponent(btnin)
                        .addGap(18, 18, 18)
                        .addComponent(btnqu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbltime)))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenActionPerformed
        txtnums.setText("");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int)(Math.random() *50000+1);
            txtnums.append(nums[i] + "\n");
        }
        btnbub.setEnabled(true);
        btnex.setEnabled(true);
        btnin.setEnabled(true);
        btnqu.setEnabled(true);
        lbltime.setText("");
    }//GEN-LAST:event_btngenActionPerformed

    private void btnbubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubActionPerformed
        txtnums.setText("");
        double start = System.nanoTime();
        BubbleSort.bubbleSort(nums);
        double end = System.nanoTime();
        double tottime = end-start;
        tottime = tottime/1000000000;
        lbltime.setText(String.format("%.2f seconds", tottime));
        txtnums.append("BUBBLE SORT");
        txtnums.append("\n=================\n");
        for (int i = 0; i < nums.length; i++) {
            txtnums.append(nums[i] + "\n");
        }
        btnbub.setEnabled(false);
        btnex.setEnabled(false);
        btnin.setEnabled(false);
        btnqu.setEnabled(false);
    }//GEN-LAST:event_btnbubActionPerformed

    private void btnexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexActionPerformed
        txtnums.setText("");
        double start = System.nanoTime();
        SelectionSort.selectionSort(nums);
        txtnums.append("EXCHANGE SORT");
        double end = System.nanoTime();
        double tottime = end-start;
        tottime = tottime/1000000000;
        lbltime.setText(String.format("%.2f seconds", tottime));
        txtnums.append("\n=================\n");
        for (int i = 0; i < nums.length; i++) {
            txtnums.append(nums[i] + "\n");
        }
        btnbub.setEnabled(false);
        btnex.setEnabled(false);
        btnin.setEnabled(false);
        btnqu.setEnabled(false);
    }//GEN-LAST:event_btnexActionPerformed

    private void btninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninActionPerformed
        txtnums.setText("");
        double start = System.nanoTime();
        InsertionSort.insertionSort(nums);
        double end = System.nanoTime();
        double tottime = end-start;
        tottime = tottime/1000000000;
        lbltime.setText(String.format("%.2f seconds", tottime));
        txtnums.append("INSERTION SORT");
        txtnums.append("\n=================\n");
        for (int i = 0; i < nums.length; i++) {
            txtnums.append(nums[i] + "\n");
        }
        btnbub.setEnabled(false);
        btnex.setEnabled(false);
        btnin.setEnabled(false);
        btnqu.setEnabled(false);
    }//GEN-LAST:event_btninActionPerformed

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
            java.util.logging.Logger.getLogger(SortingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbub;
    private javax.swing.JButton btnex;
    private javax.swing.JButton btngen;
    private javax.swing.JButton btnin;
    private javax.swing.JButton btnqu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbltime;
    private javax.swing.JTextArea txtnums;
    // End of variables declaration//GEN-END:variables
}
