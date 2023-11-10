package creationaldesignpatterns.SingletonDesignPattern;

public class Thread3 implements Runnable{
    @Override
    public void run() {
        long milliseconds=System.currentTimeMillis();
        System.out.println("i am from :"+Thread.currentThread()+" "+Singleton.getInstance()+" "+milliseconds);
    }
}
