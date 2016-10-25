package entity;

import dto.PedidoDTO;

import javax.persistence.*;

/**
 * Created by nicolas.taboada on 25/10/2016.
 */
@Entity
@Table(name = "pedidos")
public class Pedido {
    @Column
    @Id
    @GeneratedValue
    private Long idPedido;
    @Column
    private String nombre;
    @Column
    private int monto;
    @Column
    private int descuento;

    public Pedido(PedidoDTO pedidoDTO) {
        this.nombre = pedidoDTO.getNombre();
        this.monto = pedidoDTO.getMonto();
        this.descuento = pedidoDTO.getDescuento();
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
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
