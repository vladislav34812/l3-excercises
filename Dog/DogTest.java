package Dog;
/*Dev.by Vladislav
 */
public class DogTest {
    public static void main(String[]args){

        Dog dog1 = new Dog("Бобик", "рыжий",2);



    System.out.println("Имя собаки: " + dog1.getName());
    System.out.println("Цвет собаки: " + dog1.getColor());
    System.out.println("Собаке " + dog1.getAge()+ " года");
        dog1.setVoice("Гавкает");
        dog1.setEat("Кушает");
        dog1.setSleep("Спит");
    System.out.println("Как и все собаки она: " + dog1.getSleep()+ " , " + dog1.getVoice() + " и " + dog1.getEat());

    }
}
