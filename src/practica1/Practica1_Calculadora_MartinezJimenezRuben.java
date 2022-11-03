package practica1;

import java.util.Scanner;

public class Practica1_Calculadora_MartinezJimenezRuben {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char operacion = 'e';
		double operador1;
		double operador2;
		double result;
		while (operacion != 'A') {
			// Imprimimos el GUI
			System.out.println("┌───────────────────────────────────────────────────┐\n"
					+ "│                                                   │\n"
					+ "│       Calculadora de Ruben Martinez Jimenez       │\n"
					+ "│                                                   │\n"
					+ "│                ¿Qué quieres hacer?                │\n"
					+ "│                                                   │\n"
					+ "│                 s) Suma                           │\n"
					+ "│                                                   │\n"
					+ "│                 r) Resta                          │\n"
					+ "│                                                   │\n"
					+ "│                 m) Multiplicación                 │\n"
					+ "│                                                   │\n"
					+ "│                 d) División                       │\n"
					+ "│                                                   │\n"
					+ "│                 A) Salir                          │\n"
					+ "│                                                   │\n"
					+ "│ Pulse la tecla de la operacion que quieras hacer. │\n"
					+ "│                                                   │\n"
					+ "└───────────────────────────────────────────────────┘");
			operacion = entrada.nextLine().charAt(0);
			switch (operacion) {
			case ('s'):
			case ('S'):
				System.out.println("Introduce el primer numero: ");
				operador1 = entrada.nextDouble();
				System.out.println("Introduce el segundo numero: ");
				operador2 = entrada.nextDouble();
				entrada.nextLine();
				result = operador1 + operador2;
				System.out.println(operador1 + " + " + operador2 + " = " + result);
				break;
			case ('r'):
			case ('R'):
				System.out.println("Introduce el primer numero: ");
				operador1 = entrada.nextDouble();
				System.out.println("Introduce el segundo numero: ");
				operador2 = entrada.nextDouble();
				entrada.nextLine();
				result = operador1 - operador2;
				System.out.println(operador1 + " - " + operador2 + " = " + result);
				break;
			case ('m'):
			case ('M'):
				System.out.println("Introduce el primer numero: ");
				operador1 = entrada.nextDouble();
				System.out.println("Introduce el segundo numero: ");
				operador2 = entrada.nextDouble();
				entrada.nextLine();
				result = operador1 * operador2;
				System.out.println(operador1 + " x " + operador2 + " = " + result);
				break;
			case ('d'):
			case ('D'):
				System.out.println("Introduce el primer numero: ");
				operador1 = entrada.nextDouble();
				System.out.println("Introduce el segundo numero: ");
				operador2 = entrada.nextDouble();
				entrada.nextLine();
				result = operador1 / operador2;
				System.out.println(operador1 + " / " + operador2 + " = " + result);
				break;
			case ('a'):
			case ('A'):
				operacion = 'A';
				break;
			default:
				operacion = 'e';
			}
		}
		entrada.close();
	}

}
