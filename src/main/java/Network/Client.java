package Network;

import java.net.Socket;
import java.io.*;

public class Client extends Thread {
    public static void main(String[] args) throws IOException {
        Client a = new Client();
        a.start();


    }

    @Override
    public void run() {
        try {
            Socket socket = new Socket("localhost", 41021);

            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.println("Hello");
            printWriter.flush();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
