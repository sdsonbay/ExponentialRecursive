import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number = scanner.nextInt();
        System.out.println("Enter power: ");
        int power = scanner.nextInt();

        System.out.println("Result: " + exponential(number, power));
    }

    public static int exponential(int number, int power){
        if(power == 0){
            return 1;
        }else if(power == 1) {
            return number;
        }else{
            power--;
            return number *= exponential(number, power);
        }
    }
}
