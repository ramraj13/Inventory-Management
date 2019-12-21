
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class UserAdmin extends javax.swing.JFrame {

    
    public UserAdmin()  {
        initComponents();
        list();
        //Combo();
        listed();
        listed2();
        
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        btnrefresh = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel11 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        list = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tablenew = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        btncombo2 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        table3 = new javax.swing.JTable();
        btnreset1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(0, 204, 204));
        jTabbedPane1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        jPanel7.setBackground(new java.awt.Color(102, 255, 51));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Diamond ID ", "Length", "Breadth", "Height", "Carat", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table1);

        btnrefresh.setBackground(new java.awt.Color(255, 255, 255));
        btnrefresh.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnrefresh.setForeground(new java.awt.Color(0, 0, 0));
        btnrefresh.setText("REFRESH");
        btnrefresh.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Total Stock ", jPanel1);

        jPanel9.setBackground(new java.awt.Color(153, 153, 255));

        jTabbedPane2.setBackground(new java.awt.Color(153, 153, 255));
        jTabbedPane2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        jPanel14.setBackground(new java.awt.Color(102, 255, 102));

        list.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Diamond ID", "Length", "Breadth", "Height", "Carat", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(list);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 1053, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("UPDATED STOCK", jPanel11);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("REQUESTED STOCK", jPanel12);

        jPanel15.setBackground(new java.awt.Color(0, 255, 255));

        tablenew.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Diamond ID", "Length", "Breadth", "Height", "Carat", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablenew.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablenewMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tablenew);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("NEW STOCK", jPanel13);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1057, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Authenticate Stock", jPanel3);

        jPanel8.setBackground(new java.awt.Color(0, 204, 204));

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(0, 204, 204));
        jTextField1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Do You Want to Download the Annual Report?");
        jTextField1.setBorder(null);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Download");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 608, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(238, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(374, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Download Report", jPanel4);

        jPanel10.setBackground(new java.awt.Color(0, 204, 204));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 204, 204));
        jTextField2.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Are you sure You Want to Log Out?");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 0));
        jButton2.setText("LOGOUT");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(439, 439, 439)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(249, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(342, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("LOGOUT", jPanel6);

        jPanel2.setBackground(new java.awt.Color(51, 255, 255));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Diamond ID");
        jTextField3.setBorder(null);

        btncombo2.setBackground(new java.awt.Color(255, 255, 255));
        btncombo2.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btncombo2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btncombo2MouseEntered(evt);
            }
        });
        btncombo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncombo2ActionPerformed(evt);
            }
        });

        table3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Diamond ID", "Length", "Breadth", "Height", "Carat", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table3MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table3);

        btnreset1.setText("REFRESH");
        btnreset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnreset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btncombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(btnreset1)
                .addContainerGap(212, Short.MAX_VALUE))
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncombo2)
                    .addComponent(btnreset1))
                .addGap(110, 110, 110)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(333, 333, 333))
        );

        jTabbedPane1.addTab("Individual Stock", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         MessageFormat header=new MessageFormat("Total Report");
         MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
            table1.print(JTable.PrintMode.NORMAL,header,footer);
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Cannot print! !");
        
        
        }
       
    }//GEN-LAST:event_jButton1ActionPerformed
        //Login t=new Login();
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       // t.setVisible(true);
       this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed
                    popupinfo rowdata=new popupinfo();
    private void table1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table1MouseClicked
        int index=table1.getSelectedRow();
        TableModel model=table1.getModel();

        //String Id       =model.getValueAt(index,0).toString();
        String Length   =model.getValueAt(index,1).toString();
        String Breadth  =model.getValueAt(index,2).toString();
        String Height   =model.getValueAt(index,2).toString();
        String Carat    =model.getValueAt(index,4).toString();
        String Quantity =model.getValueAt(index,5).toString();

        rowdata.setVisible(true);
        rowdata.pack();
        rowdata.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //rowdata.txtid1.setText(Id);
        rowdata.txtlen.setText(Length);
        rowdata.txtquan.setText(Quantity);
        rowdata.txtbred.setText(Breadth);
        rowdata.txtheight.setText(Height);
        rowdata.txtcar.setText(Carat);
    }//GEN-LAST:event_table1MouseClicked

    private void btncombo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncombo2ActionPerformed
       
    }//GEN-LAST:event_btncombo2ActionPerformed
        public String cc;
    private void btncombo2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncombo2MouseEntered
        cc=btncombo2.getSelectedItem().toString();
        System.out.print(cc);
         DefaultTableModel table1 =new DefaultTableModel();
            table1.addColumn("Diamond ID");
            table1.addColumn("Length");
            table1.addColumn("Breadth");
            table1.addColumn("Height");
            table1.addColumn("Carat");
            table1.addColumn("Quantity");
        try{
            Class.forName("java.sql.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
                String q="SELECT  `Diamond ID`,`Length`, `Breadth`, `Height`, `Carat`,`Quantity` FROM `inventory` WHERE (`Diamond ID`='"+cc+"')";
                Statement st1=(Statement)con.createStatement();
           
                ResultSet rs=st1.executeQuery(q);
            while(rs.next())
                {
                     table1.addRow(new Object[]{
                       rs.getString(1),
                       rs.getString(2),
                       rs.getString(3),
                       rs.getString(4),
                       rs.getString(5),
                       rs.getString(6),
                      
                   });
                    
                    
                    
                }
            table3.setModel(table1);
            
            
            
           }
        catch(Exception ex)
        {
            
        }
    }//GEN-LAST:event_btncombo2MouseEntered
            popupinfo row=new popupinfo();
    private void table3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table3MouseClicked
                        int index=table3.getSelectedRow();
                        TableModel model=table3.getModel();

        
        String Length   =model.getValueAt(index,1).toString();
        String Breadth  =model.getValueAt(index,2).toString();
        String Height   =model.getValueAt(index,2).toString();
        String Carat    =model.getValueAt(index,4).toString();
        String Quantity =model.getValueAt(index,5).toString();

        row.setVisible(true);
        row.pack();
        row.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

      
        row.txtlen.setText(Length);
        row.txtquan.setText(Quantity);
        row.txtbred.setText(Breadth);
        row.txtheight.setText(Height);
        row.txtcar.setText(Carat);                    
        
    }//GEN-LAST:event_table3MouseClicked
            adminupdate ad=new adminupdate();
    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked
         int index=list.getSelectedRow();
                        TableModel model=list.getModel();

        String ID       =model.getValueAt(index,0).toString();
        String Length   =model.getValueAt(index,1).toString();
        String Breadth  =model.getValueAt(index,2).toString();
        String Height   =model.getValueAt(index,2).toString();
        String Carat    =model.getValueAt(index,4).toString();
        String Quantity =model.getValueAt(index,5).toString();

        ad.setVisible(true);
        ad.pack();
        ad.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        ad.txtid2.setText(ID);
        ad.txtlen2.setText(Length);
        ad.txtquan2.setText(Quantity);
        ad.txtbred2.setText(Breadth);
        ad.txtheight2.setText(Height);
        ad.txtcar2.setText(Carat);     
    }//GEN-LAST:event_listMouseClicked
            newup n=new newup();
    private void tablenewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablenewMouseClicked
                        int index=tablenew.getSelectedRow();
                        TableModel model=tablenew.getModel();

        String ID       =model.getValueAt(index,0).toString();
        String Length   =model.getValueAt(index,1).toString();
        String Breadth  =model.getValueAt(index,2).toString();
        String Height   =model.getValueAt(index,2).toString();
        String Carat    =model.getValueAt(index,4).toString();
        String Quantity =model.getValueAt(index,5).toString();

        n.setVisible(true);
        n.pack();
        n.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        n.txtid.setText(ID);
        n.txtlen.setText(Length);
        n.txtquan.setText(Quantity);
        n.txtbred.setText(Breadth);
        n.txtheight.setText(Height);
        n.txtcar.setText(Carat);     
    }//GEN-LAST:event_tablenewMouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        DefaultTableModel tab =new DefaultTableModel();
        tab.addColumn("Diamond ID");
        tab.addColumn("Length");
        tab.addColumn("Breadth");
        tab.addColumn("Height");
        tab.addColumn("Carat");
        tab.addColumn("Quantity");
        
        try {
            Class.forName("java.sql.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","");
            java.sql.Statement st=con.createStatement();
            String Q ="SELECT * FROM inventoryu";
            ResultSet r=st.executeQuery(Q);
            while(r.next())
            {
               tab.addRow(new Object[]
               {
                    r.getString(1),
                       r.getString(2),
                       r.getString(3),
                       r.getString(4),
                       r.getString(5),
                       r.getString(6),
               
               
               }
                       );
           }
             table1.setModel(tab);
             
        } 
            catch (ClassNotFoundException ex) {
            Logger.getLogger(UserAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnreset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnreset1ActionPerformed
         DefaultTableModel tab =new DefaultTableModel();
        tab.addColumn("Diamond ID");
        tab.addColumn("Length");
        tab.addColumn("Breadth");
        tab.addColumn("Height");
        tab.addColumn("Carat");
        tab.addColumn("Quantity");
        
        try {
            Class.forName("java.sql.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","");
            java.sql.Statement st=con.createStatement();
            String Q ="SELECT * FROM inventoryu";
            ResultSet r=st.executeQuery(Q);
            while(r.next())
                {
                    String name=r.getString("Diamond ID");
                    btncombo2.addItem(name);
                
                }
             
        } 
            catch (ClassNotFoundException ex) {
            Logger.getLogger(UserAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnreset1ActionPerformed
        
   public void list()
    {
        DefaultTableModel tab =new DefaultTableModel();
        tab.addColumn("Diamond ID");
        tab.addColumn("Length");
        tab.addColumn("Breadth");
        tab.addColumn("Height");
        tab.addColumn("Carat");
        tab.addColumn("Quantity");
        
        try {
            Class.forName("java.sql.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","");
            java.sql.Statement st=con.createStatement();
            String Q ="SELECT * FROM inventoryu";
            ResultSet r=st.executeQuery(Q);
            while(r.next())
            {
               tab.addRow(new Object[]
               {
                    r.getString(1),
                       r.getString(2),
                       r.getString(3),
                       r.getString(4),
                       r.getString(5),
                       r.getString(6),
               
               
               }
                       );
           }
             table1.setModel(tab);
             
        } 
            catch (ClassNotFoundException ex) {
            Logger.getLogger(UserAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }
            public void Combo() 
            {
        try {
            Class.forName("java.sql.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root","");
                java.sql.Statement st=con.createStatement();
                String q="SELECT * FROM inventoryu";
                ResultSet r=st.executeQuery(q);
                while(r.next())
                {
                    String name=r.getString("Diamond ID");
                    btncombo2.addItem(name);
                
                }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserAdmin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
               
                
                
            
            }
             public  void listed2()
    {
        DefaultTableModel table =new DefaultTableModel();
        table.addColumn("Diamond ID");
        table.addColumn("Length");
        table.addColumn("Breadth");
        table.addColumn("Height");
        table.addColumn("Carat");
        table.addColumn("Quantity");
        
       try{ 
               Class.forName("java.sql.Driver");
               Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
               java.sql.Statement st=con.createStatement();
               String query="SELECT * FROM inventory";
               ResultSet r=st.executeQuery(query);
               
               while(r.next())
               {
                   table.addRow(new Object[]{
                       r.getString(1),
                       r.getString(2),
                       r.getString(3),
                       r.getString(4),
                       r.getString(5),
                       r.getString(6),
                   });
                  
               }
             tablenew.setModel(table);  
             
          }
       catch(Exception e){
           
       }
    }
           
            public  void listed()
    {
        DefaultTableModel table =new DefaultTableModel();
        table.addColumn("Diamond ID");
        table.addColumn("Length");
        table.addColumn("Breadth");
        table.addColumn("Height");
        table.addColumn("Carat");
        table.addColumn("Quantity");
        
       try{ 
               Class.forName("java.sql.Driver");
               Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
               java.sql.Statement st=con.createStatement();
               String query="SELECT * FROM inventory";
               ResultSet r=st.executeQuery(query);
               
               while(r.next())
               {
                   table.addRow(new Object[]{
                       r.getString(1),
                       r.getString(2),
                       r.getString(3),
                       r.getString(4),
                       r.getString(5),
                  
                       r.getString(6),
                   });
               }
             list.setModel(table);  
             
          }
       catch(Exception e){
           
       }
    }
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> btncombo2;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JButton btnreset1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTable list;
    private javax.swing.JTable table1;
    private javax.swing.JTable table3;
    private javax.swing.JTable tablenew;
    // End of variables declaration//GEN-END:variables
}
