package triangle.test;

import triangle.model.Shape;
import triangle.model.Triangle;

import java.util.Scanner;

public class TriangleTest {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Mời nhập độ dài 3 cạnh:");
    System.out.print("side1 = ");
    double side1 = scanner.nextDouble();
    System.out.print("side2 = ");
    double side2 = scanner.nextDouble();
    System.out.print("side3 = ");
    double side3 = scanner.nextDouble();

    while (!Triangle.isTriangle(side1, side2, side3)) {
      System.out.println("Độ dài 3 cạnh bạn nhập không hợp lệ! Mời bạn nhập lại:");
      System.out.print("side1 = ");
      side1 = scanner.nextDouble();
      System.out.print("side2 = ");
      side2 = scanner.nextDouble();
      System.out.print("side3 = ");
      side3 = scanner.nextDouble();
    }

    Shape triangle1 = new Triangle(side1, side2, side3);
    Shape triangle2 = new Triangle("red", false, side1, side2, side3);
    System.out.println(triangle1);
    System.out.println(triangle2);
  }
}
