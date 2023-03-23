package dio.apirest.apirest.Hateoas.Repositories;

import dio.apirest.apirest.Hateoas.Entitys.EmployeeHateoas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeHateoas, Long> {
}
