public class TestaConta {
	public static void main(String[] args) {
		Conta c1 = new Conta("Hugo");

		//c1.setNome("Hugo");
		c1.setNumero(123);
		c1.setAgencia("45678-9");
		c1.deposita(50.0);
		c1.setDataDeAbertura(04, 06, 2015);

		System.out.println(c1.getNome());
		System.out.println(c1.getNumero());
		System.out.println(c1.getAgencia());
		System.out.println(c1.getSaldo());
		System.out.println(c1.getDataDeAbertura());

	}
}
