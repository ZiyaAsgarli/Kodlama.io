import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[3][3];
        Scanner sc = new Scanner(System.in);
        int a = 0;
        for (int i = 0; i < sehirler.length; i++) {
            for (int j = 0; j < 3; j++) {
                a++;
                System.out.println("Sehir " + a + "-ni" + " giriniz:");

                sehirler[i][j] = sc.nextLine();

            }
        }
        for (int i = 0; i < sehirler.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Sehirlerin isimleri:" + sehirler[i][j]);

            }
        }


    }
}