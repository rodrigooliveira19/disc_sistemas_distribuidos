package br.com.app;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.modelo.Calculadora;

public class AppServer {

	public static void main(String[] args) throws RemoteException{
		
		//Criando o Objeto
		Calculadora calculadora = new Calculadora(); 
		
		//Registrando o objeto
		Registry registry = LocateRegistry.createRegistry(1999); 
		registry.rebind("calculadora", calculadora);
		
		System.out.println("Objeto registrado");

	}

}
