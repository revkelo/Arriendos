package model;

public class ArriendosDTO {
private String nombre_inmueble;
private String direccion;
private String valor;

public ArriendosDTO() {
	// TODO Auto-generated constructor stub
}

public ArriendosDTO(String nombre_inmueble, String direccion, String valor) {
	super();
	this.nombre_inmueble = nombre_inmueble;
	this.direccion = direccion;
	this.valor = valor;
}

public String getNombre_inmueble() {
	return nombre_inmueble;
}

public void setNombre_inmueble(String nombre_inmueble) {
	this.nombre_inmueble = nombre_inmueble;
}

public String getDireccion() {
	return direccion;
}

public void setDireccion(String direccion) {
	this.direccion = direccion;
}

public String getValor() {
	return valor;
}

public void setValor(String valor) {
	this.valor = valor;
}
@Override
public String toString() {
	String res = "";
	res += this.nombre_inmueble + ";" + this.direccion + ";" + this.valor + "\n";
	return res;
}
}
