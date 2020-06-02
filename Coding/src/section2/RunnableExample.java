package section2;

public class RunnableExample {
    public static void main(String[] args) {
        //Traditional
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for(int i =0;i<10;i++)
                    sum+=i;
                System.out.println("Traditional Sum: "+sum);
            }
        };
        Thread threadTraditional = new Thread(runnable);
        threadTraditional.start();

        //Lambda
        Runnable runnableLambda = () -> {
            int sum = 0;
            for (int i =0;i<10;i++)
                sum+=i;
            System.out.println("Lambda sum: "+sum);
        };
        Thread threadLambda = new Thread(runnableLambda);
        threadLambda.start();

        //Runnable Lambda
        Thread threadRunnableLambda = new Thread( () ->
                {
                        int sum =0;
                        for (int i =0;i<10;i++)
                            sum+=i;
                    System.out.println("Runnable Lambda Sum: "+ sum);
                }
        );
        threadRunnableLambda.start();
    }
}
