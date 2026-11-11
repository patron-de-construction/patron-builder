package modifie.builder;

// nouvelle pizza ajoutée
public class MonteurPizzaVegetarienne extends MonteurPizza {
    @Override
    protected String nom() { return "Végétarienne"; }

    @Override
    public void monterPate() { pizza.setPate("complète"); }

    @Override
    public void monterSauce() { pizza.setSauce("tomate basilic"); }

    @Override
    public void monterGarniture() { pizza.setGarniture("poivron+oignon+olive"); }
}
