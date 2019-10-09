package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.JButton;

public class Report extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
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
	public Report() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblName.setBounds(56, 47, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblAfm = new JLabel("AFM:");
		lblAfm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAfm.setBounds(56, 72, 46, 14);
		contentPane.add(lblAfm);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStatus.setBounds(56, 97, 46, 14);
		contentPane.add(lblStatus);
		
		JLabel lblIncome = new JLabel("Income:");
		lblIncome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIncome.setBounds(56, 122, 59, 14);
		contentPane.add(lblIncome);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 23, 187, 2);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(344, 23, 1, 2);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(377, 23, 187, 2);
		contentPane.add(separator_2);
		
		JLabel lblTaxCalculationReport = new JLabel("Tax Calculation Report");
		lblTaxCalculationReport.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblTaxCalculationReport.setBounds(202, 0, 200, 50);
		contentPane.add(lblTaxCalculationReport);
		
		JButton btnNewButton = new JButton("Save");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(459, 510, 105, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNewButton_1.setBounds(344, 510, 105, 34);
		contentPane.add(btnNewButton_1);
	}

}
