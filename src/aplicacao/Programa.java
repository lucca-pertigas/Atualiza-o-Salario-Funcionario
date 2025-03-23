package aplicacao;

import java.util.Scanner;

import entidades.Funcionario;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os dados do funcionario");
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		System.out.println("Salario Bruto: ");
		double salarioBruto = sc.nextDouble();
		System.out.println("Imposto: ");
		double imposto = sc.nextDouble();
		Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);
		System.out.println(funcionario);
		System.out.println("Em quantos porcentos voce deseja aumentar o salario: ");
		double porcentagem = sc.nextDouble();
		funcionario.addSalario(porcentagem);
		System.out.println(funcionario);
			

	}

}
