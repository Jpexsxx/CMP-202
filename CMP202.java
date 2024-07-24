public class CMP202 {
    public static void main(String[] args) {}
    int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 21;
        height = 177;
        name = "Gabriel";
        name.length();
        password = "User@0412";
        if (password.contains("0412") || password.contains("User")) {
            System.out.println("Password is not strong enough");
        }
    }
}