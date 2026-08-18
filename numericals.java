package varalakshmi.gc;
public class numericals{
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int sum = a + b;   
        int sub = a-b;
        int mult=a*b;
        int div=a/b;

        System.out.println("Sum: " + sum);
        System.out.println("sub: " + sub);
        System.out.println("mult: " + mult);
        System.out.println("div: " + div);
    }

double radius = 5.0;
double areaCircle = 3.14 * radius * radius;
System.out.println("Area of Circle: " + areaCircle);

// ---------- Area of Triangle ----------
double base = 6.0;
double height = 4.0;
double areaTriangle = 0.5 * base * height;
System.out.println("Area of Triangle: " + areaTriangle);

// ---------- Fibonacci Series ----------
int n = 10; // number of terms
int first = 0, second = 1;
System.out.print("Fibonacci Series: ");
for(int i = 1; i <= n; i++) {
    System.out.print(first + " ");
    int next = first + second;
    first = second;
    second = next;
}
System.out.println();

// --------- Factorial ----------

int num = 5;
long factorial = 1;
for (int i = 1; i <= num; i++)
{
    factorial *= i;
}
System.out.println("Factorial of " + num + " is: " + factorial);
}
}
