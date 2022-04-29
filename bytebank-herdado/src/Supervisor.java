
public class Supervisor extends Funcionario {

	public double getBonificacao() {
		System.out.println("Utilizando método de Bonificação da classe SUPERVISOR");
		return super.getBonificacao() + super.getSalario();
	}
}
