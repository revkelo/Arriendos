package view;

import java.awt.Button;
import java.awt.Font;
import java.awt.Label;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {
	private Label titulo, imagen;
	private Button agregar_b, modificar_b, eliminar_b, salir_b;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 700);
		setLayout(null);

		titulo = new Label("ARRIENDOS");
		titulo.setAlignment(Label.CENTER);
		titulo.setFont(new Font("Dialog", Font.PLAIN, 41));
		titulo.setBounds(389, 10, 257, 104);
	
		add(titulo);

		agregar_b = new Button("Agregar");
		agregar_b.setBounds(28, 359, 187, 216);
		agregar_b.setActionCommand("Agregar");
		add(agregar_b);

		modificar_b = new Button("Modificar");
		modificar_b.setBounds(305, 359, 187, 216);
		modificar_b.setActionCommand("Modificar");
		add(modificar_b);

		eliminar_b = new Button("Eliminar");
		eliminar_b.setBounds(573, 359, 187, 216);
		eliminar_b.setActionCommand("Eliminar");
		add(eliminar_b);

		salir_b = new Button("Salir");
		salir_b.setBounds(804, 359, 187, 216);
		salir_b.setActionCommand("Salir");
		add(salir_b);

		imagen = new Label("IMG");
		imagen.setAlignment(Label.CENTER);
		imagen.setBounds(389, 114, 257, 200);
		add(imagen);

		setVisible(true);
	}

	public Label getTitulo() {
		return titulo;
	}

	public void setTitulo(Label titulo) {
		this.titulo = titulo;
	}

	public Label getImagen() {
		return imagen;
	}

	public void setImagen(Label imagen) {
		this.imagen = imagen;
	}

	public Button getAgregar_b() {
		return agregar_b;
	}

	public void setAgregar_b(Button agregar_b) {
		this.agregar_b = agregar_b;
	}

	public Button getModificar_b() {
		return modificar_b;
	}

	public void setModificar_b(Button modificar_b) {
		this.modificar_b = modificar_b;
	}

	public Button getEliminar_b() {
		return eliminar_b;
	}

	public void setEliminar_b(Button eliminar_b) {
		this.eliminar_b = eliminar_b;
	}

	public Button getSalir_b() {
		return salir_b;
	}

	public void setSalir_b(Button salir_b) {
		this.salir_b = salir_b;
	}

	
}
