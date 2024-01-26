
package assignmentproject;

import java.awt.Color;

public class PmMenu extends javax.swing.JFrame {
    private static final String suppliersCol[] = {"Id", "Name", "Contact", "Location"};
    private static final String requisitionCol[] = {"Item Code", "Quantity", "Price/unit", "Total", "Date", "Supplier", "Status"};
    private CurrentUser currentUser;

    public PmMenu(CurrentUser currentUser) {
        initComponents();
        this.currentUser = currentUser;
        jLabel1.setText("Welcome, " + currentUser.getUsername());
        jLabel3.setText("UID: " + currentUser.getUid());
        this.setVisible(true);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        viewItemsButton = new javax.swing.JButton();
        viewSuppliersButton = new javax.swing.JButton();
        viewRequisitionButton = new javax.swing.JButton();
        generatePoButton = new javax.swing.JButton();
        viewPoButton = new javax.swing.JButton();
        logOutButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Welcome, Username");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setText("Role: Purchase Manager");

        viewItemsButton.setText("View Item List");
        viewItemsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewItemsButtonActionPerformed(evt);
            }
        });

        viewSuppliersButton.setText("View Suppliers");
        viewSuppliersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewSuppliersButtonActionPerformed(evt);
            }
        });

        viewRequisitionButton.setText("View Purchase Requisition");
        viewRequisitionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewRequisitionButtonActionPerformed(evt);
            }
        });

        generatePoButton.setText("Manage Purchase Order");
        generatePoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePoButtonActionPerformed(evt);
            }
        });

        viewPoButton.setText("View Purchaser Order");
        viewPoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewPoButtonActionPerformed(evt);
            }
        });

        logOutButton.setFont(new java.awt.Font("Yu Gothic UI Light", 2, 12)); // NOI18N
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setText("UID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(viewPoButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(viewRequisitionButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                    .addComponent(viewItemsButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(generatePoButton, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(viewSuppliersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(logOutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(viewItemsButton)
                        .addGap(31, 31, 31)
                        .addComponent(viewRequisitionButton)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viewSuppliersButton)
                        .addGap(37, 37, 37)))
                .addComponent(generatePoButton)
                .addGap(2, 2, 2)
                .addComponent(viewPoButton)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void viewItemsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewItemsButtonActionPerformed
        ItemEntry itemViewer = new ItemEntry();
        itemViewer.viewItems();
    }//GEN-LAST:event_viewItemsButtonActionPerformed

    private void logOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutButtonActionPerformed
        currentUser = null;
        new LogoutHandler(this);
    }//GEN-LAST:event_logOutButtonActionPerformed

    private void logOutButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseEntered
        logOutButton.setForeground(Color.WHITE);
    }//GEN-LAST:event_logOutButtonMouseEntered

    private void logOutButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutButtonMouseExited
        logOutButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_logOutButtonMouseExited

    private void viewPoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewPoButtonActionPerformed
        PurchaseOrderEntry orderViewer = new PurchaseOrderEntry();
        orderViewer.viewPo();
    }//GEN-LAST:event_viewPoButtonActionPerformed

    private void viewSuppliersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewSuppliersButtonActionPerformed
        SupplierEntry supplierViewer = new SupplierEntry();
        supplierViewer.viewSuppliers();
    }//GEN-LAST:event_viewSuppliersButtonActionPerformed

    private void viewRequisitionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewRequisitionButtonActionPerformed
        RequisitionEntry reqViewer = new RequisitionEntry();
        reqViewer.viewRequsition();
    }//GEN-LAST:event_viewRequisitionButtonActionPerformed

    private void generatePoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePoButtonActionPerformed
        SearchEntryPage poPage = new SearchEntryPage(currentUser.getUid(), 4);
    }//GEN-LAST:event_generatePoButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generatePoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton logOutButton;
    private javax.swing.JButton viewItemsButton;
    private javax.swing.JButton viewPoButton;
    private javax.swing.JButton viewRequisitionButton;
    private javax.swing.JButton viewSuppliersButton;
    // End of variables declaration//GEN-END:variables
}
