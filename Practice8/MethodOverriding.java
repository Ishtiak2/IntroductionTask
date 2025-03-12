package Practice8;

class Restaurant {
    String name;
    double foodPrice;

    Restaurant(String name,double foodPrice) {
        this.name = name;
        this.foodPrice = foodPrice;
    }

    double calculateTotalBill() {
        double tax = foodPrice * 0.10;
        return foodPrice+tax;
    }
    int estimateDeliveryTime() {
        return 40;
    }
    void displayInfo() {
        System.out.println(this.name + " estimated delivery time: " + estimateDeliveryTime() + " minutes.");
        System.out.println("Total Bill: $" + calculateTotalBill());
        System.out.println();
    }
}

class FastFoodRestaurant extends Restaurant {
    FastFoodRestaurant(String name,double foodPrice) {
        super(name,foodPrice);
    }

    @Override
    double calculateTotalBill() {
        double tax = foodPrice * 0.15;
        return foodPrice + tax;
    }

    @Override
    int estimateDeliveryTime() {
        return 20;
    }
}

class FineDiningRestaurant extends Restaurant {
    FineDiningRestaurant(String name, double foodPrice) {
        super(name,foodPrice);
    }
    @Override
    double calculateTotalBill() {
        double tax = foodPrice * 0.10;
        return foodPrice + tax;
    }

    @Override
    int estimateDeliveryTime() {
        return 60;
    }
}

// Main class
public class MethodOverriding {
    public static void main(String[] args) {
        Restaurant genericRestaurant = new Restaurant("Normal",500);
        FastFoodRestaurant fastFood = new FastFoodRestaurant("Fast-food",500);
        FineDiningRestaurant fineDining = new FineDiningRestaurant("Luxury-food",500);

        genericRestaurant.displayInfo();
        fastFood.displayInfo();
        fineDining.displayInfo();
    }
}
