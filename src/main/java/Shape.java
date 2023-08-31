import java.util.Objects;

abstract public class Shape implements Comparable <Shape> {
    public abstract double getArea();
    public abstract double getPerimeter();
    public int compareTo(Shape other) {
        return Double.compare(this.getArea(),other.getArea());
    }
    public int hashCode() {
        return Objects.hash(getArea(), getPerimeter());
    }
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Shape shape = (Shape) obj;
        return Double.compare(shape.getArea(), getArea()) == 0 &&
                Double.compare(shape.getPerimeter(), getPerimeter()) == 0;
    }
}
