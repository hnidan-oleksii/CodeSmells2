package Part5.Task10;

class PastaRecipe extends CookingRecipe {
    @Override
    public void addIngredients() {
        System.out.println("Adding pasta");
    }

    @Override
    public void cook() {
        System.out.println("Cooking pasta");
    }
}

