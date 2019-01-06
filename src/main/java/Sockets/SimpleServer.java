/**
 * 
 */
package Sockets;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

import logger.cs601Logger;

/**
 * Simple Server 
 * @author Rozita Teymourzadeh
 *
 */
public class SimpleServer {

	final static String EOST = "EOST"; // End of server transfer protocol

	public static void main(String[] args) {
		cs601Logger.setup();
		Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
		boolean running = true;
		ServerSocket server = null; 
		
		try {
			server = new ServerSocket(1027);
		} catch (Exception ioe) {
			logger.log(Level.SEVERE, "Server is busy!!", ioe.getMessage());
			ioe.printStackTrace();
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
				
				logger.log(Level.INFO, "Request Received: ", message);
				
				// Display client message 
				System.out.println("Client Says:" + message);

			}catch(IOException ioe) {
				ioe.printStackTrace();
				logger.log(Level.SEVERE, ioe.getMessage());
			}
		}
	}
}
