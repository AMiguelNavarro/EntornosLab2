package com.laboratorioEntornos.clases;

public class Cliente extends Persona{
	
	private String localidad;
	
	public Cliente(String nombre, String apellidos, int edad, String localidad){
		super (nombre, apellidos, edad);
		this.localidad=localidad;
	}
	
	
	public void pedirCafeAMaquina(int cantidadCafes) {
	}
	
	public void seleccionarCafe(int cantidadCafe) {
	}
	
	public void pedirCafeAMaquina(int cantidadAzucar) {
	}
	

	
	
}
