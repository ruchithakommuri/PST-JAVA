public class Week8Task8 {

    interface Food {
        String getType();
    }

    static class Pizza implements Food {
        public String getType() {
            return "Someone ordered Fast Food!";
        }
    }

    static class Cake implements Food {
        public String getType() {
            return "Someone ordered Dessert!";
        }
    }

    static class FoodFactory {

        Food getFood(String order) {
            if (order.equalsIgnoreCase("pizza")) {
                return new Pizza();
            }

            return new Cake();
        }
    }

    public static void main(String[] args) {
        FoodFactory factory = new FoodFactory();

        Food food1 = factory.getFood("pizza");
        Food food2 = factory.getFood("cake");

        System.out.println(food1.getType());
        System.out.println(food2.getType());
    }
}
