import java.util.Scanner;
public class MyProject {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //IF PROJECT IDENTITY


        int age;
        String name;
        Boolean isStudent;


        System.out.print("Enter your name");
        name = scanner.nextLine();
        System.out.print("Enter your age!: ");
        age = scanner.nextInt();
        System.out.print("Are you a student? (true/false)");
        isStudent = scanner.nextBoolean();


        //GROUP 1 NAME

        if(name.isEmpty()){
            System.out.println("YOU DID NOT ENTER YOUR NAME ");
        }

        else{
            System.out.println("HELLO " + name + "!");
        }
            //GROUP 2 AGE
            if (age >= 65) {
                System.out.println("YOU ARE A SENIOR ");
            } else if (age >= 18) {
                System.out.println("You are an adult ");
            } else if (age < 0) {
                System.out.println("You haven't been born yet nigga");
            } else if (age == 0) {
                System.out.println("YOU ARE A BABY ");
            } else {
                System.out.println("you are a kid");




                //GROUP 3 FOR BOOLEAN STUDENT
                if(isStudent){
                    System.out.println("YOU ARE A STUDENT");
                }
                else
                    System.out.println("YOU ARE NOT A STUDENT HERE GET THE FUCK OUT");




                scanner.close();

            }
        }


    }

