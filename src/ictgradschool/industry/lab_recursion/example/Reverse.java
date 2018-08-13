package ictgradschool.industry.lab_recursion.example;

public class Reverse {
    public String reverse(String s) {
        if (s.length() == 0) {
            return "";
        }
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public String reverse1(String s) {
        if (s.length() == 0) {
            return "";
        }
        return s.substring(s.length() - 1) + reverse1(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        Reverse r = new Reverse();
        System.out.println(r.reverse("ab"));
        System.out.println(r.reverse1("ab"));
    }
}
