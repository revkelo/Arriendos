package model;

import java.util.ArrayList;

import javax.swing.JOptionPane;



public class PagosDAO {
	
	private ArrayList<PagosDTO> lista;


	public void crear(String arriendo, int pago, String comprobante, String fecha) {
		PagosDTO aux = new PagosDTO(arriendo, pago, comprobante, fecha);
		lista.add(aux);
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

}
