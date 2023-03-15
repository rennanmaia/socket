 import java.io.IOException;
 import java.io.PrintStream;
 import java.net.Socket;
 import java.net.UnknownHostException;
 import java.util.Scanner;
 import java.io.*;
 
public class Client {
   public static void main(String[] args) 
         throws UnknownHostException, IOException {
     // dispara cliente
     new Client("127.0.0.1", 12345).executa();
   }
   
   private String host;
   private int porta;
   
   public Client (String host, int porta) {
     this.host = host;
     this.porta = porta;
   }
   
   public void executa() throws UnknownHostException, IOException {
     Socket cliente = new Socket(this.host, this.porta);
     System.out.println("O cliente se conectou ao servidor!");
 
     // thread para receber mensagens do servidor
     Recebedor r = new Recebedor(cliente.getInputStream());
     new Thread(r).start();
     
     // lê msgs do teclado e manda pro servidor
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
     cliente.close();    
   }
 }
 
 class Recebedor implements Runnable {
 
   private InputStream servidor;
 
   public Recebedor(InputStream servidor) {
     this.servidor = servidor;
   }
 
   public void run() {
     // recebe msgs do servidor e imprime na tela
     Scanner s = new Scanner(this.servidor);
     while (s.hasNextLine()) {
       System.out.println(s.nextLine());
     }
   }
 }