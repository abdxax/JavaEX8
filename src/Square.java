public class Square extends Rectangle{
    public Square() {
    }
    public Square(double side) {
        super(side,side);
    }
    public Square(double side,String color, boolean filled) {
        super(color,filled,side,side);
    }

    public double getSide(){
        return (super.getWidth()*4)/4;
    }

    public void setSide(double width){
             super.setWidth(width);

    }

    @Override
    public String toString() {
        return "A Square with side="+getSide();
    }
}
