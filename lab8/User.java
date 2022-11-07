package lab8;

public class User {
    private static int count;

    private int ID;
    private String name;
    private int age;
    private String orders;
    private int numberOfOrders;
    private String eatenFoods;

    public User(String n, int a){
        this.ID = count;
        this.name = n;
        this.age = a;
        this.orders = "";
        this.numberOfOrders = 0;
        this.eatenFoods = "";
        addUser();
    }

    public int getID(){
        return this.ID;
    }
    
    public int getAge(){
        return this.age;
    }

    public int getNumberOfOrders(){
        return this.numberOfOrders;
    }

    public String getName(){
        return this.name;
    }

    public String getOrders(){
        return this.orders;
    }

    public String getEatenFoods(){
        return this.eatenFoods;
    }

    public void addUser(){
        count ++;
    }

    public boolean equals(User user){
        if (this.ID == user.getID()){
            if (this.name == user.getName()){
                if (this.age == user.getAge()){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean didEat(Food food){
        return eatenFoods.contains(food.getName()); 
    }

    public String pickOrderbyIndex(int index){
        String[] orders = getOrders().split("-");
        return orders[index-1];
    }

    public void addNewOrder(Order order){
        // Revision
        System.out.println("Adding a new order of " + order.getOrderedFood().getName() + " to " + getName());
        order.setUser(this);
        //Update orders
        if (getOrders().length() > 0){
            this.orders += "-" + order.getID();
        }
        else{
            this.orders += order.getID();
        }

        // Update numberOfOrders
        numberOfOrders ++;
        
        // Update eatenFoods
        if (getEatenFoods().length() > 0){
            this.eatenFoods += "-" + order.getOrderedFood().getName();
        }
        else{
            this.eatenFoods +=  order.getOrderedFood().getName();
        }
    }


    public String toString(){
        return "User ID: " + getID() + ", User Name: " + getName() + ", Age: " + getAge();
    }

}
