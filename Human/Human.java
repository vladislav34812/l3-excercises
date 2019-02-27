package Human;

public class Human {

    private String name;
    private int age;
    private String sayHI;

    public Human(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
     return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSayHI(){
        return this.sayHI;
    }
    public void setSayHI(String sayHI){
        this.sayHI = sayHI;
    }
}
