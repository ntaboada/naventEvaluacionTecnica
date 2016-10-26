package manager;

import cache.BumexMemcached;
import dao.PedidosDAO;
import domain.Pedido;
import domain.dto.PedidoDTO;

/**
 * Created by Nicolas on 25/10/2016.
 */

public class PedidosManager {

    private PedidosDAO pedidosDAO;

    BumexMemcached bumexMemcached = BumexMemcached.getInstance();


    public PedidosManager(){}

    public PedidosDAO getPedidosDAO() {return pedidosDAO;}

    public void setPedidosDAO(PedidosDAO pedidosDAO) {this.pedidosDAO = pedidosDAO;}


    public Pedido crearPedido(PedidoDTO pedidoDTO) {
        Pedido pedido = new Pedido(pedidoDTO);
        bumexMemcached.set(pedido.getIdPedido().toString(), pedido);
        pedidosDAO.insertOrUpdate(pedido);
        return pedido;
    }
    public void updatePedido(Pedido pedido) {
        // Si no esta en el cache, buscar en DB
        Pedido pedidoPersistente = (Pedido) this.bumexMemcached.get(String.valueOf(pedido.getIdPedido()));

        if (pedidoPersistente == null) {
            pedidoPersistente = pedidosDAO.select(pedido.getIdPedido());
        }
        pedidosDAO.insertOrUpdate(pedidoPersistente);
    }

    public void deletePedido(Pedido pedido) {

        if (this.bumexMemcached.get(String.valueOf(pedido.getIdPedido())) != null) {
            this.bumexMemcached.delete(String.valueOf(pedido.getIdPedido()));
        }
        pedidosDAO.delete(pedido);
    }

    public Pedido searchPedido(Integer idPedido) {
        Pedido pedido = (Pedido) bumexMemcached.get(idPedido.toString());

        if(pedido == null){
            pedido = pedidosDAO.select(idPedido);
        }
        return pedido;
    }

}
