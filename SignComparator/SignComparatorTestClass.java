package SignComparator;

public class SignComparatorTestClass {
    public static void main(String[] args) {
        SignComparator compare1 = new SignComparator();
        compare1.setAge(13);
        System.out.println(compare1.getAge() + " : " + compare1.compare(compare1.getAge()));
        System.out.println();


        SignComparatorTestClass testRunner = new SignComparatorTestClass();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }
        public void test1 () {
            String description = " TestNr.1 Should return what number that is possitive/negative or equal to zero, if number is 10";
            SignComparator target = new SignComparator();
            target.setAge(10);

            String expectedResult = "Number is positive";
            String actualResult = target.compare(target.getAge());

            checkThatEquals(actualResult, expectedResult, description);
        }
        public void test2(){
            String description = " TestNr.2 Should return what number that is possitive/negative or equal to zero, if number is -10";
            SignComparator target2 = new SignComparator();
            target2.setAge(-10);

            String expectedResult = "Number is negative";
            String actualResult = target2.compare(target2.getAge());

            checkThatEquals(actualResult, expectedResult, description);
    }
        public void test3(){ String description = " TestNr.3 Should return what number that is possitive/negative or equal to zero, if number is 0";
            SignComparator target2 = new SignComparator();
            target2.setAge(0);

            String expectedResult = "Number is negative";
            String actualResult = target2.compare(target2.getAge());

            checkThatEquals(actualResult, expectedResult, description);

        }

        public void checkThatEquals (String actualResuls, String expectedResult, String testName){

        if (actualResuls == expectedResult) {
                System.out.println(testName);
                System.out.println(actualResuls);
                System.out.println("Test has passed!");


            } else {
                System.out.println(testName);
                System.out.println(actualResuls);
                System.out.println("Test has failed!");
                System.out.println("Expected " + "that the " + expectedResult + " but the " + actualResuls);
            }

        }
    }
