package Network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

import java.util.Scanner;


public class Server extends Thread {

    public static void main(String[] args) throws IOException, InterruptedException {
        Server e = new Server();

        e.start();
        ServerSocket serverSocket = new ServerSocket(41021);
        Socket socket = serverSocket.accept();
        System.out.println("Server: (Network.Client) connected");
        InputStreamReader inputStreamReader = new InputStreamReader(socket.getInputStream());


        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        while (socket.isConnected()) {


            String line = bufferedReader.readLine();


            System.out.println("Client: " + line);

            if (line.equals("stop")) {
                System.out.println("Network is stopping...");

                Thread.sleep(1000);
                System.out.print("Stopping.");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.println(".");
                Thread.sleep(1000);
                System.out.println("Network has now closed");
                bufferedReader.close();
                serverSocket.close();
                socket.close();

                System.exit(500);
                break;
            }


        }

    }


    @Override

    public void run() {


        try {


            Socket socket = new Socket("localhost", 41021);
            while (socket.isConnected()) {
                PrintWriter printWriter = new PrintWriter(socket.getOutputStream());


                printWriter.println(new Scanner(System.in).nextLine());
                printWriter.flush();


            }


            socket.close();


        } catch (IOException e) {

            e.printStackTrace();
        }

    }
}



