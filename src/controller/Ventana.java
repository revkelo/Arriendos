package controller;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.Panel;
import java.awt.Font;
import java.awt.Button;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Ventana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
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
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 700);
		getContentPane().setLayout(null);

		Label label = new Label("ARRIENDOS");
		label.setAlignment(Label.CENTER);
		label.setFont(new Font("Dialog", Font.PLAIN, 41));
		label.setBounds(389, 10, 257, 104);
		getContentPane().add(label);

		Button button = new Button("New button");
		button.setBounds(28, 359, 187, 216);
		getContentPane().add(button);

		Button button_1 = new Button("New button");
		button_1.setBounds(305, 359, 187, 216);
		getContentPane().add(button_1);

		Button button_2 = new Button("New button");
		button_2.setBounds(573, 359, 187, 216);
		getContentPane().add(button_2);

		Button button_3 = new Button("New button");
		button_3.setBounds(804, 359, 187, 216);
		getContentPane().add(button_3);

		Label label_1 = new Label("IMG");
		label_1.setAlignment(Label.CENTER);
		label_1.setBounds(389, 114, 257, 200);
		getContentPane().add(label_1);
	}
}
