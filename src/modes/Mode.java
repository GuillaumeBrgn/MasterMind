package modes;

import joueurs.Joueur;
import joueurs.JoueurHumain;
import joueurs.JoueurOrdi;
import param.Parametres;

public abstract class Mode {

    Joueur humain;
    Joueur ordi;

    boolean fin=false;

    public void lancerPartie(){

        //les joueurs entrent en scène
        humain = new JoueurHumain();
        ordi = new JoueurOrdi();

        //choix des combinaisons et/ou tirage au sort
        preparerPartie();

        //déroulement de la partie
        int nbTour=0;
        while (!fin && nbTour<Parametres.nbChanceModeChallenger) {
            fin = tourDeJeu();
            nbTour++;
        }

        //affichage de fin
        System.out.println("FIN");

    }

    protected abstract void preparerPartie();

    protected abstract boolean tourDeJeu();


}
