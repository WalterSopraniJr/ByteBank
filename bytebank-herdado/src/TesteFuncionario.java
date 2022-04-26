
public class TesteFuncionario {
	
	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("Nico di Angelo");
		nico.setCpf("222.222.222-22");
		nico.setSalario(2660.00);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
		
	}

}
