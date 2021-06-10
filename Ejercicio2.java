import java.util.Scanner;

public class Ejercicio2{

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingresa el limite de la cuenta atras");
		int num1 = scanner.nextInt();
		for (int i = 0; i < (num1-1);i++){
			int temp = num1 - i;
			System.out.println(temp);
		}
	}
}