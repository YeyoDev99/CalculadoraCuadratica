package SolucionadorCuadratica;

// creo la subclase que resolvera la ecuacion heredando de la clase cuadratica:
public class SolucionadorCuadratica extends Cuadratica {
	// declaro los atributos privados:

	private String resultado;

	// creo el metodo constructor:

	SolucionadorCuadratica(double numeroA, double numeroB, double numeroC) {
		super(numeroA, numeroB, numeroC);
	}

	// creo el metodo que calculara la solucion de la cuadratica:
	public void calculadoraCuadratica() {
		valorDentroDeRaiz = (Math.pow(numeroB, 2) - (4 * numeroA * numeroC));
		if (numeroA == 0 & numeroB == 0 & numeroC == 0) {
			resultado = "\n\t0=0 (infinitas soluciones)";
		} else if (numeroA == 0 & numeroB == 0 & numeroC != 0) {
			resultado = "\n\tabsurdo matemático; " + numeroC + " != 0" + " ; no tiene solución";
		} else if (numeroA == 0 & numeroB != 0 & numeroC != 0) {
			double x = -numeroC / numeroB;
			resultado = "\n\tX=" + x;
		} else if (numeroA == 0 & numeroB != 0 & numeroC == 0) {
			resultado = "\n\tX=0";

		} else if (numeroA != 0 & numeroB == 0 & numeroC == 0) {
			resultado = "\n\tX=0";

		} else if (numeroA != 0 & numeroB == 0 & numeroC != 0) {
			// soluciones reales
			if (valorDentroDeRaiz > 0) {
				resultado = "\n\tLas 2 soluciones son: X1= " + (Math.sqrt(valorDentroDeRaiz) / (2 * numeroA))
						+ " y X2= " + (-Math.sqrt(valorDentroDeRaiz) / (2 * numeroA));

			} else if (valorDentroDeRaiz == 0) {
				resultado = "\n\tX= " + (Math.sqrt(valorDentroDeRaiz) / (2 * numeroA));

			} else if (valorDentroDeRaiz < 0) {
				valorDentroDeRaiz = valorDentroDeRaiz * -1;
				resultado = "\n\tLas 2 soluciones son: X1= " + Math.sqrt(valorDentroDeRaiz) + "i/" + (2 * numeroA)
						+ " y X2= " + -Math.sqrt(valorDentroDeRaiz) + "i/" + (2 * numeroA);

			}
		} else if (numeroA != 0 & numeroB != 0 & numeroC == 0) {
			resultado = "\n\tLas 2 soluciones son: X1= " + (numeroB + Math.sqrt(Math.pow(numeroB, 2))) / (2 * numeroA)
					+ " y X2= " + (numeroB - Math.sqrt(Math.pow(numeroB, 2)) / (2 * numeroA));

		} else if (numeroA != 0 & numeroB != 0 & numeroC != 0) {
			if (valorDentroDeRaiz > 0) {
				resultado = "\n\tLas 2 soluciones son: X1= " + (numeroB + Math.sqrt(valorDentroDeRaiz)) / (2 * numeroA)
						+ " y X2= " + (numeroB - Math.sqrt(valorDentroDeRaiz)) / (2 * numeroA);

			} else if (valorDentroDeRaiz == 0) {
				resultado = "\n\tX= " + (numeroB / (2 * numeroA));

			} else if (valorDentroDeRaiz < 0) {
				valorDentroDeRaiz = valorDentroDeRaiz * -1;
				resultado = "\n\tLas 2 soluciones son: X1= " + numeroB + "+" + Math.sqrt(valorDentroDeRaiz) + "i/"
						+ (2 * numeroA) + " y X2= " + numeroB + "" + (-Math.sqrt(valorDentroDeRaiz)) + "i/"
						+ (2 * numeroA);

			}

		}

	}
	// creo los getters y setters:

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

}
