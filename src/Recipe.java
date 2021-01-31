public class Recipe {
    String name;
    String ingredients;
    String description;
    int time;
    String closText = "**********************************************\nZachęcam do zapoznania się z innymi przepisami";

    public Recipe(String name, String ingredients, String description, int time) {
        this.name = name;
        this.ingredients = ingredients;
        this.description = description;
        this.time = time;
    }

    void display() {
        System.out.println("Nazwa potrawy: "+name);
        System.out.println("Składniki: "+ ingredients);
        System.out.println("Sposób przygotowania: "+description);
        System.out.println("Czas przygotowania: " + time+" minut");
        System.out.println(closText);
    }

    String descriptionFormatting(String description) {
        String[] splitDescription = description.split("\\.");
        this.description = "";
        for (int i = 0; i < splitDescription.length; i++) {
            if (i % 2 == 0 || i == 0) {
                this.description += "\n";
            }
            this.description += splitDescription[i].trim() + ". ";
        }
        return this.description;
    }
}

