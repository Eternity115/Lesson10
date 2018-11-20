/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insertremovearraylist;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
public class PersonListGUI extends javax.swing.JFrame {

    ArrayList<Person> pep = new ArrayList();
    DefaultListModel list = new DefaultListModel();
    public PersonListGUI() {
        initComponents();
        peoplelist.setModel(list);
        pep.add(new Person("Bob", 72,"ma"));
        pep.add(new Person("Fran", 26,"fem"));
        pep.add(new Person("Mike", 15,"ma"));
        pep.add(new Person("Sue", 54,"fem"));
        //Add People to list model
        for (Person people : pep) {
            list.addElement(people.getName());
        }
        
       
    }

        public static int search(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        while (left <= right) {
            int midpoint = (left + right) / 2;
            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);
            if (result == 0) {
                return midpoint;
            } else if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        return -1;
    }

    public static int findInsertPoint(ArrayList a, Object searchValue) {
        int left = 0;
        int right = a.size() - 1;
        int midpoint = 0;

        while (left <= right) {
            midpoint = (left + right) / 2;

            int result = ((Comparable) a.get(midpoint)).compareTo(searchValue);

            if (result < 0) {
                left = midpoint + 1;
            } else {
                right = midpoint - 1;
            }
        }
        if (((Comparable) a.get(midpoint)).compareTo(searchValue) < 0) {
            midpoint++;
        }
        return midpoint;
    }
    
    public void show(Person p){
        txtname.setText(p.getName());
        txtage.setText("" + p.getAge());
        if(p.getGen()=="ma") btnmale.setSelected(true);
        else btnfem.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        peoplelist = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnmale = new javax.swing.JRadioButton();
        btnfem = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnuex = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnuclear = new javax.swing.JMenuItem();
        mnuadd = new javax.swing.JMenuItem();
        mnudel = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        mnuall = new javax.swing.JMenuItem();
        mnufem = new javax.swing.JMenuItem();
        mnumale = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        peoplelist.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                peoplelistMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(peoplelist);

        jLabel1.setText("Name:");

        jLabel2.setText("Age:");

        buttonGroup1.add(btnmale);
        btnmale.setText("Male");
        btnmale.setActionCommand("ma");

        buttonGroup1.add(btnfem);
        btnfem.setText("Female");
        btnfem.setActionCommand("fem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnmale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnfem)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnmale)
                    .addComponent(btnfem))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("File");

        mnuex.setIcon(new javax.swing.ImageIcon("T:\\ISS-ICS4U1-1\\erik8460\\Unit 4 - Algorithms\\Lesson10\\src\\insertremovearraylist\\exit.png")); // NOI18N
        mnuex.setText("Exit");
        mnuex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuexActionPerformed(evt);
            }
        });
        jMenu1.add(mnuex);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        mnuclear.setIcon(new javax.swing.ImageIcon("T:\\ISS-ICS4U1-1\\erik8460\\Unit 4 - Algorithms\\Lesson10\\src\\insertremovearraylist\\exit.png")); // NOI18N
        mnuclear.setText("Clear");
        mnuclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuclearActionPerformed(evt);
            }
        });
        jMenu2.add(mnuclear);

        mnuadd.setIcon(new javax.swing.ImageIcon("T:\\ISS-ICS4U1-1\\erik8460\\Unit 4 - Algorithms\\Lesson10\\src\\insertremovearraylist\\insert.png")); // NOI18N
        mnuadd.setText("Add");
        mnuadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuaddActionPerformed(evt);
            }
        });
        jMenu2.add(mnuadd);

        mnudel.setIcon(new javax.swing.ImageIcon("T:\\ISS-ICS4U1-1\\erik8460\\Unit 4 - Algorithms\\Lesson10\\src\\insertremovearraylist\\delete.png")); // NOI18N
        mnudel.setText("Delete");
        mnudel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnudelActionPerformed(evt);
            }
        });
        jMenu2.add(mnudel);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Filter");

        mnuall.setIcon(new javax.swing.ImageIcon("T:\\ISS-ICS4U1-1\\erik8460\\Unit 4 - Algorithms\\Lesson10\\src\\insertremovearraylist\\all.png")); // NOI18N
        mnuall.setText("Show All");
        mnuall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuallActionPerformed(evt);
            }
        });
        jMenu3.add(mnuall);

        mnufem.setIcon(new javax.swing.ImageIcon("T:\\ISS-ICS4U1-1\\erik8460\\Unit 4 - Algorithms\\Lesson10\\src\\insertremovearraylist\\female.png")); // NOI18N
        mnufem.setText("Female");
        mnufem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnufemActionPerformed(evt);
            }
        });
        jMenu3.add(mnufem);

        mnumale.setIcon(new javax.swing.ImageIcon("T:\\ISS-ICS4U1-1\\erik8460\\Unit 4 - Algorithms\\Lesson10\\src\\insertremovearraylist\\male.png")); // NOI18N
        mnumale.setText("Male");
        mnumale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnumaleActionPerformed(evt);
            }
        });
        jMenu3.add(mnumale);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtname)
                            .addComponent(txtage, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuallActionPerformed
        list.clear();
        for (Person p : pep) {
            list.addElement(p.getName());
        }
        mnuadd.setEnabled(true);
        mnudel.setEnabled(true);
    }//GEN-LAST:event_mnuallActionPerformed

    private void mnufemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnufemActionPerformed
        list.clear();
        for (Person p : pep) {
            if (p.getGen()=="fem"){
                list.addElement(p.getName());
            }
        }
        mnuadd.setEnabled(false);
        mnudel.setEnabled(false);
    }//GEN-LAST:event_mnufemActionPerformed

    private void mnuexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mnuexActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        clearForm();
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnuaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuaddActionPerformed
        try{
        int tempage = Integer.valueOf(txtage.getText());
        //NEED TO FIX
        String btngen = buttonGroup1.getSelection().getActionCommand();
        if (tempage<0 || tempage>130){
            JOptionPane.showMessageDialog(this, "Invalid age");
            return;
        }
        Person temp = new Person(txtname.getText(), tempage,btngen);
        int loc = findInsertPoint(pep, temp);
        pep.add(loc, temp);
        list.add(loc, temp);
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, "Please fill in data");
        }
        list.clear();
        for (Person people : pep) {
            list.addElement(people.getName());
        }
        clearForm();
    }//GEN-LAST:event_mnuaddActionPerformed

    private void peoplelistMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_peoplelistMouseClicked
        String name = "" + peoplelist.getSelectedValue();
        int loc = search(pep, new Person (name,0,""));
        show(pep.get(loc));
    }//GEN-LAST:event_peoplelistMouseClicked

    private void mnudelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnudelActionPerformed
        String nmpeople = txtname.getText();
        Person temp = new Person(nmpeople, 0, "");
        String delpeople = peoplelist.getSelectedValue();
        if (delpeople==null){
            JOptionPane.showMessageDialog(this, "Select a person to delete");
            return;
        }
        int loc = search(pep, temp);
        pep.remove(loc);
        list.removeElementAt(loc);
        clearForm();
    }//GEN-LAST:event_mnudelActionPerformed

    private void mnumaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnumaleActionPerformed
        list.clear();
        for (Person p : pep) {
            if (p.getGen()=="ma"){
                list.addElement(p.getName());
            }
        }
        mnuadd.setEnabled(false);
        mnudel.setEnabled(false);
    }//GEN-LAST:event_mnumaleActionPerformed

    public void clearForm(){
        txtname.setText("");
        txtage.setText("");
        buttonGroup1.clearSelection();
        peoplelist.clearSelection();
    }
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
            java.util.logging.Logger.getLogger(PersonListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PersonListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PersonListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PersonListGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PersonListGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnfem;
    private javax.swing.JRadioButton btnmale;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mnuadd;
    private javax.swing.JMenuItem mnuall;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnudel;
    private javax.swing.JMenuItem mnuex;
    private javax.swing.JMenuItem mnufem;
    private javax.swing.JMenuItem mnumale;
    private javax.swing.JList<String> peoplelist;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
