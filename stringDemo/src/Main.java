import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String mesaj="Baki cox gozeldir";
        String yeniMesaj=mesaj.replace(' ','-');
        System.out.println(yeniMesaj);
        System.out.println(mesaj.substring(2,4));
        for (String kelime:mesaj.split(" ")){
            System.out.println(kelime);
            System.out.println(mesaj.toLowerCase());
            System.out.println(mesaj.toUpperCase());

        }
    }
}