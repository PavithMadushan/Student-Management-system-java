/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author PAVITH
 */
public class Teacher extends javax.swing.JFrame {

    /**
     * Creates new form Student
     */
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    
    public Teacher() {
        initComponents();
        setSize(1920,1080);
        //showTableData();
        
        conn=DbConnection.getConnet();
         
        showTableData();
       Fillcombo();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtsid = new javax.swing.JTextField();
        txtfname = new javax.swing.JTextField();
        txtlname = new javax.swing.JTextField();
        txttel = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtadd = new javax.swing.JTextArea();
        cmbcoursecode = new javax.swing.JComboBox<>();
        btninsert = new javax.swing.JButton();
        txtgen = new javax.swing.JTextField();
        btndelete = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        txtcc = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(2000, 2000));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Teacher");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_man_teacher_96px.png"))); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setText("X");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 102, 102));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8_arrow_pointing_left_52px.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 37, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Teacher ID");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("First Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Last Name");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Telephone");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Major");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Course Code");

        txtadd.setColumns(20);
        txtadd.setRows(5);
        txtadd.setPreferredSize(new java.awt.Dimension(176, 74));
        jScrollPane1.setViewportView(txtadd);

        cmbcoursecode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "COM/T/2021" }));

        btninsert.setBackground(new java.awt.Color(255, 153, 153));
        btninsert.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btninsert.setText("INSERT");
        btninsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninsertActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(255, 153, 153));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btndelete.setText("DELETE");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        btnupdate.setBackground(new java.awt.Color(255, 153, 153));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnupdate.setText("UPDATE");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Teacher ID", "First name", "Last name", "Address", "Major", "Telephone", "Course Code"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        jButton2.setBackground(new java.awt.Color(255, 153, 153));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("SEARCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtcc))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtsid, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtfname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtgen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                .addComponent(txttel, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addComponent(cmbcoursecode, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(15, 15, 15))))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 851, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnupdate, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtsid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btninsert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btndelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnupdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtlname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtgen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txttel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(cmbcoursecode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btninsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninsertActionPerformed
        // TODO add your handling code here:
        
        int response = JOptionPane.showConfirmDialog(this,"Do you want to insert ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(response==JOptionPane.YES_OPTION){
        
        
       try{
           
           String sqlcode1= "INSERT INTO `teacher` "
                + "(`TEACH_ID`, `TEACH_FNAME`, `TEACH_LNAME`,`TEACH_ADDRESS`)"
                + " VALUES (?,?,?,?);";
        
           String sqlcode2= "INSERT INTO `teacher_contact` "
                + "(`TEACH_ID`,`TEACH_TELE`)"
                + " VALUES (?,?);";
        
        String sqlcode3= "INSERT INTO `teacher_qualification` "
                + "(`TEACH_ID`,`TEACH_MAJOR`)"
                + " VALUES (?,?);";
        
        String sqlcode4= "INSERT INTO `conduct` "
                + "(`COURSE_ID`,`TEACH_ID`)"
                + " VALUES (?,?);";
        
        pst=conn.prepareStatement(sqlcode1);
        pst.setString(1,txtsid.getText());
        pst.setString(2,txtfname.getText());
        pst.setString(3,txtlname.getText());
        pst.setString(4,txtadd.getText());
        //pst.setString(5,txtdob.getText());
        //pst.setString(6,txtadd.getText());
        pst.executeUpdate();
        
        pst=conn.prepareStatement(sqlcode2);
        pst.setString(1,txtsid.getText());
        pst.setString(2,txttel.getText());
        pst.executeUpdate();
        
        pst=conn.prepareStatement(sqlcode3);
        pst.setString(1,txtsid.getText());
        pst.setString(2,txtgen.getText());
        pst.executeUpdate();
     //   
        pst=conn.prepareStatement(sqlcode4);
        pst.setString(2,txtsid.getText());
        pst.setString(1,txtcc.getText());
        pst.executeUpdate();
        
       
        
        
        JOptionPane.showMessageDialog(null,"Saved Successfully");
        showTableData();
       }
       
       catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
           System.out.println(ex);
       }
        }
    }//GEN-LAST:event_btninsertActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
        int response = JOptionPane.showConfirmDialog(this,"Do you want to delete ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(response==JOptionPane.YES_OPTION){
        
        
         try{
           
        String sqlcode1= "DELETE FROM teacher WHERE TEACH_ID=?;";
        String sqlcode2= "DELETE FROM teacher_contact WHERE TEACH_ID=?;";
        String sqlcode3= "DELETE FROM teacher_qualification WHERE TEACH_ID=?;";
        String sqlcode4= "DELETE FROM conduct WHERE TEACH_ID=?;";
        
        pst=conn.prepareStatement(sqlcode1);
        pst.setString(1,txtsid.getText());
        pst.executeUpdate();
        
         pst=conn.prepareStatement(sqlcode2);
        pst.setString(1,txtsid.getText());
        pst.executeUpdate();
        
         pst=conn.prepareStatement(sqlcode3);
        pst.setString(1,txtsid.getText());
        pst.executeUpdate();
        
        pst=conn.prepareStatement(sqlcode4);
        pst.setString(1,txtsid.getText());
        pst.executeUpdate();

        
        JOptionPane.showMessageDialog(null,"Deleted Successfully");
        showTableData();
       }
       
       catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
           //System.out.println(ex);
       }
        
        }
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this,"Do you want to update ?","Confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        
        if(response==JOptionPane.YES_OPTION){
        
        try{
           
           String sqlcode1= "UPDATE `teacher` SET `TEACH_FNAME`=?,`TEACH_LNAME`=?,"+
                  "`TEACH_ADDRESS`=? WHERE TEACH_ID=?;";
           
       String sqlcode2= "UPDATE `teacher_contact` SET `TEACH_TELE`=? WHERE TEACH_ID=?;";
        String sqlcode3= "UPDATE `teacher_qualification` SET `TEACH_MAJOR`= ? WHERE TEACH_ID=?;";
        String sqlcode4= "UPDATE `conduct` SET `COURSE_ID`= ? WHERE TEACH_ID=?;";
        
        
        pst=conn.prepareStatement(sqlcode1);
        pst.setString(4,txtsid.getText());
        pst.setString(1,txtfname.getText());
        pst.setString(2,txtlname.getText());
      //  pst.setString(3,txtgen.getText());
      //  pst.setString(4,txtdob.getText());
        pst.setString(3,txtadd.getText());
        pst.executeUpdate();
            //System.out.println("1111");
        
       pst=conn.prepareStatement(sqlcode2);
        pst.setString(2,txtsid.getText());
        pst.setString(1,txttel.getText());
        pst.executeUpdate();
            //System.out.println("2222");
        
        pst=conn.prepareStatement(sqlcode3);
        pst.setString(2,txtsid.getText());
        pst.setString(1,txtgen.getText());
        pst.executeUpdate();
            //System.out.println("3333");
            pst=conn.prepareStatement(sqlcode4);
        pst.setString(2,txtsid.getText());
        pst.setString(1,txtcc.getText());
        pst.executeUpdate();

         
        JOptionPane.showMessageDialog(null,"Updated Successfully");
        showTableData();
       }
       
       catch(Exception ex){
           JOptionPane.showMessageDialog(null,ex);
           System.out.println(ex);
       }
        
               
        }
                
    }//GEN-LAST:event_btnupdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
        
        int i = jTable1.getSelectedRow();
        TableModel model=jTable1.getModel();
         txtsid.setText(model.getValueAt(i,0).toString());
        txtfname.setText(model.getValueAt(i,1).toString());
        txtlname.setText(model.getValueAt(i,2).toString());
        txtadd.setText(model.getValueAt(i,3).toString());
        txtgen.setText(model.getValueAt(i,4).toString());
       
        txttel.setText(model.getValueAt(i,5).toString());
       //  txtdob.setText(model.getValueAt(i,6).toString());
        cmbcoursecode.setSelectedItem(model.getValueAt(i,7).toString());
        //txttel.setText(model.getValueAt(i,6).toString());
        //System.out.println(model.getValueAt(i,7).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try{
        
        String sqlcode="SELECT * FROM teacher WHERE TEACH_ID='"+txtsid.getText()+"'";
        
        pst=conn.prepareStatement(sqlcode);
        //pst.setString(1,txtsid.getText());
        //pst.executeUpdate();
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        
        }catch(Exception ex){
            
        JOptionPane.showMessageDialog(null,ex);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
       setVisible(false);
                Menue obj=new Menue();
                obj.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    public void showTableData(){
        
        try{
        
        String sqlcode="SELECT teacher.TEACH_ID AS \"Teacher ID\" , teacher.TEACH_FNAME AS \"First name\", teacher.TEACH_LNAME AS \"Last name\", teacher.TEACH_ADDRESS AS \"Address\", teacher_qualification.TEACH_MAJOR AS \"Major\", teacher_contact.TEACH_TELE AS \"Telephone\", course.COURSE_ID AS \"Course Code\"\n" +
"FROM teacher,teacher_contact,teacher_qualification,course,conduct\n" +
"WHERE teacher.TEACH_ID= teacher_contact.TEACH_ID and teacher.TEACH_ID=teacher_qualification.TEACH_ID AND( teacher.TEACH_ID=conduct.TEACH_ID and conduct.COURSE_ID= course.COURSE_ID)";
        pst=conn.prepareStatement(sqlcode);
        rs=pst.executeQuery();
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        
        }
        
        catch(Exception ex){
        
            JOptionPane.showMessageDialog(null,ex);
        }
        }
    
    /**
     * @param args the command line arguments
     */
    private void Fillcombo(){
    
    try{
    
    String sqlcode="SELECT * FROM course";
    pst=conn.prepareStatement(sqlcode);
    rs=pst.executeQuery();
    
    while(rs.next()){
    
    String name=rs.getString("COURSE_ID");
    cmbcoursecode.addItem(name);
    }
    
    
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
    }
    
    }
    
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
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btninsert;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbcoursecode;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea txtadd;
    private javax.swing.JTextField txtcc;
    private javax.swing.JTextField txtfname;
    private javax.swing.JTextField txtgen;
    private javax.swing.JTextField txtlname;
    private javax.swing.JTextField txtsid;
    private javax.swing.JTextField txttel;
    // End of variables declaration//GEN-END:variables
}
