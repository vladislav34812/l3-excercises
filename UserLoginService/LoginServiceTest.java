package UserLoginService;

public class LoginServiceTest {
    public static void main(String[] args) {
LoginServiceTest ntest = new LoginServiceTest();
ntest.checkIfBlocked();
    }
    public void checkIfBlocked(){

        UserLoginService tes = new UserLoginService();
        String description = "Test description: Must login or not,and after 3 tries blocks user,\n then again resets tries";
        User test1 = new User("Victor","Zaas223");
        System.out.println(tes.login("Victor","zaas223"));
        System.out.println(tes.login("Victor","zaas223"));
        System.out.println(tes.login("Victor","zaas223"));
        System.out.println(tes.login("Victor","zaas223"));
        //System.out.println(tes.login("Victor","zaas223"));
        boolean expectedResult = test1.blocked==false;
        boolean actualResult = test1.blocked;


        chechThatBlocked(actualResult,expectedResult,description);
    }
    public void chechThatBlocked(boolean actualResult,boolean expectedResult,String testName){
        if(actualResult == expectedResult){
            System.out.println(testName);
            System.out.println("Actual result: "+actualResult);
            System.out.println("Test has passed! Blocked = "+actualResult);
        }if(!actualResult==expectedResult){
            System.out.println(testName);
            System.out.println("Actual result: "+actualResult);
            System.out.println("Test has failed!");
            System.out.println("Expected that blocked will be "+expectedResult+" but it's "+ actualResult);
        }
    }
}
