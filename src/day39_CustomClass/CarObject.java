package day39_CustomClass;

public class CarObject {
    public static void main(String[] args) {
        Car car1 = new Car();
        /*car1.brand = "Toyota";
        car1.model = "Avalon";
        car1.year = 2020;
        car1.color = "White";
        car1.mileage = 20000;
        car1.price = 19000.50;*/

        car1.setCarInfo("Toyota", "Avalon", 2014, "Red",55000,16000);


        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.year);
        System.out.println(car1.color);

        System.out.println("==========================");
        Car car2 = new Car();
        /*car2.brand = "Mercedes";
        car2.model = "G 550";
        car2.year = 2000;
        car2.color = "Blue";*/
        car2.setCarInfo("BMW","X5",2019,"Black",2000,24999.99);
        System.out.println(car2.brand);
        System.out.println(car2.model);
        System.out.println(car2.year);
        System.out.println(car2.color);

        Car car3 = new Car();
        car3.setCarInfo("Audi", "A7", 2017, "While", 32000, 25000);

        System.out.println("**********************************");

        Car car4 = new Car();
        car4.setCarInfo("Jeep","Wramgler", 1990, "Blue", 250000, 127000);
        car4.getCarInfo();
        car3.getCarInfo();
        car2.getCarInfo();
        car1.getCarInfo();

    }
}
