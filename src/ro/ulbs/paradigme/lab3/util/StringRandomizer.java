package ro.ulbs.paradigme.lab3.util;

// Importă clasa Random din pachetul java.util
import java.util.Random;

public class StringRandomizer {
    // Definirea unui șir constant de caractere
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    // Metodă statică pentru a genera un șir aleatoriu de o anumită lungime
    public static String getRandomString(int length) {
        // Crearea unui obiect Random
        Random random = new Random();
        // Crearea unui StringBuilder pentru a construi șirul
        StringBuilder sb = new StringBuilder(length);
        // Generarea șirului aleatoriu
        for (int i = 0; i < length; i++) {
            // Adăugarea unui caracter aleatoriu din CHARACTERS
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        // Returnarea șirului generat
        return sb.toString();
    }
}