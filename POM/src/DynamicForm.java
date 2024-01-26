
package assignmentproject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.function.Predicate;

public class DynamicForm extends javax.swing.JFrame {
    private String title;
    private String[] fieldNames;
    private String username;
    private int category;
    private JTextField[] textFields;
    private JButton saveButton;
    private JPanel jPanel1;
    private boolean edit = false;
    private Map<String, Predicate<String>> validationRules = new HashMap<>();
    private ItemEntry itemEntry;
    private SupplierEntry supplierEntry;
    private DailySalesEntry dailySalesEntry;
    private PurchaseOrderEntry poEntry;
    private RequisitionEntry reqEntry;
    private UserEntry userEntry;
    

    
    public DynamicForm(String title, String[] fieldNames, boolean edit, int cat) { // for editing
        this.title = title;
        this.fieldNames = fieldNames;
        this.edit = edit;
        category = cat;        
        initComponents();
        addFieldValidation();
        initSaveButton();
        this.setVisible(true);
    }
    
    public DynamicForm(String title, String[] fieldNames, String id, String username, int cat) { // for adding pr
        this.title = title;
        this.fieldNames = fieldNames;
        this.username = username;
        category = cat;
        initComponents();
        textFields[0].setText(id);
        textFields[0].setEditable(false);
        addFieldValidation();
        initSaveButton();
        this.setVisible(true); 
    }
    
    
    public DynamicForm(String title, String[]fieldNames, String id, int cat){ // for adding
        this.title = title;
        this.fieldNames = fieldNames;
        category = cat;
        initComponents();
        textFields[0].setText(id);
        textFields[0].setEditable(false);
        addFieldValidation();
        initSaveButton();
        this.setVisible(true);        
    }

    private void initComponents() {
        int numFields = fieldNames.length;

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle(title);

        jPanel1 = new JPanel(new GridLayout(numFields, 2));
        textFields = new JTextField[numFields];

        for (int i = 0; i < numFields; i++) {
            textFields[i] = new JTextField();
            jPanel1.add(new JLabel(fieldNames[i]));

            if (fieldNames[i].equalsIgnoreCase("role")) {
                // If the field name is "role", create a drop-down menu (JComboBox)
                JComboBox<String> roleComboBox = new JComboBox<>(new String[]{"Admin", "Sales Manager", "Product Manager"});
                jPanel1.add(roleComboBox);
            }
            else {
                if(fieldNames[i].equalsIgnoreCase("date") && !edit){
                    LocalDate currentDate = LocalDate.now(); // get today's date        
                    // format date dd-mm-yyyy
                    DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    String formattedDate = currentDate.format(dateFormatter);
                    // display date in text field
                    textFields[i].setText(formattedDate);
                    textFields[i].setEditable(false);
                } else if (fieldNames[i].equalsIgnoreCase("raised by") && !edit){
                    textFields[i].setText(username);
                    textFields[i].setEditable(false);
                } else if (fieldNames[i].equalsIgnoreCase("price/unit") 
                        || fieldNames[i].equalsIgnoreCase("total")
                        || (fieldNames[i].equalsIgnoreCase("Supplier id") && category == 5)
                        || (fieldNames[i].equalsIgnoreCase("Sales"))
                        || (fieldNames[i].equalsIgnoreCase("date")
                        || (fieldNames[i].equalsIgnoreCase("raised by")))){
                    textFields[i].setEditable(false);
                } 
                jPanel1.add(textFields[i]);
            }
        }

        saveButton = new JButton("Save");

        JPanel jPanel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        jPanel2.add(saveButton);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }

    private void initSaveButton() {
        saveButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String[] updatedDetails = getFieldValues();
                
                // use by daily sales entry and pr
                String[] itemDetails;
                String itemCode;
                int quantity = 0;
                float price = 0.0f;
                int option;
                
                boolean success = false;
                String message = "";
                switch (category) {
                    case 1:
                        itemEntry = new ItemEntry(updatedDetails);
                        if (!validateFields()){
                            JOptionPane.showMessageDialog(DynamicForm.this, "Invalid input detected");
                            return;
                        }
                        if (!edit) success = itemEntry.addItem();
                        else success = itemEntry.editItem();
                        message = success ? "Item updated successfully." : "Supplier does not exists.";
                        break;
                    case 2:
                        supplierEntry = new SupplierEntry(updatedDetails);
                        if (!validateFields()){
                            JOptionPane.showMessageDialog(DynamicForm.this, "Invalid input detected");
                            return;
                        }
                        if (!edit) success = supplierEntry.addSupplier();
                        else success = supplierEntry.editSupplier();
                        message = success ? "Supplier updated successfully." : "Failed to update supplier.";
                        break;
                    case 3:
                        dailySalesEntry = new DailySalesEntry(updatedDetails);
                        if (!validateFields()){
                            return;
                        }
                        if (!dailySalesEntry.validItem()) {
                            JOptionPane.showMessageDialog(DynamicForm.this, "Invalid item code");
                            return;
                        }

                        if (!dailySalesEntry.validQuantity()) {
                            JOptionPane.showMessageDialog(DynamicForm.this, "Invalid quantity");
                            return;
                        }
                        itemDetails = dailySalesEntry.getItemDetail();
                        itemCode = itemDetails[0];
                        quantity = Integer.parseInt(updatedDetails[2]);
                        price = Float.parseFloat(itemDetails[3]);
                        textFields[3].setText(Float.toString(quantity * price));
                        option = JOptionPane.showConfirmDialog(DynamicForm.this, "Update Daily Sales Entry?", "Confirmation", JOptionPane.YES_NO_OPTION);
                        if (option == JOptionPane.YES_OPTION) {
                            dailySalesEntry = new DailySalesEntry(getFieldValues());
                            if (!edit) {
                                success = dailySalesEntry.addDailySales();
                                itemEntry = new ItemEntry(itemCode);
                                itemEntry.manageStock(quantity, false);
                            }
                            else success = dailySalesEntry.editDailySales();
                            message = success ? "Daily Sales updated successfully." : "Failed to update Daily Sales.";
                        }
                        break;
                    case 4:
                        poEntry = new PurchaseOrderEntry(updatedDetails);
                        if (!validateFields()){
                            JOptionPane.showMessageDialog(DynamicForm.this, "Invalid input detected");
                            return;
                        }
                        if (!edit) success = poEntry.addPo();
                        else success = poEntry.editPo();
                        message = success ? "Purchase Order updated successfully." : "Failed to update Purchase Order.";
                        break;
                    case 5:
                        reqEntry = new RequisitionEntry(updatedDetails);

                        if (!reqEntry.validItem()) {
                            JOptionPane.showMessageDialog(DynamicForm.this, "Invalid item code");
                            return;
                        }

                        if (!reqEntry.validQuantity()) {
                            JOptionPane.showMessageDialog(DynamicForm.this, "Invalid quantity");
                            return;
                        }
                        
                        itemDetails = reqEntry.getItemDetail();
                        itemCode = itemDetails[0];
                        quantity = Integer.parseInt(updatedDetails[2]);
                        price = Float.parseFloat(itemDetails[3]);
                        textFields[3].setText(Float.toString(price));
                        textFields[4].setText(Float.toString(quantity * price));
                        textFields[6].setText(itemDetails[5]);

                        option = JOptionPane.showConfirmDialog(DynamicForm.this, "Update PR Entry?", "Confirmation", JOptionPane.YES_NO_OPTION);
                        if (option == JOptionPane.YES_OPTION) {
                            reqEntry = new RequisitionEntry(getFieldValues());
                            if (!edit) {
                                success = reqEntry.addRequisition();
                                itemEntry = new ItemEntry(itemCode);
                                itemEntry.manageStock(quantity, false);
                            }
                            else success = reqEntry.editRequisition();
                            message = success ? "Requisition updated successfully." : "Failed to update Requisition.";
                        }
                        break;
                    case 6:
                        userEntry = new UserEntry(updatedDetails);
                        if (!validateFields()){
                            JOptionPane.showMessageDialog(DynamicForm.this, "Invalid input detected");
                            return;
                        }
                        if (!edit) success = userEntry.addUser();
                        else success = userEntry.editUser();
                        message = success ? "User updated successfully." : "Failed to update user.";
                        break;
                }

                // Show the appropriate message
                JOptionPane.showMessageDialog((Component)e.getSource(), message);

                // Close the dynamic form after saving or when it fails to save
                DynamicForm.this.dispose();
            }
                
                
            });
        }

    public void setFieldValues(String[] fieldValues) {
        if (fieldValues != null && textFields != null) {
            for (int i = 0; i < Math.min(fieldValues.length, textFields.length); i++) {
                textFields[i].setText(fieldValues[i]);
            }
        }
    }

    public String[] getFieldValues() {
        String[] fieldValues = new String[fieldNames.length];
        if (textFields != null) {
            for (int i = 0; i < textFields.length; i++) {
                if (fieldNames[i].equalsIgnoreCase("role")) {
                    JComboBox<String> roleComboBox = (JComboBox<String>) jPanel1.getComponent(i * 2 + 1);
                    fieldValues[i] = roleComboBox.getSelectedItem().toString();
                } else {
                    fieldValues[i] = textFields[i].getText();
                }
            }
    }
        return fieldValues;
    }
    
    public void registerFieldValidation(String fieldName, Predicate<String> validationRule) {
        validationRules.put(fieldName, validationRule);
    }
    
    private void addFieldValidation(){
        //for item
        registerFieldValidation("Price (RM)", this::priceValidation);
        registerFieldValidation("Stock", this::quantityValidation);
        registerFieldValidation("Name", this::stringValidation);
        registerFieldValidation("Category", this::stringValidation);
        
        //for supplier
        registerFieldValidation("Contact No.", this::contactValidation);
        registerFieldValidation("Location", this::stringValidation);   
        
        // for pr
        registerFieldValidation("Quantity", this::quantityValidation);
        
        // for user registration
        registerFieldValidation("Password", this::stringValidation);
        registerFieldValidation("Username", this::stringValidation);
        
    }
    
    public boolean validateFields() {
        for (int i = 0; i < fieldNames.length; i++) {
            String fieldName = fieldNames[i];
            String fieldValue = textFields[i].getText();

            // Check if a validation rule is registered for this field
            Predicate<String> validationRule = validationRules.get(fieldName);

            // If a validation rule exists, apply it to the field value
            if (validationRule != null && !validationRule.test(fieldValue)) {
                JOptionPane.showMessageDialog(this, "Invalid value for " + fieldName);
                return false;
            }
        }
        return true;
    }
    
    private boolean priceValidation(String price){
        try {
            double value = Double.parseDouble(price);
            return value > 0; 
        } catch (NumberFormatException e){
            return false;
        }
    }
    
    private boolean quantityValidation(String quantity){
        try{
            int value = Integer.parseInt(quantity);
            return value > 0;
        } catch (NumberFormatException e){
            return false;
        }
    }
    
    private boolean stringValidation(String input){
        return (input.length() > 2 && input.length() < 20);
    }
    
    private boolean contactValidation(String contact){
        if (contact.length() < 8 || contact.length() > 13) return false;
        try{
            int value = Integer.parseInt(contact);
            return value > 0;
        } catch (NumberFormatException e){
            return false;
        }
    }
   
}