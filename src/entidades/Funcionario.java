package entidades;

public class Funcionario {
	private String nome;
	private double salarioBruto;
	private double imposto;
	
	public Funcionario(String nome, double salarioBruto, double imposto) {
		super();
		this.nome = nome;
		this.salarioBruto = salarioBruto;
		this.imposto = imposto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void addSalario(double percentual) {
		salarioBruto += salarioBruto * percentual / 100;
		salarioLiquido();
	}

	public String toString() {
		return "Funcionario \nnome: " + nome + "\nSalario Liquido: " + salarioLiquido();
	}

	
		
}
