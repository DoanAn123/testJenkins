package nhom6;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Label;

public class create extends JFrame {
    private JTextField txtGhgf;

    public create() {
        JFrame frame = new JFrame("--WELCOME--");
        frame.getContentPane().setBackground(new Color(128, 255, 255));

        ImageIcon logoIcon = new ImageIcon("D:/nhom6/cuoiky/nhom6");
        JButton jbtgv = new JButton("Nhập thông tin khách hàng");
        jbtgv.setIcon(logoIcon);

        jbtgv.setBackground(Color.ORANGE);
        jbtgv.setForeground(Color.RED);
        jbtgv.setFont(new Font("Times New Roman", Font.BOLD, 20));
        jbtgv.setBounds(313, 427, 363, 61);
        jbtgv.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
                new khachhang();
            }
        });

        ImageIcon imgReturn = new ImageIcon("D:/Textgithub/hinhom6/anh/huyl.jpg");
        JButton jbtreturn = new JButton("LOG OUT");
        jbtreturn.setIcon(imgReturn);
        jbtreturn.setBackground(new Color(192, 192, 192));
        jbtreturn.setForeground(Color.BLACK);
        jbtreturn.setFont(new Font("Times New Roman", Font.BOLD, 18));
        jbtreturn.setBounds(848, 0, 178, 41);
        jbtreturn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new login();
                frame.dispose();
            }
        });

       

		ImageIcon icon = new ImageIcon("D:/nhom6/hinh1.png");

		JLabel label = new JLabel();
		label.setText("");
		label.setIcon(icon);

		JPanel pink = new JPanel();
		pink.setBackground(new Color(255, 255, 128));
		pink.setBounds(0, 38, 1026, 139);

		/*
		 * ImageIcon imgcreate = new
		 * JLabel(); jlbtao.setIcon(imgcreate); jlbtao.setText("NEW TABLE");
		 * jlbtao.setBounds(250,50, 250, 50);; jlbtao.setForeground(Color.RED);
		 * jlbtao.setFont(new Font("Times New Roman",Font.PLAIN, 18));
		 * 
		 * JPanel jptao = new JPanel(); jptao.setBackground(Color.ORANGE);
		 * jptao.setBounds(50, 250, 200, 40);
		 */

		ImageIcon welcome = new ImageIcon("D:/nhom6/hinh1.png");

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(1040, 550);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		pink.add(label);
		frame.getContentPane().add(pink);
		
		frame.getContentPane().add(jbtgv);
			
		frame.getContentPane().add(jbtreturn);
		
		Label label_1 = new Label("Quản Lý Khách Hàng");
		label_1.setForeground(new Color(255, 0, 0));
		label_1.setFont(new Font("Britannic Bold", Font.BOLD | Font.ITALIC, 40));
		label_1.setBackground(new Color(128, 255, 255));
		label_1.setBounds(253, 182, 550, 81);
		frame.getContentPane().add(label_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\Textgithub\\hinhom6\\anh\\z5437697937959_e8f61599d949dab41fa9e0bb22857b73.jpg"));
		lblNewLabel.setBounds(323, 268, 433, 131);
		frame.getContentPane().add(lblNewLabel);
		frame.setLocationRelativeTo(null);

	}

    public static void main(String[] args) {
        new create();
    }
}