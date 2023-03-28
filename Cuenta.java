public abstract class Cuenta {

	private double saldo;
	private int agencia = 1;
	private int numero;
	private Cliente titular = new Cliente();

	private static int total;

	public Cuenta() {

	}

	public Cuenta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estoy creando una cuenta" + this.numero);

		Cuenta.total++;
	}

	// DEPOSITAR NO RETORNA VALOR
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

	// RETIRAR RETORNA VALOR
	public boolean retirar(double valor) {
		if (this.saldo >= valor) {

			this.saldo -= valor;
			return true;
		}
		return false;
	}

	// TRANSFERIR RETORNA VALOR
	public boolean transferir(double valor, Cuenta destino) {
		if (this.saldo >= valor) {
			retirar(valor);
			destino.depositar(valor);
			return true;
		}
		return false;
	}

	public double getSaldo() {

		return this.saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia > 0) {
			this.agencia = agencia;
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if (numero > 0) {
			this.numero = numero;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() {
		return Cuenta.total;
	}

}
