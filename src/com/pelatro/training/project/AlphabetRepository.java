package com.pelatro.training.project;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class AlphabetRepository extends Thread{
	//server code
	ConcurrentHashMap<Character,Integer> hm;  
	//static Vector<ClientHandler>  ar= new Vector<>(); 
	//static int i = 0; 

	ServerSocket ss;
	Socket s;
	
	
	public AlphabetRepository(ConcurrentHashMap hm) {
		// TODO Auto-generated constructor stub
		this.hm=hm;
	}
	
	
	
	//database change synchronized
	
	@Override
	public void run() {
			
		
		
		
		
			try {
	
			ss = new ServerSocket(4444);
			//Socket s; 
			int i = 0; 
			//s = ss.accept();
			
			
			while (true) 
			{ 
				// Accept the incoming request 
				s = ss.accept(); 

				//System.out.println("New client request received : " + s); 
				
				// obtain input and output streams 
				DataInputStream dis = new DataInputStream(s.getInputStream()); 
				//DataOutputStream dos = new DataOutputStream(s.getOutputStream()); 
				String received = dis.readLine();
				s.close();
				
				
				
				//System.out.println("Creating a new handler for this client...")

				
				Thread t = new ClientHandler(received,hm); 
				  
                // Invoking the start() method 
                t.start(); 
				

			} 
		
		
		
			}catch(Exception e) {
				
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
	}


	
}
