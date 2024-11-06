public class Main {
  
  public static void main(String[] args) {

    int x = 1, y =2, z = 3;
    double m = 1.0, n = 3.2;
    String e = "Hello";
    String f = "World";
    //int a = x+y;
    int a = addition(x,y,z);
    double b = addition(m,n);
    
    System.out.println(addition (e,f));
    System.out.println("a is " + a);
    System.out.println("b is " + b);
    
  }

  public static String addition (String a, String b) {
    return a + " " + b;
  }

  public static double addition (double a, double b) {

    return a + b;
    
  }

  public static int addition (int a, int b, int c) {

    return a + b + c;
    
  }
  
}