import java.io.*;
import java.net.*;
class UDPClient
{
   public static void main(String args[]) throws Exception
 {
      BufferedReader inFromUser =
      new BufferedReader(new InputStreamReader(System.in));
 DatagramSocket clientSocket = new DatagramSocket();
      InetAddress IPAddress = InetAddress.getByName("localhost");
      byte[] sendData = new byte[1024];
	byte[] receiveData = new byte[1024];
      boolean flag=true;
      while(flag)
