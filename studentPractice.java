Exercise 1:
  Find if a person is young or not
public class Age
{
    public static void main(String []args)
    {
        int age;
        Scannersc= new Scanner(System.in);
        System.out.println("enter your age please");
        age = sc.nextInt();

        if (age>= 14 && age <=55);
        {
            System.out.println("you are young");
        }
        else
        {
            System.out.println("you are not young");
        }
    }
}

Exercise 2:
while and do-while loop

While loop
  int i=1;
while (i < 100)
    System.out.println(i);
    i = i * 2;

    do loop
  int i = 1;
    do
        System.out.println(i);
    i = i * 2;
    while(i 100);

    Exercise 3;
            Method overloading
int declaration:
  static int max(int x,int y)
     return x>y? x:y;
            Public static void main(String[]args)
              System.out.println(max(10,5));

            output:10
float declaration:
static float max(float x,float y)
  if (x>y)
      return x;
  else
      return y;
  public static void public static void main(String[]args){
        System.out.println(max(10.5f,5.4f));
        }

        output:10.5