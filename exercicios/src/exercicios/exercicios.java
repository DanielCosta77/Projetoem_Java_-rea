package exercicios;
import java.util.Scanner;

public class exercicios {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
	     System.out.println("digite a largura");
	     
		 double largura = sc.nextDouble();
		
		 System.out.println("largura: " + largura);
		 
		 System.out.println("digite o comprimento:");
		 
		 double comprimento = sc.nextDouble();
		 
		 System.out.println("comprimento:" + comprimento);
		 
		 System.out.println ("Preço metro quadrado");
		 
		 double metroQuadrado = sc.nextDouble();
		 
		 System.out.println("Metro Quadrado:" + metroQuadrado);
		 
		 double area = largura * comprimento;
		 
		 System.out.println("a área é: " + area);
		 
		 double preco = metroQuadrado * area;
		 
		 System.out.println("Preço Final Do terreno:" + preco);
		 
		 
		 
		 sc.close();
	}

}
