import java.util.Scanner;		//IMPORTAR SCANNER
public class M�ximoYM�nimo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);		//CREAR TECLADO
		
		System.out.print("Introduzca un n�mero: ");			//SOLICITA N�MERO
		double x = teclado.nextDouble();		//CREAR X Y ALMACENAR PRIMER VALOR
		double max = x;		//CREAR MAX Y DA VALOR DE X
		double min = x;		//CREAR MIN Y DA VALOR DE Y
		
		while (x>=0 && x<=100) {		//MIENTRAS X SEA POSITIVO Y MENOR QUE 100
			System.out.print("Introduzca un n�mero: ");		//SOLICITA SIGUIENTE VALOR
			x = teclado.nextDouble();		//ALMACENAR VALOR EN X
			if (x > max);		//SI ES MAYOR QUE MAX
				max = x;		//ACTUALIZAR VALOR DE MAX
			if (x < min);		//SI ES MENOR QUE MIN
				min = x;		//ACTUALIZAR VALOR DE MIN
		}
		
				//OUTPUT
		System.out.printf("El mayor n�mero introducido fue el %f.\n",max);
		System.out.printf("El menor n�mero introducido fue el %f.\n",min);
	}

}
