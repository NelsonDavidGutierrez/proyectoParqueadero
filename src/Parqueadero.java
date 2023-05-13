import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private List<Vehiculo> vehiculos = new ArrayList<>();

    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    public void editarVehiculo(Vehiculo vehiculo) {
        // Lógica para editar la información de un vehículo
    }

    public void eliminarVehiculo(Vehiculo vehiculo) {
        vehiculos.remove(vehiculo);
    }

    public Estacionamiento registrarEntrada(Vehiculo vehiculo) {
        Estacionamiento estacionamiento = new Estacionamiento(LocalDateTime.now());
        vehiculo.setEstacionamiento(estacionamiento);
        return estacionamiento;
    }

    public Pago registrarSalida(Vehiculo vehiculo) {
        Estacionamiento estacionamiento = vehiculo.getEstacionamiento();
        Pago pago = new Pago(calcularTarifa(vehiculo, estacionamiento), LocalDateTime.now());
        vehiculo.setEstacionamiento(null);
        return pago;
    }

    private double calcularTarifa(Vehiculo vehiculo, Estacionamiento estacionamiento) {
        // Lógica para calcular la tarifa de estacionamiento
        return 0;
    }
}