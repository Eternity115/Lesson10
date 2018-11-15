//BAD PROGRAM - DO NOT USE
package Sorting;

import javax.swing.DefaultListModel;




public class SortingListGUI extends javax.swing.JFrame {

    DefaultListModel list = new DefaultListModel();
    static int nums[] = new int[50000];
    
    public SortingListGUI() {
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
        listnums = new javax.swing.JList<>();
        btngen = new javax.swing.JButton();
        btnbub = new javax.swing.JButton();
        btnex = new javax.swing.JButton();
        btnin = new javax.swing.JButton();
        btnqu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbltime = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(listnums);

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

        lbltime.setText("    ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(btngen, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbub, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnqu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbltime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lbltime)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngenActionPerformed
        list.clear();
        nums=getNums();
        for (int i = 0; i < 50000; i++) {
            list.addElement("" + nums[i]); //can only have string
        }
        listnums.setModel(list);
        btnbub.setEnabled(true);
        btnex.setEnabled(true);
        btnin.setEnabled(true);
        btnqu.setEnabled(true);
        lbltime.setText("");
    }//GEN-LAST:event_btngenActionPerformed

    public int[] getNums(){
        int nums[] = new int[50000];
        for (int i = 0; i < 50000; i++) {
            nums[i] =(int)(Math.random() *50000+1);
            
        }
        return nums;
    }
    
    
    private void btnbubActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbubActionPerformed
        list.clear();
        double start = System.nanoTime();
        bubbleSort(nums);
        double end = System.nanoTime();
        double tottime = end-start;
        tottime = tottime/1000000000;
        lbltime.setText(String.format("%.2f seconds", tottime));
        for (int i = 0; i < 50000; i++) {
            list.addElement("" + nums[i]); //can only have string
        }
        btnbub.setEnabled(false);
        btnex.setEnabled(false);
        btnin.setEnabled(false);
        btnqu.setEnabled(false);
    }//GEN-LAST:event_btnbubActionPerformed

    private void btnexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnexActionPerformed
        list.clear();
        double start = System.nanoTime();
        selectionSort(nums);
        double end = System.nanoTime();
        double tottime = end-start;
        tottime = tottime/1000000000;
        lbltime.setText(String.format("%.2f seconds", tottime));
        for (int i = 0; i < 50000; i++) {
            list.addElement("" + nums[i]); //can only have string
        }
        btnbub.setEnabled(false);
        btnex.setEnabled(false);
        btnin.setEnabled(false);
        btnqu.setEnabled(false);
    }//GEN-LAST:event_btnexActionPerformed

    private void btninActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninActionPerformed
        list.clear();
        double start = System.nanoTime();
        insertionSort(nums);
        double end = System.nanoTime();
        double tottime = end-start;
        tottime = tottime/1000000000;
        lbltime.setText(String.format("%.2f seconds", tottime));
        for (int i = 0; i < 50000; i++) {
            list.addElement("" + nums[i]); //can only have string
        }
        btnbub.setEnabled(false);
        btnex.setEnabled(false);
        btnin.setEnabled(false);
        btnqu.setEnabled(false);
    }//GEN-LAST:event_btninActionPerformed

   
    public static void bubbleSort(int[] a) {
        int k = 0;
        boolean exchangeMade = true;
        // Make up to n - 1 passes through array, exit 
        //early if no exchanges are made on previous pass

        while ((k < a.length - 1) && exchangeMade) {
            exchangeMade = false;
            k++;
            for (int j = 0; j < a.length - k; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                    exchangeMade = true;
                }//end if
            }//end for
        }//end while
    }

//supporting swap method
    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

////////////////////////////////////////////////////////////////
    public static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinimum(a, i);
            if (minIndex != i) //if lowest is not already in place
            {
                swap(a, i, minIndex);
            }
        } //end for
    }

//supporting findMinimum method
    public static int findMinimum(int[] a, int first) {
        //first=where to start looking from
        //assume first is also the smallest for now
        int minIndex = first;
        for (int i = first + 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }


/////////////////////////////////////////////////////////////
    public static void insertionSort(int a[]) {
        int itemToInsert, j;
        boolean stillLooking;

        //on the kth pass, pass item k upwards in list
        //and insert it in its proper place amoung the
        //first k entries in an array
        for (int k = 1; k < a.length; k++) {
            //move backwards through list, looking for
            //the right place to insert a[k];
            itemToInsert = a[k];
            j = k - 1;
            stillLooking = true;
            while (j >= 0 && stillLooking) {
                if (itemToInsert < a[j]) {
                    //move item higher
                    a[j + 1] = a[j];
                    j--;
                } else {
                    //we have found new home for a[k];
                    stillLooking = false;
                }//end else// j+1 is where the item goes
                a[j + 1] = itemToInsert;
            }//end while
        }//end for
    }//end method

///////////////////////////////////////////////////////////////////
   
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
            java.util.logging.Logger.getLogger(SortingListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingListGUI().setVisible(true);
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
    private javax.swing.JList<String> listnums;
    // End of variables declaration//GEN-END:variables
}
