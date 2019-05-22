public class Main {

    public static void main(String[] args){

        Car car = new BaseCar();
        System.out.println(car.showInfo() + "        Price:" + car.showPrice());

        Car car2 = new Conditioner(car);
        System.out.println(car2.showInfo() + "        Price:" + car2.showPrice());

        Car car3 = new ESP(car);
        System.out.println(car3.showInfo() + "        Price:" + car3.showPrice());

        Car car4 = new Multimedia(car);
        System.out.println(car4.showInfo() + "        Price:" + car4.showPrice());

        car = new Conditioner(car);
        car = new ESP(car);
        car = new Multimedia(car);
        System.out.println(car.showInfo() + "        Price:" + car.showPrice());

    }
}
