package org.TrainingInFreeTime.Kata.Kata03_15.shop;

public class PromotionalProduct extends Product{
    private int promotionPercent;

    public PromotionalProduct(String name, double cost, int promotionPercent) {
        super(name, cost);
        this.promotionPercent = promotionPercent;
    }

    public int getPromotionPercent() {
        return promotionPercent;
    }

    public void setPromotionPercent(int promotionPercent) {
        this.promotionPercent = promotionPercent;
    }

    @Override
    public void printProductInfo() {
        System.out.println("Product - " + getName() +
                " cost " + getCost() + "$" +
                " product - " + getName());

    }
}
