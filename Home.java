package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame {
    private JPanel HomePanel;
    private JTextField textField1;
    private JButton button1;
    private JButton button2;
    private JTable table1;
    private JButton button3;
    private JButton thêmSáchButton;
    private JButton button6;
    private JButton button7;
    private JButton button8;

    public Home() {
        // Gọi phương thức createUIComponents() để tạo và thêm JTable vào HomePanel


        // Thiết lập nội dung của JFrame là HomePanel
        setContentPane(HomePanel);

        // Thiết lập các thuộc tính khác cho JFrame
        setTitle("Quản Lý Thư Viện");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600, 300);
        setLocationRelativeTo(null);
        setVisible(true);
        // Tạo một mảng 2D chứa dữ liệu cho bảng
        Object[][] data = {
                {"1", "GIẢI TÍCH 1", "HUCE","TOÁN HỌC","TỐT","0"},
                {"1", "GIẢI TÍCH 1", "HUCE","TOÁN HỌC","TỐT","0"},
                {"1", "GIẢI TÍCH 1", "HUCE","TOÁN HỌC","TỐT","0"},
        };

// Tiêu đề cột
        String[] columnNames = {"MÃ SÁCH", "TÊN SÁCH", "TÊN TÁC GIẢ","THỂ LOẠI","HIỆN TRẠNG","SỐ LƯỢNG"};

// Tạo một DefaultTableModel với dữ liệu và tiêu đề cột
        DefaultTableModel model = new DefaultTableModel(data, columnNames);

// Gán DefaultTableModel cho bảng
        table1.setModel(model);

// Sau này, khi bạn muốn thêm dữ liệu mới:
// Dữ liệu cho hàng mới
        Object[] newRowData = {"1", "GIẢI TÍCH 1", "HUCE","TOÁN HỌC","TỐT","0"};

// Thêm hàng mới vào DefaultTableModel
        model.addRow(newRowData);

        thêmSáchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Tạo một đối tượng ThemSach
                ThemSach themsach = new ThemSach();

                // Thêm ThemSach vào HomePanel
                HomePanel.add(themsach);

                // Cập nhật giao diện
                revalidate();
                repaint();
                HomePanel.setVisible(false);
            }
        });


    }




    public static void main(String[] args) {
        SwingUtilities.invokeLater(Home::new);
    }
}
