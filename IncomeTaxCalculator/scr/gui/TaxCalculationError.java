package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;

public class TaxCalculationError extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaxCalculationError frame = new TaxCalculationError();
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
	public TaxCalculationError() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 452, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		this.setTitle("Income Tax Calculator");
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(TaxCalculationError.class.getResource("/javax/swing/plaf/metal/icons/ocean/error.png")));
		lblNewLabel.setBounds(81, 35, 52, 52);
		contentPane.add(lblNewLabel);
		
		JLabel lblError = new JLabel("Error:");
		lblError.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblError.setBounds(217, 35, 46, 14);
		contentPane.add(lblError);
		
		JLabel lblYouHaventSelected = new JLabel("You haven't selected option for tax calculation.");
		lblYouHaventSelected.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblYouHaventSelected.setBounds(125, 49, 301, 27);
		contentPane.add(lblYouHaventSelected);
		
		JLabel lblPleaseTryAgain = new JLabel("Please try again.");
		lblPleaseTryAgain.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPleaseTryAgain.setBounds(189, 71, 200, 22);
		contentPane.add(lblPleaseTryAgain);
		
		JButton btnNewButton = new JButton("OK");
		btnNewButton.setBounds(337, 105, 89, 23);
		contentPane.add(btnNewButton);
	}
}
