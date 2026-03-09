/**
 * 
 * Rule 05. Object Orientation
 * 
 * OBJ08_J: Do not expose private members of an outer class from within a nested class.
 * 
 */

public class R05_OBJ08_J {

}

class Coordinates {
  private int x;
  private int y;

  public class Point {
    public void getPoint() {
      System.out.println("(" + x + "," + y + ")");
    }
  }
}

class AnotherClass {
  public static void main(String[] args) {
    Coordinates c = new Coordinates();
    Coordinates.Point p = c.new Point();
    p.getPoint();
  }
}