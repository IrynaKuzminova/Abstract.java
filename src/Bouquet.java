import java.math.BigDecimal;

public class Bouquet {
    private BigDecimal price = new BigDecimal(0.00);
    public Flower[] flowers;

    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;

    }

    public BigDecimal getAmountBouquet() {
        if (flowers == null) {
            return price;
        } else
            for (int i = 0; i < flowers.length; i++) {
                price = price.add(flowers[i].getPrice());

            }
        return price;

    }
}
