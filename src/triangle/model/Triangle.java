package triangle.model;

public class Triangle extends Shape {
  private double side1;
  private double side2;
  private double side3;
  public static boolean isTriangle(double side1, double side2, double side3) {
    return (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1);
  }

  public Triangle() {
    super();
    this.side1 = 1.0;
    this.side2 = 1.0;
    this.side3 = 1.0;
  }

  public Triangle(double side1, double side2, double side3) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public Triangle(String color, boolean filled, double side1, double side2, double side3) {
    super(color, filled);
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public double getSide1() {
    return side1;
  }

  public void setSide1(double side1) {
    this.side1 = side1;
  }

  public double getSide2() {
    return side2;
  }

  public void setSide2(double side2) {
    this.side2 = side2;
  }

  public double getSide3() {
    return side3;
  }

  public void setSide3(double side3) {
    this.side3 = side3;
  }

  public double getPerimeter() {
    return this.side1 + this.side2 + this.side3;
  }
  public double getArea() {
    return Math.sqrt(getPerimeter()/2*(getPerimeter()/2-this.side1)*(getPerimeter()/2-this.side2)*(getPerimeter()/2-this.side3));
  }

  @Override
  public String toString() {
    return "A Triangle with color of "
      + getColor()
      + ", "
      + (isFilled() ? "filled" : "not filled")
      + ", Its Area equals: "
      + getArea()
      + " and Its Perimeter equals: "
      + getPerimeter();
  }
}
