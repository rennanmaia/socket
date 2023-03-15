import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
 
public class Client {
	public static void main(String[] args) 
           throws UnknownHostException, IOException {
		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out.println("O cliente se conectou ao servidor!");
		System.out.println("Digite alguma coisa para enviar ao servidor:");
		System.out.println("");
		System.out.println("");
		
		Scanner teclado = new Scanner(System.in);
		PrintStream saida = new PrintStream(cliente.getOutputStream());

		String texto;
	
		while (teclado.hasNextLine()) {
			texto = teclado.nextLine();
			if (texto.equals("sair")) {
				System.exit(0);
			} else {
				saida.println(texto);
			}
		}
		saida.close();
		teclado.close();
	}
 }