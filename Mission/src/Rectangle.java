public class Rectangle {
    double width;
    double height;

    public Rectangle() {

    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        double extent = width * height;
        return extent;
    }
    @Override
    public String toString() {
        return "Rectangle [width=" + width + ", height=" + height + "]";
    }
}
