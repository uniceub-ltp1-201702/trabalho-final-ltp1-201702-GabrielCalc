package control;

import model.BD;

public class ControleExcluirMusica {

	private BD bd;

	public ControleExcluirMusica(BD bd) {
		this.bd = bd;
	}

	public void excluirMusica() {

		this.bd.excluirMusica();

	}

}
