package practicasu2;

import java.util.Scanner;

public class masacorporal {

	public static void main( String args[] )
	{
		double pK = 0, aM = 0, BMI=0;
		Scanner peso = new Scanner(System.in); 
		System.out.println("\nIntroduzca peso en kilogramos: ");
		pK = peso.nextDouble();
		
		Scanner altura = new Scanner(System.in); 
		System.out.println("\nIntroduzca su altura en metros: ");
		aM = altura.nextDouble();
		
		BMI = (pK)/(aM*aM);
		double roundBMI = Math.round(BMI*100.0)/100.0;
		
		System.out.println("Su indice de masa corporal es: "+roundBMI+"\nCategorías de IMC:\r\n"
				+ "Bajo peso = <18.5\r\n"
				+ "Peso normal = 18.5–24.9\r\n"
				+ "Sobrepeso = 25–29.9\r\n"
				+ "Obesidad = IMC de 30 o más");
		
		
		 
	}
}