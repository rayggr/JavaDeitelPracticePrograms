package cap5;

public class OperadoresLogicos {
	public static void main(String[] args) {
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "AND condicional (&&)", "false && false ",
				(false && false), "false && true", (false && true), "true && false", (true && false), "true && true",
				(true && true));

		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "OR condicional (||)", "false || false ",
				(false || false), "false || true", (false || true), "true || false", (true || false), "true || true",
				(true || true));

		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "AND logico bolean (&)", "false & false ",
				(false & false), "false & true", (false & true), "true & false", (true & false), "true & true",
				(true & true));

		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "OR exlusivo logico boleano (^)", "false ^ false ",
				(false ^ false), "false ^ true", (false ^ true), "true ^ false", (true ^ false), "true ^ true",
				(true ^ true));
	}

}
