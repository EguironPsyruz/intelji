import java.util.Scanner;
public class STUDENT {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your name?");
        String name = scanner.nextLine();
        System.out.print("What's your age?");
        int age = scanner.nextInt();
        System.out.print("What's your gpa");
        double gpa = scanner.nextDouble();
        System.out.print("Are you a student?  (True/False)");
        boolean isStudent = scanner.nextBoolean();


        if (isStudent)
            System.out.print("YOU ARE ENROLLED ");
        else
            System.out.print("YOU ARE NOT ENROLLED");

        System.out.println("Hello " + name);
        System.out.println("Your age is: " + age + " Years Old");
        System.out.println("Your GPA is: " + gpa);
        System.out.println("Student " + isStudent);


        scanner.close();


    }

}

