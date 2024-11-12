import java.util.ArrayList;

public class Automotora {
	private ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
	private final String nombreArchivo;

	//Constructor
	public Automotora(String nombreArchivo) {
		this.vehiculos = GestorDeDatos.leerVehiculos(nombreArchivo);
		this.nombreArchivo = nombreArchivo;
	}

	//Getters
	public ArrayList<Vehiculo> getVehiculos() {
		return vehiculos;
	}

	//Metodos
	public void agregarVehiculo(Vehiculo vehiculo) {
		try {
			vehiculos.add(vehiculo);
			GestorDeDatos.guardarVehiculos(vehiculos, nombreArchivo);
		} catch (Exception e) {
			System.err.println("Error al agregar vehiculo: " + e.getMessage());
		}
	}

	public void listarVehiculos(String tipo, ArrayList<? extends  Vehiculo> vehiculos) {
		System.out.println(tipo + ":");
		for (Vehiculo vehiculo : vehiculos) {
			System.out.println(vehiculo);
		}
		System.out.println();
	}

	public void mostrarDetallesVehiculos(Vehiculo vehiculo) {
		System.out.println(vehiculo.toString());
	}

	public void cargarDatos() {
		try {
			GestorDeDatos.leerVehiculos(nombreArchivo);
		} catch (Exception e) {
			System.err.println("Error al cargar datos: " + e.getMessage());
		}
	}



}