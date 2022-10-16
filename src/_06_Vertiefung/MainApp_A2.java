package _06_Vertiefung;

import java.util.Random;
import java.util.Scanner;

public class MainApp_A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int zufallZahl = 0;

        boolean run = true;

        String antwort = "";

        while(run){

            System.out.println("Lustiges Zahlenraten");
            System.out.println("---------------------");
            System.out.println("Erraten Sie die Zufahlszahl in moeglichst wenigen Schritten!");
            System.out.println("Die Zahl kann zwischen 1 und 100 liegen");

            zufallZahl = 0 + random.nextInt(100- 0 + 1);
            int eingabe = 0;
            int versuche = 1;

            while(eingabe != zufallZahl){
                System.out.println("Bitte eine Zahl eingeben: ");
                eingabe = scanner.nextInt();

                if(eingabe < 0 || eingabe > 100){
                    System.out.println("Ungültige Eignabe. Bitte Eingabe wiederholen:");
                }else if(eingabe < zufallZahl){
                    System.out.println("Die gesuchte Zahl ist groesser!");
                    versuche++;
                }else if(eingabe > zufallZahl){
                    System.out.println("Die gesuchte Zahl ist kleiner!");
                    versuche++;
                }else if(eingabe == zufallZahl){
                    System.out.println("Sie haben die gesuchte Zahl gefunden!");
                    break;
                }
            }
            if (versuche >= 5) {
                System.out.println("Weiter spielen? (j = Ja. | n = Nein.");
                antwort = scanner.next();
                if(antwort.compareTo("j") == 0){
                    run = true;
                    System.out.println();
                }else{
                    run = false;
                }
            }
        }
    }
}
