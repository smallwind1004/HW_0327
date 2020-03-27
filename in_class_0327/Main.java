package in_class_0327;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Circle> circles = new ArrayList<Circle>();
        ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
        ArrayList<Triangle> triangles = new ArrayList<Triangle>();
        while (true) {
            String tmp = sc.nextLine();
            if (tmp.equals("a")) {
                tmp = sc.nextLine();
                if (tmp.equals("1")) {
                    for (int i = 3; i <= 5; i++) {
                        circles.add(new Circle("red", 1, i));
                    }
                }
                if (tmp.equals("2")) {
                    for (int i = 3; i <= 5; i++) {
                        for (int j = 3; j <= 5; j++) {
                            rectangles.add(new Rectangle("green", 4, i, j));
                        }
                    }
                }
                if (tmp.equals("3")) {
                    for (int i = 3; i <= 5; i++) {
                        for (int j = i; j <= 5; j++) {
                            for (int k = 15; k <= 90; k += 15) {
                                triangles.add(new Triangle("black", 3, i, j, k));
                            }
                        }
                    }
                }
            }
            if (tmp.equals("b")) {
                int n = 1;
                System.out.println(Shape.getCount() + "items:");
                for (int i = 0; i < circles.size(); i++) {
                    System.out.println(n + "->" + circles.get(i).showInfo());
                    n++;
                }
                for (int i = 0; i < rectangles.size(); i++) {
                    System.out.println(n + "->" + rectangles.get(i).showInfo());
                    n++;
                }
                for (int i = 0; i < triangles.size(); i++) {
                    System.out.println(n + "->" + triangles.get(i).showInfo());
                    n++;
                }
            }
            if (tmp.equals("e")) {
                break;
            }
        }
    }
}