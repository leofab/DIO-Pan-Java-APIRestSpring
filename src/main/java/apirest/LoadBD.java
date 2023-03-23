package apirest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBD {
    private static final Logger log = LoggerFactory.getLogger(LoadBD.class);
    //persistindo dados no banco com jpa
    @Bean
    @Autowired(required = false)
    CommandLineRunner applicationRunner(EmployeeRepository employeeRepository){
        return args -> {
            log.info("Isto é um LOG de usuário salvo -> "+employeeRepository.save(new Employee("Marcelo", "Frontdesk", "St101, 29 - Reno - NV")));
            log.info("Isto é um LOG de usuário salvo -> "+employeeRepository.save(new Employee("Crhis", "Cleaner", "Av10, 10 - Reno - NV")));
        };
    }
}
