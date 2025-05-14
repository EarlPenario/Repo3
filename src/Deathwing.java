import java.sql.SQLOutput;
import java.util.Scanner;

public class Deathwing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter age of the person: ");
        int x = input.nextInt();

        for (int i = 0 ; i < x ; i++){
            System.out.println("You are " + x + " years old.");
        }

    }
}
