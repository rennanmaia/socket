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
		
		PrintStream saida = new PrintStream(cliente.getOutputStream());
		saida.println(args[0]);
		saida.close();
	}
 }