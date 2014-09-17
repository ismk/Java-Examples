/*
 * ScoresInterface.java
 *
 * These program create a Remote Interface for an RMI application
 *
 * Copyright (c) 2007 Aptech Software Limited. All Rights Reserved.
 */

package badminton;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Vincent
 */
public interface ScoresInterface extends Remote {
    public Scores getScore() throws RemoteException;
}
