package in_class_0327;
public class Circle extends Shape{
    private double r;
    
    public Circle(String color1, int s1, double r1){
        super(color1, s1);
        setR(r1);
    }
    //-----R-----
    public void setR(double newR){
        this.r = newR;
    }
    public double getR(){
        return this.r;
    }

    public double getArea(){
        return Math.PI * this.r * this.r;
    }
    public double getPerimeter() {
        return 2 * this.r * Math.PI;
    }
    public String showInfo(){
        return super.showInfo() + "r: " + Double.toString(getR()) + " Area: " + Double.toString(getArea()) + " Peri: " + Double.toString(getPerimeter());
    }
}