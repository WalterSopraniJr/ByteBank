//Gerente é um funcionario, herdou a classe dele, assina o contrato Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

	private AutenticacaoSenha autenticador;

	public Gerente() {
		this.autenticador = new AutenticacaoSenha();
	}
	
	public double getBonificacao() {
		System.out.println("Utilizando método de Bonificação da classe GERENTE");
		return super.getSalario();
	}
	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}
}
