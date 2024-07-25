public class CMP202 {
    public static void main(String[] args) {}
    int age;
    float height;
    String name;
    String password;

    void printUserDetails() {
        age = 19;
        height = 176;
        name = "Joshua";
        name.length();
        password = "Nansel001";
        if (password.contains("001") || password.contains("Nansel")) {
            System.out.println("Password is not strong enough");
        }
    }
}
