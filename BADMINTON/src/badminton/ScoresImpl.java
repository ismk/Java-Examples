/*
 * ScoresImpl.java
 *
 * This program implements the remote interface ScoresInterface.
 *
 * Copyright (c) 2007 Aptech Software Limited. All Rights Reserved.
 *
 */

package badminton;

import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Vincent
 */

public class ScoresImpl extends UnicastRemoteObject implements ScoresInterface
{
	Scores score;

        /** Creates a new instance of ScoresImpl */
	public ScoresImpl(Scores score) throws java.rmi.RemoteException {
		super();
		this.score = score;
	}

	public Scores getScore() throws java.rmi.RemoteException {
		return score;
	}	
}
