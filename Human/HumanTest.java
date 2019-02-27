package Human;

public class HumanTest {
    public static void main(String[]args){

        Human human1 = new Human("DrugDiller",21);

        human1.setSayHI("Hi my name is ");

        System.out.println(human1.getSayHI()+human1.getName()+" and I am "+human1.getAge()+ " years old");

    }
}
