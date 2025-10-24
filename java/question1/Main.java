import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Queue<Pessoa> queue = new Queue<>(5);

		queue.push(new Crianca(5, "Child 1"));
		queue.push(new Adulto(30, "Adult 1"));
		queue.push(new Crianca(6, "Child 2"));
		queue.push(new Crianca(8, "Child 3"));
		queue.push(new Adulto(20, "Adult 2"));

		while (!queue.isEmpty()) {
			Pessoa p = queue.pop();
			System.out.println(p);
		}
	}
}
