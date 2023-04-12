package com.employee.models;

//public class TestThread {
//		public synchronized void printnumbers() {
//			System.out.println("My Thread Started");
//			try {
//				for(int i=0;i < 5;i++) {
//					Thread.sleep(1000);
//					System.out.println("i = " + i);
//				}
//			}
//			catch(InterruptedException iexp) {
//				iexp.printStackTrace();
//			}
//			System.out.println("My Thread Ended");
//		}
//}


public class TestThread {
	public void printnumbers() {
		System.out.println("My Thread Started");
		synchronized(this) {
			try {
				for(int i=0;i < 5;i++) {
					Thread.sleep(1000);
					System.out.println("i = " + i);
				}
			}
			catch(InterruptedException iexp) {
				iexp.printStackTrace();
			}
			System.out.println("My Thread Ended");
		}
	}
}