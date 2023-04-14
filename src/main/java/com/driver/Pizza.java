package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
     private int vegPizza=300;
      private  int nonvegPizza=400;
     private boolean ischeeseadd;
      private int cheeseprice=80;
      private boolean addextratopping;
      private int extratoppingveg=70;
      private int getExtratoppingnonveg=120;
      private boolean addtakeaway;
      private int takeaway=20;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        price=isVeg?vegPizza:nonvegPizza;
        ischeeseadd =false;
        addextratopping=false;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        if(ischeeseadd ==false){
            ischeeseadd =true;
            price+=cheeseprice;
        }
    }

    public void addExtraToppings(){
        if(addextratopping==false) {
            price+= isVeg?extratoppingveg:getExtratoppingnonveg;
            addextratopping=true;
        }
    }

    public void addTakeaway(){
        if(addtakeaway==false){
            price+=takeaway;
            addtakeaway=true;
        }
    }

    public String getBill(){
        String var="";
        var+=isVeg?"Base Price Of The Pizza: "+vegPizza+"\n":"Base Price Of The Pizza: "+nonvegPizza+"\n";
        if(ischeeseadd) var+="Extra Cheese Added: "+cheeseprice+"\n";
        if(addextratopping){
            var+=isVeg?"Extra Toppings Added: "+extratoppingveg+"\n":"Extra Toppings Added: "+getExtratoppingnonveg+"\n";
        }
        var+="Total Price: "+price+"\n";
        this.bill=var;
        return this.bill;
    }
}
