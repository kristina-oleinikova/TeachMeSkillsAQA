package Figures;

public class Triangle extends Figure {
    private int sideLength;
    private int height;
    public Triangle(String figureName, int sideLength, int height) {
        super(figureName);
        this.sideLength = sideLength;
        this.height = height;
    }

    @Override
    public double getArea() {

        double triangleArea = (this.sideLength*this.height)/2;
        return triangleArea;
    }

    @Override
    public double getPerimeter() {
        double perimeterOfTriangle = this.sideLength*3;
        return perimeterOfTriangle;
    }
}
