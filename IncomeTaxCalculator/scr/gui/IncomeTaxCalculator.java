package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class IncomeTaxCalculator {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IncomeTaxCalculator window = new IncomeTaxCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public IncomeTaxCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 590, 524);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Income Tax Calculator");
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuFile = new JMenu("File");
		menuBar.add(menuFile);
		
		JMenuItem mntmImportFile = new JMenuItem("Open File");
		menuFile.add(mntmImportFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		menuFile.add(mntmExit);
		
		JMenu mnOptions = new JMenu("Options");
		menuBar.add(mnOptions);
		
		JMenu mnTaxpayer = new JMenu("Taxpayer");
		mnOptions.add(mnTaxpayer);
		
		JMenuItem mntmAdd = new JMenuItem("Add");
		mnTaxpayer.add(mntmAdd);
		
		JMenuItem mntmDelete = new JMenuItem("Delete");
		mnTaxpayer.add(mntmDelete);
		
		JMenu mnReceipt = new JMenu("Receipt");
		mnOptions.add(mnReceipt);
		
		JMenuItem mntmAdd_1 = new JMenuItem("Add");
		mntmAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ReceiptAdding receipt = new ReceiptAdding();
				receipt.setVisible(true);
			}
		});
		mnReceipt.add(mntmAdd_1);
		
		JMenuItem mntmDelete_1 = new JMenuItem("Delete");
		mntmDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ReceiptDeletion deletedReceipt = new ReceiptDeletion();
				deletedReceipt.setVisible(true);
			}
		});
		mnReceipt.add(mntmDelete_1);
		
		JMenu mnNewMenu = new JMenu("Help");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmHelp = new JMenuItem("Help");
		mnNewMenu.add(mntmHelp);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnNewMenu.add(mntmAbout);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPleaseSelectA = new JLabel("Please select a taxpayer from the list:");
		lblPleaseSelectA.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPleaseSelectA.setBounds(25, 21, 211, 23);
		frame.getContentPane().add(lblPleaseSelectA);
		
		JLabel lblPersonalDetails = new JLabel("Personal Details");
		lblPersonalDetails.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPersonalDetails.setBounds(238, 69, 211, 14);
		frame.getContentPane().add(lblPersonalDetails);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblName.setBounds(56, 105, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblAfm = new JLabel("AFM:");
		lblAfm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAfm.setBounds(56, 130, 46, 14);
		frame.getContentPane().add(lblAfm);
		
		JLabel lblStatus = new JLabel("Status:");
		lblStatus.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblStatus.setBounds(56, 155, 46, 14);
		frame.getContentPane().add(lblStatus);
		
		JLabel lblIncome = new JLabel("Income:");
		lblIncome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblIncome.setBounds(56, 180, 59, 14);
		frame.getContentPane().add(lblIncome);
		
		JLabel lblReceipts = new JLabel("Receipts:");
		lblReceipts.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblReceipts.setBounds(56, 205, 59, 23);
		frame.getContentPane().add(lblReceipts);
		
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Report report = new Report();
				report.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(429, 425, 135, 31);
		frame.getContentPane().add(btnNewButton);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(573, 55, 1, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 81, 218, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setBounds(346, 81, 219, 2);
		frame.getContentPane().add(separator_2);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(246, 23, 319, 20);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(143, 207, 357, 20);
		frame.getContentPane().add(comboBox_1);
		
		JFormattedTextField formattedTextField = new JFormattedTextField();
		formattedTextField.setBounds(143, 128, 357, 20);
		frame.getContentPane().add(formattedTextField);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField();
		formattedTextField_1.setBounds(143, 153, 357, 20);
		frame.getContentPane().add(formattedTextField_1);
		
		JFormattedTextField formattedTextField_2 = new JFormattedTextField();
		formattedTextField_2.setBounds(143, 178, 357, 20);
		frame.getContentPane().add(formattedTextField_2);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField();
		formattedTextField_3.setBounds(143, 103, 357, 20);
		frame.getContentPane().add(formattedTextField_3);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBounds(10, 253, 218, 2);
		frame.getContentPane().add(separator_3);
		
		JLabel lblTaxCalculation = new JLabel("Tax Calculation");
		lblTaxCalculation.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTaxCalculation.setBounds(233, 227, 200, 50);
		frame.getContentPane().add(lblTaxCalculation);
		
		JSeparator separator_4 = new JSeparator();
		separator_4.setBounds(340, 253, 225, 2);
		frame.getContentPane().add(separator_4);
		
		JLabel lblPleaseSelectOne = new JLabel("Please select one or more options for tax calculation");
		lblPleaseSelectOne.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPleaseSelectOne.setBounds(155, 266, 505, 23);
		frame.getContentPane().add(lblPleaseSelectOne);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Total Tax");
		chckbxNewCheckBox.setBounds(93, 306, 150, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Tax analysis(Basic tax, tax increase or decrease based on receipts)");
		chckbxNewCheckBox_1.setBounds(92, 332, 357, 23);
		frame.getContentPane().add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Total value of the gathered receipts");
		chckbxNewCheckBox_2.setBounds(93, 358, 271, 23);
		frame.getContentPane().add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Analysis of the amounts spent for different categories of expenditure");
		chckbxNewCheckBox_3.setBounds(93, 384, 421, 23);
		frame.getContentPane().add(chckbxNewCheckBox_3);
		
		
	}
}
