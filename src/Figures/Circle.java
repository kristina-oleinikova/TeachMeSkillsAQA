package Figures;

public class Circle extends Figure{
    private int perimeterOfCircle;
    private int radius;
    public Circle(String figureName, int perimeterOfCircle, int radius) {
        super(figureName);
        this.perimeterOfCircle = perimeterOfCircle;
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        double totalPrimeterOfCircle = 2*Math.PI*this.perimeterOfCircle*this.radius;
        return totalPrimeterOfCircle;
    }

    @Override
    public double getArea() {
        double areaOfCircle = Math.PI*(this.radius*this.radius);
        return areaOfCircle;
    }
}
