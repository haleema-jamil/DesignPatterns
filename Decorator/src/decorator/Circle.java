package decorator;

public class Circle implements Shape {

    private double price=100;

//    Circle() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }

    @Override
    public double computeCost() {
        return price;
    }
}
