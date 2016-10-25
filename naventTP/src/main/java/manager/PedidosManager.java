package manager;

import cache.BumexMemcached;
import dao.PedidosDAO;
import domain.Pedido;
import dto.PedidoDTO;

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
        pedidosDAO.insertOrUpdate(pedido);
        bumexMemcached.set(pedido.getIdPedido().toString(), pedido);
    }

    public void deletePedido(Pedido pedido) {
            bumexMemcached.delete(pedido.getIdPedido().toString());
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
