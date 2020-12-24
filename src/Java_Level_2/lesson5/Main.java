package Java_Level_2.lesson5;

public class Main {
    public static void main(String[] args) {

        Counter counter =new Counter();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i < 100; i++){
                    counter.inc();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0; i < 100; i++){
                    counter.dec();
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        });

        t1.start();
        t2.start();
//        System.out.println(counter.value());

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(counter.value());

    }






    private static void daemonThreadEx(){
    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {

                System.out.println("1");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    });
        t.setDaemon(true);
        t.start();
        try

    {
        Thread.sleep(1000);
    } catch(
    InterruptedException e)

    {
        e.printStackTrace();
    }
        System.out.println("END");
}


// лябда выражение
    /* new Thread (()->
                System.out.println(Thread.currentThread().getName()))
                .start();*/

/*        new Thread (new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }).start();  */

        /*class Anonymous implements Runnable{
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }
        new Thread (new Anonymous()).start();*/
/*
        class Anonymous implements Runnable{
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        }
        Anonymous a = new Anonymous();
        Thread t = new Thread (a);
        t.start();
*/




    private static void runnableEx() {
        Thread t1 = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        System.out.println(Thread.currentThread().getName());
        t1.start();
        t2.start();
    }

    private static void threadEx() {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println(Thread.currentThread().getName());
        t1.start();
        t2.start();
    }
}
