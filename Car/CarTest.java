package Car;

public class CarTest {
    public static void main(String[]args){
        Car car1 = new Car();
        car1.setColor("Calypsorot candy");
        car1.setManufacturer("BMW");
        car1.setYear(1994);

        System.out.println("Машина марки "+car1.getManufacturer()+" цвета "+car1.getColor()+" , "+car1.getYear()+" года выпуска");

    }
}
