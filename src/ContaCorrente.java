public class ContaCorrente {

	String numeroConta;
	String nomeTitular;
	double saldoDisp;
	String senha;

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldoDisp() {
		return saldoDisp;
	}

	public void setSaldoDisp(double saldoDisp) {
		this.saldoDisp = saldoDisp;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public ContaCorrente(String numeroConta, String nomeTitular, double saldoDisp, String senha) {
		super();
		this.numeroConta = numeroConta;
		this.nomeTitular = nomeTitular;
		this.saldoDisp = saldoDisp;
		this.senha = senha;
	}

	public ContaCorrente() {

	}

	public void sacar(double saldoDisp) {
		this.saldoDisp = this.saldoDisp - saldoDisp;
		System.out.println("Saque realizado com sucesso!");

	}

	public void depositar(double saldoDisp) {
		this.saldoDisp = this.saldoDisp + saldoDisp;
		System.out.println("Depósito realizado com sucesso!");
	}

	public void extratoContaCorrente() {
		System.out.println("Conta Corrente\n" + "+------------------------------------------------+\n"
				+ "| Titular Conta Corrente: " + getNomeTitular() + "\n" + "| Número da conta: " + getNumeroConta()
				+ "\n" + "| Saldo atual: R$ " + getSaldoDisp() + "\n"
				+ "+------------------------------------------------+\n"
				+ "+------------------------------------------------+\n");
	}

	public boolean aplicar(double saldoResgate, ContaPoupanca cp) {
		// (transferir da conta Corrente para Poupança);

		if (this.saldoDisp >= saldoResgate) {
			this.saldoDisp -= saldoResgate;
			cp.depositar(saldoResgate);
			return true;
		}
		System.out.println("Não tem dinheiro na Conta Corrente");
		return false;
	}

}
