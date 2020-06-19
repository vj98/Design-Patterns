import java.util.*;

public class Main {
    public static void main(String[] args) {

        CarEarlyInstantiation obj1 = CarEarlyInstantiation.getCar();
        obj1.doSomething();

        CarLazyInstantiation obj2 = CarLazyInstantiation.getCar();
        obj2.doSomething();
    }
}