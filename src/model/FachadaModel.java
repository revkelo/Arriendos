package model;

public class FachadaModel {

	private PagosDTO pagodto;
	private PagosDAO pagodao;

	public FachadaModel() {
		pagodto = new PagosDTO();
		pagodao = new PagosDAO();

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
