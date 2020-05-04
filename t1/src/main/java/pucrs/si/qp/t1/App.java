package pucrs.si.qp.t1;

/**
 * 
 * @author marco.mangan@pucrs.br
 * 
 */
public class App {

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return
	 */
	public static int identificaTriangulo(int a, int b, int c) {
		if ((a < b + c) && (b < a + c) && (c < b + a)) {
			if ((a == b) && (b == c))
				return tipos.EQUILATERO.value();
			else if ((a != b) && (a != c) && (b != c))
				return tipos.ESCALENO.value();
			
			else
				return tipos.ISOSCELES.value();
			
		}	
		else if(a <= 0 || b <= 0 || c <= 0)
			return tipos.INVALIDO_IN.value();
		
		return tipos.INVALIDO.value();

	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Triângulos!");
		if(identificaTriangulo(2, 3, 4)==2) {
			System.out.println("TEM QUE SER Triângulos ESCALENO = 2");
			System.out.println("É: "+identificaTriangulo(2, 3, 4));
		}
		if(identificaTriangulo(5, 5, 5) == 1) {
			System.out.println("TEM QUE SER Triângulos EQUILATERO = 1");
			System.out.println("É: "+identificaTriangulo(5, 5, 5));
		}
		if(identificaTriangulo(6, 6, 7)==3) {
			System.out.println(" TEM QUE SER Triângulos ISOSCELES = 3");
			System.out.println("É: "+identificaTriangulo(5, 5, 5));
		}
		if(identificaTriangulo(6, 7, 6) == 3) {
			System.out.println(" TEM QUE SER Triângulos ISOSCELES = 3");
			System.out.println("É: "+identificaTriangulo(6, 7, 6));

		}
		//if(identificaTriangulo(8, 0, 9) == 5) {
			System.out.println(" ENTRADA INVALIDA = 5");
			System.out.println(" o que é : "+identificaTriangulo(8, 0, 9));

		//}
		if(identificaTriangulo(2, 3, -4)== 5) {
			System.out.println(" ENTRADA INVALIDA = 5");
			System.out.println("É: "+identificaTriangulo(2, 3, -4));
		}
		if(identificaTriangulo(1, 2, 3) == 4) {
			System.out.println("INVALIDO = 4");
			System.out.println("É: "+identificaTriangulo(1, 2, 3));

		}
		if(identificaTriangulo(1, 3, 2) == 4) {
			System.out.println("INVALIDO = 4");
			System.out.println("É: "+identificaTriangulo(1, 3, 2));
		}
		if(identificaTriangulo(3, 1, 2) == 4) {
			System.out.println("INVALIDO = 4");
			System.out.println("É: "+identificaTriangulo(3, 1, 2));

		}
		if(identificaTriangulo(1, 2, 8) == 4) {
			System.out.println("INVALIDO = 4");
			System.out.println("É: "+identificaTriangulo(1, 2, 8));

		}
		if(identificaTriangulo(8, 1, 2) == 4) {
			System.out.println("INVALIDO = 4");
			System.out.println("É: "+identificaTriangulo(8, 1, 2));

		}
		if(identificaTriangulo(1/2, 3/4, 5) == 5) {
			System.out.println(" ENTRADA INVALIDA = 5");
			System.out.println(identificaTriangulo(1/2, 3/4, 5));
		}
		
		/*EQUILATERO(1), ESCALENO(2), ISOSCELES(3), INVALIDO(4),
		INVALIDO_IN(5);*/


	}
}