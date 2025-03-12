package Practice4;

class ProductFilter{

    void filterProducts(String category){
        System.out.println("Filtering products in category: " + category);
    }
    void filterProducts(double minPrice, double maxPrice){
        System.out.println("Filtering products in price range: $"+minPrice + " - $" + maxPrice);
    }

    void filterProductsByBrand(String brand){
        System.out.println("Filtering products of brand: " + brand);

    }
    void filterProducts(String category, double minPrice,double maxPrice){
        System.out.println("Filtering products in category: "+ category +" with price range $" + minPrice + " - $" + maxPrice);
    }

    void filterProducts(String category,double minPrice, double maxPrice,String brand){
        System.out.println("Filtering products in category: " +category + " with price range $" + minPrice +" - $" + maxPrice +" and brand: " + brand);
    }
}

public class ECommercePlatform {
    public static void main(String[] args){
        ProductFilter filter = new ProductFilter();

        filter.filterProducts("Electronics");
        filter.filterProducts(100,500);
        filter.filterProductsByBrand("Nike");
        filter.filterProducts("Fashion",50,300);
        filter.filterProducts("Electronics",200,1000,"Apple");
    }
}
