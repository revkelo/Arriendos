package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class VentanaGuardar extends JFrame {

	JLabel titulo, valor, arriendo, ruta;
	JComboBox arriendosCombo;
	TextField precioText;
	JButton comprobante;
	Button guardar;

	public VentanaGuardar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 393);
		setResizable(false);
		setVisible(false);
		setLayout(null);
		setLocationRelativeTo(null);

		titulo = new JLabel("Agregar");
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		titulo.setBounds(199, 11, 64, 42);
		add(titulo);

		arriendosCombo = new JComboBox<String>();

		arriendosCombo.setBounds(193, 141, 222, 30);
		add(arriendosCombo);

		precioText = new TextField();
		precioText.setBounds(193, 81, 222, 36);
		precioText.setFont(new Font("Dialog", Font.PLAIN, 26));



		add(precioText);

		valor = new JLabel("Precio Arriendo");
		valor.setHorizontalAlignment(SwingConstants.RIGHT);
		valor.setFont(new Font("Tahoma", Font.PLAIN, 15));
		valor.setBounds(48, 81, 123, 36);
		add(valor);

		arriendo = new JLabel("Arriendo");
		arriendo.setHorizontalAlignment(SwingConstants.RIGHT);
		arriendo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		arriendo.setBounds(48, 135, 123, 36);
		add(arriendo);

		ruta = new JLabel("");
		ruta.setFont(new Font("Tahoma", Font.PLAIN, 10));
		ruta.setHorizontalAlignment(SwingConstants.CENTER);
		ruta.setBounds(20, 195, 432, 14);
		add(ruta);

		comprobante = new JButton("Comprobante");
		comprobante.setBounds(170, 217, 123, 23);
		comprobante.setActionCommand("Comprobante");
		add(comprobante);

		guardar = new Button("Guardar");
		guardar.setBounds(152, 270, 168, 49);
		guardar.setActionCommand("Guardar_1");
		add(guardar);
	}

	public static String formatearNumeroConComas(int numero) {
		DecimalFormat formato = new DecimalFormat("#,###");
		return formato.format(numero);
	}

	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getValor() {
		return valor;
	}

	public void setValor(JLabel valor) {
		this.valor = valor;
	}

	public JLabel getArriendo() {
		return arriendo;
	}

	public void setArriendo(JLabel arriendo) {
		this.arriendo = arriendo;
	}

	public JLabel getRuta() {
		return ruta;
	}

	public void setRuta(JLabel ruta) {
		this.ruta = ruta;
	}

	public JComboBox getArriendosCombo() {
		return arriendosCombo;
	}

	public void setArriendosCombo(JComboBox arriendosCombo) {
		this.arriendosCombo = arriendosCombo;
	}

	public TextField getPrecioText() {
		return precioText;
	}

	public void setPrecioText(TextField precioText) {
		this.precioText = precioText;
	}

	public JButton getComprobante() {
		return comprobante;
	}

	public void setComprobante(JButton comprobante) {
		this.comprobante = comprobante;
	}

	public Button getGuardar() {
		return guardar;
	}

	public void setGuardar(Button guardar) {
		this.guardar = guardar;
	}

}
