
package assignmentproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public abstract class Entry {
    protected BufferedReader reader;
    private BufferedWriter writer;
    private JFrame frame; // to view the table
    
    abstract String[] getColNames();
    abstract String[] getDetails();

    protected void openReadFile(String filename){
        try {
            reader = new BufferedReader(new FileReader(filename));
        } catch (IOException e) {
            System.err.print(e);
        }
    }
    
    protected void openAppendFile(String filename){
        try {
            writer = new BufferedWriter(new FileWriter(filename, true));
        } catch (IOException e){
            System.err.print(e);
        }
    }
    

    protected void viewItems(String filename, String[] colNames){
        openReadFile(filename);
        
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JTable itemsTable = new JTable();
        DefaultTableModel tableModel = (DefaultTableModel) itemsTable.getModel(); // retrieve the reference of the jTable to access its structure
        tableModel.setRowCount(0);
        itemsTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        try {
            String line;
            tableModel.setColumnIdentifiers(colNames);
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                tableModel.addRow(row);
            }
            reader.close();
        } catch (IOException e) {
            System.err.print(e);
        }
        
        JScrollPane scrollPane = new JScrollPane(itemsTable);
        frame.add(scrollPane);
        frame.pack();
        frame.setLocation(400, 200);
        frame.setVisible(true);
    }
    

    
    protected boolean addItem(String filename, String[] details){
        if (itemExists(filename, details[0])) return false; //print item alr exists
        String merge = String.join(",", details);
        openAppendFile(filename);
        try{
            writer.write(merge + "\n");
            writer.close();
        } catch (IOException e){
            System.err.print(e);
        } 
        
        
        return true;
    }
    
    protected boolean delItem(String filename, String code){
       if (!itemExists(filename, code)) return false;
       openReadFile(filename);
       ArrayList<String> lines = new ArrayList<>();

       try {
           String line;
           while ((line = reader.readLine()) != null) {
               String[] row = line.split(",");
               if (!row[0].equalsIgnoreCase(code)) {
                   lines.add(line);
               }
           }
           reader.close();

           writer = new BufferedWriter(new FileWriter(filename));
           for (String lineToAdd : lines) {
               writer.write(lineToAdd);
               writer.newLine();
           }
           writer.close();

       } catch (IOException e) {
           System.err.print(e);
       }
       return true;
    }

    protected boolean editItem(String filename, String[] details, String id){
       if (!itemExists(filename, details[0])) return false;
       openReadFile(filename);
       ArrayList<String> lines = new ArrayList<>();
       String merge = String.join(",", details);

       try {
           String line;
           while ((line = reader.readLine()) != null) {
               String[] row = line.split(",");
               if (!row[0].equalsIgnoreCase(details[0])) {
                   lines.add(line);
               }
           }
           reader.close();

            StringBuilder modifiedContent = new StringBuilder();
            for (String lineToAdd : lines) {
                modifiedContent.append(lineToAdd);
                modifiedContent.append(System.lineSeparator());
            }
            modifiedContent.append(merge);

            writer = new BufferedWriter(new FileWriter(filename));
            writer.write(modifiedContent.toString());
            writer.close();
       } catch (IOException e){
           System.err.println(e);
       }
       return true;
    }
    
    
    protected boolean itemExists(String filename, String code){ // return true if item exists
        openReadFile(filename);
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");
                if (row[0].equalsIgnoreCase(code)) {
                    return true;
                }
            }
            reader.close();
        } catch (IOException e) {
            System.err.print(e);
        }
        return false;
    }
    
    protected String[] getLine(String filename, String code){
        openReadFile(filename);
        try {
            String line;
            while ((line = reader.readLine()) != null) {
                String row[] = line.split(",");
                if (row[0].equalsIgnoreCase(code)){
                    return row;
                }
            }
            reader.close();
        } catch (IOException e){
            System.err.println(e);
        }
        return null;
    }
    
}
