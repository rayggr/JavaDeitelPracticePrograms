//Fig 2.15
package cap1;

import java.util.Scanner;

public class Comparacion {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero1, numero2;
		
		System.out.print("Escriba el primer entero :");
		numero1 = entrada.nextInt();
		
		System.out.print("Escriba el segundo numero: ");
		numero2 = entrada.nextInt();
		
		if(numero1 == numero2)
			System.out.printf("%d == %d%n",numero1,numero2);
		
		if(numero1 != numero2)
			System.out.printf("%d != %d%n", numero1, numero2);
		
		if(numero1 < numero2)
			System.out.printf("%d < %d%n", numero1,numero2);
		
		if(numero1 > numero2)
			System.out.printf("%d > %d%n", numero1,numero2);

		if(numero1 <= numero2)
			System.out.printf("%d <= %d%n", numero1,numero2);
		
		if(numero1 >= numero2)
			System.out.printf("%d >= %d%n", numero1,numero2);
		
	}

}
