package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import Network.Client;

public class Server {
    public static void main(String[] args) throws IOException {


        ServerSocket serverSocket = new ServerSocket(41021);
        Socket socket = serverSocket.accept();
        System.out.println("Network.Client connected");
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String str = bufferedReader.readLine();
        System.out.println("client: " + str);
        serverSocket.close();
        socket.close();

    }
}
