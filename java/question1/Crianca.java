public class Crianca extends Pessoa {
	public Crianca(Integer idade, String nome) {
		super(idade, nome);
	}

	@Override
	public Ticket getTicketType() {
		return Ticket.CRIANCA;
	}
}
