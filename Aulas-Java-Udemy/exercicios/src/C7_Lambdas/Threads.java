package C7_Lambdas;

public class Threads {
    public static void main(String[] args) {
        Runnable t1 = new Trabalho1();
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Trabalho #02");
                    try {
                        Thread.sleep(100);
                    } catch (Exception e) {
                    }
                }
            }
        };
            Thread trabalho1 = new Thread(t1);
            Thread trabalho2 = new Thread(t2);
                trabalho1.start();
                trabalho2.start();
        }
    }



