public class ClienteNormal extends ClienteBase {
	public ClienteNormal(String nome) {
		super(nome);
	}

	@Override
	public TipoCliente getTipoCliente() {
		return TipoCliente.NORMAL;
	}

	@Override
	public void registrarPedido(double precoItem, Integer qtdItens) {
		double pontosSemBonus = (precoItem / 10) * qtdItens;

		this.adicionarPontos(pontosSemBonus);
		this.pontosExtras(precoItem);
	}
}
