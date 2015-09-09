package com.sapient.client.cui;

import javax.swing.JOptionPane;


/*
class Runner implements Runnable {

	Thread firstThread;
	Thread secondThread;

	public Runner() {
		// TODO Auto-generated constructor stub
		firstThread = new Thread(this, "First Thread");
		secondThread = new Thread(this, "Second Thread");

		firstThread.start();
		secondThread.start();
	}

	@Override
	public void run() {
		if (Thread.currentThread()==secondThread){
			try {
				firstThread.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Inside Run");
		for (int counter = 0; counter < 10; counter++) {
			System.out.println(Thread.currentThread());
		}
	}
}
*/

public class MainApp {

	public static void main(String[] args) {
		// every Java Application is single threaded...
		/*
		 * Runner runner = new Runner();
		 * 
		 * Thread firstThread = new Thread(runner, "First Thread");
		 * 
		 * System.out.println(firstThread);
		 * System.out.println(firstThread.getState()); firstThread.start();
		 * System.out.println(firstThread.getState());
		 * 
		 * 
		 * System.out.println("The End");
		 */
		/*
		 * Runner runner = new Runner();
		 * 
		 * Thread firstThread = new Thread(runner, "First Thread"); Thread
		 * secondThread = new Thread(runner, "Second Thread");
		 * 
		 * firstThread.start(); secondThread.start();
		 * 
		 * try { firstThread.join(); secondThread.join(); } catch
		 * (InterruptedException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		new Runner();
		
		JOptionPane.showMessageDialog(null, "Hi");
		
		System.out.println("The End");

	}

}
