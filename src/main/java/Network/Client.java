package Network;

import java.net.Socket;
import java.io.*;

public class Client {
    public static void main(String[] args) throws IOException{


        Socket socket = new Socket("localhost", 41021);

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println("Hello");
        printWriter.flush();
    }


}
