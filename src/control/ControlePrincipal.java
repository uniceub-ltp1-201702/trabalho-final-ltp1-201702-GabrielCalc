package control;

import javax.swing.JOptionPane;

import model.BD;
import view.ViewPrincipal;

public class ControlePrincipal {
	private BD bds;
	private ViewPrincipal vp;
	private ControleArtista ca;
	private ControleMusica cm;
	private ControleExcluirArtista cea;
	private ControleExcluirMusica cem;
	private ControleExibirMusica cexm;

	public ControlePrincipal() {
		this.bds = new BD();
		this.vp = new ViewPrincipal();
		this.ca = new ControleArtista(this.bds);
		this.cm = new ControleMusica(this.bds);
		this.cea = new ControleExcluirArtista(this.bds);
		this.cem = new ControleExcluirMusica(this.bds);
		this.cexm = new ControleExibirMusica(this.bds);

		tratarOpcao(this.vp.getOpcao());
	}

	public void tratarOpcao(String opcao) {

		while (true) {
			switch (opcao) {
			case "1":
				tratarEscolha(this.vp.getEscolha());
				break;
			case "2":
				tratarExclusao(this.vp.getExclusao());
				break;
			case "3":
				tratarConsulta(this.vp.getConsulta());
				break;
			case "4":
				JOptionPane.showMessageDialog(null, "Até breve!");
				return;
			default:
				JOptionPane.showMessageDialog(null, "Favor difitar um valor válido");
				break;
			}

			opcao = this.vp.getOpcao();
		}

	}

	public void tratarEscolha(String escolha) {
		this.bds.carregarMusica();

		while (true) {
			switch (escolha) {
			case "1":

				this.ca.cadastrarArtista();
				break;
			case "2":
				this.cm.cadastrarMusica();
				break;
			case "3":
				return;
			default:
				JOptionPane.showMessageDialog(null, "Favor digitar um valor válido");
				break;
			}
			escolha = this.vp.getOpcao();
		}
	}

	public void tratarExclusao(String exclusao) {
		while (true) {
			switch (exclusao) {
			case "1":
				this.cea.excluirArtista();
				JOptionPane.showMessageDialog(null, "Artista excluído com sucesso!");
				break;
			case "2":
				this.cem.excluirMusica();
				JOptionPane.showMessageDialog(null, "Música excluída com sucesso!");
				break;
			case "3":
				return;
			default:
				JOptionPane.showMessageDialog(null, "Favor digitar um valor válido");
				break;
			}
			exclusao = this.vp.getOpcao();
		}
	}

	public void tratarConsulta(String consulta) {

		bds.carregarMusica();

		while (true) {
			switch (consulta) {
			case "1":
				this.cexm.musicaPorArtista();
				break;
			case "2":
				this.cexm.MusicaPorNome();
				break;
			case "3":
				this.cexm.exibirMusicaPorLetra();
				break;
			case "4":
				return;
			default:
				JOptionPane.showMessageDialog(null, "Favor digitar um valor válido");
				break;
			}
			consulta = this.vp.getOpcao();
		}
	}

}
