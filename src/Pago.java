import java.time.LocalDateTime;

public class Pago {
    private double monto;
    private LocalDateTime fechaPago;

    public Pago(double monto, LocalDateTime fechaPago) {
        this.monto = monto;
        this.fechaPago = fechaPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(LocalDateTime fechaPago) {
        this.fechaPago = fechaPago;
    }
}
