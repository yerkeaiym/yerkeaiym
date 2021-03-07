package hotel.management.system;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Room extends javax.swing.JFrame {

    /**
     * Creates new form room
     */
    public Room() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_roomno = new javax.swing.JTextField();
        txt_tariff = new javax.swing.JTextField();
        txt_roomtype = new javax.swing.JComboBox<>();
        txt_bedtype = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AddBtn = new javax.swing.JButton();
        ShowBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        ClearBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Room Details");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel1.setText("Room No");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Room Type");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setText("Bed Type");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setText("Tarrif");

        txt_roomno.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txt_tariff.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        txt_roomtype.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_roomtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"AC", "Non AC"}));

        txt_bedtype.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        txt_bedtype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Single", "Double", "Family"}));

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

        AddBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        AddBtn.setText("ADD");
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });

        ShowBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ShowBtn.setText("Show");
        ShowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        updateBtn.setText("Update");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        DeleteBtn.setText("Delete");
        DeleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBtnActionPerformed(evt);
            }
        });

        ClearBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Room Details");

        jLabel6.setIcon(new javax.swing.ImageIcon("G:\\image\\images (1).jpg")); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon("G:\\image\\images (2).jpg")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel1)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel2))
                                                                .addGap(29, 29, 29)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(txt_tariff, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txt_roomno, javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txt_roomtype, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(txt_bedtype, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(AddBtn)
                                                                        .addComponent(updateBtn))
                                                                .addGap(53, 53, 53)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(DeleteBtn)
                                                                        .addComponent(ShowBtn))))
                                                .addGap(18, 18, 18)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(51, 51, 51)
                                                .addComponent(ClearBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel6)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(331, 331, 331)
                                .addComponent(jLabel5)
                                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel1)
                                                        .addComponent(txt_roomno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(29, 29, 29)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel2)
                                                        .addComponent(txt_roomtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel3)
                                                        .addComponent(txt_bedtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(33, 33, 33)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(txt_tariff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(35, 35, 35)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(AddBtn)
                                                        .addComponent(ShowBtn))
                                                .addGap(34, 34, 34)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(updateBtn)
                                                        .addComponent(DeleteBtn))
                                                .addGap(18, 18, 18)
                                                .addComponent(ClearBtn)))
                                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 16, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(905, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {
        jTable1.setModel(new DefaultTableModel());
        txt_roomno.setText("");
        txt_roomtype.setSelectedIndex(0);
        txt_bedtype.setSelectedIndex(0);
        txt_tariff.setText("");
    }

    public void infoMessage(String message, String title) {
        JOptionPane.showMessageDialog(null, message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String Room_no = txt_roomno.getText();

        String Roomtype = (String) txt_roomtype.getSelectedItem();
        String Bed_Type = (String) txt_bedtype.getSelectedItem();
        String Rate = txt_tariff.getText();


        try {
            Class.forName("org.sqlite.JDBC");
            String databaseURL = "jdbc:sqlite:C:\\Users\\LENOVO\\Desktop\\hotel\\mydb.sqlite";
            Connection con = DriverManager.getConnection(databaseURL);
            Statement stat = con.createStatement();
            String selectQuery = "select * from room_details where room_no='" + Room_no + "'";
            System.out.println("connection passed");
            ResultSet rs = stat.executeQuery(selectQuery);
            System.out.println(rs.next());
            if (rs.next() == true) {
                infoMessage("already Registered", "ok!!");
            } else {
                String insertQuery = "insert into room_details(room_no,room_type,bed_type,tariff)values('" + Room_no + "','" + Roomtype + "','" + Bed_Type + "','" + Rate + "')";

                stat.executeUpdate(insertQuery);

                infoMessage("Information Inserted", "Welcome!!");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void DeleteBtnActionPerformed(java.awt.event.ActionEvent evt) {
        String[] options = {"Yes", "No"};
        int answ = JOptionPane.showOptionDialog(null, "Sure to Delete", "Delete Confirm", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
        if (answ == 0) {
            int id = jTable1.getSelectedRow();
            String Firstname = jTable1.getValueAt(id, 0).toString();
            if (new DBRoom().Delete(Firstname)) {
                JOptionPane.showMessageDialog(null, "Successfully Deleted");


            } else {
                JOptionPane.showMessageDialog(null, "not selected");
            }
        }
    }

    private void ShowBtnActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultTableModel dm = new DBRoom().getData();
        jTable1.setModel(dm);
    }

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {
        int index = jTable1.getSelectedRow();
        String id = jTable1.getValueAt(index, 0).toString();
        if (new DBRoom().update(id, txt_roomno.getText(), (String) txt_roomtype.getSelectedItem(), (String) txt_bedtype.getSelectedItem(), txt_tariff.getText())) {
            JOptionPane.showMessageDialog(null, "Successfully Updated");
            txt_roomno.setText("");
            txt_roomtype.getSelectedItem();
            txt_bedtype.getSelectedItem();
            txt_tariff.setText("");

        } else {
            JOptionPane.showMessageDialog(null, "not Updated");
        }
    }

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        String Room_no = jTable1.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String Bed_type = jTable1.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String Room_Type = jTable1.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String Room_Rate = jTable1.getValueAt(jTable1.getSelectedRow(), 4).toString();
        txt_roomno.setText(Room_no);
        txt_roomtype.setSelectedItem(Room_Type);
        txt_bedtype.setSelectedItem(Bed_type);
        txt_tariff.setText(Room_Rate);
    }


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Room.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Room().setVisible(true);
            }
        });
    }


    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton ShowBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> txt_bedtype;
    private javax.swing.JTextField txt_roomno;
    private javax.swing.JComboBox<String> txt_roomtype;
    private javax.swing.JTextField txt_tariff;
    private javax.swing.JButton updateBtn;

}
