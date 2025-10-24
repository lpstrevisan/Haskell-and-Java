public class Automovel {
	private double combustivelAtual;
	private double capacidadeMaximaTanque;
	private TipoMotor motor;

	public Automovel(double combustivelAtual, double capacidadeMaximaTanque, TipoMotor motor) {
		this.combustivelAtual = combustivelAtual;
		this.capacidadeMaximaTanque = capacidadeMaximaTanque;
		this.motor = motor;
	}

	public double getCombustivelAtual() {
		return combustivelAtual;
	}

	public void setCombustivelAtual(double CombustivelAtual) {
		this.combustivelAtual += CombustivelAtual;
	}

	public double getCapacidadeMaximaTanque() {
		return capacidadeMaximaTanque;
	}

	public TipoMotor getMotor() {
		return motor;
	}
}
