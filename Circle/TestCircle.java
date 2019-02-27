package Circle;

public class TestCircle {
    public static void main(String[]args){
        Circle circle1 = new Circle();
        circle1.setRadius(6.5);
    System.out.println("Площадь круга с радиусом " + circle1.getRadius()+ " см равна "+ circle1.getCalclateArea() + " см");
    }
}
