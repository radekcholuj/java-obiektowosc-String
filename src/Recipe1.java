public class Recipe1 {
    Recipe[] recipes;
    int iterator = 0;

    Recipe1(int size) {
        recipes = new Recipe[size];
    }

    void addRecipe(Recipe recipe) {
        if (iterator < recipes.length) {
            recipes[iterator] = recipe;
            iterator++;
        } else {
            System.out.println("Nie można dodać przpisu, brak miejsca na nowe przpisy");
        }
    }


    void displayAllRecipes() {
        System.out.println("Wszystkie zapisane przepisy");
        System.out.println("----------------------------");
        for (Recipe recipe : recipes) {
            if (recipe != null) {
                recipe.display();
                System.out.println("**********************************************");
            } else {
                break;
            }
        }

    }
}


