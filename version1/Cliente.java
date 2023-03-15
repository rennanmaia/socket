import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
 
public class Cliente {
	public static void main(String[] args) 
           throws UnknownHostException, IOException {
		Socket cliente = new Socket("127.0.0.1", 12345);
		System.out.println("O cliente se conectou ao servidor!");
		
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		saida.println("Teste");

		saida.close();
	}
}