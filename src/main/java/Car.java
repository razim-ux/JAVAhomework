import java.util.Objects;

public class Car {

    private String model;

    private Integer fuel;

    public Car(String model, Integer fuel) {
        this.model = model;
        this.fuel = fuel;
        System.out.println("Создали машину " + model);
    }

    public Car() {
    }

    public void beepbeep(){
        System.out.println("Машина посигналила");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(model, car.model) && Objects.equals(fuel, car.fuel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, fuel);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", fuel=" + fuel +
                '}';
    }

    public Integer getFuel() {
        return fuel;
    }

    public void goToRoad(){
        if (fuel>20){
            System.out.println("Машина поехала на трассу, остаток бензина "  + fuel);
            fuel = fuel - 15;
        } else{
            System.out.println("Недостаточно бензина, машина не поедет");
            addFuelToCar();
            System.out.println("Машина заправлена, можно ехать, текущее количество бензина " + fuel);
        }
    }

    private void addFuelToCar(){
        fuel = fuel + 20;
    }

    public void setFuel(Integer fuel) {
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
