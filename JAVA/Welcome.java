public class Welcome {
    public static void main(String[] args) {
        sayWelcome();
    }

    public static void sayWelcome() {
        SayHi.sayHi();
        System.out.println("Welcome");
    }
}