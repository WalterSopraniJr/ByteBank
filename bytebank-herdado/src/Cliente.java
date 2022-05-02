//implements: cliente assinou um contrato
public class Cliente implements Autenticavel {

	private AutenticacaoSenha autenticador;
	
	public Cliente() {
		this.autenticador = new AutenticacaoSenha();
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
