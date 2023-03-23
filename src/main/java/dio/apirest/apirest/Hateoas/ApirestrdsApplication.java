package dio.apirest.apirest.Hateoas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApirestrdsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApirestrdsApplication.class, args);
	}

//	@Bean
//	CommandLineRunner commandLineRunner(EmployeeRepository repository){
//		return args ->{
//			repository.save(new Employee("João", "Adm", "St 102, 45 - Reno - NV"));
//			repository.save(new Employee("Maria", "Frontdesk", "Ave 41, 44 - Reno - NV" ));
//		};
//
//	}

}
