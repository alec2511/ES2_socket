package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Locale;

import javafx.scene.input.TouchPoint;

public class ClientHandler extends Thread {
    private Socket sock;
    private BufferedReader br = null;
    private PrintWriter prWr = null;
    

    public ClientHandler(Socket sock) {
        sock = s;
        try {
            //  parlare
            pr = new PrintWriter(s.getOutputStream(), true);
            //  ascoltare
            br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        int x = 0;
        try {
            x++;
            System.out.println(br.readLine());
            // invio messaggio
            pr.println("Ciao,qual'è il tuo nome"); 
            // ricevo: il nome
            String nome = br.readLine(); 
            System.out.println("Messaggio ricevuto");

            pr.println("Benvenuto " + nome.toUpperCase() + " sei l'utente numero :" +  j );

            // leggo il saluto finale e lo metto in console
            System.out.println(br.readLine()); 

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            s.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}