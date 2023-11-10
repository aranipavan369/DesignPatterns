package creationaldesignpatterns.SingletonDesignPattern;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("i am from :"+Thread.currentThread()+" "+ Singleton.getInstance()+" "+currentTimeMillis);
    }
}
