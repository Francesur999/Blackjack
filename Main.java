package blackjack;

import java.util.random.*;
import java.util.Random;
import java.util.Scanner;

public class Main {

     //Baraja numero 1
     static String[] cartasTrebol= {"As treboles","1 treboles","2 treboles","3 treboles","4 treboles","5 treboles","6 treboles","7 treboles","8 treboles","9 treboles","10 treboles",
    
     "J treboles","Q treboles","K treboles"};

 //Baraja numero 2
     static  String[] cartasPicas= {"As picas","1 picas","2 picas","3 picas","4 picas","5 picas","6 picas","7 picas","8 picas","9 picas","10 picas",
    
     "J picas","Q picas","K picas"}; 


 //Baraja numero 3
     static String[] cartasDiamantes= {"As diamantes","1 diamantes","2 diamantes","3 diamantes","4 diamantes","5 diamantes","6 diamantes","7 diamantes","8 diamantes","9 diamantes","10 diamantes",
    
     "J diamantes","Q diamantes","K diamantes"};

 //Baraja numero 4
     static String[] cartasCorazones= {"As corazones","1 corazones","2 corazones","3 corazones","4 corazones","5 corazones","6 corazones","7 corazones","8 corazones","9 corazones","10 corazones",
    
     "J corazones","Q corazones","K corazones"};

    public static void main(String[] args) {

 //Baraja numero 1
   ;


     Random numRandom = new Random () ; 
     Scanner teclado = new Scanner (System.in)  ; 

     int numBaraja ; 
     int numCarta  ;
     int puntuacion = 0 ;
     int eleccionAs ; 
     int turnoJug1 = 1;
     int turnoJug2 = 2;

     numBaraja = numRandom.nextInt(1,4);

     if (numBaraja == 1) {

        numCarta= numRandom.nextInt(0,13);

        if (numCarta == 0) {

            do{
            System.out.println("Salió "+cartasTrebol[numCarta]+"cuanto quieres que valga 1 0 11?");
            eleccionAs = teclado.nextInt();

            }while(eleccionAs != 1 || eleccionAs != 11);

            if (eleccionAs == 1) {

                puntuacion = puntuacion + 1;
                
            }else{
                puntuacion = puntuacion + 11;
            }
            
        }else if (numCarta > 0 && numCarta <11){

        System.out.println(cartasTrebol[numCarta]);

        puntuacion = puntuacion +numCarta;

        }else{

            System.out.println(cartasTrebol[numCarta] +" vale 10");

            puntuacion=puntuacion+10;

        }
        //TERMINA BARAJA DE TREBOL
        
        //EMPIEZA BARAJA PICAS
        
     } else if (numBaraja == 2) {

        numCarta= numRandom.nextInt(0,13);

        if (numCarta == 0) {

            do{
            System.out.println("Salió "+cartasPicas[numCarta]+"cuanto quieres que valga 1 0 10?");
            eleccionAs = teclado.nextInt();

            }while(eleccionAs != 1 || eleccionAs != 11);

            if (eleccionAs == 1) {

                puntuacion = puntuacion + 1;
                
            }else{
                puntuacion = puntuacion + 11;
            }
            
        }else if (numCarta > 0 && numCarta <11){

        System.out.println(cartasPicas[numCarta]);

        puntuacion = puntuacion +numCarta;

        }else{

            System.out.println(cartasPicas[numCarta] +" vale 10");

            puntuacion=puntuacion+10;

        }

        //FIN PICAS

        //INICIO DIAMANTES
        
     } else if (numBaraja == 3) {

        numCarta= numRandom.nextInt(0,13);

        if (numCarta == 0) {

            do{
            System.out.println("Salió "+cartasDiamantes[numCarta]+"cuanto quieres que valga 1 0 10?");
            eleccionAs = teclado.nextInt();

            }while(eleccionAs != 1 || eleccionAs != 11);

            if (eleccionAs == 1) {

                puntuacion = puntuacion + 1;
                
            }else{
                puntuacion = puntuacion + 11;
            }
            
        }else if (numCarta > 0 && numCarta <11){

        System.out.println(cartasDiamantes[numCarta]);

        puntuacion = puntuacion +numCarta;

        }else{

            System.out.println(cartasDiamantes[numCarta] +" vale 10");

            puntuacion=puntuacion+10;

        }

        //FIN DIAMANTES

        //INICIO CORAZONES

     }else{

        numCarta= numRandom.nextInt(0,13);

        if (numCarta == 0) {

            do{
            System.out.println("Salió "+cartasCorazones[numCarta]+"cuanto quieres que valga 1 0 10?");
            eleccionAs = teclado.nextInt();

            }while(eleccionAs != 1 || eleccionAs != 11);

            if (eleccionAs == 1) {

                puntuacion = puntuacion + 1;
                
            }else{
                puntuacion = puntuacion + 11;
            }
            
        }else if (numCarta > 0 && numCarta <11){

        System.out.println(cartasCorazones[numCarta]);

        puntuacion = puntuacion +numCarta;

        }else{

            System.out.println(cartasCorazones[numCarta] +" vale 10");

            puntuacion=puntuacion+10;

        }
     }

     System.out.println(puntuacion);
        
     


    }

    
    
}
