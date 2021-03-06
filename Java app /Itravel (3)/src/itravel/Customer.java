/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */  
package itravel;

import java.awt.Color;
import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;  
 
/**
 *
 * @author hanadim
 */
public class Customer extends javax.swing.JFrame {

   Connection connect=null;
PreparedStatement statement=null;
ResultSet result=null;

    public Customer() {
        initComponents();
         
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CusbuttonGroup = new javax.swing.ButtonGroup();
        BGPanel = new javax.swing.JPanel();
        CustomerHeader = new javax.swing.JLabel();
        CIcon = new javax.swing.JLabel();
        LogInBottun = new javax.swing.JRadioButton();
        RegisterBottun = new javax.swing.JRadioButton();
        UserLable = new javax.swing.JLabel();
        UserNameField = new javax.swing.JTextField();
        PasswordLable = new javax.swing.JLabel();
        PasswordField = new javax.swing.JPasswordField();
        RegisterButton = new javax.swing.JButton();
        RegisterPanel = new javax.swing.JPanel();
        RUserField = new javax.swing.JTextField();
        FirstNameField = new javax.swing.JTextField();
        LastNameField = new javax.swing.JTextField();
        EmailField = new javax.swing.JTextField();
        BdateField = new javax.swing.JTextField();
        RUserLabel = new javax.swing.JLabel();
        RPasswordLabel = new javax.swing.JLabel();
        FirstNameLabel = new javax.swing.JLabel();
        LastNameLabel = new javax.swing.JLabel();
        EmailLabel = new javax.swing.JLabel();
        BdateLabel = new javax.swing.JLabel();
        RPasswordField = new javax.swing.JPasswordField();
        LogInButton = new javax.swing.JButton();
        PhoneLabel = new javax.swing.JLabel();
        PostCodeField = new javax.swing.JTextField();
        CityField = new javax.swing.JTextField();
        CityLabel = new javax.swing.JLabel();
        PostCodeLabel = new javax.swing.JLabel();
        BackButton1 = new javax.swing.JButton();
        PhoneField = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer");

        BGPanel.setBackground(new java.awt.Color(238, 236, 233));

        CustomerHeader.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/h.jpg"))); // NOI18N

        CIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/fo22.jpg"))); // NOI18N

        CusbuttonGroup.add(LogInBottun);
        LogInBottun.setText("Log In");
        LogInBottun.setToolTipText("");
        LogInBottun.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                LogInBottunItemStateChanged(evt);
            }
        });

        CusbuttonGroup.add(RegisterBottun);
        RegisterBottun.setText("New Register");
        RegisterBottun.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                RegisterBottunItemStateChanged(evt);
            }
        });

        UserLable.setText("User Name:");

        UserNameField.setEditable(false);
        UserNameField.setToolTipText("Enter your user name here");

        PasswordLable.setText("Password:");

        PasswordField.setEditable(false);
        PasswordField.setToolTipText("Enter your password here");

        RegisterButton.setText("Register");
        RegisterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterButtonActionPerformed(evt);
            }
        });

        RegisterPanel.setBackground(new java.awt.Color(238, 236, 233));

        RUserField.setEditable(false);
        RUserField.setToolTipText("Enter your user namehere");

        FirstNameField.setEditable(false);
        FirstNameField.setToolTipText("Enter your firts name here");

        LastNameField.setEditable(false);
        LastNameField.setToolTipText("Enter your last name here");

        EmailField.setEditable(false);
        EmailField.setToolTipText("ex:xxx@hotmail.com");

        BdateField.setEditable(false);
        BdateField.setToolTipText("yyyy-mm-dd");

        RUserLabel.setText("User Name");

        RPasswordLabel.setText("Password");

        FirstNameLabel.setText("First Name");

        LastNameLabel.setText("Last Name");

        EmailLabel.setText("Email");

        BdateLabel.setText("Date of Birth");

        RPasswordField.setEditable(false);
        RPasswordField.setToolTipText("Enter your password here");

        javax.swing.GroupLayout RegisterPanelLayout = new javax.swing.GroupLayout(RegisterPanel);
        RegisterPanel.setLayout(RegisterPanelLayout);
        RegisterPanelLayout.setHorizontalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, RegisterPanelLayout.createSequentialGroup()
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegisterPanelLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(RPasswordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmailField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(FirstNameField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(RegisterPanelLayout.createSequentialGroup()
                        .addGap(0, 46, Short.MAX_VALUE)
                        .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(RegisterPanelLayout.createSequentialGroup()
                                .addComponent(RUserLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RUserField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(RPasswordLabel)
                            .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EmailLabel)
                                    .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(RegisterPanelLayout.createSequentialGroup()
                                            .addComponent(LastNameLabel)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(RegisterPanelLayout.createSequentialGroup()
                                            .addComponent(BdateLabel)
                                            .addGap(18, 18, 18)
                                            .addComponent(BdateField, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(RegisterPanelLayout.createSequentialGroup()
                                    .addComponent(FirstNameLabel)
                                    .addGap(183, 183, 183))))))
                .addGap(37, 37, 37))
        );
        RegisterPanelLayout.setVerticalGroup(
            RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegisterPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RUserField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RUserLabel))
                .addGap(18, 18, 18)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RPasswordLabel)
                    .addComponent(RPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FirstNameLabel))
                .addGap(18, 18, 18)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LastNameLabel))
                .addGap(18, 18, 18)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmailLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(RegisterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BdateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BdateLabel)))
        );

        LogInButton.setText("Login");
        LogInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogInButtonActionPerformed(evt);
            }
        });

        PhoneLabel.setText("Phone number");

        PostCodeField.setEditable(false);
        PostCodeField.setToolTipText("Enter your post code here");

        CityField.setEditable(false);
        CityField.setToolTipText("Enter your city here");

        CityLabel.setText("City");

        PostCodeLabel.setText("Post-Code");

        BackButton1.setFont(new java.awt.Font("Tahoma", 0, 8)); // NOI18N
        BackButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/back.png"))); // NOI18N
        BackButton1.setToolTipText("");
        BackButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButton1ActionPerformed(evt);
            }
        });

        PhoneField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("##########"))));

        javax.swing.GroupLayout BGPanelLayout = new javax.swing.GroupLayout(BGPanel);
        BGPanel.setLayout(BGPanelLayout);
        BGPanelLayout.setHorizontalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(LogInBottun, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(CIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CityLabel)
                            .addComponent(PhoneLabel)
                            .addComponent(PostCodeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CityField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(PostCodeField, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(PhoneField))
                        .addGap(58, 58, 58))
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addComponent(RegisterBottun)
                        .addGap(111, 111, 111))
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(82, 82, 82))))
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(PasswordLable, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(UserNameField)
                            .addComponent(UserLable)))
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(CustomerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 180, Short.MAX_VALUE)
                .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        BGPanelLayout.setVerticalGroup(
            BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGPanelLayout.createSequentialGroup()
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(CustomerHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(BackButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LogInBottun)
                    .addComponent(RegisterBottun))
                .addGap(18, 18, 18)
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addComponent(UserLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasswordLable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LogInButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(RegisterPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PhoneLabel)
                            .addComponent(PhoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CityField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CityLabel))
                        .addGap(18, 18, 18)
                        .addGroup(BGPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PostCodeLabel)
                            .addComponent(PostCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(RegisterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BGPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogInButtonActionPerformed

      if(UserNameField.getText().length()!=0&& PasswordField.getText().length()!=0){  
       
     try{  
      connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/itravel","root","Hn@30113011");
     statement =connect.prepareStatement("SELECT * FROM itravel.`customer_information` where `User_name`=? "
             + "and `Password`=?");
      statement.setString(1, UserNameField.getText());
      statement.setString(2,String.valueOf(PasswordField.getText()));
     ResultSet rs= statement.executeQuery();
     if(rs.next()){
       JOptionPane.showMessageDialog(Customer.this,"Log In Successfully",
          "Log In",JOptionPane.INFORMATION_MESSAGE);

     new Reservation().setVisible(true);
     dispose(); 
                 
     } else{
         JOptionPane.showMessageDialog(null, "Username and Password are not matched please try agin !"
                 ,"Log in Error",JOptionPane.ERROR_MESSAGE);

    }
    }  catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex);  }
         
     catch(InputMismatchException e){ 
            JOptionPane.showMessageDialog(Customer.this,"somethong went wrong with your insertion",
                    "Error",JOptionPane.WARNING_MESSAGE);}
         catch(Exception e){
      JOptionPane.showMessageDialog(null,"Error please try agin ");
      }
      
      } else 
          JOptionPane.showMessageDialog(Customer.this,"You have to fill all the information","Missing Information",JOptionPane.WARNING_MESSAGE);
           
       
    
    }//GEN-LAST:event_LogInButtonActionPerformed

    private void RegisterBottunItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_RegisterBottunItemStateChanged
   
        if (RegisterBottun.isSelected() ) {
                    RPasswordField.setEditable(true);
                    RUserField.setEditable(true);
                    PostCodeField.setEditable(true);
                    LastNameField.setEditable(true);
                    FirstNameField.setEditable(true);
                    EmailField.setEditable(true);
                    CityField.setEditable(true);
                    PhoneField.setEditable(true);
                    BdateField.setEditable(true);}
        
 else {
                    RPasswordField.setEditable(false);
                    RUserField.setEditable(false);
                    PostCodeField.setEditable(false);
                    LastNameField.setEditable(false);
                    FirstNameField.setEditable(false);
                    EmailField.setEditable(false);
                    CityField.setEditable(false);
                    PhoneField.setEditable(false);
                    BdateField.setEditable(false);}
       
    }//GEN-LAST:event_RegisterBottunItemStateChanged

    private void LogInBottunItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_LogInBottunItemStateChanged
     
           if (LogInBottun.isSelected() ) {  
            PasswordField.setEditable(true);
           UserNameField.setEditable(true);
           }
           
           else {
             PasswordField.setEditable(false);
           UserNameField.setEditable(false);
           }
           
    }//GEN-LAST:event_LogInBottunItemStateChanged

    private void RegisterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterButtonActionPerformed
          try {
         if(  RPasswordField.getText().length()!=0&& RUserField.getText().length()!=0 
                 && PostCodeField.getText().length()!=0 && LastNameField.getText().length()!=0 && 
                 FirstNameField.getText().length()!=0 &&  EmailField.getText().length()!=0 
                 && CityField.getText().length()!=0 && PhoneField.getText().length()!=0 && 
                 BdateField.getText().length()!=0 ){
             String RUser=RUserField.getText();
             String Lname=LastNameField.getText();
             String Fname=FirstNameField.getText();
             String city=CityField.getText();
             String email=EmailField.getText();
             String bday=BdateField.getText(); 
             String post=(PostCodeField.getText());
             String pnum=PhoneField.getText();
      
        if (!RUser.matches("^[a-zA-Z]+$"))
            { JOptionPane.showMessageDialog(Customer.this,
                "Only letters accepted","User name Field ",JOptionPane.WARNING_MESSAGE);}
         else if (!Lname.matches("^[a-zA-Z]+$")){JOptionPane.showMessageDialog(Customer.this,
                "Only letters accepted","Last name Field ",JOptionPane.WARNING_MESSAGE);}
         else if (!Fname.matches("^[a-zA-Z]+$")){JOptionPane.showMessageDialog(Customer.this,
                "Only letters accepted","First name Field ",JOptionPane.WARNING_MESSAGE);}
           else if (!bday.matches("^\\d{4}-\\d{2}-\\d{2}$")){JOptionPane.showMessageDialog(Customer.this,
                "Unaccepted format","Birth day Field ",JOptionPane.WARNING_MESSAGE);}
         else if (!city.matches("^[a-zA-Z\\s]+$")){JOptionPane.showMessageDialog(Customer.this,
                "Only letters accepted","Cite Field ",JOptionPane.WARNING_MESSAGE);}
         else if (!email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) 
              {JOptionPane.showMessageDialog(Customer.this,
                "Unaccepted format","Email Field ",JOptionPane.WARNING_MESSAGE);}
         else if (!post.matches("\\d{5}")){ JOptionPane.showMessageDialog(Customer.this,"Must enter a numeric value (5 diget)",
                      "Post Code Field",JOptionPane.WARNING_MESSAGE);}
         else if (!pnum.matches("\\d{9}")){ JOptionPane.showMessageDialog(Customer.this,"Must enter a numeric value (9 diget)",
                     "Phone number Field",JOptionPane.WARNING_MESSAGE);}
         
         else {
        
        connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/itravel","root","Hn@30113011");
        String INSERT1="INSERT INTO `itravel`.`customer_information` (`User_name`,`Fname`, `Lname`, "
                + "`Email`, `Date_of_birth`, `City`, `Post_code`, `Phone_number`, `Password`)"
                + " VALUES (?,?,?,?,?,?,?,?,?)";
               
        statement=connect.prepareStatement(INSERT1);
        statement.setString(1,RUserField.getText()); 
        statement.setString(2,FirstNameField.getText());
        statement.setString(3,LastNameField.getText());
        statement.setString(4,EmailField.getText());
        statement.setString(5,BdateField.getText());
        statement.setString(6,CityField.getText());
        statement.setString(7,PostCodeField.getText());
        statement.setString(8,PhoneField.getText());
        statement.setString(9,RPasswordField.getText());  
        statement.executeUpdate();
       
     JOptionPane.showMessageDialog(null," You have been succssfuly registerd");
        new Reservation().setVisible(true);
         dispose(); 
         }
         
         }else 
          JOptionPane.showMessageDialog(Customer.this,"You have to fill all the information"
                  ,"Missing Information",JOptionPane.WARNING_MESSAGE);
            }catch(InputMismatchException | SQLException e){ 
            JOptionPane.showMessageDialog(Customer.this,"somethong went wrong with your insertion","Error",JOptionPane.WARNING_MESSAGE);}
          
    }//GEN-LAST:event_RegisterButtonActionPerformed

    private void BackButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButton1ActionPerformed

        new Login().setVisible(true);
        dispose();
    }//GEN-LAST:event_BackButton1ActionPerformed
public void Check() throws SQLException,InputMismatchException {

   if(  RPasswordField.getText().length()!=0&& RUserField.getText().length()!=0 
                 && PostCodeField.getText().length()!=0 && LastNameField.getText().length()!=0 && 
                 FirstNameField.getText().length()!=0 &&  EmailField.getText().length()!=0 
                 && CityField.getText().length()!=0 && PhoneField.getText().length()!=0 && 
                 BdateField.getText().length()!=0 ){
             
        
        connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/itravel","root","Hn@30113011");
        String INSERT1="INSERT INTO `itravel`.`customer_information` (`User_name`,`Fname`, `Lname`, "
                + "`Email`, `Date_of_birth`, `City`, `Post_code`, `Phone_number`, `Password`)"
                + " VALUES (?,?,?,?,?,?,?,?,?)";
               
        statement=connect.prepareStatement(INSERT1);
        statement.setString(1,RUserField.getText()); 
        statement.setString(2,FirstNameField.getText());
        statement.setString(3,LastNameField.getText());
        statement.setString(4,EmailField.getText());
        statement.setString(5,BdateField.getText());
        statement.setString(6,CityField.getText());
        statement.setString(7,PostCodeField.getText());
        statement.setString(8,PhoneField.getText());
        statement.setString(9,RPasswordField.getText());  
        statement.executeUpdate();
       
     JOptionPane.showMessageDialog(null," You have been succssfuly registerd");
        new Reservation().setVisible(true);
         dispose(); }
         
           else 
          JOptionPane.showMessageDialog(Customer.this,"You have to fill all the information"
                  ,"Missing Information",JOptionPane.WARNING_MESSAGE);
}
    /**
     * @hanadim 
     * the command line arguments
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
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Customer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Customer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BGPanel;
    private javax.swing.JButton BackButton1;
    private javax.swing.JTextField BdateField;
    private javax.swing.JLabel BdateLabel;
    private javax.swing.JLabel CIcon;
    private javax.swing.JTextField CityField;
    private javax.swing.JLabel CityLabel;
    private javax.swing.ButtonGroup CusbuttonGroup;
    private javax.swing.JLabel CustomerHeader;
    private javax.swing.JTextField EmailField;
    private javax.swing.JLabel EmailLabel;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JLabel FirstNameLabel;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JLabel LastNameLabel;
    private javax.swing.JRadioButton LogInBottun;
    private javax.swing.JButton LogInButton;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLable;
    private javax.swing.JFormattedTextField PhoneField;
    private javax.swing.JLabel PhoneLabel;
    private javax.swing.JTextField PostCodeField;
    private javax.swing.JLabel PostCodeLabel;
    private javax.swing.JPasswordField RPasswordField;
    private javax.swing.JLabel RPasswordLabel;
    private javax.swing.JTextField RUserField;
    private javax.swing.JLabel RUserLabel;
    private javax.swing.JRadioButton RegisterBottun;
    private javax.swing.JButton RegisterButton;
    private javax.swing.JPanel RegisterPanel;
    private javax.swing.JLabel UserLable;
    private javax.swing.JTextField UserNameField;
    // End of variables declaration//GEN-END:variables
}
