/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg1erexfitxers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
        // TODO code application logic here

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
            File f2 = new File("W:\\Proves\\Fitxers\\1erExFitxers\\1erExFitxers\\src\\prova\\dades_noves.txt");

            if (f.renameTo(f2)) {
                System.out.println("Rename fet");

            } else {
                System.out.println("No s'ha pogut fer");
            }

            f2.delete();
            
            File dir=new File(".");
            String [] llista=dir.list();
            for(int i=0;i<llista.length;i++){
                System.out.println(llista[i]);
            }
            /*
                FileReader fitxer;
		BufferedReader lector;
		String linia;

		try {
			// Inicialització de les variables
			fitxer = new FileReader("W:\\Proves\\Fitxers\\1erExFitxers\\1erExFitxers\\src\\prova\\dades.txt");
			lector = new BufferedReader(fitxer);

			// Llegir i mostrar línia per línia
			while ((linia = lector.readLine()) != null) {
				System.out.println(linia);
			}

			// Tancar els fluxos
			lector.close();
			fitxer.close();
		} catch (IOException e) {
			System.out.println("Error en llegir el fitxer: " + e.getMessage());
		}
             */
        }

    }

