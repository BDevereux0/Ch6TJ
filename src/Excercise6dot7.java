public class Excercise6dot7 {
   /* Write a recursive method named oddSum that takes a positive
    odd integer n and returns the sum of odd integers from 1 to n. Start with
    a base case, and use temporary variables to debug your solution. You might
    find it helpful to print the value of n each time oddSum is invoked.

    */

    public static int oddSum(int x){
        if (x ==1 ) {
            return 1;
        }else {
            int recurse = oddSum(x - 2);
            int result = x + recurse;
            System.out.println("x "+x);
            System.out.println("recurse "+recurse);
            System.out.println("result "+result);
            return result;
        }
    }

    public static void main(String[] args) {
        System.out.println(oddSum(5));
    }
}
