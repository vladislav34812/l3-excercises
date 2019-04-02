package UserLoginService;

public class User {
    private String login;
    private String password;
    int loginAttemptsLeft = 4;
    boolean blocked;

    public User(String login, String password) {
        this.login = login;
        this.password = password;


    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }


    void resetLoginAttempts(int loginAttemptsLeft) {
        this.loginAttemptsLeft = loginAttemptsLeft;
        loginAttemptsLeft = 4;
        System.out.println("\n\t60 seconds passed... " + "\n\tLogin Attempts reseted!");
    }

    public boolean block(boolean blocked) {
        this.blocked = blocked;
        if (loginAttemptsLeft == 0) {
            System.out.println("\t<<Login service is blocked for 60 sec>>");
            blocked = true;
        }else {
            blocked = false;
        }
        return blocked;
    }
}
