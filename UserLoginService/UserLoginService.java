package UserLoginService;


public class UserLoginService {



        User bill = new User("Billy", "bi1234");
        String inputPassword;
        String user;
        String realPassword = bill.getPassword();
        int loginatml = bill.loginAttemptsLeft;

        public boolean login (String user, String inputPassword){
            this.inputPassword = inputPassword;
            this.user = user;
            if (!verify(inputPassword, realPassword)) {
                System.out.println("Login attempts left " + bill.loginAttemptsLeft);
                if (bill.loginAttemptsLeft == 0) {
                    bill.block(true);
                }
                if (bill.loginAttemptsLeft == 0) {
                   bill.resetLoginAttempts(loginatml);
                }
            }

            return true;
        }


        boolean verify (String inputPassword, String realPassword){
            if (inputPassword.equals(realPassword)) {
                System.out.println("\nPassword is correct! " + user + " Welcome!");
                return true;
            } else {
                System.out.println("\nPassword is incorrect! " + user);
                bill.loginAttemptsLeft--;
                return false;
            }

        }

        public static void main(String[] args) {
        UserLoginService user = new UserLoginService();

        System.out.println(user.login("Billy", "bi1233"));
        System.out.println(user.login("Billy", "bi1231"));
        System.out.println(user.login("Billy", "bi1235"));
        System.out.println(user.login("Billy", "bi1233"));
        System.out.println(user.login("Billy", "bi1234"));
        System.out.println(user.login("Billy", "bi1233"));
        System.out.println(user.login("Billy", "bi1233"));
        }


    }