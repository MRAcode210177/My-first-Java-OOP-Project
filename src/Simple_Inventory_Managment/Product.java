package Simple_Inventory_Managment;

import java.util.ArrayList;

public class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId,String name, double price){
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getproductId(){
        return productId;
    }
    public String getname(){
        return name;
    }
    public double getprice(){
        return price;
    }

    @Override
    public String toString() {
        return String.format("Id : " + productId + "Name:" + name + "price Rs/=" + price);
    }

    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(101,"book",480));
        products.add(new Product(102,"pencil",60));
        products.add(new Product(103,"pen",120));

        for(Product s:products){
            System.out.println(s);
        }

        int id = 103;
        boolean found = false;

        for(Product t:products){
            if(id == t.getproductId()){
                System.out.println(t.getname());
                System.out.println(t.getprice());
                found = true;
                break;
            }}
        if (!found){
            System.out.println("not found");
        }
    }
}
