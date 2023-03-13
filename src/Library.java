
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class Library extends JFrame {
	static Library frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Image icon = Toolkit.getDefaultToolkit().getImage("C:/Users/Prajwal/Library/src/assets/favicon.ico")
							.getScaledInstance(16, 16, Image.SCALE_SMOOTH);
					;
					frame = new Library();
					frame.setVisible(true);
					frame.setTitle("Library Management System");
					frame.setIconImage(icon);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Library() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(203, 228, 222));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblLibraryManagement = new JLabel("Library Management System");
		lblLibraryManagement.setFont(new Font("Quicksand", Font.BOLD, 18));
		lblLibraryManagement.setForeground(new Color(2, 52, 63));

		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setBackground(new Color(14, 131, 136));
		btnAdminLogin.setForeground(new Color(44, 51, 51));
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin.main(new String[] {});
				frame.dispose();
			}
		});
		btnAdminLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));

		JButton btnLibrarianLogin = new JButton("Librarian Login");
		btnLibrarianLogin.setBackground(new Color(14, 131, 136));
		btnLibrarianLogin.setForeground(new Color(44, 51, 51));
		btnLibrarianLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				LibrarianLogin.main(new String[] {});
			}
		});
		btnLibrarianLogin.setFont(new Font("Tahoma", Font.PLAIN, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(64)
												.addComponent(lblLibraryManagement))
										.addGroup(gl_contentPane.createSequentialGroup()
												.addGap(140)
												.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
														.addComponent(btnLibrarianLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(btnAdminLogin, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 135,
																Short.MAX_VALUE))))
								.addContainerGap(95, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblLibraryManagement)
								.addGap(32)
								.addComponent(btnAdminLogin, GroupLayout.PREFERRED_SIZE, 52, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(btnLibrarianLogin, GroupLayout.PREFERRED_SIZE, 53, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(70, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
