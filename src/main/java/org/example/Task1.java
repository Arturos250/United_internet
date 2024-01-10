package org.example;

import java.util.Scanner;

class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  /// Ich erstelle ein Scanner-Objekt, um Benutzereingaben zu empfangen
        System.out.println("Bitte geben Sie die Nummer ein"); //Ich zeige dem Benutzer die Meldung "Geben Sie bitte die Nummer ein" an und erhalte die eingegebene Nummer
        int num = sc.nextInt();
        if (Primzahl(num)){    /// Prüfen, ob die eingegebene Zahl eine Primzahl ist und das Ergebnis in der Konsole anzeigen
            System.out.println(num + " " + " ist eine Primzahl");
        }
        else{
            System.out.println(num + " " + " ist keine Primzahl");
        }
    }

    // Methode zur Prüfung, ob eine Zahl eine Primzahl ist
    private static boolean Primzahl(int number) {
        if (number < 2) { // Wenn die Zahl kleiner als 2 ist, ist sie nicht primär
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Teiler von 2 bis zur Quadratwurzel der eingegebenen Zahl prüfen
            if (number % i == 0) { // Wenn eine Zahl durch eine andere Zahl teilbar ist, ist sie nicht primär.
                return false;
            }
        }
        return true; // Wenn keine Teiler gefunden werden, ist die Zahl primär
    }
}
