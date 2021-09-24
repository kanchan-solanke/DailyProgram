public class FactNumWithoutRecursion {
    public static void main(String args[]) {
        int i, fact = 1;
        int number = 5;
        for (i = 1; i <= number; i++) {
            fact = fact * i;
        }
        System.out.println(number + "factorial is: " + fact);
}}

/* take a number 5
use for loop
i=1 i<= 5 then i becomes 2
i=2 i<4 then i becomes 3
i=3 i<3 then i becomes 2
i=2 i<2 then i becomes 1
i=1 i<1 i becomes 0
by formula

fact = fact * i
5! = 5*4*3*2*1 = 120

print it
 */