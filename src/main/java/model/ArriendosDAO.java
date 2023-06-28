package model;

import java.util.ArrayList;


import javax.swing.JOptionPane;

import model.persistance.FileHandler;

public class ArriendosDAO {

	private ArrayList<ArriendosDTO> lista;


	public ArriendosDAO() {
		lista = new ArrayList<ArriendosDTO>();

		cargarArriendo();
	}



	public String contenidoArriendos() {
		String res = "";
		for (ArriendosDTO s : lista) {
			res += s.toString();
		}
		return res;
	}

	public void escribirArriendo() {
		String content = contenidoArriendos();
		FileHandler.writeFile("arriendos.csv", content);
	}


	public void cargarArriendo() {
		String content = FileHandler.loadFile("arriendos.csv");
		String[] lines = content.split("\n");
		for (String s : lines) {
			if (s.equals(""))
				continue;
			String[] columnas = s.split(";");
			lista.add(new ArriendosDTO(columnas[0],columnas[1] , columnas[2]));

		}

	}

	public void crear(String nombre_inmueble, String direccion, String valor) {
		ArriendosDTO aux = new ArriendosDTO(nombre_inmueble, direccion, valor);
		lista.add(aux);
		escribirArriendo();
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
//			lista.get(pos).setArriendo(actulizar_arriendo);
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "No se pudo actualizar");
			return false;
		}

	}

	public ArrayList<ArriendosDTO> getLista() {
		return lista;
	}

	public void setLista(ArrayList<ArriendosDTO> lista) {
		this.lista = lista;
	}

}
