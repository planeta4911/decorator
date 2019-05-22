public class BaseCar implements Car {

    @Override
    public int showPrice() {
        return 900000;
    }

    @Override
    public String showInfo() {
        return "Kia Rio X-Line | 2017 | 1.6 (123hp) | Equipment : 2 airbags";
    }
}
