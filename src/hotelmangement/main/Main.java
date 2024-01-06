package hotelmangement.main;

import hotelmangement.MyConnection;
import hotelmangement.main.admin.AddDriver;
import hotelmangement.main.admin.AddEmployee;
import hotelmangement.main.admin.AddRoom;
import hotelmangement.main.reception.Reception;
import java.awt.Image;
import java.sql.*;
import javax.swing.ImageIcon;

public class Main extends javax.swing.JFrame {

    String uid, pwd;

    public Main(String uid, String pwd) {
        initComponents();
        this.uid = uid;
        this.pwd = pwd;
        setResizable(false);
        setLocationRelativeTo(null);
        setTitle("Hotel Management System ...");
        try {
            Connection con = MyConnection.connect();
            PreparedStatement ps = con.prepareStatement("select * from manager where uid=? and pwd=?");
            ps.setString(1, uid);
            ps.setString(2, pwd);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                name.setText(rs.getString(2));
                byte[] img = rs.getBytes(4);
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image imgIcon = im.getScaledInstance(myImage.getWidth(), myImage.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(imgIcon);
                myImage.setIcon(newImage);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private Main() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        myImage = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        myImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmangement/main/profile.jpeg"))); // NOI18N
        jPanel1.add(myImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, 230));

        name.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        name.setText("Sanyam Mittal");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 340, 60));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("HOTEL FOR CODERS :)");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 530, 100));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hope for your best experience ....");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 140, 370, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmangement/main/addDriver.jpg"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 370, 230, 220));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmangement/main/addRoom.jpg"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, 230, 220));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmangement/main/reception.jpg"))); // NOI18N
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 230, 220));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmangement/main/addEmployee.jpg"))); // NOI18N
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 230, 220));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Hotel Manager");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hotelmangement/main/main.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        new AddEmployee().setVisible(true);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        new AddRoom().setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        new AddDriver().setVisible(true);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        dispose();
        new Reception(uid, pwd).setVisible(true);
    }//GEN-LAST:event_jLabel11MouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel myImage;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
