package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import rmi.Compte;
import rmi.IBanqueRemote;

public class ClientRMI {

	public static void main(String[] args) {
		
		
		try {
			IBanqueRemote stub = (IBanqueRemote) Naming.lookup("rmi://localhost:1099/Banque");
			
			for (int i = 0; i < 10; i++) 
				stub.addCompte(new Compte(i,Math.random()*100));
			
			System.out.println("*************************");
			System.out.println("listes des client :");
			System.out.println(stub.listeClients().toString());
			
			
			
			
			System.out.println("*************************");
			System.out.println("listes des client :");
			System.out.println(stub.listeClients().toString());
			
			
			
			
			
			System.out.println("*************************");
			System.out.println("listes des client :");
			System.out.println(stub.listeClients().toString());
			
			
			
			
			
			
			
			
			
			
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
}
