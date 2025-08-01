package day8;

public class BankMultiThreadingMain {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		BankMultiThreading account = new BankMultiThreading(1000.0);
		Thread t1 = new Thread(() -> {
			for(int i = 0;i < 3;i++) {
				account.deposit(200.0);
				sleep(100);
			}
		},"Deposited-Thread");
		
		Thread t2 = new Thread(()->{
			for(int i = 0;i < 3;i++) {
				account.withdraw(150.0);
				sleep(120);
		}
	},"Withdraw-Thread");
		
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		System.out.printf("Final Balance = %.2f%n",account.getBalance());
		
	}
	
	private static void sleep(int millis) {
		try {
			Thread.sleep(millis);
		}
		catch(InterruptedException ignored) {}
	}
}
