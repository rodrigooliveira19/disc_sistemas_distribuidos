package br.com.modelo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calc extends Remote{
	
	public int somar(int x, int y) throws RemoteException; 
	public int subtrair(int x, int y)throws RemoteException; 
	public int multiplicar(int x, int y)throws RemoteException; 
	public int dividir(int x, int y)throws RemoteException; 

}
