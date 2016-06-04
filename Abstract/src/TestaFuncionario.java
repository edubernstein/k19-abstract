public class TestaFuncionario {
	
	public static void main(String[] args) {
		Funcionario f = new Gerente();
		f.setNome("Funcionário 1");
		f.setSalario(10000.0);
		System.out.println("Nome do funcionário: " + f.getNome());
		System.out.println("Salário: " + f.getSalario());
		System.out.println("Bonificação de gerente: " + f.calculaBonificacao());
	}
	
}
