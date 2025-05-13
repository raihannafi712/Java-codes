package lab7.task3;

public class Circle {
    public int circleRadiusMain;

    public void area() {
    
      double area = Math.PI * circleRadiusMain * circleRadiusMain;
      System.out.printf("Area of %s %s: %.2f\n", color, name, area);
    }
}
