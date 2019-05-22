public class ESP extends CarConfig {

    public ESP(Car car){
        super(car);
    }

    public int showPrice() {
        return super.showPrice() + 20000;
    }

    public String showInfo() {
        return super.showInfo() + ", ESP";
    }
}
