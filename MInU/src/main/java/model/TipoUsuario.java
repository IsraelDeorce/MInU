package model;

import java.util.Date;


public class TipoUsuario{

	private int idTipoUsuario;
	private String nome;
	private String descricao;
	private Date dataInclusao;
	
	public TipoUsuario() {
		
	}
	
	public TipoUsuario(int idTipoUsuario, String nome, String descricao) {
		this.idTipoUsuario = idTipoUsuario;
		this.nome = nome;
		this.descricao = descricao;
		this.dataInclusao = new Date();
	}

	public int getIdTipoUsuario() {
		return idTipoUsuario;
	}

	public void setIdTipoUsuario(int idTipoUsuario) {
		this.idTipoUsuario = idTipoUsuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}	
	
}
