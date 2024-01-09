package TareaEntonosIvanJuan;

import java.util.Scanner;

public class Tarea_Entornos {
	static Scanner entrada= new Scanner (System.in);

	public static void main(String[] args) {
		//declaracion de variables
		int lado1=0;
		int lado2=0;
		int radio=0;
		int altura=0;
		double triangulo = areaTriangulo(lado1,lado2);
		System.out.println("El área es del triangulo: "+triangulo);
		double cilindro = areaCilindro(radio,altura);
		System.out.println("El area del cilindro: "+cilindro);

	}
	public static double areaTriangulo (int lado1, int lado2) {
		System.out.println("introduzca el primer lado");
		lado1=entrada.nextInt();
		System.out.println("introduzca el segundo lado");
		lado2=entrada.nextInt();
		double area=lado1*lado2;
		return area;
	}
	public static double areaCilindro (int radio, int altura) {
		System.out.println("Introduce el radio");
		radio=entrada.nextInt();
		System.out.println("Introduce la altura");
		altura=entrada.nextInt();
		double area=((2*Math.PI*radio*altura)+(2*Math.PI*radio*radio));
		return area;
	}

}
