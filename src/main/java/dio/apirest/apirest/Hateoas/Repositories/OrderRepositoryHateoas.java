package dio.apirest.apirest.Hateoas.Repositories;

import dio.apirest.apirest.Hateoas.Entitys.OrderHateoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepositoryHateoas extends JpaRepository<OrderHateoas, Long> {
}
