package controller;

import dto.PedidoDTO;
import entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PedidosService;

/**
 * Created by nicolas.taboada on 25/10/2016.
 */

@RestController
@RequestMapping(value = "api/pedidos")
public class PedidosController {

    @Autowired
    PedidosService pedidosService;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> retrievePedido(@RequestParam Long idPedido){
        Pedido pedido = pedidosService.retrievePedido(idPedido);
        return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void savePedido(@RequestBody PedidoDTO pedidoDTO){
        pedidosService.crearPedido(pedidoDTO);

    }

}
