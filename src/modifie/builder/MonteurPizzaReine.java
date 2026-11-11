package modifie.builder;

public class MonteurPizzaReine extends MonteurPizza {
    @Override
    protected String nom() { return "Reine"; }

    @Override
    public void monterPate() { pizza.setPate("croisée"); }

    @Override
    public void monterSauce() { pizza.setSauce("douce"); }

    @Override
    public void monterGarniture() { pizza.setGarniture("jambon+champignon"); }
}
