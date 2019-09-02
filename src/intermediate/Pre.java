package intermediate;
import java.util.function.Predicate;

public class Pre {
}
    class Apple {
        private String color;
        private double price;
        private int weight;

        public Apple(String color, double price, int weight) {
            this.color = color;
            this.price = price;
            this.weight = weight;
        }

        public double getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return String.format("Color: %s Price: %.2f Weight: %s", color, price, weight);
        }
    }

