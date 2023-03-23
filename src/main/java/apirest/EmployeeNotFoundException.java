package apirest;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeNotFoundException extends RuntimeException{
    public EmployeeNotFoundException(Long id){
        super("Could not find the id : " + id);
    }
}
