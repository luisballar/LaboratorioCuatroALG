/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmos.colas.y.pilas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class Metodos {
    /**
     * @param args the command line arguments
     */
    Nodo head;
    Scanner entrada = new Scanner(System.in);

    public Metodos() {
        this.head = null;
    }
    
    public void menuPrincipal(){
        StringBuilder sB = new StringBuilder("Menu Principal")
                .append("\n Elija una opción:")
                .append("\n Opción 1: Insertar un elemento aleatorio en la Pila")
                .append("\n Opción 2: Sacar un elemento de la Pila")
                .append("\n Opción 3: Insertar un elemento aleatorio en la Cola")
                .append("\n Opción 4: Sacar un elemento de la Cola")                 
                .append("\n Opción 5: Salir\n");

        System.out.println(sB.toString());
        entradaOpcion();
    }

    public void entradaOpcion(){
        Pila Pl = new Pila();
        Cola Cl = new Cola();        
        Random random = new Random();
        int opcion = 1;
        while(opcion>=1 && opcion<5){
            opcion = entrada.nextInt();
            switch (opcion){
                case 1:
                    //Push pila
                    int randomNumberPila = random.nextInt(26);                
                    char randomCharPila = (char) ('A' + randomNumberPila); 
                    Pl.push(randomCharPila);
                    System.out.println("Se agregó el elemento " + randomCharPila);
                    break;
                case 2: 
                    //Pop pila 
                    Pl.pop();
                    break;
                case 3: 
                    //Push en la cola                
                    int randomNumberCola = random.nextInt(26);                
                    char randomCharCola = (char) ('A' + randomNumberCola);                
                    Cl.enqueue(randomCharCola);
                    System.out.println("Se agregó el elemento " + randomCharCola);
                    break;
                case 4:
                    //Pop cola       
                    Cl.dequeue();
                    break;                
            }
        }
    }
}
