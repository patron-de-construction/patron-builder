package modifie.builder;

public class Client {
    public static void main(String[] args) {
        MonteurPizza[] monteurs = {
            new MonteurPizzaReine(),
            new MonteurPizzaPiquante(),
            new MonteurPizzaVegetarienne()
        };
        Directeur directeur = new Directeur(monteurs[0]);
        for (MonteurPizza monteur : monteurs) {
            directeur.setMonteur(monteur);
            directeur.construire();
            Pizza pizza = monteur.getPizza();   // on récupère la pizza auprès du monteur
            System.out.println(pizza);
        }
    }
}
