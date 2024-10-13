//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num1 = 31;
        int num2 = 69;
        int num3 = 100;
        if (num1 > num2) {
            if (num1 > num3) {

                System.out.println("En buyuk Sayi:" + num1);
            } else if (num1 == num3) {
                System.out.println("En buyuk Sayi 2 tanedir:" + num3 + "ve" + num1);
            } else {
                System.out.println("En buyuk Sayi:" + num3);
            }
        } else if (num1 < num2) {
            if (num2 > num3) {

                System.out.println("En buyuk Sayi:" + num2);
            } else if (num2 == num3) {
                System.out.println("En buyuk Sayi 2 tanedir:" + num3 + "ve" + num2);
            } else {
                System.out.println("En buyuk Sayi:" + num3);
            }


        } else {
            if (num2 < num3) {
                System.out.println("En buyuk Sayi:" + num3);

            } else if (num2 == num3) {
                System.out.println("Tum sayilar esitdir");
            } else {
                System.out.println("En buyuk Sayi 2 tanedir:" + num1 + "ve" + num2);

            }


        }


    }
}