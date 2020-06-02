package section2;

public class HelloWorldLambda {

    public static void main(String[] args) {
        HelloWorldInterface helloWorldInterface = () -> "Hello World";
        System.out.println(helloWorldInterface.sayHello());
    }
}
