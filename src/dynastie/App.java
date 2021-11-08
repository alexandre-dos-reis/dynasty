package dynastie;

import dynastie.models.Femme;
import dynastie.models.Homme;

public class App {
    public static void main(String[] args) {

        Homme pepinLeBref = (new Homme());
        
        pepinLeBref
            .setNom("Pépin III")
            .setSurnom("Pépin le bref")
            .setNaissance(714)
            .setDeces(768);

        Femme berthe = new Femme();

        berthe
            .setSurnom("Berthe au Grand Pied")
            .setNom("Bertrade de Laon")
            .setNaissance(720)
            .setDeces(783);

        pepinLeBref.epouser(berthe);

    }
}
