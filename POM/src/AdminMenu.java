
package assignmentproject;

import java.awt.Color;

public class AdminMenu extends javax.swing.JFrame {

    private CurrentUser currentUser;
    
    public AdminMenu(CurrentUser currentUser) {
        initComponents();
        this.currentUser = currentUser;
        jLabel1.setText("Welcome, " + currentUser.getUsername());
        jLabel3.setText("UID: " + currentUser.getUid());
        this.setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        logOutButton = new javax.swing.JButton();
        viewItemButton = new javax.swing.JButton();
        editItemsButton = new javax.swing.JButton();
        editSuppliersButton = new javax.swing.JButton();
        viewSuppliersButton = new javax.swing.JButton();
        viewDailySalesButton = new javax.swing.JButton();
        editDailySalesButton = new javax.swing.JButton();
        generatePrButton = new javax.swing.JButton();
        viewPrButton = new javax.swing.JButton();
        generatePoButton = new javax.swing.JButton();
        viwePoButton = new javax.swing.JButton();
        editUserButton = new javax.swing.JButton();
        viewUsersButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 150, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Welcome, username");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Role: Administrator");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("UID:");

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

        viewItemButton.setText("View Items");
        viewItemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemButtonActionPerformed(evt);
            }
        });

        editItemsButton.setText("Add/Delete/Edit Items");
        editItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editItemsButtonActionPerformed(evt);
            }
        });

        editSuppliersButton.setText("Add/Delete/Edit Suppliers");
        editSuppliersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSuppliersButtonActionPerformed(evt);
            }
        });

        viewSuppliersButton.setText("View Suppliers");
        viewSuppliersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSuppliersButtonActionPerformed(evt);
            }
        });

        viewDailySalesButton.setText("View Daily Item-wise Sales Entry");
        viewDailySalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewDailySalesButtonActionPerformed(evt);
            }
        });

        editDailySalesButton.setText("Add/Delete/Edit Daily Item-wise Sales Entry");
        editDailySalesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editDailySalesButtonActionPerformed(evt);
            }
        });

        generatePrButton.setText("Manage Purchase Requisition");
        generatePrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePrButtonActionPerformed(evt);
            }
        });

        viewPrButton.setText("View Purchase Requisition");
        viewPrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPrButtonActionPerformed(evt);
            }
        });

        generatePoButton.setText("Manage Purchaser Order");
        generatePoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePoButtonActionPerformed(evt);
            }
        });

        viwePoButton.setText("View Purchaser Order");
        viwePoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viwePoButtonActionPerformed(evt);
            }
        });

        editUserButton.setText("Manage Users");
        editUserButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editUserButtonActionPerformed(evt);
            }
        });

        viewUsersButton.setText("View Users");
        viewUsersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewUsersButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(viewDailySalesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logOutButton)
                .addGap(39, 39, 39))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(viewSuppliersButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editItemsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewItemButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editSuppliersButton, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                            .addComponent(viewUsersButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(editUserButton, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(editDailySalesButton, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                            .addComponent(generatePrButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewPrButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(generatePoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viwePoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(36, 36, 36))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(32, 32, 32)
                .addComponent(viewItemButton)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(viewDailySalesButton)
                        .addGap(18, 18, 18)
                        .addComponent(editDailySalesButton)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(editSuppliersButton)
                                .addGap(18, 18, 18)
                                .addComponent(viewUsersButton)
                                .addGap(18, 18, 18)
                                .addComponent(editUserButton))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(generatePrButton)
                                .addGap(18, 18, 18)
                                .addComponent(viewPrButton)
                                .addGap(18, 18, 18)
                                .addComponent(generatePoButton)
                                .addGap(18, 18, 18)
                                .addComponent(viwePoButton))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(editItemsButton)
                        .addGap(18, 18, 18)
                        .addComponent(viewSuppliersButton)))
                .addGap(28, 28, 28)
                .addComponent(logOutButton)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        new LogoutHandler(this);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        logOutButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        logOutButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_logOutButtonMouseExited

    private void viewItemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemButtonActionPerformed
        ItemEntry itemViewer = new ItemEntry();
        itemViewer.viewItems();
    }//GEN-LAST:event_viewItemButtonActionPerformed

    private void editItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editItemsButtonActionPerformed
        SearchEntryPage editItemPage = new SearchEntryPage(currentUser.getUid(), 1);
    }//GEN-LAST:event_editItemsButtonActionPerformed

    private void editSuppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSuppliersButtonActionPerformed
        SearchEntryPage editSupplierPage = new SearchEntryPage(currentUser.getUid(), 2);
    }//GEN-LAST:event_editSuppliersButtonActionPerformed

    private void viewSuppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSuppliersButtonActionPerformed
        SupplierEntry supplierViewer = new SupplierEntry();
        supplierViewer.viewSuppliers();
    }//GEN-LAST:event_viewSuppliersButtonActionPerformed

    private void viewDailySalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewDailySalesButtonActionPerformed
        DailySalesEntry salesViewer = new DailySalesEntry();
        salesViewer.viewDailySales();
    }//GEN-LAST:event_viewDailySalesButtonActionPerformed

    private void editDailySalesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editDailySalesButtonActionPerformed
        SearchEntryPage editDailySalesPage = new SearchEntryPage(currentUser.getUid(), 3);
    }//GEN-LAST:event_editDailySalesButtonActionPerformed

    private void generatePrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePrButtonActionPerformed
        SearchEntryPage editPrPage = new SearchEntryPage(currentUser.getUid(), 5);
    }//GEN-LAST:event_generatePrButtonActionPerformed

    private void viewPrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPrButtonActionPerformed
        RequisitionEntry reqViewer = new RequisitionEntry();
        reqViewer.viewRequsition();
    }//GEN-LAST:event_viewPrButtonActionPerformed

    private void generatePoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePoButtonActionPerformed
        SearchEntryPage editPoPage = new SearchEntryPage(currentUser.getUid(), 4);
    }//GEN-LAST:event_generatePoButtonActionPerformed

    private void viwePoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viwePoButtonActionPerformed
        PurchaseOrderEntry orderViewer = new PurchaseOrderEntry();
        orderViewer.viewPo();
    }//GEN-LAST:event_viwePoButtonActionPerformed

    private void editUserButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editUserButtonActionPerformed
        SearchEntryPage editUserPage = new SearchEntryPage(currentUser.getUid(), 6);
    }//GEN-LAST:event_editUserButtonActionPerformed

    private void viewUsersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewUsersButtonActionPerformed
        UserEntry userViewer = new UserEntry();
        userViewer.viewUsers();
    }//GEN-LAST:event_viewUsersButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editDailySalesButton;
    private javax.swing.JButton editItemsButton;
    private javax.swing.JButton editSuppliersButton;
    private javax.swing.JButton editUserButton;
    private javax.swing.JButton generatePoButton;
    private javax.swing.JButton generatePrButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton viewDailySalesButton;
    private javax.swing.JButton viewItemButton;
    private javax.swing.JButton viewPrButton;
    private javax.swing.JButton viewSuppliersButton;
    private javax.swing.JButton viewUsersButton;
    private javax.swing.JButton viwePoButton;
    // End of variables declaration//GEN-END:variables
}
