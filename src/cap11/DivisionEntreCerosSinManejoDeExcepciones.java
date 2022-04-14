package cap11;

import java.util.Scanner;
import java.util.InputMismatchException;

public class DivisionEntreCerosSinManejoDeExcepciones {
    public static int cociente(int numerador, int denominador) throws InputMismatchException{
        return numerador / denominador;
    }

    public static void main(String args[]) {
        Scanner explorador = new Scanner(System.in);
        boolean continuarCiclo = true;

        do {
            try {
                System.out.println("Introduzca un numerador entero: ");
                int numerador = explorador.nextInt();
                System.out.println("Introduzca un denominador entero: ");
                int denominador = explorador.nextInt();

                int resultado = cociente(numerador,denominador);
                System.out.printf("%nResultado: %d / %d = %d%n",numerador,denominador,resultado);
                continuarCiclo = false;
            }catch (InputMismatchException inputMismatchException) {
                System.err.printf("%nExcecion: %s%n", inputMismatchException);
                explorador.nextLine();
                System.out.println("Debe introducir enteros. Intente de nuevo. %n%n.");
            }catch(ArithmeticException arithmeticException){
                System.err.printf("%nExcepcion: %s%n",arithmeticException);
                System.out.printf("Cero es un denominador invalido. Intente de nuevo. %n%n");
            }
        }while(continuarCiclo);
    }
}
