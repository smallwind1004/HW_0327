package in_class_0327;
public class Shape{
    protected String color;
    protected int side;
    private static int count = 0;
    
    public Shape(String color1, int s1) {
        setColor(color1);
        setSide(s1);
        count++;
    }
    public void setColor(String newColor){
        this.color = newColor;
    }
    public String getColor(){
        return this.color;
    }
    public void setSide(int newSide){
        this.side = newSide;
    }
    public int getSide(){
        return this.side;
    }
    public static int getCount() {
        return count;
    }

    public String showInfo(){
        return "side(" + Integer.toString(getSide()) + ")," + getColor() + "\n";
    }
}