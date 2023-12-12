package TareaEntonosIvanJuan;

import java.util.Scanner;

public class Tarea_Entornos {
	static Scanner entrada= new Scanner (System.in);

	public static void main(String[] args) {
		int lado1=0;
		int lado2=0;
		double triangulo = areaTriangulo(lado1,lado2);
		System.out.println("El área es: "+triangulo);

	}
	public static double areaTriangulo (int lado1, int lado2) {
		System.out.println("introduzca el primer lado");
		lado1=entrada.nextInt();
		System.out.println("introduzca el segundo lado");
		lado2=entrada.nextInt();
		double area=lado1*lado2;
		return area;
	}

}
