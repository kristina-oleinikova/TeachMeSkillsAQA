package Figures;

public abstract class Figure {
    private String figureName;

    public Figure(String figureName){
        this.figureName = figureName;
    }
    public abstract double getPerimeter();
    public abstract double getArea();
}
