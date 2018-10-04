public class Main {
    public static void main(String[] args) {

        BuyAlcohol alcohol = new BuyAlcohol("vine", "Onoro vera", 50, 2, "Men buy two botles of alcohol");
        alcohol.buyAlcohol("vine", "Onoro vera", 50, 2, "Men buy two botles of alcohol");
        System.out.println(alcohol.amount);
    }
}
