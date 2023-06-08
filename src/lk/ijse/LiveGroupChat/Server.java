package lk.ijse.LiveGroupChat;

import lk.ijse.LiveGroupChat.controller.Client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    private static ArrayList<Client> clients = new ArrayList<Client>();

    public static void main(String[] args) throws IOException {
        System.out.println("Server is started!");
        ServerSocket serverSocket = new ServerSocket(2900);
        Socket accept;
        while (true) {
//            System.out.println("Waiting ...");
            accept = serverSocket.accept();
            System.out.println("Client Connected");
            System.out.println("-------------------------------------");
            Client clientThread = new Client(accept, clients);
            clients.add(clientThread);
            clientThread.start();
        }


    }
}
