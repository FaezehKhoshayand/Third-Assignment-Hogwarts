import java.util.UUID;
import java.util.regex.*;
public class Account implements AccountManagement{
    private String username;
    // TODO: Passwords should hashed
    private String password;
    private UUID accountID;
    Account(String username, String password) {
        this.username = username;
        this.password = password;
        this.accountID = UUID.randomUUID();
    }
    public String getPassword() {
        return password;
    }
    public String getUsername() {
        return username;
    }
    public String usernameGetter() {
        return username;
    }
    @Override
    public boolean validatePassword(String enteredPassword) {
        String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[@#$%^&+=])"
                + "(?=\\S+$).{8,20}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(enteredPassword);
        return m.matches();
    }

    @Override
    public void changeUsername(String newUsername) {
        username = newUsername;
    }

    @Override
    public void changePassword(String newPassword) {
        password = newPassword;
    }
}
