public class Multimedia extends CarConfig{

    public Multimedia(Car car){
        super(car);
    }

    public int showPrice() {
        return super.showPrice() + 40000;
    }

    public String showInfo() {
        return super.showInfo() + ", Multimedia system with Bluetooth";
    }
}
