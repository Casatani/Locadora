package Locadora;

import java.util.ArrayList;

public class Locacao {
	private int id_locacao;
	private int id_socio;
	private int id_copia;
	private String data_loc;
	private ArrayList<Copia> filme_loc = new ArrayList <>();
	
	
	public int getId_locacao() {
		return id_locacao;
	}
	public void setId_locacao(int id_locacao) {
		this.id_locacao = id_locacao;
	}
	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	public int getId_copia() {
		return id_copia;
	}
	public void setId_copia(int id_copia) {
		this.id_copia = id_copia;
	}
	public String getData_loc() {
		return data_loc;
	}
	public void setData_loc(String data_loc) {
		this.data_loc = data_loc;
	}
	public ArrayList<Copia> getFilme_loc() {
		return filme_loc;
	}
	public void setFilme_loc(ArrayList<Copia> filme_loc) {
		this.filme_loc = filme_loc;
	}
	
	
}
