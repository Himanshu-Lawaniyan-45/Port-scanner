import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class PortScanner {
    public static void main(String[] args) {
        String host = "127.0.0.1";
        int startPort = 0;
        int endPort = 65535;

        System.out.println("Scanning ports on host: " + host);

        for (int port = startPort; port <= endPort; port++) {
            try {
                Socket socket = new Socket(host, port);
                System.out.println("Port " + port + " is OPEN ✅");
                socket.close();
            } catch (UnknownHostException e) {
                System.out.println("Unknown host!");
                break;
            } catch (IOException e) {

            }
        }
    }
}