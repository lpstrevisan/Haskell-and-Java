public class ClienteVIP extends ClienteBase {
	private double bonusVIP;

	public ClienteVIP(String nome, double bonusVIP) {
		super(nome);
		this.bonusVIP = bonusVIP;
	}

	@Override
	public TipoCliente getTipoCliente() {
		return TipoCliente.VIP;
	}

	@Override
	public void registrarPedido(double precoItem, Integer qtdItem) {
		double pontosSemBonus = (precoItem / 10) * qtdItem;

		double pontosComBonus = Math.ceil(bonusVIP * pontosSemBonus * qtdItem);

		this.adicionarPontos(pontosComBonus);
		this.pontosExtras(precoItem);
	}
}
