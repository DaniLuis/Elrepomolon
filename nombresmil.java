import java.util.Scanner;
public class Nombresmil{
	public static String anyade(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Añade un sinónimo: ");
		String palabra = teclado.nextLine();

		return palabra;
	}
	public static void main (String args[]){
		String palabra;
		while(true){
			palabra = anyade();
			System.out.println("penerabofalopalotrankapicha"+palabra);
		}
	}
}
