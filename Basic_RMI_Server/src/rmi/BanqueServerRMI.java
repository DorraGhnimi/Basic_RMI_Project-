package rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class BanqueServerRMI {

	public static void main(String[] args) {
		
	
		try { // 5eter l'exception f const BanqueSeviceImpl
			BanqueSeviceImpl myBanque = new BanqueSeviceImpl();
			
			System.out.println(myBanque.toString()); //reference de cet obj distant //ce qui est publier ds l'annuaire
			
			LocateRegistry.createRegistry(1099); // demarrer un annuaire auto hna , 
												//sinon on doit le demmarer par lc avant de demarrer le proj
												// ( f jdk/bin : rmiregitry.exe )
			
			Naming.rebind("rmi://localhost:1099/Banque", myBanque); // publier la reference
			
		} catch (RemoteException | MalformedURLException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
	
	
}
