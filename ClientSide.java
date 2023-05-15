import java.io.*;
import java.net.*;
class Client {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int PORT = 12345;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_ADDRESS, PORT);
            System.out.println("Connected to server: " + SERVER_ADDRESS + ":" + PORT);

            // Send client request to server
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);
            writer.println("AAPL"); // Example client request for stock symbol "AAPL"

            // Receive response from server
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String response = reader.readLine();
            System.out.println("Received response from server: " + response);

            // Close resources
            writer.close();
            reader.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
