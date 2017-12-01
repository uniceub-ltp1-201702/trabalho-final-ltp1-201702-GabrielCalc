package util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

import view.ViewIncluirArtista;

public class ExcluirArtista {
	private ViewIncluirArtista via;
	
	public ExcluirArtista() {
		this.via = new ViewIncluirArtista();
	}
	
	public ArrayList<String> remover(String fileName){
		
		via.incluirArtista();
		
		ArrayList<String> gravar = new ArrayList<String>();
		
		try {
			FileReader fr = new FileReader(fileName);
			BufferedReader br = new BufferedReader(fr);
			
			String linha = br.readLine();
			
			while (linha != null) {
				if(!linha.equals(via.getNome() + ";" + via.getCPF() + ";" + via.getIdade())) {
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
		} catch(Exception e) {
			
		}
		return gravar;
	}

}
