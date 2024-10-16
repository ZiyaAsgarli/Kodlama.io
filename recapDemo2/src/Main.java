public class Main {
    public static void main(String[] args) {
        double[] myList = {1.2, 3.4, 5.6, 3.5};
        int a = 0;
        double max = myList[0];
        double total = 0;
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            a++;
            System.out.println("Sayi " + a + " :" + number);


        }
        System.out.println("Sayilarin toplami:" + total);
        System.out.println("En buyuk sayi:" + max);

    }
}