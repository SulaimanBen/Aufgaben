package aufgabelambdas;

public class Max  implements IntOperation{

	@Override
	public int execute(int x, int y) {
		return Math.max(x, y);
	}

}
