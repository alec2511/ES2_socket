package com.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception {
        Socket s = new Socket("localhost", 3000);

        // ascoltare
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        // tastiera
        BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
        // parlare
        PrintWriter pr = new PrintWriter(s.getOutputStream(), true);

       

        pr.println("ci sono");
        // ricevo: Ciao dammi il tuo peso
        System.out.println(br.readLine()); 
        // leggo da tastiera la rischiesta del nome e lo invio
        pr.println(tastiera.readLine()); 
        // ricevo: dammi l'altezza
        System.out.println(br.readLine()); 
       
        pr.println("Grazie, arrivederci");

        s.close();
    }
}