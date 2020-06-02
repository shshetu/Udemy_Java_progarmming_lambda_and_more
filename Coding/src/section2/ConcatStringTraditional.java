package section2;

public class ConcatStringTraditional implements ConcatInterface {
    @Override
    public String concatString(String a, String b) {
        return a + " " + b;
    }

    public static void main(String[] args) {
        ConcatStringTraditional concatStringTraditional = new ConcatStringTraditional();
        System.out.println(concatStringTraditional.concatString("Hello", "World"));
    }
}
