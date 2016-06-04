public class TestaConta {
	
	public static void main(String[] args) {
		Conta c = new ContaPoupanca();
		c.setSaldo(1000);
		System.out.println(c.getSaldo());
		c.imprimeExtratoDetalhado();
	}
	
}
