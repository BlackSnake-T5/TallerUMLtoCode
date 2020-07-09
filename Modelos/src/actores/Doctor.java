package actores;

import java.util.*;

import area_medica.AreaMedica;
import citas.Cita;

public class Doctor extends Persona {

	protected Collection<Cita> doctor;
	protected AreaMedica doctores;
	protected int regDoctor;
	protected String especialidad;

	public void recetar() {
		// TODO - implement Doctor.recetar
		throw new UnsupportedOperationException();
	}

	public void agregarPlanNut() {
		// TODO - implement Doctor.agregarPlanNut
		throw new UnsupportedOperationException();
	}

	public void imprimirReceta() {
		// TODO - implement Doctor.imprimirReceta
		throw new UnsupportedOperationException();
	}

	public void registraSecretaria() {
		// TODO - implement Doctor.registraSecretaria
		throw new UnsupportedOperationException();
	}

	public Collection<Cita> getDoctor() {
		return doctor;
	}

	public void setDoctor(Collection<Cita> doctor) {
		this.doctor = doctor;
	}

	public AreaMedica getDoctores() {
		return doctores;
	}

	public void setDoctores(AreaMedica doctores) {
		this.doctores = doctores;
	}

	public int getRegDoctor() {
		return regDoctor;
	}

	public void setRegDoctor(int regDoctor) {
		this.regDoctor = regDoctor;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	

}