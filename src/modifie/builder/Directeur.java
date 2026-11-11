package modifie.builder;

// le directeur reçoit le monteur et appelle les étapes dans l'ordre
public class Directeur {
    private MonteurPizza monteur;

    public Directeur(MonteurPizza monteur) {
        this.monteur = monteur;
    }

    public void setMonteur(MonteurPizza monteur) {
        this.monteur = monteur;
    }

    public void construire() {
        monteur.creerNouvellePizza();
        monteur.monterPate();
        monteur.monterSauce();
        monteur.monterGarniture();
    }
}
