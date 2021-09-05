package com.modelo.entidad;

/**
 * @author Peterca
 * @version 1.0
 * @created 31-ago.-2021 13:22:20
 */
public class Usuario {

	private String clave;
	private Persona persona;
	private String tipoUsuario;

	public Usuario() {
		this.clave = "123456";
		this.persona = new Administrador();
		this.persona.setCedula("1234567890");
		this.persona.setNombre("Admin");
		this.tipoUsuario = "admin";
	}

	public Usuario(String cedula, String password) {
		this.clave = password;
		this.persona = new Administrador();
		this.persona.setCedula(cedula);
		this.persona.setNombre("Admin");
		this.tipoUsuario = "admin";
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}// end Usuario