package Network;

import java.net.Socket;
import java.io.*;
import java.util.Scanner;
public class Client extends Thread {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 41021);

        PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
        printWriter.println(new Scanner(System.in).next());
        printWriter.flush();
        socket.close();



    }




    }



