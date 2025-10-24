public class Gasolina implements BombaDeCombustivel {
	private double precoLitro;

	public Gasolina(double precoLitro) {
		this.precoLitro = precoLitro;
	}

	@Override
	public void abastecer(Automovel automovel, double quantidadeLitros)
			throws CombustivelNaoCompativel, CombustivelOverflow {
		if (automovel.getMotor() == TipoMotor.ETANOL) {
			throw new CombustivelNaoCompativel("Você está abastecendo com combustível incompatível");
		}

		double espacoDisponivel = automovel.getCapacidadeMaximaTanque() - automovel.getCombustivelAtual();

		if (quantidadeLitros > espacoDisponivel) {
			throw new CombustivelOverflow("Quantidade a ser abastecida é maior que a capacidade do tanque");
		}

		automovel.setCombustivelAtual(quantidadeLitros);
		System.out.println("Automóvel abastecido com " + quantidadeLitros + "L de Gasolina. Total no tanque: "
				+ automovel.getCombustivelAtual() + "L.");
	}

	@Override
	public void calcularCusto(double quantidadeLitros) {
		double custoTotal = quantidadeLitros * precoLitro;

		System.out.println("Informações de abastecimento:\nTipo: Gasolina\nQuantidade: " + quantidadeLitros
				+ "L\nCusto Total: R$" + String.format("%.2f", custoTotal) + "\n");
	}

	@Override
	public void ajustarPreco(double novoPreco) {
		precoLitro = novoPreco;
		System.out.println("Preço da gasolina ajustado para R$" + String.format("%.2f", novoPreco) + "/litro.");
	}
}
