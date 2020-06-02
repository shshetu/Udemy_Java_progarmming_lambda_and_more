package section1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Video1PrintAndFindSum {
    public static void main(String[] args) {
        //find sum
//        findSum();

        findMin();
    }

    public static void printNumbers(){
        //Imperative approach
        System.out.println("Imperative approach: ");
        for(int i=1; i<=5;i++){
            System.out.println(i);
        }

        //Declerative approach
        System.out.println("First Declerative approach: ");
        IntStream numbers = IntStream.of(1,2,3,4,5);
        numbers.forEach(System.out::println);

        //Declerative approach
        System.out.println("Second Declarative approach: ");
        IntStream numbersStream = IntStream.rangeClosed(1,5);
        numbersStream.forEach(System.out::println);
    }

    public static void findSum(){
        //Imperative approach
        int sum = 0;
        for(int i =1 ;i<=5;i++){
            sum+=i;
        }
        System.out.println("Imperative sum: "+sum);

        //Declartive sum
        int decSum1 = IntStream.of(1,2,3,4,5).sum();
        System.out.println("Declarative sum1: "+decSum1);

        int decSum2 = IntStream.rangeClosed(1,5).sum();
        System.out.println("Declarative sum2: "+decSum2);
    }

    public static void findMin(){
        //Imperative style
        List<Integer> integers = Arrays.asList(8,2,3,4,5,6,7,1);
        Integer impMin = integers.get(0);
        for(int i =0;i<integers.size();i++){
            if(integers.get(i)<impMin){
                impMin = integers.get(i);
            }
        }
        System.out.println("Imperative minimum: "+impMin);

        //Declerative style-1
        Integer decMin = integers.stream().min(Integer::compareTo).orElse(null);
        System.out.println("Declarative Minimum 1: "+decMin);
    }
}
