package section2;

public class HelloWorldTraditional implements HelloWorldInterface{
    public static void main(String[] args) {
    HelloWorldTraditional helloWorldTraditional = new HelloWorldTraditional();
    helloWorldTraditional.sayHello();
    }

    @Override
    public String sayHello() {
        return "Hello World";
    }
}
