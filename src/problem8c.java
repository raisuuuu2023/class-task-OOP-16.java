class Restaurant {
    protected double taxRate = 0.10; // Standard tax rate of 10%

    public double calculateBill(double foodPrice) {
        return foodPrice + (foodPrice * taxRate);
    }

    public int estimateDeliveryTime() {
        return 40; // Default delivery time
    }
}

class FastFoodRestaurant extends Restaurant {
    public FastFoodRestaurant() {
        this.taxRate = 0.15; // Fast-food tax rate of 15%
    }

    @Override
    public int estimateDeliveryTime() {
        return 20; // Faster delivery time
    }
}

class FineDiningRestaurant extends Restaurant {
    @Override
    public int estimateDeliveryTime() {
        return 60; // Longer delivery time
    }
}

public class problem8c {
    public static void main(String[] args) {
        Restaurant regularRestaurant = new Restaurant();
        FastFoodRestaurant fastFood = new FastFoodRestaurant();
        FineDiningRestaurant fineDining = new FineDiningRestaurant();

        double foodPrice = 100.0;

        System.out.println("Total Bill: " + regularRestaurant.calculateBill(foodPrice));
        System.out.println("Delivery Time: " + regularRestaurant.estimateDeliveryTime());
        System.out.println("Total Bill: " + fastFood.calculateBill(foodPrice));
    }
}


