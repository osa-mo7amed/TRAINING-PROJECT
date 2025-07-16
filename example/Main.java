import java.util.Scanner;

class Circle{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double getR(){
        return r;
    }

    public void setR(double r){
        this.r = r;
    }

    public double Area(){
        double A = Math.PI * Math.pow(r, 2);
        return A;
    }

    public double lengthOfCircle(){
        double L = 2 * Math.PI * r;
        return L;
    }
}

public class Main{
    public static void main(String[] args) {
        Circle C1 = new Circle(2.3);
        Circle C2 = new Circle(4.8);
        Scanner sc = new Scanner(System.in);

        System.out.println("The first circle: ");
        System.out.println("The area of the circle : " + C1.Area());
        System.out.println("The circumference length of the cirlce : " + C1.lengthOfCircle());

        System.out.println("\nThe second circle: ");
        System.out.println("The area of the circle : " + C2.Area());
        System.out.println("The circumference length of the cirlce : " + C2.lengthOfCircle());
    }
}
