package practicasu2;



import java.util.Scanner;

public class menorymayor {
	public static void main (String[]args)
	{
		Scanner entrada = new Scanner(System.in);
		int numero1;
		int numero2;
		int numero3;
		int suma;
		int promedio;
		int producto;
		int mayor;
		int menor;
		
		
		System.out.print("Introduzca el primer entero:");
		numero1 = entrada.nextInt();
		System.out.print("Introduzca el segundo entero:");
		numero2 = entrada.nextInt();
		System.out.print("Introduzca el tercer entero:");
		numero3 = entrada.nextInt();
		suma = numero1+numero2+numero3;
		promedio = suma/3;
		producto = numero1*numero2*numero3;
		if(numero1<numero2)
			mayor=numero2;
		else mayor=numero1;
		
		if(mayor>numero3);
		else mayor=numero3;
		
		if(numero1>numero2)
			menor=numero2;
		else menor=numero1;
		
		if(menor<numero3);
		else menor=numero3;
			
		
		System.out.printf("\nEl producto de los numeros es:%d\n",producto);
		System.out.printf("\nLa suma de los numeros es:%d\n",suma);
		System.out.printf("\nEl promedio de los numeros es:%d\n",promedio);
		System.out.printf("\nEl mayor de los numeros es:%d\n",mayor);
		System.out.printf("\nEl menor de los numeros es:%d\n",menor);
		
		
		
		
	}

}