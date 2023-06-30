package view;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

	private JLabel titulo;
	private JLabel imagen;
	private Button agregar_b;
	private Button modificar_b;
	private Button eliminar_b;
	private Button salir_b;
	private JMenu arriendosMenu;
	private JMenuItem mostrarItem;
	private JMenuItem guardarItem;
	private JMenuItem eliminarItem;
	private JMenuItem modificarItem;

	private JMenuBar menuBar;

	public VentanaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1030, 700);
		setLayout(null);
		setLocationRelativeTo(null);
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("img/logo.png"));
		getContentPane().setBackground(new Color(81, 166, 155)); // Establece el color de fondo a púrpura
		titulo = new JLabel("ARRIENDOS");
		titulo.setAlignmentX(Label.CENTER);
		titulo.setFont(new Font("Dialog", Font.PLAIN, 41));
		titulo.setBounds(389, 10, 257, 104);
		titulo.setForeground(Color.WHITE); // Establece el color del texto a blanco

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

		imagen = new JLabel();
		imagen.setAlignmentX(Label.CENTER);
		imagen.setBounds(389, 114, 257, 200);
		ImageIcon i = new ImageIcon("img/logo.png");
		Icon icono = new ImageIcon(
				i.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_DEFAULT));
		imagen.setIcon(icono);
		add(imagen);

		menuBar = new JMenuBar();

		arriendosMenu = new JMenu("Menu");

		mostrarItem = new JMenuItem("Mostrar Arriendos");

		mostrarItem.setActionCommand("mostrar_locales_apartamentos");

		guardarItem = new JMenuItem("Guardar Nuevo Arriendo");
		guardarItem.setActionCommand("guardar_locales_apartamentos");

		eliminarItem = new JMenuItem("Eliminar Arriendo");
		eliminarItem.setActionCommand("eliminar_locales_apartamentos");

		modificarItem = new JMenuItem("Modificar Arriendo");
		modificarItem.setActionCommand("modificar_locales_apartamentos");

		arriendosMenu.add(mostrarItem);
		arriendosMenu.add(guardarItem);
//        arriendosMenu.addSeparator();
		arriendosMenu.add(eliminarItem);
		arriendosMenu.add(modificarItem);

		menuBar.add(arriendosMenu);

		setJMenuBar(menuBar);

		setVisible(true);
	}

	public JMenu getArriendosMenu() {
		return arriendosMenu;
	}

	public void setArriendosMenu(JMenu arriendosMenu) {
		this.arriendosMenu = arriendosMenu;
	}

	public JMenuItem getMostrarItem() {
		return mostrarItem;
	}

	public void setMostrarItem(JMenuItem mostrarItem) {
		this.mostrarItem = mostrarItem;
	}

	public JMenuItem getGuardarItem() {
		return guardarItem;
	}

	public void setGuardarItem(JMenuItem guardarItem) {
		this.guardarItem = guardarItem;
	}

	public JMenuItem getEliminarItem() {
		return eliminarItem;
	}

	public void setEliminarItem(JMenuItem eliminarItem) {
		this.eliminarItem = eliminarItem;
	}

	public JMenuItem getModificarItem() {
		return modificarItem;
	}

	public void setModificarItem(JMenuItem modificarItem) {
		this.modificarItem = modificarItem;
	}



	public JLabel getTitulo() {
		return titulo;
	}

	public void setTitulo(JLabel titulo) {
		this.titulo = titulo;
	}

	public JLabel getImagen() {
		return imagen;
	}

	public void setImagen(JLabel imagen) {
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
