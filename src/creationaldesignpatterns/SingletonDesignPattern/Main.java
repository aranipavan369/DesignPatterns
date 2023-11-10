package creationaldesignpatterns.SingletonDesignPattern;

import creationaldesignpatterns.BuilderDesignPattern.Builderobject;

public class Main {
    public static void main(String[] args) {



        Thread1 T1=new Thread1();
        Thread2 T2=new Thread2();
        Thread3 T3=new Thread3();
        Thread t1=new Thread(T1);
        Thread t2=new Thread(T2);
        Thread t3=new Thread(T3);
        t1.start();
        t2.start();
        t3.start();

        //System.out.println("i am from :"+Thread.currentThread()+" "+ Singleton.getInstance());



    }
}