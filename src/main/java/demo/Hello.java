package demo;

public class Hello {

    public static void main(String[] args) {
        System.out.println(new Hello().greeting("Java"));
    }

    public String greeting(String name) {
        var message = "Hello, " + name + "!";
        return message;
    }

}
