public class Main {
	public static void main(String[] args) {
		Automovel a = new Automovel(5.0, 50.0, TipoMotor.ETANOL);

		Gasolina bombaGasolina = new Gasolina(6.80);
		Etanol bombaEtanol = new Etanol(5.50);

		try {
			bombaGasolina.abastecer(a, 5.0);
			bombaGasolina.calcularCusto(5.0);
		} catch (CombustivelNaoCompativel | CombustivelOverflow e) {
			System.err.println("Erro: " + e.getMessage());
		}

		try {
			bombaEtanol.abastecer(a, 46.0);
			bombaEtanol.calcularCusto(46.0);
		} catch (CombustivelNaoCompativel | CombustivelOverflow e) {
			System.err.println("Erro: " + e.getMessage());
		}

		try {
			bombaEtanol.abastecer(a, 45.0);
			bombaEtanol.calcularCusto(45.0);
		} catch (CombustivelNaoCompativel | CombustivelOverflow e) {
			System.err.println("Erro: " + e.getMessage());
			bombaEtanol.calcularCusto(45.0);
		}
	}
}
