package actores;

import citas.Cita;

public class Paciente extends Persona {

	protected Cita paciente;
	protected String email;

	public boolean solicitarCita() {
		// TODO - implement Paciente.solicitarCita
		throw new UnsupportedOperationException();
	}

	public Cita getPaciente() {
		return paciente;
	}

	public void setPaciente(Cita paciente) {
		this.paciente = paciente;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}