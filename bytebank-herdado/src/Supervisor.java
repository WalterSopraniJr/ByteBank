
public class Supervisor extends Funcionario {

	public double getBonificacao() {
		System.out.println("Utilizando m�todo de Bonifica��o da classe SUPERVISOR");
		return super.getBonificacao() + super.getSalario();
	}
}
