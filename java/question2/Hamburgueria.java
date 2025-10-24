import java.util.ArrayList;
import java.util.Collections;

public class Hamburgueria {
	private ArrayList<ClienteBase> clientes = new ArrayList<>();
	private double precoDoHamburguer;
	private double precoDaBatata;
	private double precoDoRefri;
	private ClienteBase cliente;
	private double bonusVIP;

	public Hamburgueria(double precoDoHamburguer, double precoDaBatata, double precoDoRefri, double bonusVIP) {
		this.precoDoHamburguer = precoDoHamburguer;
		this.precoDaBatata = precoDaBatata;
		this.precoDoRefri = precoDoRefri;
		this.bonusVIP = bonusVIP;
	}

	public void adicionarCliente(String nome, TipoCliente tipo) {
		if (tipo == TipoCliente.NORMAL) {
			cliente = new ClienteNormal(nome);
		} else {
			cliente = new ClienteVIP(nome, bonusVIP);
		}

		clientes.add(cliente);
	}

	public void adicionarCompra(String nomeCliente, Integer qtdHamburguer, Integer qtdBatata, Integer qtdRefri) {
		Integer qtdTotal = qtdHamburguer + qtdBatata + qtdRefri;
		double precoTotal = qtdHamburguer * precoDoHamburguer + qtdBatata * precoDaBatata
				+ qtdRefri * precoDoRefri;
		int index = -1;

		for (int i = 0; i < clientes.size(); i++) {
			if (clientes.get(i).getNome().equals(nomeCliente)) {
				index = i;
				break;
			}
		}

		if (index == -1) {
			System.out.println("Não existe o cliente especificado");
		} else {
			clientes.get(index).registrarPedido(precoTotal, qtdTotal);
		}
	}

	public void finalizarPromocao() {
		Collections.sort(clientes, Collections.reverseOrder());

		for (int i = 0; i < 10; i++) {
			try {
				System.out.println(clientes.get(i).getNome() + " " + clientes.get(i).getPontuacaoAtual()
						+ " " + clientes.get(i).getTipoCliente());
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
			}
		}
	}
}
