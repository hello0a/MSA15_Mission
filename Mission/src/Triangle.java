public class Triangle {
    double width;
    double height;


    public Triangle() {

    }
    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        double extent = (width * height)/2;
        return extent;
    }
    @Override
    public String toString() {
        return "Triangle [width=" + width + ", height=" + height + "]";
    }
}
