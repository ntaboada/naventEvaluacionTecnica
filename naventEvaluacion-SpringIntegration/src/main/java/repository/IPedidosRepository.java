package repository;

import entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by nicolas.taboada on 25/10/2016.
 */
public interface IPedidosRepository extends JpaRepository<Pedido, Long> {
}
