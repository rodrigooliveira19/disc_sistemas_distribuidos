package br.com.modelo;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static Calculadora calculadora = new Calculadora();

	public static void main(String[] args) throws IOException {

		String operacao;
		Integer valores[] = new Integer[3];

		// Socket para receber conexões do cliente
		try (ServerSocket serverSocket = new ServerSocket(1500)) {
			System.out.println("Rodando Servidor");

			while (true) {
				System.out.println("Aguardando requisição");
				Socket clientSocket = serverSocket.accept();
				System.out.println("Cliente conectado");

				PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
				BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

				operacao = in.readLine();
				System.out.println("Valor da operação em servidor: "+operacao);

				// Verificar se já recebeu os trê valores do cliente
				if ((operacao.equals("SOMAR")) ) {
					somar(out,in);
				}

			}

		}

	}

	private static void somar(PrintWriter out, BufferedReader in) throws IOException {
		try {
			
			String valores = in.readLine(); 
			String[] tokens = valores.split(";"); 
			
			double x = Double.parseDouble(tokens[0]); 
			double y = Double.parseDouble(tokens[1]); 
			System.out.println("x: "+x);
			System.out.println("y: "+y);
			double soma = x + y; 
			String s = String.valueOf(soma); 
			out.println(s); 
			
		} catch (Exception e) {
			System.out.println("Falha Somar: "+e.getMessage());
		}

	}

}
