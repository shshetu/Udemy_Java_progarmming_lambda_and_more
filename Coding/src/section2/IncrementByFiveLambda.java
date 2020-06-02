package section2;

public class IncrementByFiveLambda {


    public static void main(String[] args) {
        //define the sam body here
        IncrementByFive incrementByFive = a -> a + 5;
        //call the method
        System.out.println(incrementByFive.incrementByFive(5));
    }
}
