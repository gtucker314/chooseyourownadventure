import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Name your knight...");

        String name = myScanner.nextLine();

        System.out.println("Hello, " + name + " are you ready to storm a castle? (y/n)");

        if("y".equals(myScanner.nextLine())){
            System.out.println("Good! Now, do you begin your adventure by... ");
            System.out.println("[1] approaching the drawbridge?");
            System.out.println("[2] swimming the moat?");
            System.out.println("[3] scaling the tower?");
            System.out.println("[4] riding a dragon over the wall?");

            switch(myScanner.nextInt()){
                case 1 -> System.out.println(name + " knew it couldn't be this easy as they approached the castle wall... \nbut it was! Congratulations you're in!");
                case 2 -> System.out.println(name + " didn't know what was at the gate but they didn't want to check so in the mote they went... \nbut a secret entrance they did not find in the jaws of the alligator they ran into! Congratulations you're dinner!");
                case 3 -> System.out.println(name + " didn't like the gate or the mote so without a rope they scaled the tower... \nbut even with a titans grip they did slip and plumet 1000 feet below! Congratulations you're a metal pancake!");
                case 4 -> System.out.println(name + " wouldn't risk the gate or mote or tower so they went off to find a dragon to fly them over... \nbut dragons aren't as friendly as they look and cooked you for the opportunity you mistook! Congratulations you've invented cremation!");
                default -> System.out.println(name + "'s indecision consumed them and they died of being bad at numbers...");
            }
            System.exit(0);
        }else{
            System.out.println("Then be gone!");
            System.exit(0);
        }
    }
        
    }