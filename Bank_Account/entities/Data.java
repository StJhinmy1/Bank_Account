package entities;

public class Data {
	
	private int number;
	private String name;
	private double balance;

	public Data(int number, String name, double initial_balance) {
		this.name = name;
		this.number = number;
		deposit(initial_balance);
	}
		
	public Data(int numero, String nome) {
		super();
		this.number = numero;
		this.name = nome;
	}

	
    public boolean withdraw(double amount) {
        double totalToWithdraw = amount + 5.0; 
        if (this.balance >= totalToWithdraw) {
            this.balance -= totalToWithdraw;
            return true;
        }
        return false;
    }
	
	public String getName() {
		return name;
	}

	public void setName(String nome) {
		this.name = nome;
	}

	public double getBalance() {
		return balance;
	}

	public int getNumber() {
		return number;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
//	public void withdraw(double amount) {
//		balance -= amount + 5.0;
//	}

	public String toString() {
		return "Nome do correntista: " + name
	         + "\nNumero da conta: " + number
			 + "\nSaldo: R$" + String.format("%.2f",balance);
	}
}
