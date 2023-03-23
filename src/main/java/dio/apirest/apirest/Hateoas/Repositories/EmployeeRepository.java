package dio.apirest.apirest.Hateoas.Repositories;

import apirest.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
