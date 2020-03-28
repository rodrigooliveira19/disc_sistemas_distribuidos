package br.com.modelo;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculadora extends UnicastRemoteObject implements Calc{

	public Calculadora() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;

	public int somar(int x, int y) throws RemoteException {
		return x + y;
	}

	@Override
	public int subtrair(int x, int y) throws RemoteException {
		return x - y;
	}

	@Override
	public int multiplicar(int x, int y) throws RemoteException {
		return x * y;
	}

	@Override
	public int dividir(int x, int y) throws RemoteException {
		return x / y;
	}

}
