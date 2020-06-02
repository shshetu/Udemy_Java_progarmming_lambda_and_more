package section2;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class SumOfNumbersUsingCallables {
    //create two varaibles : array, sum
    static int array[] = IntStream.rangeClosed(1,5000).toArray();
    static int sumOfIntStream = IntStream.rangeClosed(1,5000).sum();
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //create two callables and define the sum inside
        Callable<Integer> callable1 = () ->{
            int sum = 0;
            for (int i =0;i<array.length/2;i++){
               sum+=i;
            }
            return sum;
        };

        Callable<Integer> callable2 = () ->{
            int sum = 0;
            for (int i =array.length/2;i<array.length;i++){
                sum+=i;
            }
            return sum;
        };
        //create an ExecutorService of 2 threads
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        //List of Callables
        List<Callable<Integer>> taskList = Arrays.asList(callable1,callable2);
        //create a List of Futures and call invoke all methods from the created ExecutorService
        List<Future<Integer>> futures = executorService.invokeAll(taskList);
        //Run a forEach loop and inside the loop sum the values got from futureList
        int sum = 0;
        int k = 0;
        for(Future<Integer> future: futures){
            sum += future.get();
            System.out.println("Sum of "+ ++k+" is: "+future.get());
        }
        executorService.shutdown();
        //print both the sum: from intSum and from callables
        System.out.println("Sum from Future: "+ sum);
        System.out.println("Sum from Stream: "+ sumOfIntStream);
    }
}
