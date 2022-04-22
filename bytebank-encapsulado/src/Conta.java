public class Conta {
	private double saldo; //não permite ser modificado fora da classe
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;  //statico da classe, para não ser construido varios independentes por conta.
	
	public Conta(int agencia, int numero) {
		total++;
		System.out.println("O total de contas é " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Criando uma conta " + this.numero);
	}
	
	void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {  //método getter para o saldo
		return this.saldo;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("Coloque um valor maior que zero no numero");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if(agencia <= 0) {
			System.out.println("Coloque um valor maior que zero na agencia");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return total;
	}
	
	
	
}