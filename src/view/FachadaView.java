package view;

public class FachadaView {
	private VentanaPrincipal vprin;
	private VentanaGuardar vguard;
	private VentanaArriendos varriend;

	public FachadaView() {
		vprin = new VentanaPrincipal();
		vguard = new VentanaGuardar();
		varriend = new VentanaArriendos();
	}

	public VentanaArriendos getVarriend() {
		return varriend;
	}

	public void setVarriend(VentanaArriendos varriend) {
		this.varriend = varriend;
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
