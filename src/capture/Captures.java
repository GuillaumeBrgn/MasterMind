package capture;

import java.util.Scanner;

public class Captures {

    static Scanner sc = new Scanner(System.in);

    /**
     * Allows catcher is processed keyboard input
     * @param min Minimum value
     * @param max Maximum value
     * @return return the rest
     */
    public static int readInt(int min, int max) {
        String line = sc.nextLine();

        int rest;

        try {
            rest = Integer.parseInt(line);
        } catch (Exception e) {
            System.out.println("Cette valeur n'est pas autorisée");
            return readInt(min, max);
        }

        if (rest < min || rest > max) {
            System.out.println("Cette valeur n'est pas autorisée");
            return readInt(min, max);
        }

        return rest;
    }

    public static int[] readTableauChiffres(int nbChiffres) {
        String line = sc.nextLine();

        //vérification de la taille du texte entré
        if(line.length()!=nbChiffres) {
            System.out.println("Cette valeur n'est pas autorisée");
            return readTableauChiffres(nbChiffres);
        }

        //convertion en tableau de String
        String[] tab = line.split("");

        //convertion en tableau de int
        int[] tab2 = new int[nbChiffres];
        try {
            for (int i = 0; i < nbChiffres; i++)
                tab2[i] = Integer.parseInt(tab[i]);
        } catch (Exception e) {
            System.out.println("Cette valeur n'est pas autorisée");
            return readTableauChiffres(nbChiffres);
        }

        return tab2;
    }
}
