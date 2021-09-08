import java.math.BigDecimal;


public abstract class Flower {
    private String color;
    private BigDecimal price;

    public Flower(String color, BigDecimal price) {
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
