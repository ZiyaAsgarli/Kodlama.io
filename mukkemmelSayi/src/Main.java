public class Main {
    public static void main(String[] args) {
        int number = 28;
        int sum = 0;
        for (int i = 1; i < number; i++) {
    if (number%i==0){
        sum=sum+i;
    }
            System.out.println(sum);

        }
        if (number==sum){

            System.out.println("This number mukemmeldir");

        }else {
            System.out.println("This number mukemmel deyildir");
        }


    }
}