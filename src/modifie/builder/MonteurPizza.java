package modifie.builder;

public abstract class MonteurPizza {
    protected Pizza pizza;

    // nouvelle pizza à chaque construction
    public void creerNouvellePizza() {
        pizza = new Pizza();
        pizza.setNom(nom());
    }

    public Pizza getPizza() {
        return pizza;
    }

    protected abstract String nom();
    public abstract void monterPate();
    public abstract void monterSauce();
    public abstract void monterGarniture();
}
