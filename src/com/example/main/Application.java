package com.example.main;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(()-> run(),"Thread-1");
		Thread t2 = new Thread(()-> run(),"Thread-2");
		Thread t3 = new Thread(()-> run(),"Thread-3");
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();
		
		
		System.out.println("Main Thread is completed...!");
	}
	
	public static void run() {
        System.out.println("Thread started :: "+Thread.currentThread().getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread ended :: "+Thread.currentThread().getName());
    }
}