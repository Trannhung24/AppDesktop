package view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DangNhap extends JFrame {
    private JButton jDangKy;
    private JPanel SignUpPanel;
    private JPanel LoginPanel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton btnLogin;
    private JCheckBox chklogin;
    private JButton quênMậtKhẩuButton;

    public DangNhap() {
        setContentPane(LoginPanel);
        setTitle("Đăng Ký Tài Khoản");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(450,300);
        setLocationRelativeTo(null);
        setVisible(true);
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(DangNhap.this, "Đăng Nhập Thành Công");
                Home home = new Home();
                home.setVisible(true);
                // Cập nhật giao diện
                revalidate();
                repaint();

            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(DangNhap::new);
    }


}

