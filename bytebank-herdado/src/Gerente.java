//Gerente é um funcionario, herdou a classe dele, assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private int senha;
	
	public double getBonificacao() {
		System.out.println("Utilizando método de Bonificação da classe GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
