public class User {
    String username = "Gabriel" ;
    String password = "12345" ;
    String login() {
        if (username.equals("Gabriel") && password.equals("12345")) {
            return "Logged in" ;
        } else {
            return "Failed" ;
        }
    }
    public static void main(String[]args) {
        User John = new User() ;
        System.out.println(John.login()) ;
    }
}
