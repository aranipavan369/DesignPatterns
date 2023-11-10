package creationaldesignpatterns.SingletonDesignPattern;

public class Thread1 implements Runnable{
    @Override
    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("i am from :"+Thread.currentThread()+" "+ Singleton.getInstance()+" "+currentTimeMillis);
        //System.out.println("Current time in milliseconds: " + currentTimeMillis);
    }
}
