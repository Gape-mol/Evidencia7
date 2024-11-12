import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "tipo")
@JsonSubTypes({
		@JsonSubTypes.Type(value = Auto.class, name = "Auto"),
		@JsonSubTypes.Type(value = Bicicleta.class, name = "Bicicleta"),
		@JsonSubTypes.Type(value = Camion.class, name = "Camion")
})

public class Vehiculo {
	private String modelo;
	private String marca;
	private int anio;
	private int precio;

	public Vehiculo(String modelo, String marca, int anio, int precio) {
		this.modelo = modelo;
		this.marca = marca;
		this.anio = anio;
		this.precio = precio;
	}

	//Constructor sin nada
	public Vehiculo() {
		this.modelo = "";
		this.marca = "";
		this.anio = 0;
		this.precio = 0;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getPrecio() {
		return this.precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Modelo= " + modelo + ", Marca= " + marca + ", Año= " + anio + ", Precio= " + precio;
	}
}