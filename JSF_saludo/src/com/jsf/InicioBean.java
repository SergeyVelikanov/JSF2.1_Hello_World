/**
 * 
 */
package com.jsf;

import java.io.Serializable;

/**
 *
 */
public class InicioBean implements Serializable{	
	private static final long serialVersionUID = -8517600785953946612L;
	private String nombre; // nombre del usuario
	private Integer edad; // edad del usuario	

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public Integer getEdad(){
		return edad;
	}

	public void setEdad(Integer edad){
		this.edad=edad;
	}

}
