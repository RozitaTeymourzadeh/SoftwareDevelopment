/**
 * 
 */
package Sockets;

/**
 * @author rozitateymourzadeh
 *
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * This is a very poorly designed HTTP server able to reply to one request with a static HTML page.
 * @author srollins
 *
 */
public class HTTPServer {

	private static volatile boolean running = true;
	private static final String BASE_PATH = "/Users/srollins/teaching/cs601/code-examples/Sockets";
	
	
	public static void main(String[] args) {

		ServerSocket serve = null;
		try {
			serve = new ServerSocket(1024);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//TODO: check to ensure serve is not null
		
		while(running) {

			try (
					Socket sock = serve.accept();
					BufferedReader instream = new BufferedReader(new InputStreamReader(sock.getInputStream()));
					OutputStream writer = sock.getOutputStream();
				) {

				String headers = "";
				String requestLine = instream.readLine();
				
				String line = instream.readLine();				
				while(line != null && !line.trim().isEmpty()) {
					headers += line + "\n";
					line = instream.readLine();
				}
				System.out.println("Request Line: " + requestLine);
				System.out.println("Headers: \n" + headers);

				//parse request line
				String[] requestLineParts = requestLine.split("\\s+");
				//TODO: make sure requestLineParts has three components
				//TODO: verify we support the protocol version specified
				//TODO: if method is not GET - send 405 response
				
				String path = requestLineParts[1];
				
				//open file 
				 try (
						 InputStream inputStream = new FileInputStream(BASE_PATH + path);
					) {
					
			            int byteRead;
			   		 
			            writer.write(HTTPConstants.OK_HEADER.getBytes());			            
			            writer.flush();
			            while ((byteRead = inputStream.read()) != -1) {
			                writer.write(byteRead);
			            }
					 
				 } catch(FileNotFoundException fnf) {
					 //TODO: return 404 not found
					 
				 } catch(IOException ioe) {
					 //TODO: internal server error
				 }
				
				String responseHeader = "HTTP/1.0 200 OK\n" +
						"\r\n";

				
				String page = "<html> " + 
						"<head><title>TEST</title></head>" + 
						"<body>This is a short test page.</body>" + 
						"</html>";

				writer.write(responseHeader.getBytes());
				writer.write(page.getBytes());
				writer.flush();
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
		}
	}
}