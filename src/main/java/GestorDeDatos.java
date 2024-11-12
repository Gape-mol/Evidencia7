import java.io.File;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GestorDeDatos {
	private static final ObjectMapper mapper = new ObjectMapper();

	/*public static void crearArchivo(String nombreArchivo) {
		try {
			File archivo = new File(nombreArchivo);
			if (archivo.createNewFile()) {
				System.out.println("Archivo creado:" + archivo.getName());
			} else {
				System.out.println("El archivo ya existe.");
			}
		} catch (Exception e) {
			System.err.println("Error al crear el archivo:" + nombreArchivo + " " + e.getMessage());
		}
	}*/

	//Guardar Vehiculo Individual
	public static void guardarVehiculo(Vehiculo vehiculo, String nombreArchivo) {
		try {
			mapper.writeValue(new File(nombreArchivo), vehiculo);
			System.out.println("Vehiculo guardados en:" + nombreArchivo);
		} catch (Exception e) {
			System.err.println("Error al guardar el vehículo en:" + nombreArchivo + " " + e.getMessage());
		}
	}

	//Guardar Vehiculo Lista
	public static void guardarVehiculos(ArrayList<Vehiculo> vehiculos, String nombreArchivo) {
		try {
			mapper.writeValue(new File(nombreArchivo), vehiculos);
			System.out.println("Lista de vehiculos guardados en:" + nombreArchivo);
		} catch (Exception e) {
			System.err.println("Error al guardar la lista de vehículos en:" + nombreArchivo + " " + e.getMessage());
		}
	}

	//Metodo que lee una lista de vehiculos
	public static ArrayList<Vehiculo> leerVehiculos(String nombreArchivo) {
		try {
			return mapper.readValue(new File(nombreArchivo),
					mapper.getTypeFactory().constructCollectionType(ArrayList.class, Vehiculo.class));
		} catch (Exception e) {
			System.err.println("Error al leer la lista de vehículos desde:" + nombreArchivo + " " + e.getMessage());
			return null;
		}
	}

	public static Vehiculo leerVehiculo(String nombreArchivo) {
		try {
			return mapper.readValue(new File(nombreArchivo), Vehiculo.class);
		} catch (Exception e) {
			System.err.println("Error al leer el vehículo desde:" + nombreArchivo + " " + e.getMessage());
			return null;
		}
	}



}