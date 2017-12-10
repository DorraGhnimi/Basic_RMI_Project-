package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IBanqueRemote extends Remote {
	
	public void addCompte(Compte c) throws RemoteException;
	public void updateClient(Compte c) throws RemoteException;
	public void delete(int code) throws RemoteException;
	public List<Compte> listeClients() throws RemoteException;

}
