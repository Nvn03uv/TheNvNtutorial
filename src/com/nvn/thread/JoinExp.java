package com.nvn.thread;

public class JoinExp extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

	public static void main(String args[]) {
		JoinExp t1 = new JoinExp();
		JoinExp t2 = new JoinExp();
		JoinExp t3 = new JoinExp();
		t1.start();
		try {
			t1.join(1500); // If milisecons are not specified thread will run untill die. 
		} catch (Exception e) {
			System.out.println(e);
		}

		t2.start();
		t3.start();
	}
}
