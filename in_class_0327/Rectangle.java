package in_class_0327;
public class Rectangle extends Shape{
    private double w, h;
    
    public Rectangle(String color1, int s1, double w1, double h1){
        super(color1, s1);
        setW(w1);
        setH(h1);
    }
    //-----W-----
    public void setW(double newW){
        this.w = newW;
    }
    public double getW(){
        return this.w;
    }
    //-----H-----
    public void setH(double newH){
        this.h = newH;
    }
    public double getH(){
        return this.h;
    }

    public double getArea(){
        return w * h;
    }
    public double getPerimeter() {
        return 2 * (this.w + this.h) ;
    }
    public String showInfo(){
        return super.showInfo() + "w: " + Double.toString(getW())+ " h: " + Double.toString(getH()) + " Area: " + Double.toString(getArea()) + " Peri: " + Double.toString(getPerimeter());
    }
}