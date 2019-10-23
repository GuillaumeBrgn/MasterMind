package joueurs;

public class JoueurOrdi extends Joueur {

    //TODO
    @Override
    public int[] proposition() {
        return null;
    }

    @Override
    public boolean reponse(int[] proposition) {
        boolean fini=true;
        for (int i = 0; i < proposition.length; i++) {
            if (proposition[i]<combinaison[i]){
                System.out.print("+");
                fini = false;
            }
            else if (proposition[i]>combinaison[i]){
                System.out.print("-");
                fini = false;
            }
            else
                System.out.print("=");
        }
        System.out.println();

        return fini;
    }
}
