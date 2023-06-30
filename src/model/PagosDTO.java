package model;

public class PagosDTO {
	private String arriendo;
	private int pago;
	private String comprobante;
	private String fecha;
	
	public PagosDTO() {
		// TODO Auto-generated constructor stub
	}

	public PagosDTO(String arriendo, int pago, String comprobante, String fecha) {
		super();
		this.arriendo = arriendo;
		this.pago = pago;
		this.comprobante = comprobante;
		this.fecha = fecha;
	}

	public String getArriendo() {
		return arriendo;
	}

	public void setArriendo(String arriendo) {
		this.arriendo = arriendo;
	}

	public int getPago() {
		return pago;
	}

	public void setPago(int pago) {
		this.pago = pago;
	}

	public String getComprobante() {
		return comprobante;
	}

	public void setComprobante(String comprobante) {
		this.comprobante = comprobante;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
@Override
public String toString() {
	String res = "";
	res += this.arriendo + ";" + this.pago + ";" + this.comprobante + ";" + this.fecha + "\n";
	return res;
}
}
