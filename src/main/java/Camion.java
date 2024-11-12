import com.fasterxml.jackson.annotation.JsonProperty;

public class Camion extends Vehiculo {
	private String tipo;
	@JsonProperty("capacidadCargaToneladas")
	private int capacidadCargaToneladas;

	public Camion(String modelo, String marca, int year, int precio, int capacidadCargaToneladas) {
		super(modelo, marca, year, precio);
		this.tipo = "Camion";
		this.capacidadCargaToneladas = capacidadCargaToneladas;
	}

	//aaa, porque tanto constructor sin nada
	public Camion() {
		super("", "", 0, 0);
		this.tipo = "Camion";
		this.capacidadCargaToneladas = 0;
	}

	public String getTipo() {
		return tipo;
	}

	public int getCapacidadCargaToneladas(){
		return capacidadCargaToneladas;
	}

	@Override
	public String toString() {
		return "Camion{"+ super.toString() + "Capacidad de carga: " + capacidadCargaToneladas + '}';
	}
}