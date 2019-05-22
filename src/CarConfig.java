public class CarConfig implements Car {

    private Car car;

    public CarConfig(Car car){
        this.car = car;
    }

    @Override
    public String showInfo() {
        return car.showInfo();
    }

    @Override
    public int showPrice() {
        return car.showPrice();
    }
}
