import com.fasterxml.jackson.annotation.JsonProperty;

public class Auto extends Vehiculo {
	private String tipo;

	@JsonProperty("numeroPuertas")
	private int numeroPuertas;

	public Auto(String marca, String modelo, int year, int precio, int numeroPuertas) {
		super(modelo, marca, year, precio);
		this.tipo = "Auto";
		this.numeroPuertas = numeroPuertas;
	}
	//Constructor sin parametros. Al parecer jackson lo requiere
	public Auto() {
		super("", "", 0, 0);
		this.tipo = "Auto";
		this.numeroPuertas = 0;
	}

	public String getTipo() {
		return tipo;
	}

	public int getNumeroPuertas(){
		return numeroPuertas;
	}

	@Override
	public String toString() {
		return "Auto{"+ super.toString() + "Puertas= " + numeroPuertas + '}';
	}

}