//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char grade = 'B';
        switch (grade) {
            case 'A':
                System.out.println("Mukemmel:Gectiniz");
                break;
            case 'B':
                System.out.println("Cok iyi:Gectiniz");
                break;
            case 'C':
                System.out.println("Iyi:Gectiniz");
                break;
            case 'D':
                System.out.println("Fena Degil:Gectiniz");
                break;
            case 'F':
                System.out.println("Malesef gecemediniz");
                break;
            default:
                System.out.println("Girdiginiz derece dogru diyil");


        }


    }
}