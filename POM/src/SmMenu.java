
package assignmentproject;

import java.awt.Color;

public class SmMenu extends javax.swing.JFrame {


    private CurrentUser currentUser;
    
    public SmMenu(CurrentUser currentUser) {
        initComponents();
        this.currentUser = currentUser;
        jLabel1.setText("Welcome, " + currentUser.getUsername());
        jLabel3.setText("UID: " + currentUser.getUid());
        this.setVisible(true);
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
        logOutButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        viewItemsButton = new javax.swing.JButton();
        editItemsButton = new javax.swing.JButton();
        dailySalesButton = new javax.swing.JButton();
        dailySalesButton1 = new javax.swing.JButton();
        createRequisitionButton = new javax.swing.JButton();
        displayRequisitionButton = new javax.swing.JButton();
        viewOrderButton = new javax.swing.JButton();
        viewSuppliersButton = new javax.swing.JButton();
        editSuppliersButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Welcome, Username");

        logOutButton.setFont(new java.awt.Font("Yu Mincho", 2, 12)); // NOI18N
        logOutButton.setText("Log Out");
        logOutButton.setBorderPainted(false);
        logOutButton.setContentAreaFilled(false);
        logOutButton.setFocusPainted(false);
        logOutButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logOutButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logOutButtonMouseExited(evt);
            }
        });
        logOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Role: Sales Manager");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("UID:");

        viewItemsButton.setText("View Items");
        viewItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemsButtonActionPerformed(evt);
            }
        });

        editItemsButton.setText("Add/Delete/Edit Items");
        editItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemsButtonActionPerformed(evt);
            }
        });

        dailySalesButton.setText("View Daily Item-wise Sales");
        dailySalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailySalesButtonActionPerformed(evt);
            }
        });

        dailySalesButton1.setText("Add/Delete/Edit Daily Item-wise Sales");
        dailySalesButton1.setToolTipText("");
        dailySalesButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailySalesButton1ActionPerformed(evt);
            }
        });

        createRequisitionButton.setText("Manage Purchase Requisition");
        createRequisitionButton.setToolTipText("");
        createRequisitionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRequisitionButtonActionPerformed(evt);
            }
        });

        displayRequisitionButton.setText("View Purchase Requisition");
        displayRequisitionButton.setToolTipText("");
        displayRequisitionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayRequisitionButtonActionPerformed(evt);
            }
        });

        viewOrderButton.setText("View Purchaser Order");
        viewOrderButton.setToolTipText("");
        viewOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderButtonActionPerformed(evt);
            }
        });

        viewSuppliersButton.setText("View Suppliers");
        viewSuppliersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSuppliersButtonActionPerformed(evt);
            }
        });

        editSuppliersButton.setText("Add/Delete/Edit Suppliers");
        editSuppliersButton.setToolTipText("");
        editSuppliersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSuppliersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(viewItemsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editItemsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewSuppliersButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editSuppliersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dailySalesButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dailySalesButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(logOutButton)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(displayRequisitionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createRequisitionButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewOrderButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(38, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(38, 38, 38))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(logOutButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(24, 24, 24)
                .addComponent(viewItemsButton)
                .addGap(26, 26, 26)
                .addComponent(editItemsButton)
                .addGap(3, 3, 3)
                .addComponent(createRequisitionButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(viewSuppliersButton)
                .addGap(4, 4, 4)
                .addComponent(displayRequisitionButton)
                .addGap(2, 2, 2)
                .addComponent(editSuppliersButton)
                .addGap(2, 2, 2)
                .addComponent(viewOrderButton)
                .addGap(1, 1, 1)
                .addComponent(dailySalesButton)
                .addGap(26, 26, 26)
                .addComponent(dailySalesButton1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        new LogoutHandler(this);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void viewItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemsButtonActionPerformed
        ItemEntry itemViewer = new ItemEntry();
        itemViewer.viewItems();
    }//GEN-LAST:event_viewItemsButtonActionPerformed

    private void displayRequisitionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayRequisitionButtonActionPerformed
        RequisitionEntry reqViewer = new RequisitionEntry();
        reqViewer.viewRequsition();
    }//GEN-LAST:event_displayRequisitionButtonActionPerformed

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        logOutButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        logOutButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_logOutButtonMouseExited

    private void viewSuppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSuppliersButtonActionPerformed
       SupplierEntry supplierViewer = new SupplierEntry();
       supplierViewer.viewSuppliers();
    }//GEN-LAST:event_viewSuppliersButtonActionPerformed

    private void dailySalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailySalesButtonActionPerformed
        DailySalesEntry salesViewer = new DailySalesEntry();
        salesViewer.viewDailySales();
    }//GEN-LAST:event_dailySalesButtonActionPerformed

    private void viewOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewOrderButtonActionPerformed
        PurchaseOrderEntry orderViewer = new PurchaseOrderEntry();
        orderViewer.viewPo();
    }//GEN-LAST:event_viewOrderButtonActionPerformed

    private void editItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemsButtonActionPerformed
       SearchEntryPage editItemPage = new SearchEntryPage(currentUser.getUid(), 1);
    }//GEN-LAST:event_editItemsButtonActionPerformed

    private void editSuppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSuppliersButtonActionPerformed
        SearchEntryPage editSupplierPage = new SearchEntryPage(currentUser.getUid(), 2);
    }//GEN-LAST:event_editSuppliersButtonActionPerformed

    private void dailySalesButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailySalesButton1ActionPerformed
        SearchEntryPage editDailySalesPage = new SearchEntryPage(currentUser.getUid(), 3);
    }//GEN-LAST:event_dailySalesButton1ActionPerformed

    private void createRequisitionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRequisitionButtonActionPerformed
        SearchEntryPage editPrPage = new SearchEntryPage(currentUser.getUid(), 5);
    }//GEN-LAST:event_createRequisitionButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createRequisitionButton;
    private javax.swing.JButton dailySalesButton;
    private javax.swing.JButton dailySalesButton1;
    private javax.swing.JButton displayRequisitionButton;
    private javax.swing.JButton editItemsButton;
    private javax.swing.JButton editSuppliersButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton viewItemsButton;
    private javax.swing.JButton viewOrderButton;
    private javax.swing.JButton viewSuppliersButton;
    // End of variables declaration//GEN-END:variables
}