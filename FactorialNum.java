import java.util.Scanner;
public class FactorialNum {
    static int factorial(int n){
        if(n == 0)                 //If the entered number is 0 or 1, then return 1.
            return 1;
        else
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println("Factorial of " + num
                + " is " + factorial(num));
    }
}

/* recursion
factorial method use
base case if value n=1 or n=0 it returns 1

suppose take a num 3
n * factorial(n-1)
3*2*1 =6
again num =3
then 3-1=2             // n-1
=> 3*2 =6              // n * 2
=> 2-1= 1 * 6 = 6
otherwise, we have to do factors of num
by using formula

n! = n* (n-1) * ----* 1
 */