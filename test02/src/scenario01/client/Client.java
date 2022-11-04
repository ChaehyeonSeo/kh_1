package scenario01.client;

import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public void client() {
		
//		192.168.20.34
	}
	
	public static void main(String[] args) {

		int port = 3000;
		String serverIP;
		try {
			serverIP = InetAddress.getLocalHost().getHostAddress();

			Socket socket = new Socket(serverIP, port);
			
//			...
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
