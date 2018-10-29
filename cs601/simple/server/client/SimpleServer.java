/**
 * 
 */
package simple.server.client;

/**
 * @author rozitateymourzadeh
 *
 */
/**
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Simple Server 
 * @author Rozita Teymourzadeh
 *
 */
public class SimpleServer {

	final static String EOST = "EOST"; // End of server transfer protocol

	public static void main(String[] args) {
		boolean running = true;
		ServerSocket server = null; 
		try {
			server = new ServerSocket(1027);
		} catch (Exception ioe) {
			System.out.println("Server is busy!!");
			ioe.printStackTrace();
			System.exit(1);
		}
		while(running) {
			try (
//   				ServerSocket server = new ServerSocket(1024); // open the server socket to listen to 1024 port
					Socket sock = server.accept(); // block on accept till a new client connects
					BufferedReader instream = new BufferedReader(new InputStreamReader(sock.getInputStream()))
					){
				String message = "";
				String line = instream.readLine();

				while(line != null && !line.trim().equals(EOST)) {
					message += line + "\n"; // append message
					line = instream.readLine(); //read next line
				}
				System.out.println("Server is running");
				System.out.println("Client Says:" + message);

			}catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}
