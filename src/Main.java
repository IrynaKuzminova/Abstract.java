import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Flower paeony = new Paeony("pink", new BigDecimal("65.00"));
        Flower daisy = new Daisy("white", new BigDecimal("5.00"));
        Flower hyacinth = new Hyacinth("purple", new BigDecimal("25.00"));
        Flower tulip = new Tulip("red", new BigDecimal("20.00"));
        Bouquet bouquet = new Bouquet(new Flower[]{paeony, paeony, paeony, daisy, hyacinth, tulip, tulip});
        System.out.println("Ціна букету: "+ bouquet.getAmountBouquet());
    }
}
