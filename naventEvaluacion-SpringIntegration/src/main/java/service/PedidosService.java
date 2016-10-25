package service;

import dto.PedidoDTO;
import entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import repository.IPedidosRepository;

/**
 * Created by nicolas.taboada on 25/10/2016.
 */

@Service
public class PedidosService {

    @Autowired
    IPedidosRepository iPedidosRepository;

    public void crearPedido(PedidoDTO pedidoDTO){
        Pedido pedido = new Pedido(pedidoDTO);
        iPedidosRepository.save(pedido);
    }

    @Cacheable
    public Pedido retrievePedido(Long idPedido){
        Pedido pedidoBuscado = iPedidosRepository.findOne(idPedido);
        return pedidoBuscado;
    }

}
