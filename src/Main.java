import capture.Captures;
import modes.Challenger;
import modes.Defenseur;
import modes.Duel;
import modes.Mode;

public class Main {
    public static void main(String[] args){

        System.out.println("Choisissez votre mode de jeu :");
        System.out.println("1) Challenger");
        System.out.println("2) Defenseur");
        System.out.println("3) Duel");

        int m = Captures.readInt(1,3);
        Mode mode;
        if(m==1)
            mode = new Challenger();
        else if(m==2)
            mode = new Defenseur();
        else
            mode = new Duel();

        mode.lancerPartie();

    }
}
