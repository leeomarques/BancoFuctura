package Prática;

public class ContaPoupanca extends ContaCorrente {

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String numeroConta, String nomeTitular, double saldoDisp, String senha) {
		super(numeroConta, nomeTitular, saldoDisp, senha);
	}

	public boolean resgatar(double saldoResgate, ContaCorrente cc) {
		// (transferir da Poupança para conta Corrente)

		if (this.saldoDisp >= saldoResgate) {
			this.saldoDisp -= saldoResgate;
			cc.depositar(saldoResgate);
			return true;
		}
		System.out.println("Não tem dinheiro na Conta Poupança");
		return false;

	}

	public void extratoContaPoupanca() {
		System.out.println("Conta Poupança\n" + "+------------------------------------------------+\n"
				+ "| Titular Conta Poupança: " + getNomeTitular() + "\n" + "| Número da conta: " + getNumeroConta()
				+ "\n" + "| Saldo atual: R$ " + getSaldoDisp() + "\n"
				+ "+------------------------------------------------+\n"
				+ "+------------------------------------------------+\n");
	}

}
