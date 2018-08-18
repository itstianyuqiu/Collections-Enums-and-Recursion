package ictgradschool.industry.lab_recursion.ex03;

public class ExerciseThree {
//    1. 24
    private int foo(int x) {
        if (x <= 1) {
            return 1;
        }
        return x * foo(x - 1);
    }
//    2.a) 8.0, b) 0.11111
    private double bar(double x, int n) {
        if (n > 1)
            return x * bar(x, n - 1);
        else if (n < 0)
            return 1.0 / bar(x, -n);
        else
            return x;
    }
//    3. infinite
    private void bad1() {
        System.out.println("This is very good code.");
        bad1();
    }
//    4. if n is negative number
    private int bad2(int n) {
        if (n == 0) {
            return 0;
        }
        return n + bad2(n - 2);
    }
//    5.a) n>0, b) n<=0
    private int bad3(int n) {
        if (n == 0) {
            return 0;
        }
        return n + bad3(n + 1);
    }
    public static void main(String[] args) {
        ExerciseThree e=new ExerciseThree();
        System.out.println(e.foo(4));
        System.out.println(e.bar(2,3));
        System.out.println(e.bar(3,-2));
    }
}
