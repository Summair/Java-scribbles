/*
 * Program is built to find your network address on a server
 * it will list the link addresses on your server where you might want knowledge of IP's
 * running it will print a list of all the local interfaces 
 * 
 */


import java.io.*;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInt {

	public static void main(String[] args) throws IOException {
	
		Enumeration list = NetworkInterface.getNetworkInterfaces();
		while(list.hasMoreElements()) {
			 
			NetworkInterface iface = (NetworkInterface) list.nextElement();
			
			System.out.println(iface.getDisplayName());
			Enumeration addrs = iface.getInetAddresses();
			
			while(addrs.hasMoreElements()) {
				InetAddress addr = (InetAddress) addrs.nextElement();
				System.out.println(addr);
				
			}
			
		
			InetAddress destAddr = InetAddress.getByName("");
		
		try {
			NetworkInterface dest = NetworkInterface.getByInetAddress(destAddr);
			System.out.println("Address for" + destAddr + "is"+ dest);
		
		}catch (SocketException ex){
			
			System.err.println( "Couldnt get address for" + destAddr);
		}
		
		}
	}

}
