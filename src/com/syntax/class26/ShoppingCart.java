package com.syntax.class26;

public class ShoppingCart {
    private double originalPrice;
    private double discount=.15;
    void setDiscount(double discount){
        if(discount>0 && discount<=.15){
            this.discount=discount;
            calculatePrice();
        }else{
            System.out.println("Can't have that much discount");
        }
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public double getDiscount() {
        return discount;
    }

    void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    void calculatePrice(){
        double price=originalPrice-(originalPrice*discount);
        System.out.println(price);
    }


}
class Tester{
    public static void main(String[] args) {
        ShoppingCart c= new ShoppingCart();
//        c.originalPrice=100;
//        c.discount=.14;
        System.out.println(c.getDiscount());
        c.setOriginalPrice(100);
        c.setDiscount(0.1);
        //c.calculatePrice();
    }
}
