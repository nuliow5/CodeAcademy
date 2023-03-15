package org.TrainingInFreeTime.Kata.Kata03_15;

import org.TrainingInFreeTime.Kata.Kata03_15.shop.Product;
import org.TrainingInFreeTime.Kata.Kata03_15.shop.PromotionalProduct;
import org.TrainingInFreeTime.Kata.Kata03_15.shop.Shop;
import org.TrainingInFreeTime.Kata.Kata03_15.shop.ShopNetwork;

import java.util.ArrayList;
import java.util.List;

public class ShopMain {
    static Shop maximaShop = new Shop();

    static Product jazzChips = new Product("Jazz Chips", 1.50);
    public static void main(String[] args) {

        maximaShop.setAddress("Radvilu 15, Kedainiai");
        maximaShop.setEmployeeCount(15);
        maximaShop.setShopNetwork(ShopNetwork.MAXIMA);

       biggestStore(crateListOfStores());

        maximaShop.turnOnConditioner();

        cheapProducts(createEssentialGoods(), 2.20);

        System.out.println("---------------");

        for (int i = 0; i < createPromotionProducts().size(); i++) {
            createPromotionProducts().get(i).printProductInfo();
        }

        lowestDiscount(createPromotionProducts());

    }

    public static void biggestStore(List<Shop> shops){
        int max = shops.get(0).getEmployeeCount();
        Shop beggetShop = null;


        for (int i = 0; i < shops.size(); i++) {
            if (shops.get(i).getEmployeeCount() > max){
                max = shops.get(i).getEmployeeCount();
                beggetShop = shops.get(i);
            }
        }
        System.out.println("Biggest shop is " + beggetShop);
    }

    public static List<Shop> crateListOfStores(){
        List<Shop> shops = new ArrayList<>();

        shops.add(new Shop("Kalantos 11, Kaunas",
                30,
                ShopNetwork.IKI,
                createEssentialGoods()));

        shops.add(new Shop("Silagirio 50, Kaunas",
                35,
                ShopNetwork.LIDL,
                createSnacks()));

        shops.add(maximaShop);

        return shops;

    }

    public static List<Product> createEssentialGoods(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Milk", 1.50));
        productList.add(new Product("Bread", 2.20));
        productList.add(new Product("Chocolate", 2.10));

        Product sourCream = new Product();
        sourCream.setName("Sour Cream");
        sourCream.setCost(3);

        productList.add(sourCream);
        productList.add(jazzChips);

        return productList;
    }

    public static List<Product> createSnacks(){
        List<Product> snacksList = new ArrayList<>();
        snacksList.add(new Product("Chips", 2));
        snacksList.add(new Product("Pop Corn", 3.50));
        snacksList.add(new Product("Nuts", 1.50));

        return snacksList;
    }

    public static void cheapProducts(List<Product> productList, double cost){
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getCost() < cost){
                (productList.get(i)).printProductInfo();
            }
        }
    }

    public static List<PromotionalProduct> createPromotionProducts(){
        List<PromotionalProduct> promotionalProductList = new ArrayList<>();

        promotionalProductList.add(new PromotionalProduct("Coffee", 2.1, 15));
        promotionalProductList.add(new PromotionalProduct("Tee", 2.1, 30));

        return promotionalProductList;
    }
    public static void lowestDiscount(List<PromotionalProduct> promotionalProductList){
        System.out.println("#lowest Discount");
        PromotionalProduct min = promotionalProductList.get(0);
        for (PromotionalProduct prom : promotionalProductList){
            if (prom.getPromotionPercent() < min.getPromotionPercent()){
                min = prom;
            }
        }
        min.printProductInfo();

    }
}
