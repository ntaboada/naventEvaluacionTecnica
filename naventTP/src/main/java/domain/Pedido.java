package domain;

import dto.PedidoDTO;

/**
 * Created by Nicolas on 25/10/2016.
 */
public class Pedido {
    private Integer idPedido;
    private String nombre;
    private int monto;
    private int descuento;

    public Pedido(PedidoDTO pedidoDTO) {
        this.nombre = pedidoDTO.getNombre();
        this.monto = pedidoDTO.getMonto();
        this.descuento = pedidoDTO.getDescuento();
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
}
