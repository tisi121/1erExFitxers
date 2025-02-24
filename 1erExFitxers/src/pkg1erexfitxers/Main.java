/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1erexfitxers;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author thejo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Ex1

        File d = new File("src\\prova");
        File f = new File("W:\\Proves\\Fitxers\\1erExFitxers\\1erExFitxers\\src\\prova\\dades.txt");

        if (!d.exists()) {
            d.mkdir();
        }
        if (!f.exists()) {
            try {
                if (f.createNewFile()) {
                    System.out.println("Fitxer creat");
                } else {
                    System.out.println("No s'ha pogut crear");
                }
            } catch (IOException ex) {
                System.out.println("Error en la creació del fitxer: " + ex.getMessage());
            }
        }
        //Ex2 i 3
        File f2 = new File("W:\\Proves\\Fitxers\\1erExFitxers\\1erExFitxers\\src\\prova\\dades_noves.txt");

        if (f.renameTo(f2)) {
            System.out.println("Rename fet");

        } else {
            System.out.println("No s'ha pogut fer");
        }

        f2.delete();

        //Ex4
        File dir = new File(".");
        String[] llista = dir.list();
        for (int i = 0; i < llista.length; i++) {
            System.out.println(llista[i]);
        }
        //Ex.5
        File fit = new File("src\\prova\\dades.txt");

        // Crear el fitxer si no existeix
        if (!fit.exists()) {
            try {
                if (fit.createNewFile()) {
                    System.out.println("Fitxer creat: " + fit.getAbsolutePath());
                } else {
                    System.out.println("No s'ha pogut crear el fitxer.");
                }
            } catch (IOException ex) {
                System.out.println("Error en la creació del fitxer: " + ex.getMessage());
            }
        }

        // Escriure al fitxer
        try (FileWriter fw = new FileWriter(fit)) {
            fw.write("Hola bon dia!");
            System.out.println("S'ha escrit al fitxer.");
        } catch (IOException ex) {
            System.out.println("Error en escriure al fitxer: " + ex.getMessage());
        }

        // Llegir el fitxer
        File aux = new File("src\\prova\\dades.txt");
        try (FileReader fr = new FileReader(fit)) {

            // Llegir el contingut del fitxer original
            StringBuilder contingut = new StringBuilder();
            int caracter;
            while ((caracter = fr.read()) != -1) {
                contingut.append((char) caracter);
            }

        } catch (IOException ex) {
            System.out.println("Error en llegir el fitxer: " + ex.getMessage());
        }
        try (FileReader lector = new FileReader(aux)) {
            int caracter;
            // Llegeix caràcter a caràcter
            while ((caracter = lector.read()) != -1) {
                // Converteix el caràcter a tipus char
                char c = (char) caracter;
                // Mostra el caràcter si no és un espai
                if (c != ' ') {
                    System.out.print(c);
                }
            }
        } catch (IOException e) {
            System.out.println("S'ha produït un error en llegir el fitxer: " + e.getMessage());
        }

        //Ex6
        File fitxerOriginal = new File("src\\prova\\dades.txt");

        // Ruta del fitxer de sortida
        File fitxerSortida = new File("src\\prova\\dades_canviades.txt");

        // Verificar si el fitxer original existeix
        if (!fitxerOriginal.exists()) {
            System.out.println("El fitxer original no existeix.");
            return;
        }

        // Llegir el fitxer original i processar el contingut
        try (FileReader fr = new FileReader(fitxerOriginal); FileWriter fw = new FileWriter(fitxerSortida)) {

            int caracter;
            while ((caracter = fr.read()) != -1) {
                // Convertir el caràcter a majúscula o minúscula
                char caracterProcessat = canviarMajusculaMinuscula((char) caracter);
                // Escriure el caràcter processat al fitxer de sortida
                fw.write(caracterProcessat);
            }

            System.out.println("S'ha processat i guardat el contingut al fitxer de sortida.");

        } catch (IOException ex) {
            System.out.println("Error en processar el fitxer: " + ex.getMessage());
        }
    }

    // Mètode per canviar majúscules a minúscules i viceversa
    private static char canviarMajusculaMinuscula(char c) {
        if (Character.isUpperCase(c)) {
            return Character.toLowerCase(c);
        } else if (Character.isLowerCase(c)) {
            return Character.toUpperCase(c);
        } else {
            return c; // Manté caràcters que no són lletres (espais, números, etc.)
        }
    }

}
