package pkg2014.pkg02.pkg27.rmi.example;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class scoresimpl extends UnicastRemoteObject implements scoresinterface {
    scores score;
    public scoresimpl(scores score) throws RemoteException{
        super();
        this.score = score;
    }
    public scores getScore(){
        return score;
    }
    
    
}
