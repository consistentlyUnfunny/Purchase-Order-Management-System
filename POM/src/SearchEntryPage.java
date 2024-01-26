
package assignmentproject;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class SearchEntryPage extends javax.swing.JFrame {
    
    private String user;
    private int category;
    private ItemEntry itemEntry;
    private SupplierEntry supplierEntry;
    private DailySalesEntry dailySalesEntry;
    private PurchaseOrderEntry poEntry;
    private RequisitionEntry reqEntry;
    private UserEntry userEntry;
    // add username for requisition and po
    public SearchEntryPage(String user, int category) { // category: 1 = items, 2 = supplier, 3 = dailysales, 4 = po, 5 = pr, 6 = user
        initComponents();
        this.user = user;
        this.category = category;
        switch (category){
            case 1:
                this.setTitle("Item Entry");
                jLabel1.setText("Enter Item ID");
                break;
            case 2:
                this.setTitle("Supplier Entry");
                jLabel1.setText("Enter Supplier ID");
                break;
            case 3:
                this.setTitle("Daily Sales Entry");
                jLabel1.setText("Enter Sales ID");
                break;
            case 5:
                this.setTitle("Purchase Requisition Entry");
                jLabel1.setText("Enter Requisition ID");
                break;
            case 6:
                this.setTitle("User Entry");
                jLabel1.setText("Enter User ID");   
                break;
            default :
                break;
        }
        addButton.setVisible(false);
        if (category != 4){
            addButton.setVisible(true);
            approveButton.setVisible(false);
            jLabel2.setVisible(false);
        }
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        approveButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Enter ID");

        jLabel2.setText("*Enter product requisition ID to approve");

        approveButton.setText("Approve");
        approveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(approveButton))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(addButton)
                        .addGap(36, 36, 36)
                        .addComponent(deleteButton)
                        .addGap(49, 49, 49)
                        .addComponent(editButton)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(approveButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(addButton))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String id = idField.getText(); 
        boolean deleted = false;
        
        switch (category) {
            case 1:
                itemEntry = new ItemEntry(id);
                deleted = itemEntry.delItem();
                break;
            case 2:
                supplierEntry = new SupplierEntry(id);
                deleted = supplierEntry.delSuppliers();
                break;
            case 3:
                dailySalesEntry = new DailySalesEntry(id);
                deleted = dailySalesEntry.delDailySales();
                break;
            case 4:
                poEntry = new PurchaseOrderEntry(id);
                deleted = poEntry.delPo();
                break;
            case 5:
                reqEntry = new RequisitionEntry(id);
                deleted = reqEntry.delRequsition();
                break;
            case 6:
                userEntry = new UserEntry(id);
                deleted = userEntry.delUser();
                break;
            default:
                // Handle the case for an invalid category
                JOptionPane.showMessageDialog(this, "Invalid category");
                return;
        }

        if (deleted) {
            JOptionPane.showMessageDialog(this, "Entry Deleted");
        } else {
            JOptionPane.showMessageDialog(this, "Entry does not exist");
        }
        idField.setText("");   
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void approveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveButtonActionPerformed

        String id = idField.getText();
        RequisitionEntry searchReq = new RequisitionEntry(id);
        String[] details = searchReq.getDetails();
        if (details == null){
            JOptionPane.showMessageDialog(this, "Entry does not exist");
        } else {
            String poId = JOptionPane.showInputDialog("Enter PO ID: ");
            if (poId == null || poId.length() > 7 || poId.length() < 3) {
                JOptionPane.showMessageDialog(this, "Invalid input");
            } else {
                details[0] = poId;
                details[details.length - 1] = user;
                poEntry = new PurchaseOrderEntry(details); 
                if (poEntry.poExists()) {
                    JOptionPane.showMessageDialog(this, "PO ID already exists");
                } else {
                    poEntry.addPo();
                    searchReq.delRequsition();
                    JOptionPane.showMessageDialog(this, "Entry added");
                    this.dispose();
                }
            }
        }
    }//GEN-LAST:event_approveButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String id = idField.getText();
        String[] details = null;
        switch (category) {
            case 1:
                itemEntry = new ItemEntry(id);
                details = itemEntry.getDetails();
                break;
            case 2:
                supplierEntry = new SupplierEntry(id);
                details = supplierEntry.getDetails();
                break;
            case 3:
                dailySalesEntry = new DailySalesEntry(id);
                details = dailySalesEntry.getDetails();
                break;
            case 4:
                poEntry = new PurchaseOrderEntry(id);
                details = poEntry.getDetails();
                break;
            case 5:
                reqEntry = new RequisitionEntry(id);
                details = reqEntry.getDetails();
                break;
            case 6:
                userEntry = new UserEntry(id);
                details = userEntry.getDetails();
                break;
            default:
                // Handle the case for an invalid category
                JOptionPane.showMessageDialog(this, "Invalid category");
                return;
        }

        if (details == null) {
            JOptionPane.showMessageDialog(this, "Entry does not exist");
        } else {
            displayDynamicForm("Edit Entry", details, true, id);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String id = idField.getText();
        if (id.length() < 3 || id.length() > 20){
            JOptionPane.showMessageDialog(this, "Invalid input");
            return;
        }
        String[] details = null;
        switch (category) {
            case 1:
                itemEntry = new ItemEntry(id);
                details = itemEntry.getDetails();
                break;
            case 2:
                supplierEntry = new SupplierEntry(id);
                details = supplierEntry.getDetails();
                break;
            case 3:
                dailySalesEntry = new DailySalesEntry(id);
                details = dailySalesEntry.getDetails();
                break;
            case 4:
                poEntry = new PurchaseOrderEntry(id);
                details = poEntry.getDetails();
                break;
            case 5:
                reqEntry = new RequisitionEntry(id);
                details = reqEntry.getDetails();
                break;
            case 6:
                userEntry = new UserEntry(id);
                details = userEntry.getDetails();
                break;
            default:
                // Handle the case for an invalid category
                JOptionPane.showMessageDialog(this, "Invalid category");
                return;
        }

        if (details == null) {
            displayDynamicForm("New entry", details, false, id);
        } else {
            JOptionPane.showMessageDialog(this, "Entry already exists");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void displayDynamicForm(String title, String[] fieldValues, boolean edit, String id) {
        
        DynamicForm dynamicForm = null;
        switch (category) {
            case 1:
                if (edit) dynamicForm = new DynamicForm(title, itemEntry.getColNames(), edit, category);
                else dynamicForm = new DynamicForm(title, itemEntry.getColNames(), id, category);
                break;
            case 2:
                if (edit) dynamicForm = new DynamicForm(title, supplierEntry.getColNames(), edit, category);
                else dynamicForm = new DynamicForm(title, supplierEntry.getColNames(), id, category);
                break;
            case 3:
                if (edit) dynamicForm = new DynamicForm(title, dailySalesEntry.getColNames(), edit, category);
                else dynamicForm = new DynamicForm(title, dailySalesEntry.getColNames(), id, category);
                break;
            case 4:
                if (edit) dynamicForm = new DynamicForm(title, poEntry.getColNames(), edit, category);
                else dynamicForm = new DynamicForm(title, poEntry.getColNames(), id, category);
                break;
            case 5:
                if (edit) dynamicForm = new DynamicForm(title, reqEntry.getColNames(), edit, category);
                else dynamicForm = new DynamicForm(title, reqEntry.getColNames(), id, user, category);
                break;
            case 6:
                if (edit) dynamicForm = new DynamicForm(title, userEntry.getColNames(), edit, category);
                else dynamicForm = new DynamicForm(title, userEntry.getColNames(), id, category);
                break;   
        }   
        dynamicForm.setFieldValues(fieldValues); 
    }

 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton approveButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
