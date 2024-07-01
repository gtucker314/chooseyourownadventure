import java.util.Scanner;
public class App {
    public static void main(String[]args)
    throws Exception {
        Scanner myScanner = new
        Scanner(System.in);
        System.out.println("What is your name?");
        String name =myScanner.nextLine();
        System.out.println("Hello," +name+ " are you ready to test your AZTECH Robotics knowledge? (y/n)");

        if("y".equals(myScanner.nextLine())){
            System.out.println("Good! Which category will you select...");
            System.out.println("[1] Competition History");
            System.out.println("[2] Team Information");
            System.out.println("[3] Outreach and Other Events");

            switch(myScanner.nextInt()){
                case 1 ->System.out.println( name+", what competition did AZTECH robotics take 2nd at in 2024? ([1] Aerospace Valley or [2] AZ East)");
            
                case 2 ->System.out.println( name+ ", what year was the team founded?");
   
                case 3 ->System.out.println(name+ ", which of the following is the name of an oureach event we hosted during the 2023-24 robotics season?");
           
            default -> System.out.println("fail");
    
        }
        System.exit(0);
    }else{
        System.out.println("bye");
        System.exit(0);
    }
        }
        
    }
