package control;

import model.BD;

public class ControleExcluirArtista {
	
		private BD bd;
		
		
		public ControleExcluirArtista(BD bd){
			this.bd = bd;
		}
		
		
		public void excluirArtista() {
			
			this.bd.excluirArtista();

		}

}
