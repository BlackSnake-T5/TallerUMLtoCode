package pagos;

import java.util.Date;

public class PagoTarjeta implements Pago {

	protected float monto;
	protected String numero;
	protected Date expira;
	protected String propietario;
	protected String banco;
	
	
	public boolean realizarPago(float monto) {
		// TODO Auto-generated method stub
		return true;
	}


	public float getMonto() {
		return monto;
	}


	public void setMonto(float monto) {
		this.monto = monto;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public Date getExpira() {
		return expira;
	}


	public void setExpira(Date expira) {
		this.expira = expira;
	}


	public String getPropietario() {
		return propietario;
	}


	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}


	public String getBanco() {
		return banco;
	}


	public void setBanco(String banco) {
		this.banco = banco;
	}
	
	

}