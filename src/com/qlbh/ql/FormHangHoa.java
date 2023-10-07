/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.qlbh.ql;

import ConnectDtb.DatabaseConnection;
import com.qlbh.main.FormMain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINH TUNG
 */
public class FormHangHoa extends javax.swing.JFrame {

    /**
     * Creates new form FormHangHoa
     */
    public FormHangHoa() {
        initComponents();
        loadDataToTable();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jpSanPham = new javax.swing.JPanel();
        javax.swing.JLabel jLabel = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        tfGiaBan = new javax.swing.JTextField();
        txtMaSanPham = new javax.swing.JTextField();
        tfSoLuong = new javax.swing.JTextField();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableSanPham = new javax.swing.JTable();
        jbDanhSachSanPham = new javax.swing.JLabel();
        javax.swing.JButton btnXoaSP = new javax.swing.JButton();
        javax.swing.JButton btnThemSP = new javax.swing.JButton();
        javax.swing.JButton btnThoat = new javax.swing.JButton();
        javax.swing.JButton btnSuaSP = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WinMart - Hàng Hóa");

        jpSanPham.setBackground(new java.awt.Color(204, 255, 255));
        jpSanPham.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sản Phẩm", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N

        jLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel.setText("Mã Sản Phẩm");

        txtTenSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenSanPhamActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Số Lượng");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Tên SP");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Giá Bán");

        txtMaSanPham.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaSanPhamFocusLost(evt);
            }
        });
        txtMaSanPham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaSanPhamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpSanPhamLayout = new javax.swing.GroupLayout(jpSanPham);
        jpSanPham.setLayout(jpSanPhamLayout);
        jpSanPhamLayout.setHorizontalGroup(
            jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtTenSanPham, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                        .addComponent(txtMaSanPham, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(tfGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jpSanPhamLayout.setVerticalGroup(
            jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSanPhamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(tfGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpSanPhamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tfSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        tableSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Giá Bán", "Số Lượng"
            }
        ));
        jScrollPane1.setViewportView(tableSanPham);

        jbDanhSachSanPham.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbDanhSachSanPham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbDanhSachSanPham.setText("Danh Sách Sản Phẩm");
        jbDanhSachSanPham.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        btnXoaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoaSP.setText("Xóa");
        btnXoaSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnXoaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaSPActionPerformed(evt);
            }
        });

        btnThemSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemSP.setText("Thêm");
        btnThemSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThemSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemSPActionPerformed(evt);
            }
        });

        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnSuaSP.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaSP.setText("Sửa");
        btnSuaSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSuaSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaSPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jbDanhSachSanPham, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane1)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jpSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnSuaSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                .addComponent(btnThemSP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(31, 31, 31)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnXoaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbDanhSachSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThemSP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoaSP, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSuaSP, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                            .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loadDataToTable() {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM HANGHOA"; 

            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();

            DefaultTableModel model = (DefaultTableModel) tableSanPham.getModel();
            model.setRowCount(0); // Xóa tất cả dữ liệu cũ trong bảng

            while (resultSet.next()) {
                Vector row = new Vector();
                row.add(resultSet.getString("MaHang")); 
                row.add(resultSet.getString("TenHang")); 
                row.add(resultSet.getString("DonGia")); 
                row.add(resultSet.getString("SoLuongKho")); 

                model.addRow(row);
            }

    //        conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi khi đọc dữ liệu từ cơ sở dữ liệu: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void txtTenSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenSanPhamActionPerformed

    private void btnXoaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaSPActionPerformed
        int row = tableSanPham.getSelectedRow();

       if (row < 0) {
           JOptionPane.showMessageDialog(this,
               "Không có hàng nào được chọn! Vui lòng chọn một hàng",
               "Chọn hàng!",
               JOptionPane.ERROR_MESSAGE);
       } else {
           try {
               Connection conn = DatabaseConnection.getConnection();

               // Lấy mã từ hàng được chọn
               String maSanPham = tableSanPham.getValueAt(row, 0).toString();

               // Tạo truy vấn SQL để xóa nhân viên dựa trên mã nhân viên
               String sql = "DELETE FROM HANGHOA WHERE MaHang = ?";
               PreparedStatement preparedStatement = conn.prepareStatement(sql);
               preparedStatement.setString(1, maSanPham);

               // Thực hiện truy vấn
               int rowsAffected = preparedStatement.executeUpdate();

               if (rowsAffected > 0) {
                   JOptionPane.showMessageDialog(this, "Xóa Sản phẩm thành công!");
                   // Xóa hàng khỏi bảng
                   DefaultTableModel model = (DefaultTableModel) tableSanPham.getModel();
                   model.removeRow(row);
               } else {
                   JOptionPane.showMessageDialog(this, "Xóa Sản phẩm thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
               }

               // Đóng kết nối cơ sở dữ liệu
//               conn.close();
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, "Lỗi khi xóa SP: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
           }
       }
    }//GEN-LAST:event_btnXoaSPActionPerformed

    private void btnThemSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemSPActionPerformed
        // Lấy thông tin từ các trường nhập liệu
        String maSP = txtMaSanPham.getText();
        String tenSP = txtTenSanPham.getText();
        String donGia = tfGiaBan.getText();
        String soLuongKho = tfSoLuong.getText();

        // Kiểm tra xem các trường nhập liệu đã được điền đầy đủ chưa
        if (maSP.isEmpty() || tenSP.isEmpty() || donGia.isEmpty() || soLuongKho.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ thông tin!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Kết nối đến cơ sở dữ liệu
                Connection conn = DatabaseConnection.getConnection();

                // Tạo truy vấn SQL để thêm nhân viên mới
                String sql = "INSERT INTO HANGHOA (MaHang, TenHang, DonGia, SoLuongKho) VALUES (?, ?, ?, ?)";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, maSP);
                preparedStatement.setString(2, tenSP);
                preparedStatement.setString(3, donGia);
                preparedStatement.setString(4, soLuongKho);

                // Thực hiện truy vấn
                int rowsAffected = preparedStatement.executeUpdate();

                if (rowsAffected > 0) {
                    JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!");
                    loadDataToTable();
                    // Xóa dữ liệu từ các trường nhập liệu sau khi thêm thành công
                    txtMaSanPham.setText("");
                    txtTenSanPham.setText("");
                    tfGiaBan.setText("");
                    tfSoLuong.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Thêm nhân viên thất bại!", "Lỗi", JOptionPane.ERROR_MESSAGE);
                }

                // Đóng kết nối cơ sở dữ liệu
//                conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Lỗi khi thêm nhân viên: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnThemSPActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát?", "Xác nhận", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            // Ẩn form Main
            this.setVisible(false);

            // Tạo và hiển thị form đăng nhập
            FormMain formMain = new FormMain();
            formMain.setLocationRelativeTo(null);
            formMain.setVisible(true);
        }
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnSuaSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaSPActionPerformed
        // Lấy mã khách hàng từ trường nhập liệu
        String maSanPham = txtMaSanPham.getText();

        // Kiểm tra xem mã khách hàng đã tồn tại trong cơ sở dữ liệu chưa
        if (kiemTraTonTaiMaSP(maSanPham)) {
            // Mã khách hàng tồn tại, tiến hành cập nhật thông tin
            capNhatThongTinSP(maSanPham);
        } else {
            // Mã khách hàng không tồn tại, hiển thị thông báo lỗi
            JOptionPane.showMessageDialog(this, "Không tìm thấy Mã để sửa!", "Không tìm thấy", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSuaSPActionPerformed
    // Phương thức kiểm tra sự tồn tại của mã khách hàng trong cơ sở dữ liệu
    private boolean kiemTraTonTaiMaSP(String maSanPham) {
        boolean tonTai = false;
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM HANGHOA WHERE MaHang = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, maSanPham);
            ResultSet resultSet = preparedStatement.executeQuery();
            tonTai = resultSet.next();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi khi kiểm tra mã: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        return tonTai;
    } 

    // Phương thức cập nhật thông tin khách hàng trong cơ sở dữ liệu
    private void capNhatThongTinSP(String maSanPham) {
        // Lấy thông tin mới từ các trường nhập liệu
        String tenSP = txtTenSanPham.getText();
        String donGia = tfGiaBan.getText();
        String soLuongKho = tfSoLuong.getText();

        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "UPDATE HANGHOA SET TenHang = ?, DonGia = ?, SoLuongKho = ? WHERE MaHang = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, tenSP);
            preparedStatement.setString(2, donGia);
            preparedStatement.setString(3, soLuongKho);
            preparedStatement.setString(4, maSanPham);

            int rowsUpdated = preparedStatement.executeUpdate();

            if (rowsUpdated > 0) {
                JOptionPane.showMessageDialog(this, "Sửa thông tin sản phẩm thành công!", "Thành công", JOptionPane.INFORMATION_MESSAGE);
                // Nạp lại dữ liệu bảng sau khi cập nhật
                loadDataToTable();
            } else {
                JOptionPane.showMessageDialog(this, "Không thể sửa thông tin sản phẩm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Lỗi khi cập nhật thông tin: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void txtMaSanPhamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaSanPhamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaSanPhamActionPerformed

    private boolean showError = false; // Thêm biến flag
    private void txtMaSanPhamFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaSanPhamFocusLost
        String maHang = txtMaSanPham.getText();

        if (!maHang.isEmpty()) {
            try {
                Connection conn = DatabaseConnection.getConnection();

                String sql = "SELECT * FROM HANGHOA WHERE MaHang = ?";
                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, maHang);
                ResultSet resultSet = preparedStatement.executeQuery();

                if (resultSet.next()) {
                    // Đổ dữ liệu từ ResultSet vào các JTextField và JComboBox tương ứng
                    txtTenSanPham.setText(resultSet.getString("TenHang"));
                    tfGiaBan.setText(resultSet.getString("DonGia"));
                    tfSoLuong.setText(resultSet.getString("SoLuongKho"));

                    // Reset biến flag
                    showError = false;
                } else {
                    // Không tìm thấy mã khách hàng
                    if (!showError) { // Kiểm tra biến flag trước khi hiển thị thông báo
                        JOptionPane.showMessageDialog(this, "Không tìm thấy mã này!", "Không tìm thấy", JOptionPane.ERROR_MESSAGE);
                        showError = true; // Đánh dấu đã hiển thị thông báo
                    }

                    // Xóa dữ liệu từ các JTextField và JComboBox tương ứng
                    txtTenSanPham.setText("");
                    tfGiaBan.setText("");
                    tfSoLuong.setText("");
                }

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Lỗi khi tìm kiếm mã: " + ex.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_txtMaSanPhamFocusLost

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
            java.util.logging.Logger.getLogger(FormHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormHangHoa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormHangHoa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jbDanhSachSanPham;
    private javax.swing.JTable tableSanPham;
    private javax.swing.JTextField tfGiaBan;
    private javax.swing.JTextField tfSoLuong;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables
}