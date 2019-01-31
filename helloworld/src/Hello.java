/**
 * Created by ghost on 23 Nov 18
 */
public class Hello {

    public static void main(String[] args) {

        System.out.println("Hello, World!");

        int myFirstNumber = 15 + (2*10);
        int mySecondNumber = 12;
        int myThirdNumebr = 6;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumebr;

        System.out.println(myTotal);

        double a = 0.0;
        System.out.println("double : " + String.format("%.2f", a));

        boolean check = String.format("%.3f", 3.1756).equals(String.format("%.3f", 3.175));
        double num = Double.parseDouble(String.format("%.3f", 3.1756));

        System.out.println(check + " " + num);

    }
}
