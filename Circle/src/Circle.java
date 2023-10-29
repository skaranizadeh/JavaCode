

public class Circle {
    private double radius;
    final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0 ) {
            this.radius = 0;
        } else
            this.radius = radius;
    }

    public double area() {
        return PI * Math.pow(radius, 2);
    }

    public double circumference() {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {

        Circle circle = new Circle(3.2);
        System.out.println("This is the radius of the circle: " + circle.getRadius());

        circle.setRadius(2.0);
        System.out.printf("The area of a circle with radius of %.2f is %.2f square units\n"
                           ,circle.getRadius(), circle.area());
        System.out.printf("The circumference of a circle with radius of %.2f is %.2f units\n"
                           ,circle.getRadius(), circle.circumference());
    }
}
