package view;

public class FachadaView {
	private VentanaPrincipal vprin;
	private VentanaGuardar vguard;

	public FachadaView() {
		vprin = new VentanaPrincipal();
		vguard = new VentanaGuardar();
	}

	public VentanaPrincipal getVprin() {
		return vprin;
	}

	public void setVprin(VentanaPrincipal vprin) {
		this.vprin = vprin;
	}

	public VentanaGuardar getVguard() {
		return vguard;
	}

	public void setVguard(VentanaGuardar vguard) {
		this.vguard = vguard;
	}
	

}
