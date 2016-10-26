package domain.controller;

import domain.dto.PedidoDTO;
import domain.entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import domain.service.PedidosService;

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

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public ResponseEntity<?> retrievePedidoByName(@RequestParam String nombre){
        Pedido pedido = pedidosService.retrievePedido(nombre);
        return new ResponseEntity<Pedido>(pedido, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public void savePedido(@RequestBody PedidoDTO pedidoDTO){
        pedidosService.crearPedido(pedidoDTO);

    }

}
