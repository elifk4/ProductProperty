
package product;


public class TestProduct {
    
public static void main(String[] args){
    
    Product p1=new Product();
    p1.setName("Iphone 13");
    p1.setPrice(500);
    p1.setQuantity(10);
    
    Product p2=new Product();
    
    System.out.println("Product1 id:"+p1.getProductId());
    System.out.println("Product2 id:"+ p2.getProductId());
    
    System.out.println("Name of product1: "+p1.getName());
    System.out.println("Quantity of product1: "+p1.getQuantity());
    System.out.println("Price of product1: "+p1.getPrice());
    
    System.out.println("Item value of product1: "+ p1.getItemValue());
    
    p2.setName("Samsung a52");
    p2.setQuantity(15);
    p2.setPrice(450);
    
    System.out.println("Product 2 information:"+ p2.toString());
      
      
    
    
}
    
}
