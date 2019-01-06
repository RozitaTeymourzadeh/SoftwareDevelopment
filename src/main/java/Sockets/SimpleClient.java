/**
 * 
 */
package Sockets;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class SimpleClient {

	/**
	 * General Client
	 * 
	 * To run the project in different host
	 * 
	 * @author Rozita Teymourzadeh
	 *
	 */

	final static int PORT = 1027; 

	public static void main(String[] args) {
		// try with resources to ensure socket will be closed
		try (
				//Socket socket = new Socket(127.0.0.1, PORT);
				Socket socket = new Socket(InetAddress.getLocalHost(), PORT);
				//					Socket socket = new Socket("mcvm105.cs.usfca.edu", PORT);// External host
				PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
				){
			//print a message
			out.println("My message from Client!");
			//print the end of transmission token
			out.println("EOST");
			System.out.println("Communication Complete");

		} catch(IOException ioe){
			System.out.println("Client Error!");
			System.exit(1);
		}
	}
}
