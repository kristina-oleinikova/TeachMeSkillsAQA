package Figures;

public class Rectangle extends Figure{
    private int length;
    private int width;

    public Rectangle(String figureName, int length, int width) {
        super(figureName);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        double rectanglePerimeter = (this.length+this.width)*2;
        return rectanglePerimeter;
    }

    @Override
    public double getArea() {
        double areaOfRectangle = this.length*this.width;
        return areaOfRectangle;
    }
}
