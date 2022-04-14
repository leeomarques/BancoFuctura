package Pr�tica;

public class ContaPoupanca extends ContaCorrente {

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String numeroConta, String nomeTitular, double saldoDisp, String senha) {
		super(numeroConta, nomeTitular, saldoDisp, senha);
	}

	public boolean resgatar(double saldoResgate, ContaCorrente cc) {
		// (transferir da Poupan�a para conta Corrente)

		if (this.saldoDisp >= saldoResgate) {
			this.saldoDisp -= saldoResgate;
			cc.depositar(saldoResgate);
			return true;
		}
		System.out.println("N�o tem dinheiro na Conta Poupan�a");
		return false;

	}

	public void extratoContaPoupanca() {
		System.out.println("Conta Poupan�a\n" + "+------------------------------------------------+\n"
				+ "| Titular Conta Poupan�a: " + getNomeTitular() + "\n" + "| N�mero da conta: " + getNumeroConta()
				+ "\n" + "| Saldo atual: R$ " + getSaldoDisp() + "\n"
				+ "+------------------------------------------------+\n"
				+ "+------------------------------------------------+\n");
	}

}
