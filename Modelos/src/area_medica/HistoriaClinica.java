package area_medica;

import java.util.ArrayList;

import actores.Paciente;

public class HistoriaClinica {

	protected Paciente historiaClinica;
	protected int nro;
	protected ArrayList<String> enfermedades;
	protected ArrayList<String> alergias;
	protected ArrayList<String> otros;
	public Paciente getHistoriaClinica() {
		return historiaClinica;
	}
	public void setHistoriaClinica(Paciente historiaClinica) {
		this.historiaClinica = historiaClinica;
	}
	public int getNro() {
		return nro;
	}
	public void setNro(int nro) {
		this.nro = nro;
	}
	public ArrayList<String> getEnfermedades() {
		return enfermedades;
	}
	public void setEnfermedades(ArrayList<String> enfermedades) {
		this.enfermedades = enfermedades;
	}
	public ArrayList<String> getAlergias() {
		return alergias;
	}
	public void setAlergias(ArrayList<String> alergias) {
		this.alergias = alergias;
	}
	public ArrayList<String> getOtros() {
		return otros;
	}
	public void setOtros(ArrayList<String> otros) {
		this.otros = otros;
	}

	
	
}