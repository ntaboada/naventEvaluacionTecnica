package domain.repository;

import domain.entity.Pedido;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nicolas.taboada on 25/10/2016.
 */
public interface IPedidosRepository extends JpaRepository<Pedido, Long> {
    @Cacheable("pedido")
    Pedido findByidPedido(Long idPedido);

    Pedido findByNombre(String nombre);
}
