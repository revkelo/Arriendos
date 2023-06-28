package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import java.awt.TextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Button;

public class Build extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Build frame = new Build();
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
	public Build() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Agregar");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(199, 11, 64, 42);
		contentPane.add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(193, 141, 222, 30);
		contentPane.add(comboBox);
		
		TextField textField = new TextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 26));
		textField.setBounds(193, 81, 222, 36);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Precio Arriendo");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(48, 81, 123, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Arriendo");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(48, 135, 123, 36);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(20, 195, 432, 14);
		contentPane.add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("Comprobante");
		btnNewButton.setBounds(170, 217, 123, 23);
		contentPane.add(btnNewButton);
		
		Button button = new Button("Guardar");
		button.setBounds(152, 270, 168, 49);
		contentPane.add(button);
	}
}
