/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testtts;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocket {
    
    
    
    
    
    
    
    
  public ClientSocket(String host, int port) throws IOException {
       
 
   
    
    System.out.println( "hello customer # 65432" );
    System.out.println( "enter 'p' to purchase a widget" );
     System.out.println( "enter 'r' to return a widget" );
      System.out.println( "enter 's' to show a list of your transactions" );
    
    String hostName = host;//"127.0.0.1" ;
   
    int portNumber = port;//8008;
    
   
    
    
    try (Socket clientSocket = new Socket(hostName, portNumber);
      PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
      BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
      BufferedReader stdIn = new BufferedReader(new InputStreamReader(System.in))) {
      String userInput;
      while ((userInput = stdIn.readLine()) != null) {
        out.println(userInput);
        String response = in.readLine();
	System.out.println( response);
         //testtts.TestTTS.frank.sayWords(response );
        //frank.sayWords(in.readLine());
       //  jill.sayWords(in.readLine());
      }
    }catch (UnknownHostException e) {
       System.err.println("Don't know about host " + hostName);
       System.exit(1);
    }catch (IOException e) {
       System.err.println("Couldn't get I/O for the connection to " + hostName);
       System.exit(1);
      } 
    
    
 
    
    
  }  // end main
  
  
  
  public void giveCommand(String command){
      
      
      
      
  }
  
  
  
  
  
  
  
} // end class


