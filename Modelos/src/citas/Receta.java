package citas;

import java.util.Date;

import actores.Paciente;

public class Receta {

	protected Paciente recetas;
	protected Date fecha;
	public Paciente getRecetas() {
		return recetas;
	}
	public void setRecetas(Paciente recetas) {
		this.recetas = recetas;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	
}