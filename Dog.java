package Dog;
/*Dev.by Vladislav
 */
public class Dog {

    private String name;
    private String color;
    private int age;
    private String voice;
    private String eat;
    private String sleep;

public Dog(String name, String color, int age) {

    this.name = name;
    this.color = color;
    this.age = age;
    }


        public String getVoice(){
    return voice;
    }
        public String getSleep(){
    return sleep;
        }
        public String getEat(){
    return eat;
        }
        public String getName(){
    return name;
    }
        public String getColor(){
    return color;
    }
        public int getAge(){
    return age;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
    public void setEat(String eat){
        this.eat = eat;
    }
    public void setSleep(String sleep){
        this.sleep = sleep;}
    }
