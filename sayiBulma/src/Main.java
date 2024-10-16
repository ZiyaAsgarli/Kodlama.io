public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 3, 4, 5};
        int aranacakSayi = 5;
        for (int i = 0; i < sayilar.length; i++) {
            if (sayilar[i] == aranacakSayi) {
                System.out.println("Aranan sayi:" + aranacakSayi + " Dizideki sayi:" + sayilar[i]);
                break;
            } 

        }


    }
}