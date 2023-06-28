package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import model.FachadaModel;
import view.FachadaView;

public class Controller implements ActionListener {

	private FachadaView vp;
	private FachadaModel md;

	public Controller() {
		vp = new FachadaView();
		md = new FachadaModel();
		action();
	}

	public void action() {
		vp.getVprin().getAgregar_b().addActionListener(this);
		vp.getVprin().getModificar_b().addActionListener(this);
		vp.getVprin().getEliminar_b().addActionListener(this);
		vp.getVprin().getSalir_b().addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();

		if (comando.equals("Agregar")) {
vp.getVprin().setVisible(false);
vp.getVguard().setVisible(true);
		}

		if (comando.equals("Modificar")) {
			System.out.println(comando);
			
			System.out.println(md.getPagodao().getLista().size());
		}

		if (comando.equals("Eliminar")) {
			System.out.println(comando);
		}

		if (comando.equals("Salir")) {
			System.out.println(comando);
		}
	}

}
