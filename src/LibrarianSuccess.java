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

public class LibrarianSuccess extends JFrame {
	static LibrarianSuccess frame;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new LibrarianSuccess();
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
	public LibrarianSuccess() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(2, 52, 63));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(203, 228, 222));

		setContentPane(contentPane);

		JLabel lblLibrarianSection = new JLabel("Librarian Section");
		lblLibrarianSection.setFont(new Font("Tahoma", Font.BOLD, 18));

		JButton btnNewButton = new JButton("Add Books");
		btnNewButton.setBackground(new Color(14, 131, 136));
		btnNewButton.setForeground(new Color(44, 51, 51));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BooksForm.main(new String[] {});
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JButton btnViewBooks = new JButton("View Books");
		btnViewBooks.setBackground(new Color(14, 131, 136));
		btnViewBooks.setForeground(new Color(44, 51, 51));
		btnViewBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ViewBooks.main(new String[] {});
			}
		});
		btnViewBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JButton btnIssueBook = new JButton("Issue Book");
		btnIssueBook.setBackground(new Color(14, 131, 136));
		btnIssueBook.setForeground(new Color(44, 51, 51));
		btnIssueBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IssueBookForm.main(new String[] {});
				frame.dispose();
			}
		});
		btnIssueBook.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JButton btnViewIssuedBooks = new JButton("View Issued Books");
		btnViewIssuedBooks.setBackground(new Color(14, 131, 136));
		btnViewIssuedBooks.setForeground(new Color(44, 51, 51));
		btnViewIssuedBooks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewIssuedBooks.main(new String[] {});
			}
		});
		btnViewIssuedBooks.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JButton btnReturnBook = new JButton("Return Book");
		btnReturnBook.setBackground(new Color(14, 131, 136));
		btnReturnBook.setForeground(new Color(44, 51, 51));
		btnReturnBook.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ReturnBook.main(new String[] {});
				frame.dispose();
			}
		});
		btnReturnBook.setFont(new Font("Tahoma", Font.PLAIN, 13));

		JButton btnLogout = new JButton("Logout");
		btnLogout.setBackground(new Color(14, 131, 136));
		btnLogout.setForeground(new Color(44, 51, 51));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Library.main(new String[] {});
				frame.dispose();
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 13));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addContainerGap(81, Short.MAX_VALUE)
								.addComponent(lblLibrarianSection)
								.addGap(54))
						.addGroup(gl_contentPane.createSequentialGroup()
								.addGap(132)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 191,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
										.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
								.addContainerGap(101, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(
				gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(lblLibrarianSection)
								.addGap(18)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnViewBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnIssueBook, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnViewIssuedBooks, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnReturnBook, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addGap(18)
								.addComponent(btnLogout, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(16, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

}
