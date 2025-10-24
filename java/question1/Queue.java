import java.util.ArrayList;
import java.util.Collections;

public class Queue<T> {
	ArrayList<T> Pessoas;

	public Queue() {
		this.Pessoas = new ArrayList<>(10);
	}

	public Queue(Integer length) {
		this.Pessoas = new ArrayList<>(length);
	}

	public void push(T pessoas) {
		Pessoas.add(pessoas);
		Collections.sort(Pessoas, Collections.reverseOrder());
	}

	public T pop() {
		T pessoa = Pessoas.get(0);
		Pessoas.remove(0);

		return pessoa;
	}

	public boolean isEmpty() {
		if (Pessoas.size() == 0) {
			return true;
		} else {
			return false;
		}
	}
}
