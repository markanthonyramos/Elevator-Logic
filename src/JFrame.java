/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class Project extends javax.swing.JFrame {

    /**
     * Creates new form Project
     */
    public Project() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        option2 = new javax.swing.JComboBox<>();
        option1 = new javax.swing.JComboBox<>();
        option5 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        option4 = new javax.swing.JComboBox<>();
        option6 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        confirm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        kilo = new javax.swing.JSpinner();
        amount1 = new javax.swing.JSpinner();
        amount2 = new javax.swing.JSpinner();
        amount3 = new javax.swing.JSpinner();
        amount4 = new javax.swing.JSpinner();
        amount5 = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        option3 = new javax.swing.JComboBox<>();
        jScrollPane7 = new javax.swing.JScrollPane();
        whole = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Pick your order");
        jLabel3.setToolTipText("");
        jLabel3.setAlignmentY(0.0F);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Grains and Bread");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, -1, -1));

        option2.setBackground(new java.awt.Color(177, 243, 144));
        option2.setEditable(true);
        option2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        option2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Onions", "Garlic" }));
        option2.setPreferredSize(new java.awt.Dimension(135, 21));
        option2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option2ActionPerformed(evt);
            }
        });
        getContentPane().add(option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 203, -1, -1));

        option1.setBackground(new java.awt.Color(177, 243, 144));
        option1.setEditable(true);
        option1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        option1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Skinless white meat", "Lean cuts of red meat", "Tuna", "Bangus", "Tilapia", "Chicken", "Luncheon Meat" }));
        option1.setPreferredSize(new java.awt.Dimension(135, 21));
        option1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option1ActionPerformed(evt);
            }
        });
        getContentPane().add(option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 167, -1, -1));

        option5.setBackground(new java.awt.Color(177, 243, 144));
        option5.setEditable(true);
        option5.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        option5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Milk", "Eggs", "Cheese", "Yogurt" }));
        option5.setPreferredSize(new java.awt.Dimension(135, 21));
        option5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                option5ActionPerformed(evt);
            }
        });
        getContentPane().add(option5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 319, -1, -1));

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setForeground(new java.awt.Color(25, 25, 25));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Produce");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, -1, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Oil and Fat");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dairy and Eggs");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Meat and Fish");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Condiments");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        option4.setBackground(new java.awt.Color(177, 243, 144));
        option4.setEditable(true);
        option4.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        option4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Salt", "Pepper", "Honey", "Sugar", "Soy Sauce", "Vinegar", "Stock Cubes" }));
        option4.setPreferredSize(new java.awt.Dimension(135, 21));
        jPanel1.add(option4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        option6.setBackground(new java.awt.Color(177, 243, 144));
        option6.setEditable(true);
        option6.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        option6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Cooking Oil", "Butter", "Vegetable Oil" }));
        option6.setPreferredSize(new java.awt.Dimension(135, 21));
        jPanel1.add(option6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Address:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        address.setBackground(new java.awt.Color(177, 243, 144));
        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 110, 210, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Summary of order");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        jButton1.setBackground(new java.awt.Color(177, 243, 144));
        jButton1.setText("Proceed to Check out");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 150, 30));

        confirm.setBackground(new java.awt.Color(177, 243, 144));
        confirm.setText("Confirm Order");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });
        jPanel1.add(confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 780, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME TO E-MARKET");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentY(0.0F);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        name.setBackground(new java.awt.Color(177, 243, 144));
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 80, 210, -1));
        jPanel1.add(kilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 167, -1, -1));
        jPanel1.add(amount1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 203, -1, -1));
        jPanel1.add(amount2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, -1, -1));
        jPanel1.add(amount3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));
        jPanel1.add(amount4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 319, -1, -1));
        jPanel1.add(amount5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Amount");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Kilo");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Amount");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 196, -1, 30));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Amount");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 240, -1, -1));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Amount");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Amount");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 320, -1, -1));

        option3.setBackground(new java.awt.Color(177, 243, 144));
        option3.setEditable(true);
        option3.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        option3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "None", "Pasta", "Rice", "Bread", "All purpose flour" }));
        option3.setPreferredSize(new java.awt.Dimension(135, 21));
        jPanel1.add(option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, -1, -1));

        whole.setColumns(20);
        whole.setRows(5);
        jScrollPane7.setViewportView(whole);

        jPanel1.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 350, 240));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 820));

        pack();
    }// </editor-fold>                        

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {                                     

    }                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        String name1 = name.getText();
        String address1 = address.getText();
        
        String selectedValue = option1.getSelectedItem().toString();
        String selectedValue1 = option2.getSelectedItem().toString();
        String selectedValue2 = option3.getSelectedItem().toString();
        String selectedValue3 = option4.getSelectedItem().toString();
        String selectedValue4 = option5.getSelectedItem().toString();
        String selectedValue5 = option6.getSelectedItem().toString();

        int selectedKilo = Integer.parseInt(kilo.getValue().toString());
        int selectedAmount1 = Integer.parseInt(amount1.getValue().toString());
        int selectedAmount2 = Integer.parseInt(amount2.getValue().toString());
        int selectedAmount3 = Integer.parseInt(amount3.getValue().toString());
        int selectedAmount4 = Integer.parseInt(amount4.getValue().toString());
        int selectedAmount5 = Integer.parseInt(amount5.getValue().toString());

        int option1TotalValue = 0;
        int option2TotalValue = 0;
        int option3TotalValue = 0;
        int option4TotalValue = 0;
        int option5TotalValue = 0;
        int option6TotalValue = 0;
        
        int totalPrice = 0;
        
        StringBuilder SB = new StringBuilder();
        SB.append("Name: "+name1).append("\n");
        SB.append("Address: "+address1).append("\n");
        
        if (option1.getSelectedItem() == "None")
        {
            SB.append("");
            totalPrice += 0;
        }
        else if (option1.getSelectedItem() == "Skinless white meat")
        {
            option1TotalValue = 240 * selectedKilo;
            SB.append("\n"+selectedValue+" | " + option1TotalValue);
            totalPrice += option1TotalValue;
        }    
        else if (option1.getSelectedItem() == "Lean cuts of red meat")
        {
            option1TotalValue = 320 * selectedKilo;
            SB.append("\n"+selectedValue+" | " + option1TotalValue);
            totalPrice += option1TotalValue;
        }    
        else if (option1.getSelectedItem() == "Tuna")
        {
            option1TotalValue = 105 * selectedKilo;
           SB.append("\n"+selectedValue+" | " + option1TotalValue);
            totalPrice += option1TotalValue;
        }    
        else if (option1.getSelectedItem() == "Bangus")
        {
            option1TotalValue = 110 * selectedKilo;
           SB.append("\n"+selectedValue+" | " + option1TotalValue);
            totalPrice += option1TotalValue;
        }    
        else if (option1.getSelectedItem() == "Tilapia")
        {
            option1TotalValue = 150 * selectedKilo;
            SB.append("\n"+selectedValue+" | " + option1TotalValue);
            totalPrice += option1TotalValue;
        }    
        else if (option1.getSelectedItem() == "Chicken")
        {
            option1TotalValue = 200 * selectedKilo;
           SB.append("\n"+selectedValue+" | " + option1TotalValue);
            totalPrice += option1TotalValue;
        }    
        else if (option1.getSelectedItem() == "Luncheon Meat")
        {
            option1TotalValue = 200 * selectedKilo;
            SB.append("\n"+selectedValue+" | " + option1TotalValue);
            totalPrice += option1TotalValue;
        }    
        
        if (option1.getSelectedItem() == "None")
        {
            SB.append("");
            totalPrice += 0;
        }
        else if (option2.getSelectedItem() == "Onions")
        {
            option2TotalValue = 10 * selectedAmount1;
            SB.append("\n"+selectedValue1+" | " + option2TotalValue);
            totalPrice += option2TotalValue;
        }   
        else if (option2.getSelectedItem() == "Garlic")
        {
            option2TotalValue = 10 * selectedAmount1;
            SB.append("\n"+selectedValue1+" | " + option2TotalValue);
            totalPrice += option2TotalValue;
        }    
        
        if (option1.getSelectedItem() == "None")
        {
            SB.append("");
            totalPrice += 0;
        }
        else if (option3.getSelectedItem() == "Pasta")
        {
            option3TotalValue = 60 * selectedAmount2;
           SB.append("\n"+selectedValue2+" | " + option3TotalValue);
            totalPrice += option3TotalValue;
        }
        else if (option3.getSelectedItem() == "Rice")
        {
            option3TotalValue = 45 * selectedAmount2;
            SB.append("\n"+selectedValue2+" | " + option3TotalValue);
            totalPrice += option3TotalValue;
        }    
        else if (option3.getSelectedItem() == "Bread")
        {
            option3TotalValue = 65 * selectedAmount2;
           SB.append("\n"+selectedValue2+" | " + option3TotalValue);
            totalPrice += option3TotalValue;
        }    
        else if (option3.getSelectedItem() == "All puurpose flour")
        {
            option3TotalValue = 60 * selectedAmount2;
           SB.append("\n"+selectedValue2+" | " + option3TotalValue);
            totalPrice += option3TotalValue;
        } 
        
        if (option1.getSelectedItem() == "None")
        {
            SB.append("");
            totalPrice += 0;
        }
        else if (option4.getSelectedItem() == "Salt")
        {
            option4TotalValue = 30 * selectedAmount3;
           SB.append("\n"+selectedValue3+" | " + option4TotalValue);
            totalPrice += option4TotalValue;
        }    
        else if (option4.getSelectedItem() == "Pepper")
        {
            option4TotalValue = 25 * selectedAmount3;
            SB.append("\n"+selectedValue3+" | " + option4TotalValue);
            totalPrice += option4TotalValue;
        } 
        else if (option4.getSelectedItem() == "Honey")
        {
            option4TotalValue = 150 * selectedAmount3;
            SB.append("\n"+selectedValue3+" | " + option4TotalValue);
            totalPrice += option4TotalValue;
        } 
        else if (option4.getSelectedItem() == "Sugar")
        {
            option4TotalValue = 50 * selectedAmount3;
           SB.append("\n"+selectedValue3+" | " + option4TotalValue);
            totalPrice += option4TotalValue;
        } 
        else if (option4.getSelectedItem() == "Soy Sauce")
        {
            option4TotalValue = 50 * selectedAmount3;
            SB.append("\n"+selectedValue3+" | " + option4TotalValue);
            totalPrice += option4TotalValue;
        } 
        else if (option4.getSelectedItem() == "Vinegar")
        {
            option4TotalValue = 50 * selectedAmount3;
            SB.append("\n"+selectedValue3+" | " + option4TotalValue);
            totalPrice += option4TotalValue;
        } 
        else if (option4.getSelectedItem() == "Stock Cubes")
        {
            option4TotalValue = 20 * selectedAmount3;
           SB.append("\n"+selectedValue3+" | " + option4TotalValue);
            totalPrice += option4TotalValue;
        } 
        
        if (option1.getSelectedItem() == "None")
        {
            SB.append("");
            totalPrice += 0;
        }
        else if (option5.getSelectedItem() == "Milk")
        {
            option5TotalValue = 85 * selectedAmount4;
           SB.append("\n"+selectedValue4+" | " + option5TotalValue);
            totalPrice += option5TotalValue;
        } 
        else if (option5.getSelectedItem() == "Eggs")
        {
            option5TotalValue = 250 * selectedAmount4;
           SB.append("\n"+selectedValue4+" | " + option5TotalValue);
            totalPrice += option5TotalValue;
        } 
        else if (option5.getSelectedItem() == "Cheese")
        {
            option5TotalValue = 70 * selectedAmount4;
            SB.append("\n"+selectedValue4+" | " + option5TotalValue);
            totalPrice += option5TotalValue;
        } 
        else if (option5.getSelectedItem() == "Yogurt")
        {
            option5TotalValue = 40 * selectedAmount4;
           SB.append("\n"+selectedValue4+" | " + option5TotalValue);
            totalPrice += option5TotalValue;
        } 
        
        if (option1.getSelectedItem() == "None")
        {
            SB.append("");
            totalPrice += 0;
        }
        else if (option6.getSelectedItem() == "Cooking Oil")
        {
            option6TotalValue = 100 * selectedAmount5;
            SB.append("\n"+selectedValue5+" | " + option6TotalValue);
            totalPrice += option6TotalValue;
        } 
        else if (option6.getSelectedItem() == "Butter")
        {
            option6TotalValue = 125 * selectedAmount5;
            SB.append("\n"+selectedValue5+" | " + option6TotalValue);
            totalPrice += option6TotalValue;
        } 
        else if (option6.getSelectedItem() == "Vegetable Oil")
        {
            option6TotalValue = 120 * selectedAmount5;
            SB.append("\n"+selectedValue5+" | " + option6TotalValue);
            totalPrice += option6TotalValue;
        } 
        
        int ans = totalPrice + 50;
        SB.append("\n ").append("\n");
        SB.append("\nDelivery fee | 50").append("\n");
        SB.append("\n-------------------------------------").append("\n");
        SB.append("Total Amount : " + ans).append("\n");
        SB.append("\nPlease prepare " + ans + " on the day of delivery.").append("\n");
        whole.setText(SB.toString());
        
        
    }                                        

    private void option2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void option1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void option5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {                                        
        JOptionPane.showMessageDialog(null, "Thank you! \nPlease wait for your order.", "Outputs", JOptionPane.PLAIN_MESSAGE);
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
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField address;
    private javax.swing.JSpinner amount1;
    private javax.swing.JSpinner amount2;
    private javax.swing.JSpinner amount3;
    private javax.swing.JSpinner amount4;
    private javax.swing.JSpinner amount5;
    private javax.swing.JButton confirm;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSpinner kilo;
    private javax.swing.JTextField name;
    private javax.swing.JComboBox<String> option1;
    private javax.swing.JComboBox<String> option2;
    private javax.swing.JComboBox<String> option3;
    private javax.swing.JComboBox<String> option4;
    private javax.swing.JComboBox<String> option5;
    private javax.swing.JComboBox<String> option6;
    private javax.swing.JTextArea whole;
    // End of variables declaration                   
}