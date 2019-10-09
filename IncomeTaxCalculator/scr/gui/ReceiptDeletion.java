package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JList;
import javax.swing.JButton;

public class ReceiptDeletion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReceiptDeletion frame = new ReceiptDeletion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ReceiptDeletion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDeleteReceipt = new JLabel("Delete Receipt");
		lblDeleteReceipt.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDeleteReceipt.setBounds(162, 11, 98, 22);
		contentPane.add(lblDeleteReceipt);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 31, 153, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(262, 31, 162, 2);
		contentPane.add(separator_2);
		
		JLabel lblPleaseSelectOne = new JLabel("Please select one or more receipts from the list to delete them");
		lblPleaseSelectOne.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPleaseSelectOne.setBounds(31, 35, 369, 50);
		contentPane.add(lblPleaseSelectOne);
		
		JList list = new JList();
		list.setBounds(31, 90, 359, 207);
		contentPane.add(list);
		
		JButton btnNewButton = new JButton("Delete");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(335, 330, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(236, 330, 89, 23);
		contentPane.add(btnNewButton_1);
		this.setTitle("Income Tax Calculator");
	}
}
