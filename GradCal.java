import java.util.Scanner;

public class GradCal {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();

        if (grade >= 80 && grade <= 100)
            System.out.println("A+");
        else if (grade >= 75)
            System.out.println("A");
        else if (grade >= 70)
            System.out.println("A-");
        else if (grade >= 65)
            System.out.println("B+");
        else if (grade >= 60)
            System.out.println("B");
        else if (grade >= 55)
            System.out.println("B-");
        else if (grade >= 50)
            System.out.println("C+");
        else if (grade >= 45)
            System.out.println("C");
        else if (grade >= 40)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
