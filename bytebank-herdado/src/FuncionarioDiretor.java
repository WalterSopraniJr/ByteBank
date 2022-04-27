
public class FuncionarioDiretor {
	public static void main(String[] args) {
		FuncionarioTeste funcionarioComum = new FuncionarioTeste();
		funcionarioComum.setSalario(3000.0);
		System.out.println(funcionarioComum.getTipo());
		System.out.println(funcionarioComum.getBonificacao());
		
		FuncionarioTeste funcionarioGerente = new FuncionarioTeste();
		funcionarioGerente.setTipo(1);
		funcionarioGerente.setSalario(5000.0);
		System.out.println(funcionarioGerente.getTipo());
		System.out.println(funcionarioGerente.getBonificacao());
		
		FuncionarioTeste funcionarioDiretor = new FuncionarioTeste();
		funcionarioDiretor.setTipo(2);
		funcionarioDiretor.setSalario(9000.0);
		System.out.println(funcionarioDiretor.getTipo());
		System.out.println(funcionarioDiretor.getBonificacao());
	}

}
