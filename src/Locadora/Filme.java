package Locadora;

import java.util.ArrayList;

public class Filme {

	protected int id_filme;
	protected String titulo;
	protected int duracao;
	protected int ano;
	protected String formato;
	protected ArrayList<String> atores = new ArrayList <>();
	
	public String getTitulo() {
		return titulo;
	}
	public int getId_filme() {
		return id_filme;
	}
	public void setId_filme(int id_filme) {
		this.id_filme = id_filme;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getFormato() {
		return formato;
	}
	public void setFormato(String formato) {
		this.formato = formato;
	}
	public ArrayList<String> getAtores() {
		return atores;
	}
	public void setAtores(ArrayList<String> atores) {
		this.atores = atores;
	}
		
	@Override
	public String toString(){
		return "Título: " + this.titulo + ", Duração: " + this.ano + ", Formato: " + this.formato +
				", Ator: " + this.atores;
	}
}
