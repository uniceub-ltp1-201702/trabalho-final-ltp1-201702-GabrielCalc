package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import view.ViewIncluirMusica;

public class ExcluirMusica {
	private ViewIncluirMusica vim;
	
	public ExcluirMusica() {
		this.vim = new ViewIncluirMusica();
	}
	
	public ArrayList<String> remover(String fileName){
		
		vim.incluirMusica();
		
		ArrayList<String> gravar = new ArrayList<String>();
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			String linha = br.readLine();
			
			while (linha != null) {
				if (!linha.equals(vim.getNome() + ";" + vim.getArtista() + ";" + vim.getAlbum())) {
					gravar.add(linha);
				}
				linha = br.readLine();
			}
			br.close();
			fr.close();
			FileWriter fw = new FileWriter(fileName, true);
			fw.close();
			
			FileWriter fw1 = new FileWriter(fileName);
			BufferedWriter bw = new BufferedWriter(fw1);
			
			for (int i = 0; i < gravar.size(); i++) {
				bw.write(gravar.get(i));
				bw.newLine();
				
			}
			bw.close();
			fw1.close();
		} catch (Exception e) {
			
		}
		return gravar;
	}

}
