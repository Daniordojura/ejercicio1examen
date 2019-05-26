
//Daniel Ordóñez Jurado

	public class Multiplicar3 {
		int num1;
		int num2;
		int num3;
		int num4;
		
		public Multiplicar3(int num1, int num2, int num3, int num4) {
			num1 = num1;
			num2 = num2;
			num3 = num3;
			num4 = num4;
		}
		
		public int multiplicar() {
			int resultado = num1 * num2 * num3 * num4;
			return resultado;
		}

	public static void main(String[] args) {
		Multiplicar3 c1=new Multiplicar3(2,5, 10,5);
		System.out.println(c1.multiplicar());
		
	}
	}
