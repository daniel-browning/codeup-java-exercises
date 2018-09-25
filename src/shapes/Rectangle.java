package shapes;

public class Rectangle {

    protected int width;

    protected int length;

    public Rectangle(int width, int length) {
        super();
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getArea() {
        return this.length * this.width;
    }

    public int getPerimeter() {
        return (this.length + this.width) * 2;
    }

}
