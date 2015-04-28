package com.test;

/**
 * Created by roka on 17.03.15.
 */
public class Test {


    public static void main(String[] args) throws InterruptedException {
        final Print p = new Print();
        Thread t1 = new Thread(){
            public void run(){
                synchronized (p){
                    p.print("1");
                    try {
                        Thread.sleep(10000l);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                p.print("2");
            }
        };

        t1.start();
        Thread.sleep(1000l);
        t2.start();


    }




}

class Print {

    void print(String name){
        System.out.println("Test : " + name);

    }

}




