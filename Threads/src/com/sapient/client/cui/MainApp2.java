package com.sapient.client.cui;

class Data {
	private int value;

	public void getValue() {
		System.out.println(value);
	}

	public void setValue(int value) {
		this.value = value;
	}
}

class Runner implements Runnable {
	Data data;
	boolean flag = false;
	private Thread secondThread;

	public Runner() {
		data = new Data();
	}

	@Override
	public void run() {
		Thread currThread;

		for (int counter = 0; counter < 10; counter++) {
			currThread = Thread.currentThread();

			if (currThread.getName().equals("Producer")) {
				System.out.println(currThread);
				synchronized (data) {
					data.setValue(counter + 1);
					try {
						data.notify();
						if (!secondThread.isAlive()) {
							secondThread.start();
						}
						data.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} else if (currThread.getName().equals("Consumer")) {
				System.out.print(currThread);
				synchronized (data) {
					data.getValue();
					try {
						data.notify();
						if (counter < 9) {
							data.wait();
						}
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		}
		// System.out.println(Thread.currentThread());
		// data.notify();
	}

	public void setSecondThread(Thread secondThread) {
		this.secondThread = secondThread;
	}
}

public class MainApp2 {
	public static void main(String[] args) {
		Runner runner = new Runner();

		Thread firstThread = new Thread(runner, "Producer");
		Thread secondThread = new Thread(runner, "Consumer");

		firstThread.start();
		// secondThread.start();
		runner.setSecondThread(secondThread);

		// System.out.println("End");

	}
}
