package ejerciciobucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class ParesNones {

    /**
     * @param args the command line arguments
     */
    /* int primerNumeroAleatorio = numeroAleatorio.nextInt(2); //Numero aleatorio del 0 al 1
        System.out.println(primerNumeroAleatorio);
        
        int segundoNumeroAleatorio = numeroAleatorio.nextInt(2) + 1; //Numero aleatorio del 1 al 2
        System.out.println(segundoNumeroAleatorio);
        
        int tercerNumeroAleatorio = numeroAleatorio.nextInt(50-10+1) + 10; //Numero aleatorio del 10 al 50
        System.out.println(tercerNumeroAleatorio);
        
        double cuartoNumeroAleatorio = numeroAleatorio.nextDouble();
        System.out.println(cuartoNumeroAleatorio);
    
    public static void main(String[] args) {
        // TODO code application logic here
        Random numeroAleatorio = new Random();
        int primerNumeroAleatorio = numeroAleatorio.nextInt(10)+1;
        System.out.println("Primer numero aleatorio " + primerNumeroAleatorio);
        int segundoNumeroAleatorio = numeroAleatorio.nextInt(10)+1;
        System.out.println("Segundo numero aleatorio " + segundoNumeroAleatorio);
     */
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int opcion,numeroJugador1,numeroJugador2,sumaNumeros;
        String paresNones;
        boolean par; 
        do {
            System.out.println("Opciones posibles ");
            System.out.println("1.Jugar contra una persona");
            System.out.println("2.Jugar contra la máquina");
            System.out.println("3.Finalizar programa");

            opcion = teclado.nextInt();

       
        switch (opcion) {
            
             case 1:
                System.out.println("1.Jugar contra una persona");
                do {
                    System.out.println("¿PARES o NONES?");
                    teclado.nextLine();
                    paresNones = teclado.nextLine();
                }while(!(paresNones.equalsIgnoreCase("pares") || paresNones.equalsIgnoreCase("nones"))) ; //paresNones.equals("Pares")
                
                if(paresNones.equalsIgnoreCase("pares")) par=true;
                else par=false;
                
                do {
                 System.out.println("Mete un numero entre 1 y 10");
                 numeroJugador1 = teclado.nextInt();
                }while(numeroJugador1<0 || numeroJugador1>10);
                
                do {
                 System.out.println("Mete un numero entre 1 y 10");
                 numeroJugador2 = teclado.nextInt();
                }while(numeroJugador2<0 || numeroJugador2>10);
                
                 sumaNumeros= numeroJugador1 + numeroJugador2;
                
                 
                        
                if (sumaNumeros % 2 == 0){ 
                    
                    if(par) System.out.println("Jugador 1 ha ganado");
                    else System.out.println("Jugador 2 ha ganado");
                }
                else{
                    if(par) System.out.println("Jugador 2 ha ganado");
                    else System.out.println("Jugador 1 ha ganado");
                }    
                 
               
                break;

             case 2:
                System.out.println("2.Jugar contra la máquina");
               
                do {
                    System.out.println("¿PARES o NONES?");
                    teclado.nextLine();
                    paresNones = teclado.nextLine();
                }while(!(paresNones.equalsIgnoreCase("pares") || paresNones.equalsIgnoreCase("nones"))) ; //paresNones.equals("Pares")
                
                if(paresNones.equalsIgnoreCase("pares")) par=true;
                else par=false;
                
                do {
                 System.out.println("Mete un numero entre 1 y 10");
                 numeroJugador1 = teclado.nextInt();
                }while(numeroJugador1<0 || numeroJugador1>10);
                
                numeroJugador2=random.nextInt(10)+1;
                
                 sumaNumeros= numeroJugador1 + numeroJugador2;
                
                 
                        
                if (sumaNumeros % 2 == 0){ 
                    
                    if(par) System.out.println("Jugador 1 ha ganado");
                    else System.out.println("Jugador 2 ha ganado");
                }
                else{
                    if(par) System.out.println("Jugador 2 ha ganado");
                    else System.out.println("Jugador 1 ha ganado");
                }  
                break;
        
             case 3:
                System.out.println("Programa finalizado");
                break;
             default:
                 System.out.println("Mete otro número");
                 break;
        
                 
    }
} while (opcion !=3);}
}
