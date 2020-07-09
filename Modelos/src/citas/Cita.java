package citas;

import java.util.Date;

import actores.Doctor;
import actores.Paciente;

public class Cita {

	protected Doctor citasPendientes;
	protected Paciente cita;
	protected Date fecha;
	protected boolean pagada;
	protected String registradoPor;

	/**
	 * 
	 * @param Pago
	 */
	public void realizarPago(int Pago) {
		// TODO - implement Cita.realizarPago
		throw new UnsupportedOperationException();
	}

	public Doctor getCitasPendientes() {
		return citasPendientes;
	}

	public void setCitasPendientes(Doctor citasPendientes) {
		this.citasPendientes = citasPendientes;
	}

	public Paciente getCita() {
		return cita;
	}

	public void setCita(Paciente cita) {
		this.cita = cita;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}

	public String getRegistradoPor() {
		return registradoPor;
	}

	public void setRegistradoPor(String registradoPor) {
		this.registradoPor = registradoPor;
	}

	
	
}