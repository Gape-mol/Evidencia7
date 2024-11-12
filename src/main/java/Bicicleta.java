import com.fasterxml.jackson.annotation.JsonProperty;

public class Bicicleta extends Vehiculo {
	private String tipo;
	@JsonProperty("tipoBicicleta")
	private String tipoBicicleta;

	public Bicicleta(String modelo, String marca, int year, int precio, String tipoBicicleta) {
		super(modelo, marca, year, precio);
		this.tipo = "Bicicleta";
		this.tipoBicicleta = tipoBicicleta;
	}

	//...
	public Bicicleta() {
		super("", "", 0, 0);
		this.tipo = "Bicicleta";
		this.tipoBicicleta = "";
	}

	public String getTipo() {
		return tipo;
	}

	public String getTipoBicicleta(){
		return tipoBicicleta;
	}

	@Override
	public String toString () {
		return "Bicicleta{"+ super.toString() + "Tipo de bicicleta: " + tipoBicicleta + '}';
	}
}