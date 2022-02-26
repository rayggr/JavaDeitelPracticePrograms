package cap2;

public class Cuenta {
	private String nombre;
	

	public Cuenta() {
		this("Sin nombre");
	}
	
	public Cuenta(String nombre) {
		this.nombre = nombre;
	}

	public void establecerNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String obtenerNombre()
	{
		return nombre;
	}
	

}
