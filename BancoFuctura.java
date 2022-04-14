package Prática;

public class BancoFuctura {

	ContaCorrente[] contaCorrente = new ContaCorrente[100];
	int indiceC = 0;
	ContaPoupanca[] ContaPoupanca = new ContaPoupanca[100];
	int indiceP = 0;
	ContaCorrente cc;
	ContaPoupanca cp;
	
	
	public BancoFuctura() {
		new ContaCorrente();
		new ContaPoupanca();
	}

	public void cadastrarConta(ContaCorrente cc) {
		contaCorrente[indiceC] = cc;
		indiceC = indiceC + 1;
	}

	public void debitarConta(String numeroConta, double valor) {
		ContaCorrente c;
		c = this.procurarConta(numeroConta);
		c.sacar(valor);
	}

	public void creditarConta(String numeroConta, double valor) {
		ContaCorrente c;
		c = this.procurarConta(numeroConta);
		c.depositar(valor);
	}

	public ContaCorrente procurarConta(String numeroConta) {
		int i = 0;
		boolean achou = false;
		ContaCorrente resposta = null;

		while ((!achou) && (i < indiceC)) {
			if (contaCorrente[i].getNumeroConta().equals(numeroConta)) {
				achou = true;
				cc.extratoContaCorrente();
				resposta = contaCorrente[i];
			} else {
				i = i + 1;
			}
		}
		if (!achou)
			System.out.println("Conta Corrente não localizada");
		return resposta;
	}

	public void cadastrarPoupanca(ContaPoupanca p) {
		ContaPoupanca[indiceP] = p;
		indiceP = indiceP + 1;
	}

	public void debitarPoupanca(String numero, double valor) {
		ContaPoupanca p;
		p = this.procurarPoupanca(numero);
		p.sacar(valor);
	}

	public void creditarPoupanca(String numero, double valor) {
		ContaCorrente c;
		c = this.procurarPoupanca(numero);
		c.depositar(valor);
	}

	public ContaPoupanca procurarPoupanca(String numero) {
		int i = 0;
		boolean achou = false;
		ContaPoupanca resposta = null;
		while ((!achou) && (i < indiceP)) {
			if (ContaPoupanca[i].getNumeroConta().equals(numero)) {
				achou = true;
				cp.extratoContaPoupanca();
				resposta = ContaPoupanca[i];
			} else {
				i = i + 1;
			}
		}
		if (!achou)
			System.out.println("Conta Poupança não localizada");
		return resposta;
	}

}
