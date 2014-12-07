package TCPSocket;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCPConnect {

//	TCP/IP function that connects to the server using the information
//	From line 15 where the ip adress and Port nr is entered
	public String sendMessage(String gsonString) throws Exception {
		String stringToBeReturned = null;
		String modifiedSentence;
		Socket clientSocket = new Socket("localhost", 8888);
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
		
//		Message is encrypted with XOR
		byte[] input = gsonString.getBytes();
		byte key = (byte) 3.1470;
		byte[] encrypted = input;
		for (int i = 0; i < encrypted.length; i++)
		{
			encrypted[i] = (byte) (encrypted[i] ^ key);
		}

//		Sends encrypted information to server and flushes
		outToServer.write(encrypted);
		outToServer.flush();
		
//		Recives input from server via TCP/IP
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		modifiedSentence = inFromServer.readLine();
		System.out.println(modifiedSentence);
		String TestingString = new String(modifiedSentence).trim();
		
//		Decrypts server input using XOR
		byte[] input2 = TestingString.getBytes();
		byte key2 = (byte) 3.1470;
		byte[] encrypted2 = input2;
		for (int i = 0; i < encrypted2.length; i++)
		{
			encrypted2[i] = (byte) (encrypted2[i] ^ key2);
		}
		
//		Closes connection and returns decrypted information from server
		String decrypted2 = new String(encrypted2).trim();
		System.out.println("FROM SERVER: " + decrypted2);
		clientSocket.close();
		stringToBeReturned = decrypted2;
		
		return stringToBeReturned;
	}
	
}
