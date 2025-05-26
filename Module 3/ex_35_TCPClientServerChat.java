// Server
import java.io.*;
import java.net.*;

public class ex_35_TCPClientServerChat {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(1234);
        Socket client = serverSocket.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
        PrintWriter out = new PrintWriter(client.getOutputStream(), true);

        out.println("Hello client!");
        System.out.println("Client says: " + in.readLine());

        client.close();
        serverSocket.close();
    }
}

// Client
import java.io.*;
import java.net.*;

public class ex_javacode35_client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 1234);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        System.out.println("Server says: " + in.readLine());
        out.println("Hello server!");

        socket.close();
    }
}

