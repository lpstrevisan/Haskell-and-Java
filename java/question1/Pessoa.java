import java.lang.Comparable;

public abstract class Pessoa implements Comparable<Pessoa> {
	private Integer idade;
	private String nome;

	public Pessoa(Integer idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}

	public abstract Ticket getTicketType();

	@Override
	public int compareTo(Pessoa pessoa) {
		return this.idade.compareTo(pessoa.idade);
	}

	public String getName() {
		return nome;
	}

	public Integer getAge() {
		return idade;
	}

	@Override
	public String toString() {
		return nome + ":" + idade + "[" + getTicketType() + "]";
	}
}
