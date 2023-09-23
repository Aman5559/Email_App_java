package project;

import java.util.Scanner;

public class Email {
    private String FirstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
   private int mailboxCapacity = 500;
   private int defaultPasswordLength = 10;
    private String alternateEmail;
    private String companySuffix = "aeycomapny.com" ;


    //constructer for the first name and last name 
    public Email(String FirstName , String lastName){
    //    FirstName = sc.nextLine();
    //    lastName = sc.nextLine();
        this.FirstName = FirstName;
        this.lastName = lastName;
       // System.out.println("EMAIL CREATED: " + this.FirstName +" "+ this.lastName);

        // call a method asking for the department , return the department 
        this.department = setDepartment();
        //System.out.println("Department: " + this.department);
        
        // Call a method that returns the random password 
        this.password =randomPassword(defaultPasswordLength);
        System.out.println("Your password is : " + this.password);

        // combine elements to generate email
        email = FirstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix ; 
       // System.out.println("Your email is : " + email);
    }
    private String setDepartment(){
        System.out.print("New Worker: "+ FirstName+". Department Codes:\n1 for Sales\n2 for Developmwnt\n3 fOr Accounting\n0 for none\n Enter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice =in.nextInt();
        if(depChoice == 1) {return "sales" ;}
        else if(depChoice == 2) {return "dev";}
        else if(depChoice == 3) {return "acct";}
        else {return ""; }

    }
    private String randomPassword(int length){
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for(int i =0;i<length;i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);



        }
        return new String(password);

    }  

    // Ask for the department

    //Generate a random  password

    // Set the mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;

    }

    // Set the alternate email
    public void setAlternateEmail(String altEmail){
        this.alternateEmail = altEmail;


    }
    // Change the passwords
    public void changePassword(String password){
        this.password = password;

    } 
    public int getMailboxCapacity() {return mailboxCapacity;}
    public String getAlternateEmail() {return alternateEmail;} 
    public String getPassword(){return password; }

    public String showInfo(){
        return "DISPLAY NAME : " + FirstName + " " + lastName +
                "\nCOMAPNY EMAIL: " + email +
                "\nMAILBOX CAPACITY : " + mailboxCapacity +  "mb" ;
                                
    }

    
}
