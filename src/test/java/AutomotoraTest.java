import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.util.ArrayList;

class AutomotoraTest {

    private String nombreArchivo = "vehiculos.json";

    //Test para construir objetos... han ocurrido demasiados errores leyendo el json
    @Test
    void testVehiculo() {
        Vehiculo vehiculo = new Vehiculo("ModeloTest", "MarcaTest", 2020, 10000);

        assertEquals("ModeloTest", vehiculo.getModelo());
        assertEquals("MarcaTest", vehiculo.getMarca());
        assertEquals(2020, vehiculo.getAnio());
        assertEquals(10000, vehiculo.getPrecio());
    }

    @Test
    void testAuto() {
        Auto auto = new Auto("Toyota", "Corolla", 2018, 15000, 4);

        assertEquals("Toyota", auto.getMarca());
        assertEquals("Corolla", auto.getModelo());
        assertEquals(2018, auto.getAnio());
        assertEquals(15000, auto.getPrecio());
        assertEquals(4, auto.getNumeroPuertas());
    }

    @Test
    void testBicicleta() {
        Bicicleta bicicleta = new Bicicleta("Talon", "Giant", 2022, 500, "Montania");

        assertEquals("Giant", bicicleta.getMarca());
        assertEquals("Talon", bicicleta.getModelo());
        assertEquals(2022, bicicleta.getAnio());
        assertEquals(500, bicicleta.getPrecio());
        assertEquals("Montania", bicicleta.getTipoBicicleta());
    }

    @Test
    void testCamion() {
        Camion camion = new Camion("Actros", "Mercedes-Benz", 2019, 75000, 18);

        assertEquals("Mercedes-Benz", camion.getMarca());
        assertEquals("Actros", camion.getModelo());
        assertEquals(2019, camion.getAnio());
        assertEquals(75000, camion.getPrecio());
        assertEquals(18, camion.getCapacidadCargaToneladas());
    }

    //Test lectura de archivo, este test funciona con el json que nos pasaron, ya que despues de ejecutar las pruebas unitarias se agrega un vehiculo y no hay clase para borrar un vehiculo :/
    @Test
    void testLeerVehiculos() {
        Automotora automotora = new Automotora(nombreArchivo);
        automotora.cargarDatos();
        ArrayList<Vehiculo> vehiculos = automotora.getVehiculos();
        assertEquals(6, vehiculos.size(), "La lista debe contener 6 vehículos");
    }

    //Test agregar Vehiculo
    @Test
    void testAgregarVehiculo() {
        Automotora automotora = new Automotora(nombreArchivo);
        automotora.cargarDatos();
        Auto auto = new Auto("Ford", "Fiesta", 2020, 18000, 4);
        int sizeAntes = automotora.getVehiculos().size();
        automotora.agregarVehiculo(auto);
        int sizeDespues = automotora.getVehiculos().size();
        assertEquals(sizeAntes + 1, sizeDespues);
    }

    //Test listar
    @Test
    void testListarVehiculos() {
        Automotora automotora = new Automotora(nombreArchivo);
        automotora.cargarDatos();
        ArrayList<Vehiculo> vehiculos = automotora.getVehiculos();
        assertNotNull(vehiculos);
        assertFalse(vehiculos.isEmpty(), "La lista de vehículos no debe estar vacía");
    }

    @Test
    void testAutomotoraMostrarDetallesVehiculo() {
        Automotora automotora = new Automotora(nombreArchivo);
        automotora.cargarDatos();
        Vehiculo vehiculo = automotora.getVehiculos().get(0);
        assertDoesNotThrow(() -> automotora.mostrarDetallesVehiculos(vehiculo));
    }
}
