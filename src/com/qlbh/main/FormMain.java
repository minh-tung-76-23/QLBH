/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlbh.main;

import com.qlbh.app.FormDangNhap;
import com.qlbh.ql.FormHangHoa;
import com.qlbh.ql.FormHoaDon;
import com.qlbh.ql.FormKhachHang;
import com.qlbh.ql.FormNhanVien;
import javax.swing.JOptionPane;

/**
 *
 * @author MINH TUNG
 */
public class FormMain extends javax.swing.JFrame {

    /**
     * Creates new form FormMain
     */
    public FormMain() {
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

        jButton9 = new javax.swing.JButton();
        btnQLKH = new javax.swing.JButton();
        btnQLHD = new javax.swing.JButton();
        btnQLNV = new javax.swing.JButton();
        btnHangHoa = new javax.swing.JButton();
        btnDangXuat = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lbNameUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jButton9.setBackground(new java.awt.Color(204, 255, 204));
        jButton9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(0, 0, 255));
        jButton9.setText("Quản Lý Nhân Viên");
        jButton9.setBorder(null);
        jButton9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton9.setName("btnQLNhanVien"); // NOI18N
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WinMart - Trang Chủ");
        setBackground(new java.awt.Color(0, 204, 204));

        btnQLKH.setBackground(new java.awt.Color(204, 204, 204));
        btnQLKH.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLKH.setText("Quản Lý Khách Hàng");
        btnQLKH.setActionCommand("Quản Lý  Khách Hàng");
        btnQLKH.setBorder(null);
        btnQLKH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLKH.setName("btnQLNhanVien"); // NOI18N
        btnQLKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKHActionPerformed(evt);
            }
        });

        btnQLHD.setBackground(new java.awt.Color(204, 204, 204));
        btnQLHD.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLHD.setText("Quản Lý Hóa Đơn");
        btnQLHD.setBorder(null);
        btnQLHD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLHD.setName("btnQLNhanVien"); // NOI18N
        btnQLHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLHDActionPerformed(evt);
            }
        });

        btnQLNV.setBackground(new java.awt.Color(204, 204, 204));
        btnQLNV.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnQLNV.setText("Quản Lý Nhân Viên");
        btnQLNV.setBorder(null);
        btnQLNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLNV.setName("btnQLNhanVien"); // NOI18N
        btnQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNVActionPerformed(evt);
            }
        });

        btnHangHoa.setBackground(new java.awt.Color(204, 204, 204));
        btnHangHoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHangHoa.setText("Quản Lý Hàng Hóa");
        btnHangHoa.setBorder(null);
        btnHangHoa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnHangHoa.setName("btnQLNhanVien"); // NOI18N
        btnHangHoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHangHoaActionPerformed(evt);
            }
        });

        btnDangXuat.setText("Đăng xuất");
        btnDangXuat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangXuat.setName("jBtnDangXuat"); // NOI18N
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Mời lựa chọn");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Xin Chào,");

        lbNameUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbNameUser.setName("lBTenDangNhap"); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(169, 169, 169)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addComponent(jLabel2)))
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnDangXuat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(btnQLKH, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnQLHD, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnHangHoa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnQLNV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(17, 17, 17))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbNameUser, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbNameUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQLKH, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQLHD, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHangHoa, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(btnDangXuat)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setUserName(String userName) {
        lbNameUser.setText(userName);
    }

    private void btnQLKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKHActionPerformed
        // Tạo form 
        FormKhachHang formKhachHang = new FormKhachHang(); // Truyền tham số là form kh

        // Ẩn form đăng nhập
        this.setVisible(false);

        // Hiển thị form 
        formKhachHang.setLocationRelativeTo(null);
        formKhachHang.setVisible(true);
    }//GEN-LAST:event_btnQLKHActionPerformed

    private void btnQLHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLHDActionPerformed
        // Tạo form 
        FormHoaDon formHoaDon = new FormHoaDon(); // Truyền tham số 

        // Ẩn form đăng nhập
        this.setVisible(false);

        // Hiển thị form
        formHoaDon.setLocationRelativeTo(null);
        formHoaDon.setVisible(true);
    }//GEN-LAST:event_btnQLHDActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void btnQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNVActionPerformed
        // Tạo form 
        FormNhanVien formNhanVien = new FormNhanVien(); // Truyền tham số 

        // Ẩn form đăng nhập
        this.setVisible(false);

        // Hiển thị form
        formNhanVien.setLocationRelativeTo(null);
        formNhanVien.setVisible(true);
    }//GEN-LAST:event_btnQLNVActionPerformed

    private void btnHangHoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHangHoaActionPerformed
        // Tạo form 
        FormHangHoa formHangHoa = new FormHangHoa(); // Truyền tham số 

        // Ẩn form đăng nhập
        this.setVisible(false);

        // Hiển thị form
        formHangHoa.setLocationRelativeTo(null);
        formHangHoa.setVisible(true);
    }//GEN-LAST:event_btnHangHoaActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn đăng xuất?", "Xác nhận đăng xuất", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Ẩn form Main
            this.setVisible(false);

            // Tạo và hiển thị form đăng nhập
            FormDangNhap formDangNhap = new FormDangNhap();
            formDangNhap.setVisible(true);
        }
    }//GEN-LAST:event_btnDangXuatActionPerformed

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
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnDangXuat;
    private javax.swing.JButton btnHangHoa;
    private javax.swing.JButton btnQLHD;
    private javax.swing.JButton btnQLKH;
    private javax.swing.JButton btnQLNV;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbNameUser;
    // End of variables declaration//GEN-END:variables
}
