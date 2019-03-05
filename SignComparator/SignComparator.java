package SignComparator;

public class SignComparator {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String compare(int age) {
        if (age > 0) {
            return "Number is positive";
        }
        if (age < 0) {
            return "Number is negative";
        } else
            return "Number is equal to zero";
            }
    }