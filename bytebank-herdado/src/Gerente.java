
public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
		System.out.println("Utilizando m�todo de Bonifica��o da classe GERENTE");
		return super.getSalario();
	}
}
