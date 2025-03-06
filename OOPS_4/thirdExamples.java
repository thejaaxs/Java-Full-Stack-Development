// Rectangle Example Using OOPS

class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void calculateArea() {
        System.out.println("Area : " + length * width);
    }
}

public class thirdExamples {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(10, 20);
        rect.calculateArea();
        rect.setLength(5);
        rect.setWidth(10);
        rect.calculateArea();
    }
}
