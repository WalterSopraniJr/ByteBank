//o abstract não permite instanciar novas declarações, apenas em gerente, supervisor ou operador
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salario;

	//não há implementação de método aqui
	public abstract double getBonificacao();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
 
