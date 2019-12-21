 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.awt.print.*;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




public class UserInventory extends javax.swing.JFrame {

    
    public UserInventory() {
        initComponents();
        listed();
        combofill();
        combo1();
       
       
       
        
        
        
    }
    
      public String cont;
      String filename;
      int s=0;
      byte[] person_image=null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        tabIndividualStock = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list = new javax.swing.JTable();
        btnprint = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        list1 = new javax.swing.JTable();
        txtstock1 = new javax.swing.JTextField();
        btncombo1 = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table2 = new javax.swing.JTable();
        btncombo3 = new javax.swing.JComboBox<>();
        jTextField4 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        txtidnew = new javax.swing.JTextField();
        txtlennew = new javax.swing.JTextField();
        txtbrednew = new javax.swing.JTextField();
        txtheightnew = new javax.swing.JTextField();
        txtcarnew = new javax.swing.JTextField();
        txtquannew = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jTextField11 = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        btnlogout = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(1, 31, 75));

        tabIndividualStock.setBackground(new java.awt.Color(100, 151, 177));
        tabIndividualStock.setForeground(new java.awt.Color(0, 0, 0));
        tabIndividualStock.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N

        jPanel10.setBackground(new java.awt.Color(125, 172, 214));

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
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        list.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(list);

        btnprint.setBackground(new java.awt.Color(255, 102, 102));
        btnprint.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        btnprint.setText("PRINT REPORT");
        btnprint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btnprint)
                .addGap(74, 74, 74))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 515, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addComponent(btnprint)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabIndividualStock.addTab("Total Stock", jPanel2);

        jPanel11.setBackground(new java.awt.Color(249, 215, 213));

        list1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Diamond ID", "Length", "Breadth", "Height", "Carat", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        list1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                list1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(list1);

        txtstock1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtstock1.setBorder(null);

        btncombo1.setBackground(new java.awt.Color(255, 255, 255));
        btncombo1.setFont(new java.awt.Font("DialogInput", 0, 14)); // NOI18N
        btncombo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncombo1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btncombo1MousePressed(evt);
            }
        });
        btncombo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncombo1ActionPerformed(evt);
            }
        });

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(255, 255, 255));
        jTextField3.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Diamond ID");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btncombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtstock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 385, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(160, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btncombo1)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtstock1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(130, 130, 130)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabIndividualStock.addTab("Individual Stock", jPanel3);

        jPanel13.setBackground(new java.awt.Color(102, 255, 255));

        table2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "Diamond ID", "Length", "Breadth", "Heigth", "Carat", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                table2MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(table2);

        btncombo3.setBackground(new java.awt.Color(255, 255, 255));
        btncombo3.setFont(new java.awt.Font("DialogInput", 0, 18)); // NOI18N
        btncombo3.setForeground(new java.awt.Color(0, 0, 0));
        btncombo3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncombo3MouseClicked(evt);
            }
        });

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(102, 255, 255));
        jTextField4.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("Diamond ID");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(227, 227, 227)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btncombo3, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(357, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(122, 122, 122)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField4)
                    .addComponent(btncombo3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(191, 191, 191))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabIndividualStock.addTab("Update Stock", jPanel4);

        jPanel12.setBackground(new java.awt.Color(255, 255, 51));

        jTextField5.setEditable(false);
        jTextField5.setBackground(new java.awt.Color(255, 255, 51));
        jTextField5.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("Diamond ID");
        jTextField5.setBorder(null);
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jTextField6.setEditable(false);
        jTextField6.setBackground(new java.awt.Color(255, 255, 51));
        jTextField6.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField6.setForeground(new java.awt.Color(0, 0, 0));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("LENGTH");
        jTextField6.setBorder(null);

        jTextField7.setEditable(false);
        jTextField7.setBackground(new java.awt.Color(255, 255, 51));
        jTextField7.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField7.setForeground(new java.awt.Color(0, 0, 0));
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("BREADTH");
        jTextField7.setBorder(null);

        jTextField8.setEditable(false);
        jTextField8.setBackground(new java.awt.Color(255, 255, 51));
        jTextField8.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField8.setForeground(new java.awt.Color(0, 0, 0));
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("HEIGHT");
        jTextField8.setBorder(null);
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jTextField9.setEditable(false);
        jTextField9.setBackground(new java.awt.Color(255, 255, 51));
        jTextField9.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField9.setForeground(new java.awt.Color(0, 0, 0));
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("CARAT");
        jTextField9.setBorder(null);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jTextField10.setEditable(false);
        jTextField10.setBackground(new java.awt.Color(255, 255, 51));
        jTextField10.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField10.setForeground(new java.awt.Color(0, 0, 0));
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10.setText("QUANTITY");
        jTextField10.setBorder(null);
        jTextField10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField10ActionPerformed(evt);
            }
        });

        txtidnew.setBackground(new java.awt.Color(255, 255, 255));
        txtidnew.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        txtidnew.setForeground(new java.awt.Color(0, 0, 0));
        txtidnew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtlennew.setBackground(new java.awt.Color(255, 255, 255));
        txtlennew.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        txtlennew.setForeground(new java.awt.Color(0, 0, 0));
        txtlennew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtbrednew.setBackground(new java.awt.Color(255, 255, 255));
        txtbrednew.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        txtbrednew.setForeground(new java.awt.Color(0, 0, 0));
        txtbrednew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtbrednew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbrednewActionPerformed(evt);
            }
        });

        txtheightnew.setBackground(new java.awt.Color(255, 255, 255));
        txtheightnew.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        txtheightnew.setForeground(new java.awt.Color(0, 0, 0));
        txtheightnew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtcarnew.setBackground(new java.awt.Color(255, 255, 255));
        txtcarnew.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        txtcarnew.setForeground(new java.awt.Color(0, 0, 0));
        txtcarnew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtcarnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcarnewActionPerformed(evt);
            }
        });

        txtquannew.setBackground(new java.awt.Color(255, 255, 255));
        txtquannew.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        txtquannew.setForeground(new java.awt.Color(0, 0, 0));
        txtquannew.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtquannew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquannewActionPerformed(evt);
            }
        });

        jToggleButton1.setBackground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jToggleButton1.setForeground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setText("INSERT");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jTextField11.setEditable(false);
        jTextField11.setBackground(new java.awt.Color(255, 255, 51));
        jTextField11.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField11.setForeground(new java.awt.Color(0, 0, 0));
        jTextField11.setText("  ARE YOU SURE YOU WANNA STOCK UP? ?");
        jTextField11.setBorder(null);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17))
                            .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcarnew, javax.swing.GroupLayout.DEFAULT_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(txtquannew)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextField8)
                            .addComponent(jTextField7)
                            .addComponent(jTextField6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtidnew)
                            .addComponent(txtbrednew)
                            .addComponent(txtheightnew)
                            .addComponent(txtlennew))))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(199, 199, 199))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtidnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlennew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtbrednew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtheightnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcarnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtquannew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(63, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jToggleButton1)
                        .addGap(75, 75, 75))))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabIndividualStock.addTab("New Stock ", jPanel5);

        jPanel9.setBackground(new java.awt.Color(125, 172, 214));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 944, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabIndividualStock.addTab("Reguest Stock", jPanel6);

        jPanel8.setBackground(new java.awt.Color(20, 22, 96));

        btnlogout.setBackground(new java.awt.Color(255, 255, 255));
        btnlogout.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        btnlogout.setForeground(new java.awt.Color(0, 0, 0));
        btnlogout.setText("LOG OUT");
        btnlogout.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setBackground(new java.awt.Color(20, 22, 96));
        jTextField1.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Have you checked all the requirement data?");
        jTextField1.setBorder(null);

        jTextField2.setBackground(new java.awt.Color(20, 22, 96));
        jTextField2.setFont(new java.awt.Font("DialogInput", 1, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(255, 255, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Are you sure you Want to Log Out??");
        jTextField2.setBorder(null);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(233, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)))
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(btnlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(393, 393, 393))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnlogout)
                .addContainerGap(224, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabIndividualStock.addTab("Log out", jPanel7);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabIndividualStock)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabIndividualStock)
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

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void btncombo1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncombo1MousePressed

        cc=btncombo1.getSelectedItem().toString();
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
            list1.setModel(table1);
            
            
            
           }
        catch(Exception ex)
        {
        }
        
    }//GEN-LAST:event_btncombo1MousePressed

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        MessageFormat header=new MessageFormat("Total Report");
        MessageFormat footer=new MessageFormat("Page{0,number,integer}");
        try{
            list.print(JTable.PrintMode.NORMAL,header,footer);

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null,"Cannot print! !");

        }
    }//GEN-LAST:event_btnprintActionPerformed
              popupinfo rowdata=new popupinfo();
    private void listMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listMouseClicked

        int index=list.getSelectedRow();
        TableModel model=list.getModel();

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
    }//GEN-LAST:event_listMouseClicked
                
                
    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void list1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_list1MouseClicked
         int index=list1.getSelectedRow();
        TableModel model=list1.getModel();

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
    }//GEN-LAST:event_list1MouseClicked
          public String cc;  
    private void btncombo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncombo1MouseClicked
        cc=btncombo1.getSelectedItem().toString();
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
            list1.setModel(table1);
            
            
            
           }
        catch(Exception ex)
        {
            
        }
    }//GEN-LAST:event_btncombo1MouseClicked
            
    public void combo1()
    {
           try
           {
               Class.forName("java.sql.Driver");
               Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
               java.sql.Statement st=con.createStatement();
               String q="SELECT * FROM inventory";
               ResultSet r=st.executeQuery(q);
               while(r.next())
               {
                    String name=r.getString("Diamond ID");
                    btncombo3.addItem(name);
               }
           }
           catch(Exception ex)
           {
           } 
    }
    private void btncombo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncombo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncombo1ActionPerformed

    private void btncombo3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncombo3MouseClicked
         cc=btncombo3.getSelectedItem().toString();
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
            table2.setModel(table1);
            
            
            
           }
        catch(Exception ex)
        {
        }
        
    }//GEN-LAST:event_btncombo3MouseClicked
                updater up=new updater();
    private void table2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_table2MouseClicked
         int index=table2.getSelectedRow();
        TableModel model=table2.getModel();

        String Id       =model.getValueAt(index,0).toString();
        String Length   =model.getValueAt(index,1).toString();
        String Breadth  =model.getValueAt(index,2).toString();
        String Height   =model.getValueAt(index,2).toString();
        String Carat    =model.getValueAt(index,4).toString();
        String Quantity =model.getValueAt(index,5).toString();

        up.setVisible(true);
        up.pack();
        up.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        up.txtid1.setText(Id);
        up.txtlen1.setText(Length);
        //rowdata.txtquan.setText(Quantity);
        up.txtbred1.setText(Breadth);
        up.txtheight1.setText(Height);
        up.txtcar1.setText(Carat);
        
    }//GEN-LAST:event_table2MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField10ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void txtcarnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcarnewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcarnewActionPerformed

    private void txtquannewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquannewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquannewActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        try {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            java.sql.Statement st=con.createStatement();
            String q="INSERT INTO `inventory`(`Diamond ID`, `Length`, `Breadth`, `Height`, `Carat`, `Quantity`) VALUES ('"+txtidnew.getText()+"','"+txtlennew.getText()+"','"+txtbrednew.getText()+"','"+txtheightnew.getText()+"','"+txtcarnew.getText()+"','"+txtquannew.getText()+"')";
            st.executeUpdate(q);
            this.setVisible(false);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserInventory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserInventory.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtbrednewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbrednewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbrednewActionPerformed
     
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
    public final void combofill()
    {
        try
        {
            Class.forName("java.sql.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","");
            java.sql.Statement st=con.createStatement();
            String query="Select * from inventory";
            ResultSet rs=st.executeQuery(query);
            while(rs.next())
            {
               String name=rs.getString("Diamond ID");
               btncombo1.addItem(name);
            }
        
        }
        catch(Exception ex)
        {
            System.out.print(ex);
        }
    }
       
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserInventory().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> btncombo1;
    private javax.swing.JComboBox<String> btncombo3;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton btnprint;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
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
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable list;
    public javax.swing.JTable list1;
    private javax.swing.JTabbedPane tabIndividualStock;
    private javax.swing.JTable table2;
    private javax.swing.JTextField txtbrednew;
    private javax.swing.JTextField txtcarnew;
    private javax.swing.JTextField txtheightnew;
    private javax.swing.JTextField txtidnew;
    private javax.swing.JTextField txtlennew;
    private javax.swing.JTextField txtquannew;
    private javax.swing.JTextField txtstock1;
    // End of variables declaration//GEN-END:variables

    private void btnprintActionPerformed() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
