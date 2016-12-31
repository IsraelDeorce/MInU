package model;

import java.util.Date;

public class Usuario {
	
	private int idUsuario;
	private String usuario;
	private String senha;
	private TipoUsuario tipoUsuario;
	private PerfilAcessoEnum perfilAcesso;
	private StatusUsuarioEnum statusUsuario;
	private String matricula;
	private String nome;
	private String email;
	private Date dataInclusao;
	
	public Usuario() {
		this.dataInclusao = new Date();
	}

	public Usuario(int idUsuario) {
		this.idUsuario = idUsuario;
		this.dataInclusao = new Date();
	}

	public Usuario(String usuario, String senha, String matricula, String nome, String email, StatusUsuarioEnum statusUsuario, TipoUsuario tipoUsuario, PerfilAcessoEnum perfilAcesso) {
		super();
		this.usuario = usuario;
		this.senha = senha;
		this.matricula = matricula;
		this.nome = nome;
		this.email = email;
		this.statusUsuario = statusUsuario;
		this.perfilAcesso = perfilAcesso;
		this.tipoUsuario = tipoUsuario;
		this.dataInclusao = new Date();
	}

	public Usuario(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	public PerfilAcessoEnum getPerfilAcesso() {
		return perfilAcesso;
	}

	public void setPerfilAcesso(PerfilAcessoEnum perfilAcesso) {
		this.perfilAcesso = perfilAcesso;
	}

	public StatusUsuarioEnum getStatusUsuario() {
		return statusUsuario;
	}

	public void setStatusUsuario(StatusUsuarioEnum statusUsuario) {
		this.statusUsuario = statusUsuario;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataInclusao() {
		return dataInclusao;
	}

	public void setDataInclusao(Date dataInclusao) {
		this.dataInclusao = dataInclusao;
	}

}
