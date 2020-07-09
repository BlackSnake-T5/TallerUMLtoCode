package actores;

import java.util.*;

public class Administrador extends Persona {

	Collection<Persona> registradoPor;

	public void registraUsuario() {
		// TODO - implement Administrador.registraUsuario
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Persona
	 */
	public void asignarRol(int Persona) {
		// TODO - implement Administrador.asignarRol
		throw new UnsupportedOperationException();
	}

	public Collection<Persona> getRegistradoPor() {
		return registradoPor;
	}

	public void setRegistradoPor(Collection<Persona> registradoPor) {
		this.registradoPor = registradoPor;
	}

}