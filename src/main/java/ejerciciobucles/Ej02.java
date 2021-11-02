package ejerciciobucles;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alberto
 */
public class Ej02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random= new Random();
        int opcion;

        do {
            System.out.println("Opciones posibles ");
            System.out.println("1.Introducir un número postivo por teclado (Número entre 2 y 600_000_000)");
            System.out.println("2.Número generado aleatoriamente");
            System.out.println("3.Finalizar programa");

            opcion = teclado.nextInt();
      
            switch (opcion) {
                case 1:
                    System.out.println("1.Introducir un número postivo por teclado (Número entre 2 y 600_000_000)");
                    break;
                case 2:
                    System.out.println("2.Número generado aleatoriamente");
                    long numero=random.nextInt(600_000_000-2+1)+2;
                    System.out.println(numero);
                    break;
                case 3:
                    System.out.println("3.Fin del programa");
                    break;
                default:
                     System.out.println("Mete otro número");
                    break;
            }
                  
            
            
            
         
                
            
        }while(opcion!=3);
                
    
    }

}
