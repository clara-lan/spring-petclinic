package guru.springframework.springpet;

public class SomeController {
    private final MyService myService;

    public SomeController(MyService myService){

        this.myService = myService;
    }
}