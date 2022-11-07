package lab8;

public class Order {
    private static int count;

    private int ID;
    private Food orderedFood;
    private double portion;
    private double totalPrice;

    //mod
    private User user;
    private boolean discountApplied = false;
    
    public Order(double portion, String name, double price){
        this.ID = count;
        this.portion = portion;
        this.orderedFood = new Food(name, price);
        this.totalPrice = 0;

        addOrder();
    }

    public Order(double p, Food f){
        this.ID = count;
        this.portion = p;
        this.orderedFood = f;
        this.totalPrice = 0;

        addOrder();
    }

    public void addOrder(){
        count ++;
    }

    public int getID(){
        return this.ID;
    }

    public Food getOrderedFood(){
        return this.orderedFood;
    }

    public double getPortion(){
        return this.portion;
    }

    public double getTotalPrice(){
        return this.totalPrice;
    }

    public User getUser(){
        return this.user;
    }

    public void setUser(User u){
        this.user = u;
    }

    public void setDiscount(boolean x){
        this.discountApplied = x;
    }

    public boolean equals(Order order){
        if (getID() == order.getID()){
            return true;
        }
        return false;
    }

    public boolean equalsUser(Order order){
        if (getUser() == order.getUser()){
            return true;
        }
        return false;
    }


    public void checkout(){
        if (discountApplied){
            System.out.println("Applying surprise discount of 20%");
            this.totalPrice = 0.8 * (getPortion() * orderedFood.getPrice());
        }
        else{
            this.totalPrice = getPortion() * orderedFood.getPrice();
        }
    }

    public void increasePortion(int extraPortion){
        portion += extraPortion;
    }

    public String toString(){
        if (totalPrice == 0){
            System.out.println(">> Warning: This order is incomplete");
        }
        return "Details for Order " + getID() + "\n\t" + orderedFood.getName() + "(x " + getPortion() + ")" + 
        "\n\tTOTAL = " + getTotalPrice() + "\n\n";

    }

}

