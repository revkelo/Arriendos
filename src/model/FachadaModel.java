package model;

public class FachadaModel {

	private PagosDTO pagodto;
	private PagosDAO pagodao;

	private ArriendosDTO arridto;
	private ArriendosDAO arridao;

	public FachadaModel() {
		pagodto = new PagosDTO();
		pagodao = new PagosDAO();

		arridto = new ArriendosDTO();
		arridao = new ArriendosDAO();

	}

	public ArriendosDTO getArridto() {
		return arridto;
	}

	public void setArridto(ArriendosDTO arridto) {
		this.arridto = arridto;
	}

	public ArriendosDAO getArridao() {
		return arridao;
	}

	public void setArridao(ArriendosDAO arridao) {
		this.arridao = arridao;
	}

	public PagosDTO getPagodto() {
		return pagodto;
	}

	public void setPagodto(PagosDTO pagodto) {
		this.pagodto = pagodto;
	}

	public PagosDAO getPagodao() {
		return pagodao;
	}

	public void setPagodao(PagosDAO pagodao) {
		this.pagodao = pagodao;
	}

}
