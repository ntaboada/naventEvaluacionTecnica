package domain.dto;

/**
 * Created by nicolas.taboada on 25/10/2016.
 */
public class PedidoDTO {
    private String nombre;
    private double monto;
    private int descuento;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
