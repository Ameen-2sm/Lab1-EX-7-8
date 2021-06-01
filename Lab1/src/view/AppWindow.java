package view;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import controller.CalculateWeight;
import model.Weight;

public class AppWindow extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel marsLbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow frame = new AppWindow();
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
	public AppWindow() {
		setTitle("Human Weight On Mars Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 738, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel earthLbl = new JLabel("Enter weight in Earth : ");
		earthLbl.setFont(new Font("Tahoma", Font.PLAIN, 25));
		earthLbl.setBounds(93, 42, 263, 31);
		contentPane.add(earthLbl);

		marsLbl = new JLabel("Humna weight on Mars : ");
		marsLbl.setVisible(false);
		marsLbl.setFont(new Font("Tahoma", Font.PLAIN, 25));
		marsLbl.setBounds(77, 166, 403, 31);
		contentPane.add(marsLbl);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 25));
		textField.setBounds(357, 42, 200, 31);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				marsLbl.setText("");
				Weight weight = new Weight();
				String w = textField.getText();
				weight.setWeightInEarth(Double.parseDouble(w));
				CalculateWeight calculateWeight = new CalculateWeight();
				Weight marsWeight =  calculateWeight.calculateHumanWeightInMars(weight);
				System.out.println(marsWeight);
				marsLbl.setText("Humna weight on Mars : " + String.format("%.2f", marsWeight.getWeightInMars()) + " Kg");
				marsLbl.setVisible(true);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnNewButton.setBounds(357, 101, 200, 35);
		contentPane.add(btnNewButton);

		JLabel kgLbl = new JLabel("Kg");
		kgLbl.setFont(new Font("Tahoma", Font.PLAIN, 25));
		kgLbl.setBounds(567, 42, 55, 31);
		contentPane.add(kgLbl);
	}
}
