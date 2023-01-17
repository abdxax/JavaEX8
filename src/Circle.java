public class Circle extends Shape {
    private double raius=1.0;
    public Circle(){

    }

    public Circle(double raius) {
        this.raius = raius;
    }

    public Circle(String color, boolean filled, double raius) {
        super(color, filled);
        this.raius = raius;
    }

    public double getRaius() {
        return raius;
    }

    public void setRaius(double raius) {
        this.raius = raius;
    }

    public double getArea(){
        return  3.14*(raius*raius);
    }

    public double getPerimeter(){
        return  2*3.14*raius;
    }

    @Override
    public String toString() {
        return "A Circle with radius="+raius;
    }
}
