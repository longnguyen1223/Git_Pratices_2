package Syed_2;

public class InterviewQuestion {
    public static void main(String[] args) {
        String names = "Syed, Paha, Long, Ivana, Nick, Vitalli";

        String reverse = new StringBuilder(names).reverse().toString();

        System.out.print(reverse);

        System.out.print("-----------");
        System.out.print(names);
    }
}