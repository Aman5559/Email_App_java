package project;
import java.util.Scanner;


public class EmailApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first name and last name of  the employee");
        String Firstname = sc.nextLine();
        String lastName = sc.nextLine();


        Email em1 = new Email(Firstname, lastName);

       System.out.println( em1.showInfo());

        
    }
    
}
