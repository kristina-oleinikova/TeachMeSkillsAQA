package Figures;

class Main {
    public static void main(String[] args)
    {
        sumOfPerimeterAllFigures(createFigureArray());
    }

    public static Figure[] createFigureArray(){
        Figure[] figures = {
            new Rectangle("rectangle", 2, 5),
            new Circle("circle", 3, 4),
            new Triangle("triangle", 4,7),
            new Triangle("triangle", 8, 1),
            new Circle ("circle", 3, 9)
        };
        return figures;
    }

    public static void sumOfPerimeterAllFigures(Figure[] figures){
        double sumOfPerimeters = 0;

        for (Figure x : figures){
            sumOfPerimeters += x.getPerimeter();
        }
        System.out.println("Sum of perimeter for all figures: " + sumOfPerimeters);
    }

}