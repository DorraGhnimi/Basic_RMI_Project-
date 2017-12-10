package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

public class BanqueSeviceImpl extends UnicastRemoteObject implements IBanqueRemote{

	
	private static final long serialVersionUID = 1L;
	List<Compte> comptes = new ArrayList<>();
	
	
	public BanqueSeviceImpl() throws RemoteException {
		super();
		
		
	}

	@Override
	public void addCompte(Compte c) throws RemoteException {
		comptes.add(c);
		
	}

	@Override
	public void updateClient(Compte c) throws RemoteException {
		comptes.set(c.getCode(), c);
		
	}

	@Override
	public void delete(int code) throws RemoteException {
		comptes.remove(code);
		
	}

	
	@Override
	public List<Compte> listeClients() throws RemoteException {
		return comptes;
	}

	
}
