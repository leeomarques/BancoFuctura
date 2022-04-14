package Prática;

import java.io.IOException;
import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		boolean continua = true;

		BancoFuctura bancoFuctura = new BancoFuctura();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();

		while (continua) {
			mostarMenu();
			int opcao = entrada.nextInt();

			if (opcao <= 8) {
				Scanner entrada1 = new Scanner(System.in);
				switch (opcao) {
				case 1:
					System.out.println("1 - Conta Corrente / 2 - Poupança");
					String case1 = entrada1.nextLine();
					if (case1.equals("1")) {
						System.out.println("Criar Conta");
						System.out.println("Digite o Nome do Titular da Conta");
						cc.setNomeTitular(entrada1.nextLine());
						System.out.println("Digite o Número da Conta");
						cc.setNumeroConta(entrada1.nextLine());
						System.out.println("Faça o primeiro depósito");
						cc.setSaldoDisp(entrada1.nextDouble());
						System.out.println("Digite uma senha de senha de 4 a 6 dígitos");
						cc.setSenha(entrada1.nextLine());
						System.out.println("\n");
						bancoFuctura.cadastrarConta(cc);
					} else if (case1.equals("2")) {
						System.out.println("Criar Conta");
						System.out.println("Digite o Nome do Titular da Conta");
						cp.setNomeTitular(entrada1.nextLine());
						System.out.println("Digite o Número da Conta");
						cp.setNumeroConta(entrada1.nextLine());
						System.out.println("Faça o primeiro depósito");
						cp.setSaldoDisp(entrada1.nextDouble());
						System.out.println("Digite uma senha de senha de 4 a 6 dígitos");
						cp.setSenha(entrada1.nextLine());
						System.out.println("\n");
						bancoFuctura.cadastrarPoupanca(cp);
					} else {
						System.out.println("Insira um valor correto!");
					}

					break;
				case 2:
					System.out.println("1 - Conta Corrente / 2 - Poupança");
					String case2 = entrada1.nextLine();
					if (case2.equals("1")) {
						cc.extratoContaCorrente();
					} else if (case2.equals("2")) {
						cp.extratoContaPoupanca();
					} else {
						System.out.println("Insira um valor correto!");
					}
					break;
				case 3:
					System.out.println("1 - Conta Corrente / 2 - Poupança");
					String case3 = entrada1.nextLine();
					if (case3.equals("1")) {
						System.out.println("Informe o valor a ser Depositado");
						cc.depositar(entrada1.nextDouble());
					} else if (case3.equals("2")) {
						System.out.println("Informe o valor a ser Depositado");
						cp.depositar(entrada1.nextDouble());
					} else {
						System.out.println("Insira um valor correto!");
					}
					break;
				case 4:
					System.out.println("1 - Conta Corrente / 2 - Poupança");
					String case4 = entrada1.nextLine();
					if (case4.equals("1")) {
						System.out.println("Informe o valor a ser Sacado");
						cc.sacar(entrada1.nextDouble());
					} else if (case4.equals("2")) {
						System.out.println("Informe o valor a ser Sacado");
						cp.sacar(entrada1.nextDouble());
					} else {
						System.out.println("Insira um valor correto!");
					}
					break;
				case 5:
					System.out.println("Informe o valor");
					cc.aplicar(entrada1.nextDouble(), cp);
					break;
				case 6:
					System.out.println("Informe o valor");
					cp.resgatar(entrada1.nextDouble(), cp);
					break;
				case 7:
					System.out.println("Localizar Conta");
					System.out.println("1 - Conta Corrente / 2 - Poupança");
					String case7 = entrada1.nextLine();
					if (case7.equals("1")) {
						System.out.println("Digite o número da Conta Corrente");
						bancoFuctura.procurarConta(entrada.nextLine());
					} else if (case7.equals("2")) {
						System.out.println("Digite o número da Conta Poupança");
						bancoFuctura.procurarPoupanca(entrada.nextLine());
					} else {
						System.out.println("Insira uma valor correto!");
					}
					break;
				case 8:
					System.out.println("Atendimento Finalizado!");
					continua = false;
					break;
				default:
					break;
				}
			} else {
				System.out.println("Opção incorreta, favor inserir novamente!");
			}

		}
	}

	private static void mostarMenu() {
		System.out.println("-----------------------------" + "\nBem vindo(a) ao Banco Fuctura\n"
				+ "\nSelecione a opção desejada" + "\n1 - Criar Conta" + "\n2 - Ver Extrato" + "\n3 - Depósito"
				+ "\n4 - Saque" + "\n5 - Aplicar" + "\n6 - Resgatar" + "\n7 - Localizar Conta" + "\n8 - Sair"
				+ "\n-----------------------------");
	}

}
