Excercise 1:
public class mypractice {
    public static void main(String[]args)
    {
        int a = 10,b = 0, c;
        try
        {
            c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Denominator should not be 0, pls try again");
        }
        System.out.println("bye");
    }
}

Excercise 2 : class exception
 string getMessage()
System.out.println(e.getMessage());

string toString()
System.out.println(e);

void printStackTrace()
e.printStackTrace();