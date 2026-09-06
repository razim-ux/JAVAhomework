import java.util.*;

public class Training {


    public static void main(String[]args){
        Map<String, Integer> people = new HashMap<>();
        people.put("Razim",15);
        people.put("Oleg",25);
        people.put("Razim",15);

        System.out.println(people);

//        List<Car> names = getCarNames();
//        List<Car> carsWithFuel = new ArrayList<>();
//
//        for (Car car : names) {
//            if (car.getFuel() > 15){
//                carsWithFuel.add(car);
//
//            }
//
//        }
//
//        System.out.println(carsWithFuel);
    }

    private static List<Car> getCarNames() {
        List<Car> cars = new ArrayList<Car>() {{
            add(new Car("BMW",0));
            add(new Car("Nissan",30));
            add(new Car("Exeed",15));
            add(new Car("Renault",50));

        }};
        return cars;

    }
}
