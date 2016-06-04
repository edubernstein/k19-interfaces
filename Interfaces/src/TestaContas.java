public class TestaContas {
	
	public static void main(String[] args) {
		ContaCorrente c1 = new ContaCorrente();
		ContaPoupanca p1 = new ContaPoupanca();
		c1.deposita(500);
		p1.deposita(500);
		c1.saca(100);
		p1.saca(100);
		System.out.println("Saldo conta corrente: " + c1.getSaldo());
		System.out.println("Saldo conta poupança: " + p1.getSaldo());
		GeradorDeExtrato g = new GeradorDeExtrato();
		g.geraExtrato(c1);
		g.geraExtrato(p1);
	}
	
}
