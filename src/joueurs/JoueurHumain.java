package joueurs;

import capture.Captures;
import param.Parametres;

public class JoueurHumain extends Joueur {

    @Override
    public int[] proposition() {

        //le joueur entre son choix
        System.out.print("Proposition : ");
        int[] choix = Captures.readTableauChiffres(Parametres.tailleCombinaison);

        return choix;
    }

    //TODO
    @Override
    public boolean reponse(int[] proposition) {
        return false;
    }

}
