package rmiinterface;

//import model.Contact;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMIInterface extends Remote{

    public String helloTo(String name) throws RemoteException;

    //public Contact getContact() throws RemoteException;
}