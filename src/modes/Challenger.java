package modes;

import param.Parametres;

public class Challenger extends Mode {

    @Override
    protected void preparerPartie() {
        ordi.genererCombinaison();
    }

    @Override
    protected boolean tourDeJeu() {
        if(Parametres.modeTriche)
            System.out.println("(Combinaison secrète : "+ordi.getCombinaisonString()+")");
        int[] proposition = humain.proposition();
        return ordi.reponse(proposition);
    }
}
