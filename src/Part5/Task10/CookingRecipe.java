package Part5.Task10;

class CookingRecipe {
    public void prepareRecipe() {
        boilWater();
        addIngredients();
        cook();
        serve();
    }

    protected void boilWater() {
        System.out.println("Boiling water");
    }
    protected void addIngredients() {
        System.out.println("Adding ingredients");
    }
    protected void cook() {
        System.out.println("Cooking");
    }
    protected void serve() {
        System.out.println("Serving");
    }
}
