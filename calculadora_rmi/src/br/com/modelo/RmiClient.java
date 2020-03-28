package br.com.modelo;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RmiClient {
	
	private static String url = "rmi://localhost:1999/calculadora"; 
	
	public static void main(String[] args) throws MalformedURLException, RemoteException, NotBoundException {
		
		//Procurar o objeto no registro e retorna sua referência
		Calc calc = (Calc) Naming.lookup(url); 
		
		//Utilizando os metodos
		System.out.println("Soma 10 + 5 = "+calc.somar(10, 5));
		System.out.println("Subtrair 10 - 5 = "+calc.subtrair(10, 5));
		System.out.println("Multiplicar 10 * 5 = "+calc.multiplicar(10, 5));
		System.out.println("Dividir 10 / 5 = "+calc.dividir(10, 5));
	}

}
