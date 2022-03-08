package lodgerio.functional.objects.functionCar;

import java.util.ArrayList;
import java.util.List;

public class FunctionCar {

    public static void main(String[] args) {

        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car("Maruti", 350000));
        listCar.add(new Car("Toyota", 400000));
        listCar.add(new Car("Mahindra", 500000));
        listCar.add(new Car("Honda", 600000));

        // displaying all cars with cost more than 4lakh
        listCar.stream().filter(c -> (c.getID() > 400000))
                .forEach(c -> System.out.println(c.getCompany()));

        // returning CAR object
        Car cc = listCar.stream()
                .filter(c -> c.getCompany().startsWith("H"))
                .findFirst()
                .orElse(null);
        System.out.println("Get Company = " + cc.getCompany());


        // get minimum
        int min = listCar.stream()
                .mapToInt(Car::getID)
                .min()
                .orElse(0);
        System.out.println(min);

        // get maximum
        int max = listCar.stream()
                .mapToInt(Car::getID)
                .max()
                .orElse(0);
        System.out.println(max);

    }


}
