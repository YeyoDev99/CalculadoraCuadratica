/*
 * AUTOR: YADER IBRALDO QUIROGA TORRES
 * PROGRAMA: SOLUCIONADOR DE ECUACION CUADRATICA
 * FECHA: 11-04-2023
 */

package actividad1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		// declaro el BufferedReader:
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int validador = 0;
		System.out.println("\n\tBienvenido al solucionador de una Ecuacion cuadratica: ");
		// creo un ciclo para definir el programa:
		while (true) {

			System.out.print("\n\tdigite los valores de la cuadratica de forma Ax^2+Bx+C=0: ");
			System.out.print("\n\tA: ");
			double numeroA = 1;
			while (validador == 0) {
				try {
					numeroA = Double.parseDouble(in.readLine());
					validador = 1;
				} catch (Exception e) {
					System.out.print("\n\t---Porfavor digite un numero valido!!\n\t:");
					validador = 0;

				}
			}
			validador = 0;
			System.out.print("\n\tB: ");
			double numeroB = 1;
			while (validador == 0) {
				try {
					numeroB = Double.parseDouble(in.readLine());
					validador = 1;
				} catch (Exception e) {
					System.out.print("\n\t---Porfavor digite un numero valido!!\n\t:");
					validador = 0;

				}
			}
			validador = 0;
			System.out.print("\n\tC: ");
			double numeroC = 1;
			while (validador == 0) {
				try {
					numeroC = Double.parseDouble(in.readLine());
					validador = 1;
				} catch (Exception e) {
					System.out.print("\n\t---Porfavor digite un numero valido!!\n\t:");
					validador = 0;

				}
			}
			validador = 0;

			// se crea el objeto a partir de la clase "resolusorCuadratica":

			SolucionadorCuadratica resolusor = new SolucionadorCuadratica(numeroA, numeroB, numeroC);
			resolusor.calculadoraCuadratica();
			System.out.println("\n\tLa solucion es: \n" + resolusor.getResultado());

			// se le pregunta al usuario si desea seguir con el programa:
			System.out.print(
					"\n\tpor favor digite la letra \"y\" si desea seguir con el programa, si desea salir digite cualquier otra tecla: ");
			String eleccionError = in.readLine().toLowerCase();
			if (!eleccionError.equals("y")) {
				System.out.print(
						"\n\t----------------------------------------------------------------------------------------------------------- ");
				System.out.println("\n\tgracias por utilizar nuestro programa.");
				break;

			}
		}

	}

}
