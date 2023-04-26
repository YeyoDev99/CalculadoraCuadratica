package actividad1;

// creo la superclase que guardara los atributos de la cuadratica:
public class Cuadratica {
	// declaro los atributos privados:
		protected double numeroA;
		protected double numeroB;
		protected double numeroC;
		protected double valorDentroDeRaiz;

		// creo el metodo constructor:
		Cuadratica(double numeroA, double numeroB, double numeroC) {
			this.numeroA = numeroA;
			this.numeroB = numeroB;
			this.numeroC = numeroC;
		}
		// creo los metodos que se encargaran de hacer los calculos:
		
		
		
		// creo los getters y setters:
		public double getNumeroA() {
			return numeroA;
		}

		public void setNumeroA(double numeroA) {
			this.numeroA = numeroA;
		}

		public double getNumeroB() {
			return numeroB;
		}

		public void setNumeroB(double numeroB) {
			this.numeroB = numeroB;
		}

		public double getNumeroC() {
			return numeroC;
		}

		public void setNumeroC(double numeroC) {
			this.numeroC = numeroC;
		}

		public double getValorDentroDeRaiz() {
			return valorDentroDeRaiz;
		}

		public void setValorDentroDeRaiz(double valorDentroDeRaiz) {
			this.valorDentroDeRaiz = valorDentroDeRaiz;
		}

	
		

		
		
}
