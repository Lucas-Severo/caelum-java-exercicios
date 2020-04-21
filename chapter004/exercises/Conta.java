public class Conta {
	String nome;
	int numero;
	String agencia;
	double saldo;
	String dataDeAbertura;

	public void saca(double valor) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public double calculaRendimento() {
		return saldo * 0.1;	
	}

	public String recuperaDadosParaImpressao() {
		return "Nome: " + nome +
			   "\nNumero: " + numero + 
			   "\nAgencia: " + agencia + 
			   "\nSaldo: " + saldo + 
			   "\nData de abertura: " + dataDeAbertura;
	}

	@Override
	public String toString() {
		return "Nome: " + nome +
			   "\nNumero: " + numero + 
			   "\nAgencia: " + agencia + 
			   "\nSaldo: " + saldo + 
			   "\nData de abertura: " + dataDeAbertura;
	}

}
