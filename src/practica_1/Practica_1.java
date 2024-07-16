/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_1;

import java.util.Scanner;

/**
 *
 * @author TYT
 */
public class Practica_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner lea = new Scanner(System.in);

        int votosAzul = 0;
        int votosRojo = 0;
        int votosNegro = 0;
        int votosAmarillo = 0;
        int votosNulos = 0;

        System.out.print("Ingrese el número de votantes: ");
        int numVotantes = lea.nextInt();
        lea.nextLine(); // Consumir el salto de línea

        for (int i = 1; i <= numVotantes; i++) {
            System.out.print("Votante " + i + ": ¿Vota por AZUL, ROJO, NEGRO o AMARILLO? ");
            String voto = lea.nextLine().toUpperCase();

            switch (voto) {
                case "AZUL":
                    votosAzul++;
                    break;
                case "ROJO":
                    votosRojo++;
                    break;
                case "NEGRO":
                    votosNegro++;
                    break;
                case "AMARILLO":
                    votosAmarillo++;
                    break;
                default:
                    votosNulos++;
                    break;
            }
        }

        System.out.println("Resultados:");
        System.out.println("Votos AZUL: " + votosAzul);
        System.out.println("Votos ROJO: " + votosRojo);
        System.out.println("Votos NEGRO: " + votosNegro);
        System.out.println("Votos AMARILLO: " + votosAmarillo);
        System.out.println("Votos nulos: " + votosNulos);

        // Determinar el ganador
        if (votosAzul >= votosRojo && votosAzul >= votosNegro && votosAzul >= votosAmarillo) {
            System.out.println("El ganador es: AZUL");
        } else if (votosRojo >= votosNegro && votosRojo >= votosAmarillo) {
            System.out.println("El ganador es: ROJO");
        } else if (votosNegro >= votosAmarillo) {
            System.out.println("El ganador es: NEGRO");
        } else {
            System.out.println("El ganador es: AMARILLO");
        }
    }
}