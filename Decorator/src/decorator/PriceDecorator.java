package decorator;

public class PriceDecorator extends ShapeDecorator {
    private double price;

    /**
     *
     * @param price
     */
    public PriceDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    public double getPrice() {
       System.out.println("Price: 100");
        return price;
    }
}