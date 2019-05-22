public class Conditioner extends CarConfig {

    public Conditioner(Car car){
        super(car);
    }

    public int showPrice() {
        return super.showPrice() + 30000;
    }

    public String showInfo() {
        return super.showInfo() + ", Conditioner";
    }
}
