public class Greeter {
    void message() {
        System.out.println("Hello! How are you?");
    }

    public static void main(String[] args) {
        (new Greeter()).message();
    }
}