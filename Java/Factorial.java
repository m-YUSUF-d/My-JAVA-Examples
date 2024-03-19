import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) 
    {
        Fak();
    }

    public static void Fak() {
        Scanner value = new Scanner(System.in);
        System.out.println("Enter a number : ");

        int num = value.nextInt();
        int result = 1;

        for(int i = num ; i > 0; i--) {
            result *= i;
        }
        value.close();
        System.out.println(result);
    }
}