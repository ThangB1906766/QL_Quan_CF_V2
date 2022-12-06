/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import dao.BanDAO;
import dao.NhanVienDAO;
import helpers.KiemTraDuLieuNhapVao;
import helpers.ThongBao;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Ban;
import model.NhanVien;

/**
 *
 * @author admin
 */
public class QuanLyBan_JPanel extends javax.swing.JPanel {

    /**
     * Creates new form QuanLyBan
     */
    public QuanLyBan_JPanel() {
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_soBan = new javax.swing.JTextField();
        txt_ghiChu = new javax.swing.JTextField();
        btn_themBan = new javax.swing.JButton();
        btn_capNhat = new javax.swing.JButton();
        btn_xoaBan = new javax.swing.JButton();
        btn_taoMoi = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_QLBan = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Quản lý bàn");

        jLabel3.setText("Số bàn");

        jLabel4.setText("Ghi chú");

        btn_themBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Save-icon.png"))); // NOI18N
        btn_themBan.setText("Thêm bàn");
        btn_themBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themBanActionPerformed(evt);
            }
        });

        btn_capNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btn_capNhat.setText("Cập nhật");
        btn_capNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capNhatActionPerformed(evt);
            }
        });

        btn_xoaBan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btn_xoaBan.setText("Xóa bàn");
        btn_xoaBan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_xoaBanActionPerformed(evt);
            }
        });

        btn_taoMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/new-icon-16.png"))); // NOI18N
        btn_taoMoi.setText("Tạo mới");
        btn_taoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_taoMoiActionPerformed(evt);
            }
        });

        jScrollPane2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane2MouseClicked(evt);
            }
        });

        tbl_QLBan.setModel(new javax.swing.table.DefaultTableModel(
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
        tbl_QLBan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_QLBanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_QLBan);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_taoMoi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_xoaBan))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_soBan)
                            .addComponent(txt_ghiChu, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_themBan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(btn_capNhat)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_soBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_ghiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_themBan)
                            .addComponent(btn_capNhat))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_xoaBan)
                            .addComponent(btn_taoMoi))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    private GiaoDienChinh_JFrame giaoDienChinh;
    private void btn_themBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themBanActionPerformed
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        KiemTraDuLieuNhapVao.KiemTraRong(txt_soBan, sb, "Số bàn không được để trống");
        KiemTraDuLieuNhapVao.KiemTraRong(txt_ghiChu, sb, "Ghi chú không được để trống");

        if (sb.length() > 0) {
            ThongBao.ThongBaoLoi(giaoDienChinh, sb.toString(), "Lỗi sb.length() > 0");
            return;
        }
        try {
            Ban ban = new Ban();
            ban.setTenBan(txt_soBan.getText());
            ban.setGhiChu(txt_ghiChu.getText());
            ban.setTrangThai("Còn trống");

            BanDAO banDAO = new BanDAO();
            if (banDAO.Insert(ban) > 0) { // Insert dữ liệu vào csdl
                ThongBao.ThongBao(giaoDienChinh, "Bàn được lưu thành công", "Thông báo");
                TaiDuLieuLenBang();
            } else {
                ThongBao.ThongBao(giaoDienChinh, "Bàn đã lưu thất bại", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btn_themBanActionPerformed

    private void btn_taoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_taoMoiActionPerformed
        // TODO add your handling code here:
        txt_ghiChu.setText("");
        txt_soBan.setText("");
        txt_soBan.requestFocus();
    }//GEN-LAST:event_btn_taoMoiActionPerformed

    private void btn_capNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capNhatActionPerformed

        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        KiemTraDuLieuNhapVao.KiemTraRong(txt_soBan, sb, "Số bàn không được để trống");
        KiemTraDuLieuNhapVao.KiemTraRong(txt_ghiChu, sb, "Ghi chú không được để trống");

        if (sb.length() > 0) {
            ThongBao.ThongBaoLoi(giaoDienChinh, sb.toString(), "Lỗi sb.length() > 0");
            return;
        }
        try {

            Ban ban = new Ban();
            ban.setTenBan(txt_soBan.getText());
            ban.setGhiChu(txt_ghiChu.getText());
            ban.setTrangThai("Còn trống");

            BanDAO banDAO = new BanDAO();
            if (banDAO.Update(ban) > 0) { // Insert dữ liệu vào csdl
                ThongBao.ThongBao(giaoDienChinh, "Bàn được cập nhật thành công", "Thông báo");
                TaiDuLieuLenBang();
            } else {
                ThongBao.ThongBao(giaoDienChinh, "Bàn đã cập nhật thất bại", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btn_capNhatActionPerformed

    private void btn_xoaBanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_xoaBanActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        StringBuilder sb = new StringBuilder();
        KiemTraDuLieuNhapVao.KiemTraRong(txt_soBan, sb, "Số bàn không được để trống");

        if (sb.length() > 0) {
            ThongBao.ThongBaoLoi(giaoDienChinh, sb.toString(), "Lỗi sb.length() > 0");
            return;
        }
        // Kiểm tra có muốn cập nhật hay không 
        if (ThongBao.ThongBaoXacNhan(giaoDienChinh, "Bạn có muốn xóa bàn \"" +txt_soBan.getText()+ "\" không?", "Hỏi") == JOptionPane.NO_OPTION) {
            return; // nếu không muốn -> kết thúc sự kiện
        }
        try {

            Ban ban = new Ban(txt_soBan.getText());

            BanDAO banDAO = new BanDAO();
            if (banDAO.Delete(ban) > 0) { // Insert dữ liệu vào csdl
                ThongBao.ThongBao(giaoDienChinh, "Bàn được xóa thành công", "Thông báo");
                btn_taoMoiActionPerformed(evt);
                TaiDuLieuLenBang();
            } else {
                ThongBao.ThongBao(giaoDienChinh, "Xóa thất bại", "Thông báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btn_xoaBanActionPerformed

    private void jScrollPane2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane2MouseClicked

    private void tbl_QLBanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_QLBanMouseClicked
        // TODO add your handling code here:
         try {
            int row = tbl_QLBan.getSelectedRow();
            if (row >= 0) { // Người dùng đã chọn 1 dòng trên bảng
                String idBan = (String) tbl_QLBan.getValueAt(row, 0); // Lấy dữ liệu tại cột đầu là idNhanVien
                                
                BanDAO banDAO = new BanDAO();
                Ban banID = new Ban(idBan);
                Ban ban = banDAO.selectById(banID);
                
                if (ban != null) { // Lấy dữ liệu lên khi có chọn 1 dòng có tồn taij mã nhân viên
                    txt_ghiChu.setText(ban.getGhiChu());
                    txt_soBan.setText(ban.getTenBan());
                    TaiDuLieuLenBang();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            ThongBao.ThongBaoLoi(giaoDienChinh, e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_tbl_QLBanMouseClicked

    private DefaultTableModel tblmodel;

    private void TaoBang() {
        tblmodel = new DefaultTableModel();
        tblmodel.setColumnIdentifiers(new String[]{"Số bàn", "Trạng thái", "Ghi chú"});
        tbl_QLBan.setModel(tblmodel);
    }
    
    private void TaiDuLieuLenBang() {
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_capNhat;
    private javax.swing.JButton btn_taoMoi;
    private javax.swing.JButton btn_themBan;
    private javax.swing.JButton btn_xoaBan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_QLBan;
    private javax.swing.JTextField txt_ghiChu;
    private javax.swing.JTextField txt_soBan;
    // End of variables declaration//GEN-END:variables
}