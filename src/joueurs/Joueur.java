package joueurs;

import param.Parametres;

public abstract class Joueur {

    int[] combinaison = new int[Parametres.tailleCombinaison];

    //les méthodes communes aux 2 joueurs (ordi et humain) : pas abstract / définies dans cette classe mère
    public String getCombinaisonString(){
        String res="";
        for (int n:combinaison)
            res+=n;
        return res;
    }

    public void genererCombinaison() {
        for (int i = 0; i < combinaison.length; i++)
            combinaison[i] =
                    (int) (Math.random() * (Parametres.nombreMax + 1) - Parametres.nombreMin) + Parametres.nombreMin;
    }

    //les méthodes qui changent selon le type de joueur : abstract / à redéfinir dans les classes filles
    public abstract int[] proposition();

    public abstract boolean reponse(int[] proposition);

}

