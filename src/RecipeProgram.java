public class RecipeProgram {
    public static void main(String[] args) {
        Recipe r1 = new Recipe("Gołąbki", "mielone mięso, ryż, cebula, kapusta, rosół, przecier pomidorowy, mąka, przyprawy",
                "Mięso włożyć do większej miski. " +
                        " Ryż ugotować, ostudzić i dodać do mięsa." +
                        "Cebulę obrać, zetrzeć na tarce, dodać do mięsa z ryżem." +
                        "Doprawić solą (około pół łyżeczki), pieprzem (1/4 łyżeczki)." +
                        "Wszystko wymieszać i dobrze wyrobić dłonią." +
                        "Uformować niewielkie podłużne kotlety ",
                         45);

        Recipe1 recipes = new Recipe1(5);


        r1.description = r1.descriptionFormatting(r1.description);
        recipes.addRecipe(r1);

        recipes.displayAllRecipes();

    }
}

