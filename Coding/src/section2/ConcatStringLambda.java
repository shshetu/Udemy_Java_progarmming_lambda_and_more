package section2;

public class ConcatStringLambda {
    public static void main(String[] args) {
        //define sam
    ConcatInterface concatInterface = (a,b) -> a+" "+b;
    //calling the method
        System.out.println(concatInterface.concatString("Hello","World"));
    }
}
