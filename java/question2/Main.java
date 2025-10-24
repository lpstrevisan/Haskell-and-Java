public class Main {
	public static void main(String[] args) {
		Hamburgueria bigFood = new Hamburgueria(15, 10, 5, 0.2);

		bigFood.adicionarCliente("Isabela", TipoCliente.VIP);
		bigFood.adicionarCliente("Livia", TipoCliente.VIP);
		bigFood.adicionarCliente("Sofia", TipoCliente.VIP);
		bigFood.adicionarCliente("Maria", TipoCliente.NORMAL);
		bigFood.adicionarCliente("Ana", TipoCliente.NORMAL);
		bigFood.adicionarCliente("Helena", TipoCliente.NORMAL);

		bigFood.adicionarCliente("Arthur", TipoCliente.VIP);
		bigFood.adicionarCliente("Bernardo", TipoCliente.VIP);
		bigFood.adicionarCliente("José", TipoCliente.VIP);
		bigFood.adicionarCliente("Davi", TipoCliente.NORMAL);
		bigFood.adicionarCliente("Gabriel", TipoCliente.NORMAL);
		bigFood.adicionarCliente("Heitor", TipoCliente.NORMAL);

		bigFood.adicionarCompra("Isabela", 2, 1, 1);
		bigFood.adicionarCompra("Isabela", 1, 0, 2);
		bigFood.adicionarCompra("Isabela", 3, 2, 1);

		bigFood.adicionarCompra("Livia", 1, 1, 1);
		bigFood.adicionarCompra("Livia", 2, 0, 0);

		bigFood.adicionarCompra("Sofia", 0, 2, 3);
		bigFood.adicionarCompra("Sofia", 1, 1, 0);

		bigFood.adicionarCompra("Maria", 2, 0, 1);
		bigFood.adicionarCompra("Maria", 1, 1, 1);

		bigFood.adicionarCompra("Ana", 3, 0, 0);
		bigFood.adicionarCompra("Ana", 1, 2, 1);

		bigFood.adicionarCompra("Helena", 1, 1, 2);

		bigFood.adicionarCompra("Arthur", 2, 2, 2);
		bigFood.adicionarCompra("Arthur", 1, 0, 1);

		bigFood.adicionarCompra("Bernardo", 3, 1, 0);

		bigFood.adicionarCompra("José", 1, 2, 2);

		bigFood.adicionarCompra("Davi", 2, 1, 0);

		bigFood.adicionarCompra("Gabriel", 1, 0, 1);

		bigFood.adicionarCompra("Heitor", 0, 1, 2);
		bigFood.adicionarCompra("Heitor", 2, 0, 0);

		bigFood.adicionarCompra("Isabela", 1, 1, 1);
		bigFood.adicionarCompra("Davi", 1, 0, 0);
		bigFood.adicionarCompra("Sofia", 1, 0, 0);
		bigFood.adicionarCompra("Helena", 1, 0, 0);
		bigFood.adicionarCompra("Arthur", 1, 0, 0);

		bigFood.finalizarPromocao();

	}
}
