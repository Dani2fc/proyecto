package modelo;

import java.io.IOException;
import java.util.Scanner;

public class CifradoCesar {
        // Atributos
        public String texto;
        public int n;

    // método para cifrar el texto
    public static String cifrar(String texto, int n) {
        StringBuilder cifrado = new StringBuilder();
        n = n % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) + n) > 'z') {
                    cifrado.append((char) (texto.charAt(i) + n - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + n));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) + n) > 'Z') {
                    cifrado.append((char) (texto.charAt(i) + n - 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) + n));
                }
            }
        }
        return cifrado.toString();
    }

    // método para descifrar el texto
    public static String descifrar(String texto, int n) {
        StringBuilder cifrado = new StringBuilder();
        n = n % 26;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
                if ((texto.charAt(i) - n) < 'a') {
                    cifrado.append((char) (texto.charAt(i) - n + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - n));
                }
            } else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
                if ((texto.charAt(i) - n) < 'A') {
                    cifrado.append((char) (texto.charAt(i) - n + 26));
                } else {
                    cifrado.append((char) (texto.charAt(i) - n));
                }
            }
        }
        return cifrado.toString();
    }
}