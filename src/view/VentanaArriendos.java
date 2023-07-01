package view;

import java.awt.Toolkit;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

import model.ArriendosDTO;

public class VentanaArriendos extends JFrame {

	private JTable table;
	private DefaultTableModel tableModel;
	private JMenuItem salirItem;

	public VentanaArriendos() {
		setTitle("ARRIENDOS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 300);
		setLocationRelativeTo(null);
//		setIconImage(Toolkit.getDefaultToolkit().getImage("img/logo.png"));
		setUndecorated(true);

		tableModel = new DefaultTableModel();
		table = new JTable(tableModel);

		tableModel.addColumn("ID");
		tableModel.addColumn("Nombre");
		tableModel.addColumn("Dirección");
		tableModel.addColumn("Valor");

		JScrollPane scrollPane = new JScrollPane(table);
		getContentPane().add(scrollPane);

		// Crear la barra de menú
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);


		// Crear el item de menú "Salir"
		salirItem = new JMenuItem("Salir");
		salirItem.setActionCommand("salir_mostrar_arriendos");
		menuBar.add(salirItem);

		setVisible(false);

	}

	public void imprimirArriendos(ArrayList<ArriendosDTO> lista) {
		// Agregar los datos de los arriendos a la tabla
		int id = 0;
		for (ArriendosDTO arriendo : lista) {

			id++;

			Object[] rowData = { id, arriendo.getNombre_inmueble(), arriendo.getDireccion(), arriendo.getValor() };
			tableModel.addRow(rowData);
		}
	}
	
	 public void borrar() {
	        tableModel.setRowCount(0);
	    }

	public JTable getTable() {
		return table;
	}

	public void setTable(JTable table) {
		this.table = table;
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	public void setTableModel(DefaultTableModel tableModel) {
		this.tableModel = tableModel;
	}

	public JMenuItem getSalirItem() {
		return salirItem;
	}

	public void setSalirItem(JMenuItem salirItem) {
		this.salirItem = salirItem;
	}

}
