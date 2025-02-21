1. Amb la classe File llegeix un fitxer amb nom dades.txt dins d’una carpeta amb nom “prova” a
dins del directori de treball. Si el directori no existeix, s’ha de crear, Si el fitxer no existeix, s’ha
de crear.
2. Fent ús de la classe File canvia el nom del fitxer dades.txt a dades_noves.txt. Comprova que
s’ha canviat
3. Fent ús de la classe File esborra el fitxer dades_noves.txt
4. Copia el següent codi que serveix per a visualitzar el contingut d’un directori en concret.
Comprova el seu funcionament aplicant-ho a directoris del teu ordinador:

public static void main(String[] args) {
    File directorio = new File(".");  //directorio actual
    String[] lista = directorio.list();
    for (int i = 0; i < lista.length; i++) {
        System.out.println(lista[i]);
    }
}

5. Crea un fitxer de text amb el nom i contingut que vulguis. Ara crea una aplicación que pugui
llegir aquest fitxer caràcter a caràcter i que mostri el contingut sense els espais que pugui
contenir.
6. Llegeix un fitxer de text qualsevol i grava’l en un altre fitxer que canviï les majúscules per les
minúscules i a l’inversa.
