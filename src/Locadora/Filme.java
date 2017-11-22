package Locadora;

import java.util.ArrayList;

public class Filme {

	private int id_filme;
	private String titulo;
	private int duracao;
	private int ano;
	private String formato;
	private ArrayList<String> atores = new ArrayList <>();
	private ArrayList<Copia> copia = new ArrayList <>();
	
	public Filme(String titulo,int duracao,int ano,String atores){
		this.titulo = titulo;
		this.duracao = duracao;
		this.ano = ano;
		this.atores.add(atores);
	}
		
	public ArrayList<Copia> getCopia() {
		return copia;
	}
	public void setCopia(ArrayList<Copia> copia) {
		this.copia = copia;
	}
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
	public void addAtores(String atores) {
		this.atores.add(atores);
	}
		
	@Override
	public String toString(){
		return "Título: " + this.titulo + ", Duração: " + this.ano + ", Formato: " + this.formato +
				", Ator: " + this.atores;
	}
}
