public class Adulto extends Pessoa {
	public Adulto(Integer idade, String nome) {
		super(idade, nome);
	}

	@Override
	public Ticket getTicketType() {
		return Ticket.ADULTO;
	}
}
