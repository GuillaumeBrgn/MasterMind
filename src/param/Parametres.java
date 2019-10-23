package param;

public class Parametres {

    //définit la taille de la combinaison à deviner
    public static int tailleCombinaison = 4;

    //définit les nombres min et max autorisés dans une combinaison
    public static int nombreMin = 0;
    public static int nombreMax = 9;

    //défini le nombre de chance en mode Challenger et Defenseur
    //(inutile pour le mode Duel)
    public static int nbChanceModeChallenger = 5;
    public static int nbChanceModeDefenseur = 5;

    //affiche la combinaison en mode Challenger
    public static boolean modeTriche = true;

}
