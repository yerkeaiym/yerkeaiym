/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.management.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Home extends javax.swing.JFrame {
    Connection conn = null;
    ResultSet rs = null;
    PreparedStatement pst = null;

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        conn = DB.java_db();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txt_firstname = new javax.swing.JTextField();
        txt_surname = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_identity = new javax.swing.JTextField();
        txt_idno = new javax.swing.JTextField();
        txt_mobileno = new javax.swing.JTextField();
        txt_roomno = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_tariffperday = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_noofdays = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txt_tax = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_totaltariff = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        Totalbtn = new javax.swing.JButton();
        RegisterBtn = new javax.swing.JButton();
        ShowBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        UpdateBtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        txt_nationality = new com.toedter.components.JLocaleChooser();
        txt_gender = new javax.swing.JComboBox<>();
        txt_roomtype = new javax.swing.JComboBox<>();
        txt_bedtype = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        FoodBtn = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 255));
        jMenuBar1.setFont(new java.awt.Font("Goudy Stout", 3, 12)); // NOI18N

        jMenu1.setText("Home");
        jMenu1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenuBar1.add(jMenu1);

        jMenu3.setText("Room");
        jMenu3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Room Details");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Food");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem2.setText("Food");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("Employee");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem3.setText("ADD Employee");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem3);

        jMenuItem4.setText("Employee Details");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem4);

        jMenuItem5.setText("Delete Employee");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem5);

        jMenuBar1.add(jMenu6);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Hotel Management System");

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("Name");

        jLabel2.setText("Surname");

        jLabel3.setText("Address");

        jLabel4.setText("Nationality");

        jLabel5.setText("Identity");

        jLabel6.setText("ID NO");

        jLabel7.setText("Mobile No");

        jLabel8.setText("Gender");

        jLabel9.setText("Check in Date");

        jLabel10.setText("Date of Out");

        jLabel11.setText("Room No");

        jLabel12.setText("Room Type");

        jLabel13.setText("Bed Type");

        txt_firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_firstnameActionPerformed(evt);
            }
        });

        jLabel14.setText("Tariffe per Day");

        jLabel15.setText("No of Days");

        jLabel16.setText("Tax");

        jLabel17.setText("Total Tariff");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{

                }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel18.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel18.setText("Guest Details");

        Totalbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Totalbtn.setText("Total");
        Totalbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalbtnActionPerformed(evt);
            }
        });

        RegisterBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        RegisterBtn.setText("Register");
        RegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterBtnActionPerformed(evt);
            }
        });

        ShowBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ShowBtn.setText("Show");
        ShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        UpdateBtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        UpdateBtn.setText("Update");
        UpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateBtnActionPerformed(evt);
            }
        });

        Clearbtn.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        Clearbtn.setText("Reset");
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });

        txt_nationality.setModel(new javax.swing.DefaultComboBoxModel(new String[]{"Russian (Russia)", "Kazakh(Kazakhstan)"}));

        txt_gender.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txt_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Male", "Female", " "}));

        txt_roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"AC", "Non AC", " "}));

        txt_bedtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Single Bed", "Double Bed", "Family Room"}));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(141, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addComponent(Clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(66, 66, 66)
                                                .addComponent(UpdateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(56, 56, 56)
                                                .addComponent(DeleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(68, 68, 68)
                                                .addComponent(ShowBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(65, 65, 65)
                                                .addComponent(RegisterBtn)
                                                .addGap(69, 69, 69)
                                                .addComponent(Totalbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(447, 447, 447))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel11)
                                                                        .addComponent(jLabel12))
                                                                .addGap(67, 67, 67)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txt_roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt_roomno, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel14)
                                                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(47, 47, 47)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txt_bedtype, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(txt_tariffperday, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(486, 486, 486))))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel4))
                                                                .addGap(31, 31, 31)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txt_firstname)
                                                                        .addComponent(txt_surname)
                                                                        .addComponent(txt_address)
                                                                        .addComponent(txt_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, 161, Short.MAX_VALUE))))
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel8))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txt_mobileno)
                                                        .addComponent(txt_identity)
                                                        .addComponent(txt_idno)
                                                        .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(406, 406, 406)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9)
                                                        .addComponent(jLabel17)
                                                        .addComponent(jLabel10)
                                                        .addComponent(jLabel16)
                                                        .addComponent(jLabel15))
                                                .addGap(53, 53, 53)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jDateChooser2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                                                .addComponent(txt_totaltariff, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txt_tax, javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(txt_noofdays, javax.swing.GroupLayout.Alignment.LEADING)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1))
                                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(41, 41, 41)
                                                .addComponent(jLabel18)
                                                .addGap(40, 40, 40)
                                                .addComponent(txt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addGap(106, 106, 106)
                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel9)
                                                                        .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel10)
                                                                        .addComponent(jDateChooser2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(txt_tax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel16))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(txt_noofdays, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(txt_totaltariff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel17)))
                                                                        .addComponent(jLabel15)))
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGap(6, 6, 6)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(txt_roomno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel11))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel12)
                                                                                        .addComponent(txt_roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(txt_mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addComponent(jLabel8)
                                                                                .addGap(27, 27, 27)
                                                                                .addComponent(jLabel7)))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(txt_identity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel5))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(txt_idno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(jLabel6)))
                                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel13)
                                                                                        .addComponent(txt_bedtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                        .addComponent(jLabel14)
                                                                                        .addComponent(txt_tariffperday, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                        .addComponent(jLabel1)
                                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(txt_firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(txt_surname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel2))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(txt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel3))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(txt_nationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Totalbtn)
                                        .addComponent(RegisterBtn)
                                        .addComponent(ShowBtn)
                                        .addComponent(DeleteBtn)
                                        .addComponent(UpdateBtn)
                                        .addComponent(Clearbtn))
                                .addGap(30, 30, 30)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48))
        );

        jMenuBar2.setBackground(new java.awt.Color(153, 255, 51));
        jMenuBar2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar2.setForeground(new java.awt.Color(0, 0, 255));
        jMenuBar2.setFont(new java.awt.Font("Goudy Stout", 3, 12)); // NOI18N

        jMenu2.setText("Home");
        jMenu2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem7.setText("Logout");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuBar2.add(jMenu2);

        jMenu5.setText("Room");
        jMenu5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jMenu5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu5ActionPerformed(evt);
            }
        });

        jMenuItem6.setText("Room Details");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuBar2.add(jMenu5);

        jMenu7.setText("Food");
        jMenu7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        FoodBtn.setText("Food");
        FoodBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FoodBtnActionPerformed(evt);
            }
        });
        jMenu7.add(FoodBtn);

        jMenuBar2.add(jMenu7);

        jMenu8.setText("Employee");
        jMenu8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        jMenuItem8.setText("ADD Employee");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem8);

        jMenuItem9.setText("User");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem9);

        jMenuBar2.add(jMenu8);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_firstnameActionPerformed

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        jTable1.setModel(new DefaultTableModel());
        model.setRowCount(0);
        txt_address.setText("");
        txt_bedtype.setSelectedIndex(0);
        txt_firstname.setText("");
        txt_gender.setSelectedIndex(0);
        txt_identity.setText("");
        txt_idno.setText("");
        txt_mobileno.setText("");
        txt_nationality.setSelectedIndex(0);
        txt_noofdays.setText("");
        txt_roomno.setText("");
        txt_roomtype.setSelectedIndex(0);
        txt_surname.setText("");
        txt_tariffperday.setText("");
        txt_tax.setText("");
        txt_totaltariff.setText("");
        jDateChooser1.setDate(null);
        jDateChooser2.setDate(null);
        // End of variables declaration
    }//GEN-LAST:event_ClearbtnActionPerformed

    private void TotalbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalbtnActionPerformed

        SimpleDateFormat format = new SimpleDateFormat("yyy-mm-dd");
        {
            Date Check_In_Date = null;
            Date Check_Out_Date = null;
            try {
                Check_In_Date = format.parse(format.format(jDateChooser1.getDate()));
                Check_Out_Date = format.parse(format.format(jDateChooser2.getDate()));

            } catch (Exception e) {
                e.printStackTrace();
            }
            long checkdiff = Check_Out_Date.getTime() - Check_In_Date.getTime();
            int Daydiff = (int) (checkdiff / 1000 / 60 / 60 / 24);
            txt_noofdays.setText(Integer.toString(Daydiff));
            String rate1 = txt_tariffperday.getText();
            int ratep = Integer.parseInt(rate1);
            txt_totaltariff.setText(Integer.toString(Daydiff * ratep));

            txt_tax.setText(Integer.toString(Daydiff * ratep));
            double q = Double.parseDouble(txt_tax.getText());
            q = (q) * 12 / 100;
            String tax = String.format("RS %.2f", q);
            txt_tax.setText(tax);

            double tt = Double.parseDouble(txt_totaltariff.getText());
            tt = (tt);
            String total = String.format("RS %.3f", tt + q);
            txt_totaltariff.setText(total);


        }
    }//GEN-LAST:event_TotalbtnActionPerformed

    private void RegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterBtnActionPerformed
        // TODO add your handling code here:
        if (txt_firstname.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "firstname Field is empty");
        } else if (txt_surname.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "surname Field is empty");
        } else {
            int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to add record?", "Add Record", JOptionPane.YES_NO_OPTION);
            if (p == 0) {
                try {
                    String sql = "insert into guest_details"
                            + "(firstname,surname,address,nationality,gender,mobile_no,identity,id_no,room_no,room_type,bed_type,"
                            + "tariff_per_day,check_in_date,date_of_out,"
                            + "tax,no_of_days,total_tariff) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
                    pst = conn.prepareStatement(sql);
                    pst.setString(1, txt_firstname.getText());
                    pst.setString(2, txt_surname.getText());
                    pst.setString(3, txt_address.getText());
                    pst.setString(4, (String) txt_nationality.getSelectedItem());
                    pst.setString(5, (String) txt_gender.getSelectedItem());
                    pst.setString(6, txt_mobileno.getText());
                    pst.setString(7, txt_identity.getText());
                    pst.setString(8, txt_idno.getText());
                    pst.setString(9, txt_roomno.getText());
                    pst.setString(10, (String) txt_roomtype.getSelectedItem());
                    pst.setString(11, (String) txt_bedtype.getSelectedItem());
                    pst.setString(12, txt_tariffperday.getText());
                    java.util.Date date1 = jDateChooser1.getDate();
                    Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String s = formatter.format(date1);
                    pst.setString(13, s);
                    java.util.Date date2 = jDateChooser2.getDate();
                    Format formatter1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                    String s1 = formatter1.format(date2);
                    pst.setString(14, s1);
                    pst.setString(15, txt_tax.getText());
                    pst.setString(16, txt_noofdays.getText());
                    pst.setString(17, txt_totaltariff.getText());
                    pst.execute();
                    JOptionPane.showMessageDialog(null, "Data is saved successfully");
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);
                } finally {
                    try {
                        rs.close();
                        pst.close();
                    } catch (Exception e) {

                    }
                }
            }
        }

    }//GEN-LAST:event_RegisterBtnActionPerformed

    private void ShowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addColumn("ID");
        model.addColumn("Firstame");
        model.addColumn("Surname");
        model.addColumn("Address");
        model.addColumn("Nationality");
        model.addColumn("Gender");
        model.addColumn("Mobile");
        model.addColumn("Identity");
        model.addColumn("IDNo");
        model.addColumn("Room no");
        model.addColumn("Room type");
        model.addColumn("bed type");
        model.addColumn("room rent");
        model.addColumn("Check In");
        model.addColumn("Date of out");
        model.addColumn("TAX");
        model.addColumn("No of days");
        model.addColumn("total");


        try {
            Class.forName("org.sqlite.JDBC");
            String databaseURL = "jdbc:sqlite:C:\\Users\\LENOVO\\Desktop\\hotel\\mydb.sqlite";
            Connection con = DriverManager.getConnection(databaseURL);
            Statement stat = con.createStatement();
            String sql = "select * from guest_details";
            System.out.println("connection passed");

            ResultSet rs = stat.executeQuery(sql);


            while (rs.next()) {

                String id = rs.getString(1);
                String firstname = rs.getString(2);
                String surname = rs.getString(3);
                String address = rs.getString(4);
                String nationality = rs.getString(5);
                String gender = rs.getString(6);
                String mobile_no = rs.getString(7);

                String identity = rs.getString(8);
                String id_no = rs.getString(9);
                String room_no = rs.getString(10);
                String room_type = rs.getString(11);
                String bed_type = rs.getString(12);
                String tariff_per_day = rs.getString(13);

                String check_in_date = rs.getString(14);
                String date_of_out = rs.getString(15);
                String tax = rs.getString(16);
                String no_of_days = rs.getString(17);
                String total_tariff = rs.getString(18);
                model.addRow(new String[]{id, firstname, surname, address, nationality, gender, mobile_no,
                        identity, id_no, room_no, room_type, bed_type, tariff_per_day, check_in_date, date_of_out, tax, no_of_days, total_tariff});

                //  Object[] rowData={id,firstname,surname,address,nationality,gender,mobile_no,identity,id_no,room_no,room_type,bed_type
                //  ,tariff_per_day,check_in_date,date_of_out,tax,no_of_days,total_tariff};
                //  model.addRow(rowData);

            }
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }//GEN-LAST:event_ShowBtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed

    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Home gd = new Home();
        gd.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Room ro = new Room();
        ro.setVisible(true);

    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenu5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu5ActionPerformed

    }//GEN-LAST:event_jMenu5ActionPerformed

    private void FoodBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FoodBtnActionPerformed
        Food gd = new Food();
        gd.setVisible(true);
    }//GEN-LAST:event_FoodBtnActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        AddEmployee ed = new AddEmployee();
        ed.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBtnActionPerformed
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Sure to Delete", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (answ == 0) {
            int id = jTable1.getSelectedRow();
            String Firstname = jTable1.getValueAt(id, 0).toString();
            if (new DBGuest().Delete(Firstname)) {
                JOptionPane.showMessageDialog(null, "Successfully Deleted");


            } else {
                JOptionPane.showMessageDialog(null, "not selected");
            }
        }
    }//GEN-LAST:event_DeleteBtnActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Login lo = new Login();
        lo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String firstname = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String surname = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String address = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String nationality = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        txt_firstname.setText(firstname);
        txt_surname.setText(surname);
        txt_address.setText(address);
        txt_nationality.setSelectedItem(nationality);
        String gender = jTable1.getValueAt(jTable1.getSelectedRow(), 5).toString();
        String mobileno = jTable1.getValueAt(jTable1.getSelectedRow(), 6).toString();
        String identity = jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString();
        String idno = jTable1.getValueAt(jTable1.getSelectedRow(), 8).toString();
        txt_gender.setSelectedItem(gender);
        txt_mobileno.setText(mobileno);
        txt_identity.setText(identity);
        txt_idno.setText(idno);
        String roomno = jTable1.getValueAt(jTable1.getSelectedRow(), 9).toString();
        String roomtype = jTable1.getValueAt(jTable1.getSelectedRow(), 10).toString();
        String bedtype = jTable1.getValueAt(jTable1.getSelectedRow(), 11).toString();
        String tariffperday = jTable1.getValueAt(jTable1.getSelectedRow(), 12).toString();
        txt_roomno.setText(roomno);
        txt_roomtype.setSelectedItem(roomtype);
        txt_bedtype.setSelectedItem(bedtype);
        txt_tariffperday.setText(tariffperday);


        String tax = jTable1.getValueAt(jTable1.getSelectedRow(), 15).toString();
        String noofdays = jTable1.getValueAt(jTable1.getSelectedRow(), 16).toString();
        String totoltariff = jTable1.getValueAt(jTable1.getSelectedRow(), 17).toString();
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int index = jTable1.getSelectedRow();
            Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) model.getValueAt(index, 13));
            jDateChooser1.setDate(date);
            Date date1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse((String) model.getValueAt(index, 14));
            jDateChooser2.setDate(date1);
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        txt_tax.setText(tax);
        txt_noofdays.setText(noofdays);
        txt_totaltariff.setText(totoltariff);
    }//GEN-LAST:event_jTable1MouseClicked

    private void UpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateBtnActionPerformed
        int index = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(index, 0).toString();
        if (new DBGuest().update(id, txt_firstname.getText(), txt_surname.getText(), txt_address.getText(), (String) txt_nationality.getSelectedItem(), (String) txt_gender.getSelectedItem(), txt_mobileno.getText(),
                txt_identity.getText(), txt_idno.getText(), txt_roomno.getText(), (String) txt_roomtype.getSelectedItem(), (String) txt_bedtype.getSelectedItem(), txt_tariffperday.getText(),
                jDateChooser1.getDate(), jDateChooser2.getDate(), txt_tax.getText(), txt_noofdays.getText(), txt_totaltariff.getText())) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            txt_roomno.setText("");
            txt_roomtype.getSelectedItem();
            txt_bedtype.getSelectedItem();
            txt_tariffperday.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "not Updated");
        }                // TODO add your handling code here:
    }//GEN-LAST:event_UpdateBtnActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:

        UserLogin us = new UserLogin();
        us.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    /**
     * @param args the commansd line arguments
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clearbtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JMenuItem FoodBtn;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JButton ShowBtn;
    private javax.swing.JButton Totalbtn;
    private javax.swing.JButton UpdateBtn;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_address;
    private javax.swing.JComboBox<String> txt_bedtype;
    private javax.swing.JTextField txt_firstname;
    private javax.swing.JComboBox<String> txt_gender;
    private javax.swing.JTextField txt_identity;
    private javax.swing.JTextField txt_idno;
    private javax.swing.JTextField txt_mobileno;
    private com.toedter.components.JLocaleChooser txt_nationality;
    private javax.swing.JTextField txt_noofdays;
    private javax.swing.JTextField txt_roomno;
    private javax.swing.JComboBox<String> txt_roomtype;
    private javax.swing.JTextField txt_surname;
    private javax.swing.JTextField txt_tariffperday;
    private javax.swing.JTextField txt_tax;
    private javax.swing.JTextField txt_totaltariff;
    // End of variables declaration//GEN-END:variables
}
