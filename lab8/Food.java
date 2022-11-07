package lab8;

public class Food {
    private String name;
    private String ingredients;
    private int calories;
    private String type;
    private double price;

    public Food(String n, double p){
        setName(n);
        setPrice(p);
    }

    public Food(String n, String i, int c, String t, double p){
        setName(n);
        setIngredients(i);
        setCalories(c);
        setType(t);
        setPrice(p);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public String getIngredients(){
        return this.ingredients;
    }

    public void setIngredients(String i){
        this.ingredients = i;
    }

    public String getType(){
        return this.type;
    }

    public void setType(String t){
        this.type = t;
    }

    public int getCalories(){
        return this.calories;
    }

    public void setCalories(int c){
        this.calories = c;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double p){
        this.price = p;
    }

    public boolean equals(Food food){
        if (getName() == food.getName()){
            if (getIngredients() == food.getIngredients()){
                return true;
            }
        }
        return false;
    }

    public void addNewIngredients(String newIngredient){
        if (getIngredients().length() > 0){
            this.ingredients += ", " + newIngredient;
        }
        else{
            this.ingredients += newIngredient;
        }
    }

    public boolean doesContain(String ingredient){
        return getIngredients().contains(ingredient);
    }

    public String toString(){
        return getName() + " is a " + getType() + " dish.\n" + "It includes " + getIngredients() + 
        ".\nSingle portion contains " + getCalories() + " calories. \nSingle serving cost = " + getPrice() + "\n";
    }
    
}
