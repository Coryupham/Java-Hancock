import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client2 {
        private Socket socket;
        private PrintWriter out;
        private BufferedReader in;

        public Client2() {
            try {
                System.out.println("Connecting to server...");
                socket = new Socket("localhost", 58999);
                out = new PrintWriter(socket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            } catch (Exception e) {
                System.out.println("Run the server first.");
            }
        }

        protected void finalize() {
            try {
                socket.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }

        public String sendPassword(String pass) {
            if (!HUSH) System.out.print("Sending: " + pass);
            out.println(pass);
            String result = null;
            try {
                result = in.readLine();
                if (!HUSH) {
                    if (result.equals("no"))
                        System.out.println(" (wrong password)");
                    else if (result.equals("yes")) {
                        System.out.println(" (CORRECT!)");
                        System.exit(0);
                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
            return result;
        }

        //change this to true when running your code an extended time
        public static boolean HUSH = true;

        //ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz
        private static String selectedCharacters = "abcdefg01234hijklmnopq567rstuv89@wxyz";

        private static void processAll(int x, int maxLength, String result){
            if(x < selectedCharacters.length()){
                generate(maxLength, result + selectedCharacters.charAt(x));
                processAll(x+1, maxLength, result);

            }
        }


        public static void generate(int maxLength, String result){
            if(result.length() < maxLength){

                processAll(0, maxLength, result);

            } else {
                if(me.sendPassword(result).equals("yes")){
                    System.out.println(result);
                    System.exit(0);
                }
            }
        }
        public static Client2 me = new Client2();
        public static void main(String[] args) {
            //Client me = new Client();
            //me.sendPassword("W");
            //me.sendPassword("Hi");
            //me.sendPassword("Bye");
            //me.sendPassword("2600");



            int length =5;
            generate(length, "");
        }
    }
