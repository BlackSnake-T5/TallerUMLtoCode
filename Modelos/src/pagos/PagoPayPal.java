package pagos;

public class PagoPayPal implements Pago {

	protected float monto;
	protected String email;
	
	
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


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}