package dio.apirest.apirest.Hateoas.Exceptions;

public class OrderNotFoundExceptionHateoas extends RuntimeException {
    public OrderNotFoundExceptionHateoas(long id){
        super("Could not found the order id: "+id);
    }
}
