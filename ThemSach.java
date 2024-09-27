package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ThemSach extends JFrame {
    private JPanel ThemSach;
    private JButton HỦYButton;
    private JTextField txtMaSach;
    private JTextField txtTenSach;
    private JTextField txtTenTacGia;
    private JTextField txtTheLoai;
    private JTextField txtHienTrang;
    private JTextField txtSoLuong;
    private JButton THÊMButton;

    public ThemSach() {
        setContentPane(ThemSach);
        setTitle("Thêm Sách");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setVisible(true);

        THÊMButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int MaSach = 0;
                String TenSach = "";
                String TenTacGia = "";
                String TheLoai = "";
                String HienTrang = "";
                int SoLuong = 0;
                boolean check = true;

                try {
                    MaSach = Integer.parseInt(txtMaSach.getText());
                    if (MaSach < 0) {
                        JOptionPane.showMessageDialog(ThemSach, "Mã sách không hợp lệ !");
                        check = false;
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ThemSach, "Mã sách chỉ được chứa ký tự số !");
                    check = false;
                    return;
                }

                TenSach = txtTenSach.getText();
                TenTacGia = txtTenTacGia.getText();
                TheLoai = txtTheLoai.getText();
                HienTrang = txtHienTrang.getText();

                try {
                    SoLuong = Integer.parseInt(txtSoLuong.getText());
                    if (SoLuong < 0) {
                        JOptionPane.showMessageDialog(ThemSach, "Số lượng không hợp lệ !");
                        check = false;
                        return;
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ThemSach, "Số lượng chỉ được chứa ký tự số !");
                    check = false;
                    return;
                }

                if (check) {
                    JOptionPane.showMessageDialog(ThemSach, "Đã thêm thành công");
                    // Thực hiện thêm sách vào cơ sở dữ liệu hoặc xử lý dữ liệu tùy ý
                    // Ví dụ: ThemSach vao database
                }
            }
        });
        HỦYButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();

                // Hiển thị cửa sổ trước đó

            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ThemSach::new);
    }
}
