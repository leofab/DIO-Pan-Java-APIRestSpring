package dio.apirest.apirest.Hateoas;

import dio.apirest.apirest.Hateoas.Entitys.EmployeeHateoas;
import dio.apirest.apirest.Hateoas.Entitys.OrderHateoas;
import dio.apirest.apirest.Hateoas.Entitys.Status;
import dio.apirest.apirest.Hateoas.Repositories.EmployeeRepository;
import dio.apirest.apirest.Hateoas.Repositories.OrderRepositoryHateoas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDBHateoas {

    private static final Logger log = LoggerFactory.getLogger(LoadDBHateoas.class);
    // persistindo dados no banco com jpa

    @Bean
    @Autowired(required = false)
    CommandLineRunner loaddata(EmployeeRepository employeeRepositoryHateoas, OrderRepositoryHateoas orderRepositoryHateoas) {
        return args -> {
            log.info("Log of save event: " + employeeRepositoryHateoas.save(new EmployeeHateoas("Adonis", "ChefofFront",
                    "5th av, 44, 20 - Reno - NV")));
            log.info("log of save event: " + employeeRepositoryHateoas.save(new EmployeeHateoas("Humberto", "Cleaner",
                    "long street st, 5, 10 - Reno - NV")));
            log.info("Log of save event: " + employeeRepositoryHateoas.save(new EmployeeHateoas("Cecil", "Adm",
                    "49th street, 10, 1 - Reno - NV")));
            orderRepositoryHateoas.save(new OrderHateoas(Status.COMPLETED, "review"));
            orderRepositoryHateoas.save(new OrderHateoas(Status.IN_PROGRESS, "travel"));
            orderRepositoryHateoas.save(new OrderHateoas(Status.IN_PROGRESS, "sale"));
            orderRepositoryHateoas.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });
        };
    }
}
