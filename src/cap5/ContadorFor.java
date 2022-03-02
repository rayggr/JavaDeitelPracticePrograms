package cap5;

public class ContadorFor {
	public static void main(String[] args) {
		for (int contador = 1; contador <= 10; contador++)
			System.out.printf("%d ", contador);
			
		int x = 0;
		for (;;) {
			x++;
			System.out.printf("%d ", x);
			if (x == 10)
				break;
		}
	}

}
