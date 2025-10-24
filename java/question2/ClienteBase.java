import java.lang.Comparable;

public abstract class ClienteBase implements Cliente, Comparable<ClienteBase> {
	private String nome;
	private double pontuacaoAtual;

	public ClienteBase(String nome) {
		this.nome = nome;
		this.pontuacaoAtual = 0.0;
	}

	public String getNome() {
		return nome;
	}

	@Override
	public int compareTo(ClienteBase clienteBase) {
		return Double.compare(this.pontuacaoAtual, clienteBase.pontuacaoAtual);
	}

	@Override
	public void adicionarPontos(double pontos) {
		pontuacaoAtual += pontos;
	}

	@Override
	public double getPontuacaoAtual() {
		return pontuacaoAtual;
	}

	public abstract TipoCliente getTipoCliente();

	public abstract void registrarPedido(double precoItem, Integer qtdIntens);

	public void pontosExtras(double valorCompra) {
		if (valorCompra >= 10) {
			pontuacaoAtual += Math.floor(valorCompra / 10);
		}
	}

}
