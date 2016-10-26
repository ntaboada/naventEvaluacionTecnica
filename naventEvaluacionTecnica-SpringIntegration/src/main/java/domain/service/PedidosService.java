package domain.service;

import domain.dto.PedidoDTO;
import domain.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import domain.repository.IPedidosRepository;

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


    public Pedido retrievePedido(Long idPedido){
        Pedido pedidoBuscado = iPedidosRepository.findByidPedido(idPedido);
        return pedidoBuscado;
    }

    public Pedido retrievePedido(String nombre){
        Pedido pedidoBuscado = iPedidosRepository.findByNombre(nombre);
        return pedidoBuscado;
    }
}
