//Interface, classe abstrata com m�todos abstratos, nada � concreto

//contrato autenticavel
	//quem assinar esse contrato, precisa implementar
		//metodo setSenha
		//metodo autentica
public abstract interface Autenticavel {

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);
	
}
