
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AdminSuccess extends JFrame {
	static AdminSuccess frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new AdminSuccess();
					frame.setVisible(true);
					frame.setTitle("Library Management System");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AdminSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 371);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(203, 228, 222));

		setContentPane(contentPane);

		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdminSection.setForeground(new Color(2, 52, 63));

		JButton btnNewButton = new JButton("Add Librarian");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBackground(new Color(14, 131, 136));
		btnNewButton.setForeground(new Color(44, 51, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianForm.main(new String[] {});
				frame.dispose();
			}
		});

		JButton btnViewLibrarian = new JButton("View Librarian");
		btnViewLibrarian.setBackground(new Color(14, 131, 136));
		btnViewLibrarian.setForeground(new Color(44, 51, 51));
		btnViewLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewLibrarian.main(new String[] {});
			}
		});
		btnViewLibrarian.setFont(new Font("Tahoma", Font.BOLD, 15));

		JButton btnDeleteLibrarian = new JButton("Delete Librarian");
		btnDeleteLibrarian.setBackground(new Color(14, 131, 136));
		btnDeleteLibrarian.setForeground(new Color(44, 51, 51));
		btnDeleteLibrarian.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteLibrarian.main(new String[] {});
				frame.dispose();
			}
		});
		btnDeleteLibrarian.setFont(new Font("Tahoma", Font.BOLD, 15));

		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(14, 131, 136));
		btnLogout.setForeground(new Color(44, 51, 51));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Library.main(new String[] {});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 15));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap(150, Short.MAX_VALUE)
								.addComponent(lblAdminSection, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
								.addGap(123))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
								.addGap(134)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnDeleteLibrarian, GroupLayout.PREFERRED_SIZE, 181,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnViewLibrarian, GroupLayout.PREFERRED_SIZE, 181,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(109, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblAdminSection, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
								.addGap(11)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnViewLibrarian, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnDeleteLibrarian, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(21, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
