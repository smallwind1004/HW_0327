package in_class_0327;
public class Triangle extends Shape{
    private double a, b, de;
    
    public Triangle(String color1, int s1, double a1, double b1, double de1){
        super(color1, s1);
        setA(a1);
        setB(b1);
        setDe(de1);
    }
    //-----A-----
    public void setA(double newA){
        this.a = newA;
    }
    public double getA(){
        return this.a;
    }
    //-----B-----
    public void setB(double newB){
        this.b = newB;
    }
    public double getB(){
        return this.b;
    }
    //-----Degree-----
    public void setDe(double newDe){
        this.de = Math.PI * newDe / 180;
    }
    public double getDe(){
        return this.de;
    }

    public double getArea(){
        return a * b * Math.sin(de) / 2;
    }
    public double getPerimeter() {
        return a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(de));
    }
    public String showInfo(){
        return super.showInfo() + "a: " + Double.toString(getA())+ " b: " + Double.toString(getB()) + " degree: "+ Double.toString(getDe()) + " Area: " + Double.toString(getArea()) + " Peri: " + Double.toString(getPerimeter());
    }
}