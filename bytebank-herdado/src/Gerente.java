
public class Gerente extends FuncionarioAutenticavel {

	public double getBonificacao() {
		System.out.println("Utilizando método de Bonificação da classe GERENTE");
		return super.getSalario();
	}
}
