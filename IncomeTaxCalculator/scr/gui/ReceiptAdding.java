package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;

public class ReceiptAdding extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReceiptAdding frame = new ReceiptAdding();
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
	public ReceiptAdding() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle("Income Tax Calculator");
		
		JLabel lblReceiptAddition = new JLabel("Add Receipt");
		lblReceiptAddition.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblReceiptAddition.setBounds(174, 11, 221, 14);
		contentPane.add(lblReceiptAddition);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 23, 163, 2);
		contentPane.add(separator);
		
		JLabel lblId = new JLabel("Receipt ID:");
		lblId.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblId.setBounds(25, 57, 70, 14);
		contentPane.add(lblId);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDate.setBounds(25, 83, 46, 14);
		contentPane.add(lblDate);
		
		JLabel lblKind = new JLabel("Kind:");
		lblKind.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblKind.setBounds(25, 108, 46, 14);
		contentPane.add(lblKind);
		
		JLabel lblAmount = new JLabel("Amount:");
		lblAmount.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAmount.setBounds(25, 133, 70, 14);
		contentPane.add(lblAmount);
		
		JLabel lblCompany = new JLabel("Company:");
		lblCompany.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompany.setBounds(25, 158, 70, 14);
		contentPane.add(lblCompany);
		
		JLabel lblCountry = new JLabel("Country:");
		lblCountry.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCountry.setBounds(25, 183, 58, 14);
		contentPane.add(lblCountry);
		
		JLabel lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCity.setBounds(25, 208, 46, 14);
		contentPane.add(lblCity);
		
		JLabel lblStreet = new JLabel("Street:");
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStreet.setBounds(25, 233, 46, 14);
		contentPane.add(lblStreet);
		
		JLabel lblNumber = new JLabel("Number:");
		lblNumber.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumber.setBounds(25, 258, 70, 14);
		contentPane.add(lblNumber);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(317, 329, 107, 25);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(201, 329, 107, 25);
		contentPane.add(btnNewButton_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(110, 55, 274, 20);
		contentPane.add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(110, 81, 274, 20);
		contentPane.add(formattedTextField_1);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBounds(110, 106, 274, 20);
		contentPane.add(formattedTextField_2);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setBounds(110, 131, 274, 20);
		contentPane.add(formattedTextField_3);
		
		JFormattedTextField formattedTextField_4 = new JFormattedTextField();
		formattedTextField_4.setBounds(110, 156, 274, 20);
		contentPane.add(formattedTextField_4);
		
		JFormattedTextField formattedTextField_5 = new JFormattedTextField();
		formattedTextField_5.setBounds(110, 181, 274, 20);
		contentPane.add(formattedTextField_5);
		
		JFormattedTextField formattedTextField_6 = new JFormattedTextField();
		formattedTextField_6.setBounds(110, 206, 274, 20);
		contentPane.add(formattedTextField_6);
		
		JFormattedTextField formattedTextField_7 = new JFormattedTextField();
		formattedTextField_7.setBounds(110, 231, 274, 20);
		contentPane.add(formattedTextField_7);
		
		JFormattedTextField formattedTextField_8 = new JFormattedTextField();
		formattedTextField_8.setBounds(110, 256, 274, 20);
		contentPane.add(formattedTextField_8);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(253, 23, 171, 2);
		contentPane.add(separator_1);
	}
}
