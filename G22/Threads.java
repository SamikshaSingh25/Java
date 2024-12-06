
class Thread13 implements Runnable{
    @Override
    public void run(){
        int sum=0;
        for (int i = 1; i <= 100 ; i++) {
            sum+=i;
        }
        System.out.print("sum 13:"+sum+" ");
        System.out.println(Thread.currentThread());
    }
}

class Thread12 extends Thread{
    public void run(){
        int sum=0;
        for (int i = 1; i <= 10000 ; i++) {
            sum+=i;
        }
        System.out.print("sum 12:"+sum+" ");
        System.out.println(Thread.currentThread());
        Thread t2=new Thread(new Thread13());
        t2.start();
    }
} 

public class Threads {
    public static void main(String[] args) {
        System.out.println("Main thread running.");
        System.out.println(Thread.currentThread().getName());
        Thread12 t1 = new Thread12();
        // Thread t2=new Thread(new Thread13()); //instance when implements runnable
        t1.start(); //to start thread
        // t2.start();
        System.out.println("main thread terminating."); 

    }
}
