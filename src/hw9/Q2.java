package hw9;

class Account {
	private double balance = 0;//餘額

	synchronized public void save(double s) {
		while (balance >= 3000) {
			System.out.println("媽媽看到餘額在3000以上，暫停匯款");
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		balance += s;
		System.out.println("媽媽存了:" + s + "，帳戶共有:" + balance);
	    notify();
	}

	synchronized public void get(double g) {
		while (balance <=2000) {
			System.out.println("熊大看到餘額在2000以下，要求匯款");
			try {
				wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		balance -= g;
		System.out.println("熊大領了:" + g + "，帳戶共有:" + balance);
		if (balance < 1000) {
			System.out.println("熊大看到帳戶沒錢，暫停提款");
			System.out.println("媽媽被熊大要求匯款!");
			notify();
		}
	}
}

class Saving extends Thread {
	Account account;

	public Saving(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			account.save(2000);
	}
}

class Getting extends Thread {
	Account account;

	public Getting(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			account.get(1000);
	}
}

public class Q2 {
	public static void main(String[] args) {
		Account account = new Account();
		Saving saving = new Saving(account);
		Getting getting = new Getting(account);
		saving.start();
		getting.start();
	}

}
