
public class Supervisor extends Funcionario {

	public double getBonificacao() {
		return super.getBonificacao() + super.getSalario();
	}
}
