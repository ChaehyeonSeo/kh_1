package scenario01.server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public void server() {
		int port = 3000;

		ServerSocket server;
		try {
			server = new ServerSocket(port);

			Socket client = server.accept();

			// 이하 생략
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

	}

}
