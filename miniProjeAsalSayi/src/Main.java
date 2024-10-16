public class Main {
    public static void main(String[] args) {
        int number = 19;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            int remiander = number % i;
            if (remiander != 0) {
                isPrime = true;
            } else if (remiander == 0) {
                isPrime = false;
                break;

            }


        }
        if (isPrime == false) {
            System.out.println("This number is not Prime");
        } else {
            System.out.println("This number is Prime");
        }


    }

}
