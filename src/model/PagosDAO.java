package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import model.persistance.FileHandler;

public class PagosDAO {

	private ArrayList<PagosDTO> lista;

	public PagosDAO() {
		lista = new ArrayList<PagosDTO>();
		loadFile();
	}

	public String contentBase() {
		String res = "";
		for (PagosDTO s : lista) {
			res += s.toString();
		}
		return res;
	}

	public void writeFile() {
		String content = contentBase();
		FileHandler.writeFile("datos.csv", content);
	}

	public void loadFile() {
		String content = FileHandler.loadFile("datos.csv");
		String[] lines = content.split("\n");
		for (String s : lines) {
			if (s.equals(""))
				continue;
			String[] columnas = s.split(";");
			lista.add(new PagosDTO(columnas[0],Integer.parseInt(columnas[1]) , columnas[2], columnas[3]));

		}

	}

	public void crear(String arriendo, int pago, String comprobante, String fecha) {
		PagosDTO aux = new PagosDTO(arriendo, pago, comprobante, fecha);
		lista.add(aux);
		writeFile();
	}

	public boolean eliminar(int pos) {
		try {

			lista.remove(pos);
			return true;
		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "No se pudo eliminar");

		}
		return false;

	}

	public boolean actualizar(int pos, String actulizar_arriendo) {
		try {
			lista.get(pos).setArriendo(actulizar_arriendo);
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo actualizar");
			return false;
		}

	}

	public ArrayList<PagosDTO> getLista() {
		return lista;
	}

	public void setLista(ArrayList<PagosDTO> lista) {
		this.lista = lista;
	}

}
