package juegos;


import java.util.Random;
import java.util.Scanner;

public class ParesNones {
    // Vamos a crear un juego en el que el usuario elegira si quiere ir pares o nones
    // tambien elegira un numero del 1 al 10 y el programa elegira otro numero aleatorio
    //en caso de que la suma de los numeros de el usuario y el programa sea igual a la que
    // el usuario eligio, el usuario gana, en caso contrario pierde.

    public static void main(String[] args) {

        //CONSTANTES
        int MAXIMOS_DEDOS = 10;
        int MINIMO_DEDOS = 0;

        //Incializo Scanner
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        //Variables
        String opcion;
        String paresNonesJ1="";
        String paresNonesJ2="";
        int dedosJugador1=0;
        int dedosJugador2=0;
        int sumaDedos=0;
        String ganador="";

        do{
            System.out.println("¿Que modo de juegos vas a jugar?");
            System.out.println("-----------------------");
            System.out.println("1. Juego local contra otro jugador");
            System.out.println("2. Juega contra la maquina");
            System.out.println("usa SALIR para terminar el programa");

            opcion = sc.nextLine();
            opcion = opcion.toUpperCase();

            switch(opcion){
                // Case 1 para jugar contra otro jugador en local
                case "1":
                    System.out.println("HAS DECIDIDO JUGAR contra otro jugador");
                    System.out.println("-----------------------------");

                    do{
                        //El bucle comprueba si el dato introducido es PARES O NONES
                        System.out.println("Elgige PARES o NONES,");
                        System.out.println("JUGARDOR 1:");
                        paresNonesJ1= sc.nextLine();
                        paresNonesJ1 = paresNonesJ1.toUpperCase();

                        if(!(paresNonesJ1.equalsIgnoreCase("PARES")
                                || paresNonesJ1.equalsIgnoreCase("NONES"))){
                            System.out.println("Opciones validas: PARES o NONES");

                        }
                    }while(!(paresNonesJ1.equalsIgnoreCase("PARES")
                            || paresNonesJ1.equalsIgnoreCase("NONES")));

                    if(paresNonesJ1.equalsIgnoreCase("PARES")){
                        paresNonesJ2 = "NONES";
                    } else{
                        paresNonesJ2 = "PARES";
                    }

                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Es decir JUGADOR 1 ["+ paresNonesJ1 +"] y JUGADOR 2 ["+ paresNonesJ2 +"]");
                    System.out.println("--------------------------------------------------------------------------");

                    do{
                        //El bucle comprueba si el numero introducido de dedos del jugador 1 es un numero logico
                        //Es decir tiene que tener 10 o 1 dedo
                        System.out.println("Elige numero de dedos JUGADOR 1:");

                        dedosJugador1 = sc.nextInt();
                        if(dedosJugador1>MAXIMOS_DEDOS){
                            System.out.println("El numero de dedos no puede ser mayor que 10");
                        } else if (dedosJugador1<MINIMO_DEDOS){
                            System.out.println("El numero de dedos no puede ser menor que 0");
                        }

                    }while(!(dedosJugador1 >= MINIMO_DEDOS && dedosJugador1<=MAXIMOS_DEDOS));

                    do{
                        //El bucle comprueba si el numero introducido de dedos del jugador 2 es un numero logico
                        //Es decir tiene que tener 10 o 1 dedo
                        System.out.println("Elige numero de dedos JUGADOR 2:");

                        dedosJugador2 = sc.nextInt();
                        if(dedosJugador2>MAXIMOS_DEDOS){
                            System.out.println("El numero de dedos no puede ser mayor que 10");
                        } else if (dedosJugador2<MINIMO_DEDOS){
                            System.out.println("El numero de dedos no puede ser menor que 0");
                        }

                    }while(!(dedosJugador2 >= MINIMO_DEDOS && dedosJugador2<=MAXIMOS_DEDOS));

                    break;

                case "2":
                    System.out.println("HAS DECIDIDO JUGAR CONTRA LA MAQUINA");
                    System.out.println("-----------------------------");

                    do{
                        //El bucle comprueba si el dato introducido es PARES O NONES
                        System.out.println("Elgige PARES o NONES,");
                        System.out.println("JUGARDOR 1:");
                        paresNonesJ1= sc.nextLine();
                        paresNonesJ1 = paresNonesJ1.toUpperCase();

                        if(!(paresNonesJ1.equals("PARES") || paresNonesJ1.equals("NONES"))){
                            System.out.println("Opciones validas: PARES o NONES");

                        }
                    }while(!(paresNonesJ1.equals("PARES") || paresNonesJ1.equals("NONES")));

                    if(paresNonesJ1.equals("PARES")){
                        paresNonesJ2 = "NONES";
                    } else{
                        paresNonesJ2 = "PARES";
                    }

                    System.out.println("--------------------------------------------------------------------------");
                    System.out.println("Es decir JUGADOR 1 ["+ paresNonesJ1 +"] y JUGADOR 2 ["+ paresNonesJ2 +"]");
                    System.out.println("--------------------------------------------------------------------------");

                    do{
                        //El bucle comprueba si el numero introducido de dedos del jugador 1 es un numero logico
                        //Es decir tiene que tener 10 o 1 dedo
                        System.out.println("Elige numero de dedos JUGADOR 1:");

                        dedosJugador1 = sc.nextInt();
                        if(dedosJugador1>10){
                            System.out.println("El numero de dedos no puede ser mayor que 10");
                        } else if (dedosJugador1<0){
                            System.out.println("El numero de dedos no puede ser menor que 0");
                        }

                    }while(!(dedosJugador1 >= MINIMO_DEDOS && dedosJugador1<=MAXIMOS_DEDOS));

                    //DEDOS ALEATORIOS CPU
                    dedosJugador2 = random.nextInt(10)+1; //VA A ELEGIR UN NUMERO DEL 1 AL 10
                    break;

                case "SALIR":
                    System.out.println("HAS DECIDIDO SALIR DEL JUEGO...");
                    break;
                default:
                    System.out.println("Elige una opción valida\n");
                    break;
            }

            if(opcion.equalsIgnoreCase("1") || opcion.equals("2")){
                //OPERACION DEL JUEGO (sumo los dedos y miro si es par o impar para saber quien ha ganado)
                sumaDedos = dedosJugador1 + dedosJugador2;

                if ((sumaDedos % 2) == 0) {
                    //Compruebo si es par el numero
                    if (paresNonesJ1.equals("PARES")) {
                        //Compruebo si el valor que eligió el jugador es PARES o NONES y lo añado a la variable
                        // GANADOR para saber quien gana

                        ganador = "JUGADOR 1";
                    } else {
                        ganador = "JUGADOR 2";
                    }

                    System.out.println("LA SUMA DE DEDOS ES DE [" + sumaDedos + "], por lo que es PARES");
                    System.out.println("----------------------");
                    System.out.println("GANA " + ganador + "!!!\n\n");

                } else {
                    if (paresNonesJ1.equals("NONES")) {
                        //Compruebo si el valor que eligió el jugador es PARES o NONES y lo añado a la variable
                        // GANADOR para saber quien gana
                        ganador = "JUGADOR 1";
                    } else {
                        ganador = "JUGADOR 2";
                    }

                    System.out.println("LA SUMA DE DEDOS ES DE [" + sumaDedos + "], por lo que es NONES");
                    System.out.println("----------------------");
                    System.out.println("GANA " + ganador + "!!!\n\n");
                }

                sc.nextLine();
                //Limpio el buffer para evitar el salto de linea
            }

        }while(!opcion.equals("SALIR"));
    }
}
