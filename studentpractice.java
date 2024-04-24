Inheritance
 for example:
Class Circle
        {
private double radius;
public Circle()
        radius=0.0;
public double area(){}
public double perimeter(){}
        }
 class Cylinder extends Circle
 private double height;
 public Cylinder()
     height=0.0;
 public double volume(){}

        class Test
        public static void main(){
     circle c1 = new Circle();
     cylinder c2 = new Cylinder();
        }

  Innerclass:
class Outer
{
    int x = 10;
    class Inner
    {
        int y = 20;
        void innerDisplay()
        {
            System.out.println(x);
            System.out.println(y);
        }
    }
    void outer Display()
{
    Inner i = new Inner();
    i.innerDisplay();
    System.out.println(i.y);
}
}

Static Nested class:

class Test
{
    static int x =10;
    int y = 20;

    void show()
    {
        System.out.println(x + ""+y);  (allowed)
    }
    static void display()
    {
        System.out.println(x + ""+y)  (not allowed)because y is a non-static method
            or
            s.o.p(x);   (allowed)
    }
}

Static Block
        public class StaticPractice
        {
            static
            {
                System.out.println("Block 1");
            }
            public static void main (String[]args);
            {
                System.out.println("Main");
            }
            static
            {
                System.out.println("Block 2");
            }
        }
        output:
      Block 1
      Block 2
      Main