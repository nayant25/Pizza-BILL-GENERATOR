

public class pizza {
    private int price;
    private boolean veg;
    private int extraCheesePrice = 100;
    private int extraToppingsPrice = 150;
    private int backpackPrice = 20;
    private int basePizzaPrice;
    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToopingsAdded = false;
    private boolean isOptedForTakeaway = false;

    public pizza(boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
        basePizzaPrice = this.price;
    }
    public void addExtraCheese(){
        isExtraCheeseAdded = true;
        //System.out.println("Extra Cheese Added");
        this.price += extraCheesePrice;
    }
    public void addExtraToppings(){
        isExtraToopingsAdded = true;
       // System.out.println("Extra Toppings Added");
        this.price += extraToppingsPrice;
    }
    public void takeaway() {
        isOptedForTakeaway = true;
       // System.out.println("Opted for takeaway");
        this.price += backpackPrice;

    }
    public void getBill(){
        String bill = "";
        System.out.println("Base Pizza Price: "+basePizzaPrice);
        if(isExtraToopingsAdded){
            bill += "Extra Cheese Added: "+extraCheesePrice+"\n";
        }
        if(isExtraToopingsAdded){
            bill += "Extra Toppings Added: "+extraToppingsPrice+"\n";
        }
        if(isOptedForTakeaway){
            bill += "Opted For Takeaway: " +backpackPrice+"\n";
        }
        bill += "Total Bill: "+this.price+"\n";
        System.out.println(bill);
    }

}
