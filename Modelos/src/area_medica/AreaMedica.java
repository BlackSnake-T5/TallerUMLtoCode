package area_medica;

import java.util.*;

import actores.Doctor;

public class AreaMedica {

	private Collection<Doctor> areas;
	protected String especilidad;
	protected float costo;
	public Collection<Doctor> getAreas() {
		return areas;
	}
	public void setAreas(Collection<Doctor> areas) {
		this.areas = areas;
	}
	public String getEspecilidad() {
		return especilidad;
	}
	public void setEspecilidad(String especilidad) {
		this.especilidad = especilidad;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	
	

}