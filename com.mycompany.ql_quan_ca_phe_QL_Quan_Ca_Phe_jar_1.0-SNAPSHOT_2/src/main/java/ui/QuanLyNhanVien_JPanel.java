/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import dao.NhanVienDAO;
import helpers.KiemTraDuLieuNhapVao;
import helpers.ThongBao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NhanVien;

/**
 *
 * @author admin
 */
public class QuanLyNhanVien_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyNhanVien
     */
    public QuanLyNhanVien_JPanel() {
        initComponents();
        TaoBang();
        TaiDuLieuLenBang();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_maNhanVien = new javax.swing.JTextField();
        txt_hoTen = new javax.swing.JTextField();
        txt_email = new javax.swing.JTextField();
        txt_soDienThoai = new javax.swing.JTextField();
        rdb_nam = new javax.swing.JRadioButton();
        rdb_nu = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_diaChi = new javax.swing.JTextArea();
        btn_taoMoi = new javax.swing.JButton();
        btn_luu = new javax.swing.JButton();
        btn_capNhat = new javax.swing.JButton();
        btn_xoa = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_QLNV = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btn_timKiem = new javax.swing.JButton();

        jLabel1.setText("Mã nhân viên");

        jLabel2.setText("Họ tên");

        jLabel3.setText("Email");

        jLabel4.setText("Số điện thoại");

        jLabel5.setText("Giới tính");

        jLabel6.setText("Địa chỉ");

        txt_maNhanVien.setText("b1906766");

        txt_hoTen.setText("Lê Minh Thắng");

        txt_email.setText("thang@gmail.com");
        txt_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_emailActionPerformed(evt);
            }
        });

        txt_soDienThoai.setText("0922001122");
        txt_soDienThoai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_soDienThoaiActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdb_nam);
        rdb_nam.setSelected(true);
        rdb_nam.setText("Nam");
        rdb_nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdb_namActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdb_nu);
        rdb_nu.setText("Nữ");

        txt_diaChi.setColumns(20);
        txt_diaChi.setRows(5);
        txt_diaChi.setText("Cần Thơ");
        jScrollPane1.setViewportView(txt_diaChi);

        btn_taoMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-icon-16.png"))); // NOI18N
        btn_taoMoi.setText("Tạo mới");
        btn_taoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taoMoiActionPerformed(evt);
            }
        });

        btn_luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save-icon.png"))); // NOI18N
        btn_luu.setText("Lưu");
        btn_luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_luuActionPerformed(evt);
            }
        });

        btn_capNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btn_capNhat.setText("Cập nhật");
        btn_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capNhatActionPerformed(evt);
            }
        });

        btn_xoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btn_xoa.setText("Xóa");
        btn_xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaActionPerformed(evt);
            }
        });

        tbl_QLNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_QLNV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_QLNVMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_QLNV);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Quản lý nhân viên");

        btn_timKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/search-icon-16.png"))); // NOI18N
        btn_timKiem.setText("Tìm kiếm");
        btn_timKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(rdb_nam)
                                        .addGap(18, 18, 18)
                                        .addComponent(rdb_nu))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_maNhanVien)
                                            .addComponent(txt_hoTen)
                                            .addComponent(txt_email)
                                            .addComponent(txt_soDienThoai, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_timKiem)))
                                .addGap(3, 3, 3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_taoMoi)
                                .addGap(38, 38, 38)
                                .addComponent(btn_luu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                .addComponent(btn_capNhat)
                                .addGap(22, 22, 22))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_xoa)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel7)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txt_maNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_timKiem))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_hoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_soDienThoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb_nam)
                            .addComponent(rdb_nu)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_taoMoi)
                    .addComponent(btn_luu)
                    .addComponent(btn_capNhat)
                    .addComponent(btn_xoa))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txt_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_emailActionPerformed

    private void btn_taoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taoMoiActionPerformed
        // TODO add your handling code here:
        txt_maNhanVien.setText("");
        txt_hoTen.setText("");
        txt_email.setText("");
        txt_soDienThoai.setText("");
        txt_diaChi.setText("");

    }//GEN-LAST:event_btn_taoMoiActionPerformed
    /*
    Ngày 04/10/2022 Chức năng lưu nhân viên
     */
    private GiaoDienChinh_JFrame giaoDienChinh;
    private void btn_luuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_luuActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        KiemTraDuLieuNhapVao.KiemTraRong(txt_maNhanVien, sb, "Mã nhân viên không được để trống");
        KiemTraDuLieuNhapVao.KiemTraRong(txt_hoTen, sb, "Họ tên nhân viên không được để trống");
        KiemTraDuLieuNhapVao.KiemTraRong(txt_email, sb, "Email nhân viên không được để trống");
        KiemTraDuLieuNhapVao.KiemTraRong(txt_soDienThoai, sb, "Số điện thoại nhân viên không được để trống");
        KiemTraDuLieuNhapVao.KiemTraRong(txt_diaChi, sb, "Địa chỉ nhân viên không được để trống");

        if (sb.length() > 0) {
            ThongBao.ThongBaoLoi(giaoDienChinh, sb.toString(), "Lỗi sb.length() > 0");
            return;
        }
        try {
            NhanVien nv = new NhanVien();
            nv.setIdNhanVien(txt_maNhanVien.getText());
            nv.setHoVaTen(txt_hoTen.getText());
            nv.setEmail(txt_email.getText());
            nv.setSoDienThoai(txt_soDienThoai.getText());
            nv.setDiaChi(txt_diaChi.getText());
            nv.setGioiTinh(rdb_nam.isSelected() ? 1 : 0);

            NhanVienDAO nvDAO = new NhanVienDAO();
            if (nvDAO.Insert(nv) > 0) { // Insert dữ liệu vào csdl
                ThongBao.ThongBao(giaoDienChinh, "Nhân viên đã được lưu thành công", "Thông báo");
                TaiDuLieuLenBang();
            } else {
                ThongBao.ThongBao(giaoDienChinh, "Lưu nhân viên thất bại", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btn_luuActionPerformed

    private void rdb_namActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdb_namActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_rdb_namActionPerformed

    private void btn_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capNhatActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        KiemTraDuLieuNhapVao.KiemTraRong(txt_maNhanVien, sb, "Mã nhân viên không được để trống");
        KiemTraDuLieuNhapVao.KiemTraRong(txt_hoTen, sb, "Họ tên nhân viên không được để trống");
        KiemTraDuLieuNhapVao.KiemTraRong(txt_email, sb, "Email nhân viên không được để trống");
        KiemTraDuLieuNhapVao.KiemTraRong(txt_soDienThoai, sb, "Số điện thoại nhân viên không được để trống");
        KiemTraDuLieuNhapVao.KiemTraRong(txt_diaChi, sb, "Địa chỉ nhân viên không được để trống");

        if (sb.length() > 0) {
            ThongBao.ThongBaoLoi(giaoDienChinh, sb.toString(), "Lỗi sb.length() > 0");
            return;
        }
        // Kiểm tra có muốn cập nhật hay không 
        if (ThongBao.ThongBaoXacNhan(giaoDienChinh, "Bạn có muốn cập nhật nhân viên không?", "Hỏi") == JOptionPane.NO_OPTION) {
            return; // nếu không muốn -> kết thúc sự kiện
        }
        try {
            NhanVien nv = new NhanVien();
            nv.setIdNhanVien(txt_maNhanVien.getText());
            nv.setHoVaTen(txt_hoTen.getText());
            nv.setEmail(txt_email.getText());
            nv.setSoDienThoai(txt_soDienThoai.getText());
            nv.setDiaChi(txt_diaChi.getText());
            nv.setGioiTinh(rdb_nam.isSelected() ? 1 : 0);

            NhanVienDAO nvDAO = new NhanVienDAO();
            if (nvDAO.Update(nv) > 0) { // Update dữ liệu vào csdl
                ThongBao.ThongBao(giaoDienChinh, "Nhân viên đã được cập nhật thành công", "Thông báo");
                TaiDuLieuLenBang();
            } else {
                ThongBao.ThongBao(giaoDienChinh, "Cập nhật nhân viên thất bại", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btn_capNhatActionPerformed

    private void btn_xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        KiemTraDuLieuNhapVao.KiemTraRong(txt_maNhanVien, sb, "Mã nhân viên không được để trống");

        if (sb.length() > 0) {
            ThongBao.ThongBaoLoi(giaoDienChinh, sb.toString(), "Lỗi sb.length() > 0");
            return;
        }
        // Kiểm tra có muốn cập nhật hay không 
        if (ThongBao.ThongBaoXacNhan(giaoDienChinh, "Bạn có muốn xóa nhân viên không?", "Hỏi") == JOptionPane.NO_OPTION) {
            return; // nếu không muốn -> kết thúc sự kiện
        }
        try {
            NhanVien nv = new NhanVien(txt_maNhanVien.getText());

            NhanVienDAO nvDAO = new NhanVienDAO();
            if (nvDAO.Delete(nv) > 0) { // Delete dữ liệu trong csdl
                ThongBao.ThongBao(giaoDienChinh, "Nhân viên đã được xóa thành công", "Thông báo");
                btn_taoMoiActionPerformed(evt); // Xóa dữ liệu trên txt khi xóa xong
                TaiDuLieuLenBang();
            } else {
                ThongBao.ThongBao(giaoDienChinh, "Xóa nhân viên thất bại", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btn_xoaActionPerformed

    private DefaultTableModel tblmodel;

    private void TaoBang() {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String[]{"Mã nhân viên", "Họ và tên", "Email", "Số điện thoại", "Gới tính", "Địa chí"});
        tbl_QLNV.setModel(tblmodel);
    }
    private void txt_soDienThoaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_soDienThoaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_soDienThoaiActionPerformed

    private void tbl_QLNVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_QLNVMouseClicked
        // TODO add your handling code here:
        try {
            int row = tbl_QLNV.getSelectedRow();
            if (row >= 0) { // Người dùng đã chọn 1 dòng trên bảng
                String idNhanVien = (String) tbl_QLNV.getValueAt(row, 0); // Lấy dữ liệu taij cột đầu là idNhanVien
                NhanVienDAO nvDAO = new NhanVienDAO();
                NhanVien nhanVienID = new NhanVien(idNhanVien);
                NhanVien nv = nvDAO.selectById(nhanVienID);

                if (nv != null) { // Lấy dữ liệu lên khi có chọn 1 dòng có tồn taij mã nhân viên
                    txt_maNhanVien.setText(nv.getIdNhanVien());
                    txt_hoTen.setText(nv.getHoVaTen());
                    txt_email.setText(nv.getEmail());
                    txt_soDienThoai.setText(nv.getSoDienThoai());
                    txt_diaChi.setText(nv.getDiaChi());
                    //rdb_nam.setSelected(nv.getGioiTinh() == 1 ? true : false);
                    if (nv.getGioiTinh() == 1) {
                        rdb_nam.setSelected(true);
                    } else {
                        rdb_nu.setSelected(true);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tbl_QLNVMouseClicked
    /*
    Ngày 05/10/2022 Chức năng tìm kiếm nhân viên bằng mã nhân viên
     */
    private void btn_timKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timKiemActionPerformed
        // TODO add your handling code here:
        try {
            NhanVienDAO nvDAO = new NhanVienDAO();
            NhanVien idNhanVien = new NhanVien(txt_maNhanVien.getText());
            NhanVien nv = nvDAO.selectById(idNhanVien);
            if (nv != null) {
                txt_hoTen.setText(nv.getHoVaTen());
                txt_email.setText(nv.getEmail());
                txt_soDienThoai.setText(nv.getSoDienThoai());
                txt_diaChi.setText(nv.getDiaChi());
                if (nv.getGioiTinh() == 1) {
                    rdb_nam.setSelected(true);
                } else {
                    rdb_nu.setSelected(true);
                }

            } else {
                ThongBao.ThongBao(giaoDienChinh, "Không tìm thấy mã sinh viên", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btn_timKiemActionPerformed

    private void TaiDuLieuLenBang() {
        try {
            NhanVienDAO nvDAO = new NhanVienDAO();
            List<NhanVien> list = nvDAO.selectAll(); // Trả về all nhân viên trong csdl
            tblmodel.setRowCount(0); // Xóa dữ liệu hiện đang trên bảng
            for (NhanVien nhanVien : list) {
                tblmodel.addRow(new Object[]{
                    nhanVien.getIdNhanVien(), nhanVien.getHoVaTen(), nhanVien.getEmail(), nhanVien.getSoDienThoai(),
                    nhanVien.getGioiTinh() == 1 ? "Nam" : "Nữ", nhanVien.getDiaChi()
                });
            }
            tblmodel.fireTableDataChanged(); // Cập nhật lại hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_capNhat;
    private javax.swing.JButton btn_luu;
    private javax.swing.JButton btn_taoMoi;
    private javax.swing.JButton btn_timKiem;
    private javax.swing.JButton btn_xoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rdb_nam;
    private javax.swing.JRadioButton rdb_nu;
    private javax.swing.JTable tbl_QLNV;
    private javax.swing.JTextArea txt_diaChi;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_hoTen;
    private javax.swing.JTextField txt_maNhanVien;
    private javax.swing.JTextField txt_soDienThoai;
    // End of variables declaration//GEN-END:variables
}