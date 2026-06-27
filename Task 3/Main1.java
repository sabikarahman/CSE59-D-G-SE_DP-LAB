public class Main {
    public static void main(String[] args) {

        User user = new User("Alice", "alice@example.com");

        UserValidator validator = new UserValidator();
        UserRepository repository = new UserRepository(validator);
        repository.save(user);
   }
}
class User {
    private String username;
    private String email;

    public User(String username, String email) {
    this.username = username;
    this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }
}

class UserValidator {

    public boolean isValidEmail(User user) {
    if (user.getEmail() != null && user.getEmail().contains("@")) {
            return true;
        }

        System.out.println("Invalid email format.");
        return false;
    }
}

    class UserRepository {
    private UserValidator validator;

    public UserRepository(UserValidator validator) {
        this.validator = validator;
    }

    public void save(User user) {
        if (validator.isValidEmail(user)) {
            System.out.println("Connecting to database...");
            System.out.println("Saving user " + user.getUsername() + " to the users table.");
        }
    }
}
