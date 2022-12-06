/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import dao.BanDAO;
import dao.BanHangDAO;
import dao.DoDungDAO;
import dao.HoaDonDAO;
import helpers.ChiaSeDuLieu;
import helpers.DatabaseHelper;
import helpers.ThongBao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.Ban;
import model.BanHang;
import model.DoDung;
import model.HoaDon;

/**
 *
 * @author admin
 */
public class QuanLyBanHang_JPanel extends javax.swing.JPanel {

    private Object java;
    // private Object java;

    /**
     * Creates new form QuanLyBanHang_JPanel
     */
    public QuanLyBanHang_JPanel() {
        initComponents();
        TaoBang_Ban();
        TaiDuLieuLenBang_Ban();

        /*
        Ngày 06/10/2022 Tải tên đồ dùng lên combobox
         */
        LoadTenDoDung();

        TaoBangBan_BanHang();
        TaiDuLieuLenBang_BanHang();

    }

    private DefaultTableModel tblmodel;

    private void TaoBang_Ban() {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String[]{"Số bàn", "Trạng thái", "Ghi chú"});
        tbl_quanLyBan.setModel(tblmodel);
    }
    private GiaoDienChinh_JFrame giaoDienChinh;

    private void TaiDuLieuLenBang_Ban() {
        try {

            BanDAO banDAO = new BanDAO();
            List<Ban> list = banDAO.selectAll(); // Trả về all nhân viên trong csdl
            tblmodel.setRowCount(0); // Xóa dữ liệu hiện đang trên bảng
            for (Ban ban : list) {
                tblmodel.addRow(new Object[]{
                    ban.getTenBan(), ban.getTrangThai(), ban.getGhiChu()
                });
            }
            tblmodel.fireTableDataChanged(); // Cập nhật lại hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }

    /*
    Ngày 06/10/2022 Tải danh sách đồ uống lên combobox
     */
    private void LoadTenDoDung() {

        try {
            // Tạo kết nối csdl
            Connection con = DatabaseHelper.openConnection();
            String sql = "SELECT tenDoDung from DoDung ";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            System.out.println("Ban da thuc thi " + sql);
            cbo_doDung.removeAllItems();
            while (rs.next()) {
                cbo_doDung.addItem(rs.getString("tenDoDung"));
            }
            con.close();
            pst.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_quanLyBan = new javax.swing.JTable();
        jSpinner = new javax.swing.JSpinner();
        btn_themDoUong = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_quanLyBanHang = new javax.swing.JTable();
        btn_thanhToan = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lbl_tongTien = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbo_doDung = new javax.swing.JComboBox<>();
        btn_xuatHoaDon = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý bán hàng");

        tbl_quanLyBan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_quanLyBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_quanLyBanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_quanLyBan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jSpinner.setAutoscrolls(true);
        jSpinner.setRequestFocusEnabled(false);
        jSpinner.setValue(1);
        jSpinner.setVerifyInputWhenFocusTarget(false);

        btn_themDoUong.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-icon-16.png"))); // NOI18N
        btn_themDoUong.setText("Thêm đồ uống");
        btn_themDoUong.setEnabled(false);
        btn_themDoUong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themDoUongActionPerformed(evt);
            }
        });

        tbl_quanLyBanHang.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_quanLyBanHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_quanLyBanHangMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_quanLyBanHang);

        btn_thanhToan.setText("Thanh toán");
        btn_thanhToan.setEnabled(false);
        btn_thanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_thanhToanActionPerformed(evt);
            }
        });

        jLabel2.setText("Tổng tiền");

        lbl_tongTien.setText("0");

        jLabel4.setText("Số lượng");

        btn_xuatHoaDon.setText("Xuất hóa đơn");
        btn_xuatHoaDon.setEnabled(false);
        btn_xuatHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xuatHoaDonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(cbo_doDung, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_thanhToan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btn_themDoUong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_xuatHoaDon)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lbl_tongTien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(370, 370, 370)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_themDoUong)
                            .addComponent(cbo_doDung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_xuatHoaDon))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_thanhToan)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(lbl_tongTien))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 303, Short.MAX_VALUE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HienThi_ThemDoUong() {
        try {
            int row = tbl_quanLyBan.getSelectedRow();
            // btn_themDoUong.setEnabled(true);
            if ((tbl_quanLyBan.getValueAt(row, 1) + "").equals("Còn trống")) {
                //btn_thanhToan.setEnabled(true);
                btn_themDoUong.setEnabled(true);
            } else {
                //btn_thanhToan.setEnabled(false);
                btn_themDoUong.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "HienThi_ThemDoUong()");
        }
    }

    private void HienThi_ThanhToan() {
        try {
//         int row = tbl_quanLyBanHang.getSelectedRow();
            btn_thanhToan.setEnabled(true);
//        int soLuong = (int) tbl_quanLyBanHang.getValueAt(row, 2);
//        if (soLuong > 0) {
//            btn_thanhToan.setEnabled(true);
//        } else {
//            btn_thanhToan.setEnabled(false);
//        }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi HienThi_ThanhToan()");
        }
    }
    private void btn_themDoUongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themDoUongActionPerformed
        // TODO add your handling code here:
        try {
            BanHang banHang = new BanHang();
            // Lấy tên bàn
            int Row = tbl_quanLyBan.getSelectedRow();
            String tenBan = (String) tbl_quanLyBan.getValueAt(Row, 0);
            banHang.setTenBan(tenBan);
            banHang.setTenDoDung(cbo_doDung.getSelectedItem().toString());

            // Lấy số lượng
            banHang.setSoLuong(Integer.parseInt(jSpinner.getValue().toString()));

            // Lấy giá tiền đồ dùng
            banHang.setGiaDoDung(LayGiaDoDung(cbo_doDung.getSelectedItem().toString()));
            // Tính thành tiền
            banHang.setThanhTien(
                    Integer.parseInt(jSpinner.getValue().toString())
                    * LayGiaDoDung(cbo_doDung.getSelectedItem().toString())
            );

            BanHangDAO banHangDAO = new BanHangDAO();
            if (banHangDAO.Insert(banHang) > 0) { // Insert dữ liệu vào csdl
                ThongBao.ThongBao(giaoDienChinh, "Bàn được lưu thành công", "Thông báo");

                // Cập nhật trạng thái thành "Đã đặt" sau khi thêm đồ dùng cho bàn
                banHangDAO.Update(banHang);

                TaoBang_Ban();
                TaiDuLieuLenBang_Ban();
                TaoBangBan_BanHang();
                TaiDuLieuLenBang_BanHang();
            } else {
                ThongBao.ThongBao(giaoDienChinh, "Bàn đã lưu thất bại", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btn_themDoUongActionPerformed

    private void btn_thanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_thanhToanActionPerformed
        // TODO add your handling code here:
        try {
            int row = tbl_quanLyBanHang.getSelectedRow();
            if (row >= 0) { // Người dùng đã chọn 1 dòng trên bảng
                String idBan = (String) tbl_quanLyBanHang.getValueAt(row, 0); // Lấy dữ liệu tại cột đầu là tên bàn

                BanHangDAO banHangDAO = new BanHangDAO();
                BanHang banHangID = new BanHang(idBan);
                BanHang banHang = banHangDAO.selectById(banHangID);

                if (banHang != null) { // Lấy dữ liệu lên khi có chọn 1 dòng có tồn taij mã nhân viên
//                    txt_ghiChu.setText(ban.getGhiChu());
//                    txt_soBan.setText(ban.getTenBan());
                    lbl_tongTien.setText(String.valueOf(banHang.getThanhTien()));
                }
            }
            btn_thanhToan.setEnabled(false);
            btn_xuatHoaDon.setEnabled(false);
            XoaBanDaDat();
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btn_thanhToanActionPerformed

    private void tbl_quanLyBanHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_quanLyBanHangMouseClicked
        // TODO add your handling code here:
        HienThi_ThanhToan();
        TaiDuLieuLenBang_Ban();
        //HienThi_ThemDoUong();
        btn_xuatHoaDon.setEnabled(true);
        btn_themDoUong.setEnabled(false);
    }//GEN-LAST:event_tbl_quanLyBanHangMouseClicked

    private void tbl_quanLyBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_quanLyBanMouseClicked
        // TODO add your handling code here:

        HienThi_ThemDoUong();
        TaiDuLieuLenBang_BanHang();
        //HienThi_ThanhToan();
        btn_thanhToan.setEnabled(false);
        btn_xuatHoaDon.setEnabled(false);
    }//GEN-LAST:event_tbl_quanLyBanMouseClicked

    private void btn_xuatHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xuatHoaDonActionPerformed
        // TODO add your handling code here:
        
        try {
            HoaDon hoaDon = new HoaDon();
            // Lấy tên đăng nhập 
            String tenDangNhap = ChiaSeDuLieu.nguoiDangNhap.getTenDangNhap();
            hoaDon.setTenDangNhap(tenDangNhap);
            // Lấy tên bàn
            int Row = tbl_quanLyBanHang.getSelectedRow();
            String tenBan = (String) tbl_quanLyBanHang.getValueAt(Row, 0);
            hoaDon.setTenBan(tenBan);
            // Lấy tên đồ dùng
            hoaDon.setTenDoDung(cbo_doDung.getSelectedItem().toString());

            // Lấy số lượng
            hoaDon.setSoLuong(Integer.parseInt(jSpinner.getValue().toString()));

            // Lấy giá tiền đồ dùng
            hoaDon.setGiaDoDung(LayGiaDoDung(cbo_doDung.getSelectedItem().toString()));
            // Tính thành tiền
            hoaDon.setThanhTien(
                    Integer.parseInt(jSpinner.getValue().toString())
                    * LayGiaDoDung(cbo_doDung.getSelectedItem().toString())
            );
            // Lấy ngày hiện tại
            
            long millis = System.currentTimeMillis();
            java.sql.Date date = new java.sql.Date(millis);
            System.out.println("In ngay"+date);
            hoaDon.setNgayLap(date);
            
            //System.out.println(java.time.LocalTime.now());
           // hoaDon.setGioLap("Không có giờ");
            
            HoaDonDAO hoaDonDAO = new HoaDonDAO();
            if (hoaDonDAO.Insert(hoaDon) > 0) { // Insert dữ liệu vào csdl
                ThongBao.ThongBao(giaoDienChinh, "Xuất hóa đơn thành công\n"+hoaDon.XuatHoaDon(), "Thông báo");
                //System.out.println(hoaDon.XuatHoaDon());
                  XoaBanDaDat();

            } else {
                ThongBao.ThongBao(giaoDienChinh, "Xuất hóa đơn thất bại", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btn_xuatHoaDonActionPerformed

    private float LayGiaDoDung(String tenDoDung) {
        float gia = 0;
        try {
            // Tạo kết nối csdl
            Connection con = DatabaseHelper.openConnection();
            String sql = "SELECT giaDoDung"
                    + " from DoDung "
                    + " Where tenDoDung=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, tenDoDung);
            ResultSet rs = pst.executeQuery();
            System.out.println("Ban da thuc thi " + sql);

            while (rs.next()) {
                //cbo_doDung.addItem(rs.getString("tenDoDung"));
                gia = rs.getFloat("giaDoDung");
            }
            System.out.println("Chạy phương thức LayGiaDoDung(String tenDoDung) lệnh sql " + sql);
            con.close();
            pst.close();
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
        return gia;
    }

    private DefaultTableModel tblmodel_2;

    private void TaoBangBan_BanHang() {
        tblmodel_2 = new DefaultTableModel();
        tblmodel_2.setColumnIdentifiers(new String[]{"Tên bàn", "Tên đồ dùng", "Số lượng", "Giá", "Thành tiền"});
        tbl_quanLyBanHang.setModel(tblmodel_2);
    }

    private void TaiDuLieuLenBang_BanHang() {
        try {

            BanHangDAO banHangDAO = new BanHangDAO();
            List<BanHang> list = banHangDAO.selectAll(); // Trả về all nhân viên trong csdl
            tblmodel_2.setRowCount(0); // Xóa dữ liệu hiện đang trên bảng
            for (BanHang banHang : list) {
                tblmodel_2.addRow(new Object[]{
                    banHang.getTenBan(), banHang.getTenDoDung(), banHang.getSoLuong(), banHang.getGiaDoDung(),
                    banHang.getThanhTien()
                });
            }
            tblmodel_2.fireTableDataChanged(); // Cập nhật lại hiển thị dữ liệu trong bảng
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }

    /*
    private void SetTrangThai_Ban(){
        try {
            BanHang banHang = new BanHang();
            
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }
    
    /*
    Ngày 8/10/2022 Chức năng xóa bàn đã đặt trong bản tbl_quanLyBanHang sau khi nhấn thanh toán
     */

 /*
        Ngày 10/10/2022 Chức năng xuất hóa đơn & thống kê
    
     */
    private void XoaBanDaDat() {
        try {

            BanHang banHang = new BanHang();
            // Lấy tên bàn
            int Row = tbl_quanLyBanHang.getSelectedRow();
            String tenBan = (String) tbl_quanLyBanHang.getValueAt(Row, 0);
            banHang.setTenBan(tenBan);

            BanHangDAO banHangDAO = new BanHangDAO();
            if (banHangDAO.Delete(banHang) > 0) { // Insert dữ liệu vào csdl
                //ThongBao.ThongBao(giaoDienChinh, "Bàn được lưu thành công", "Thông báo");

                banHangDAO.Update_2(banHang);
//
//                TaoBang_Ban();
                TaiDuLieuLenBang_Ban();
//                TaoBangBan_BanHang();
                TaiDuLieuLenBang_BanHang();
            }

        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_thanhToan;
    private javax.swing.JButton btn_themDoUong;
    private javax.swing.JButton btn_xuatHoaDon;
    private javax.swing.JComboBox<String> cbo_doDung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner;
    private javax.swing.JLabel lbl_tongTien;
    private javax.swing.JTable tbl_quanLyBan;
    private javax.swing.JTable tbl_quanLyBanHang;
    // End of variables declaration//GEN-END:variables
}