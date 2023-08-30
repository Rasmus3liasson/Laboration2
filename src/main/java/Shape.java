abstract public class Shape implements Comparable <Shape> {
    public abstract double getArea();
    public abstract double getPerimeter();
    public int compareTo(Shape other) {
        return Double.compare(this.getArea(),other.getArea());
    }

}
