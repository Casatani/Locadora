package Locadora;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Filme> filmes = new ArrayList<Filme>();
		
		//Adiciona Primeiro Filme
		Filme filme = new Filme("Kill Bill",130,2003,"Jose"); 

		filme.addAtores("Joao");
		filme.addAtores ("Maria");
				
		filmes.add(filme);
		Copia copia = new Copia(filme);

	}

}

