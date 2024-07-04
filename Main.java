package frc.robot;

import java.util.Scanner;

  public class Main {
      public static void main(String[] args) throws Exception {
          Scanner myScanner = new Scanner(System.in);
  
          System.out.println("What is your name?");
  
          String name = myScanner.nextLine();
  
          System.out.println("Hello, " + name + " are you ready to test your knowledge of AZTECH Robotics? (y/n)");
  
          if("y".equals(myScanner.nextLine())){
              System.out.println("Pick Your Section ");
              System.out.println("[1] Team History");
              System.out.println("[2] Competition History");
            
          switch(myScanner.nextInt()){
              case 1 -> teamHistory();
              case 2 -> compHistory();
              default -> System.out.println (name + ", now I don't believe that was an");
          }
          
              System.exit(0);
          }else{
              System.out.println("Bye");
              System.exit(0);
          }
             myScanner.close();
       
        }
        public static void teamHistory(){
          
            System.out.println("What year was the team founded (2017 or 2018)");
            Scanner myScanner = new Scanner(System.in);
            if("2017".equals(myScanner.nextLine())){
              System.out.println("Correct! Would you like to continue with the Team History Category? (y/n)");
              if("y".equals(myScanner.nextLine())){
                teamHistory2();
              }
              else{
                System.out.println("Would you like to move onto [1] Competition History or [2] Exit?");
                switch(myScanner.nextInt()){
                  case 1 -> compHistory();
                  case 2 -> exit();
                  
                }
              }
              myScanner.close();
            }
            else{
              System.out.println("Sorry, not quite! Would you like to continue with the Team History Category? (y/n)");
                if("y".equals(myScanner.nextLine())){
                  teamHistory2();
                }
                else{
                  System.out.println("Would you like to move onto [1] Competition Hisotyr or [2] Exit?");
                  switch(myScanner.nextInt()){
                    case 1 -> compHistory();
                    case 2 -> exit();
                }
              }
          }
        }
        public static void compHistory(){
          Scanner myScanner = new Scanner(System.in);
            System.out.println("Which of the following awards did AZTECH Rbotics recieve during the Crescendo Season? (Impact Award or Spirit Award or Wood Flowers Award)");
            if("Spirit Award".equals(myScanner.nextLine())){
              System.out.println("Correct! Would you like to continue with the Competition History Category? (y/n)");
              if("y".equals(myScanner.nextLine())){
                compHistory2();
              }
              else{
                System.out.println("Would you like to move onto [1] Team History or [2] Exit?");
                switch(myScanner.nextInt()){
                  case 1 -> teamHistory();
                  case 2 -> exit();
              }
            }
          }else{
            System.out.println("Sorry, not quite! Would you like to continue with the Competition History Category? (y/n)");
                if("y".equals(myScanner.nextLine())){
                  compHistory2();
                }
                else{
                  System.out.println("Would you like to move onto [1] Team History or [2] Exit?");
                  switch(myScanner.nextInt()){
                    case 1 -> teamHistory();
                    case 2 -> exit();
                }
              }
          }
        }

        public static void teamHistory2(){

        }
       
        
        public static void compHistory2(){

        }
         public static void exit(){
          System.exit (0);
        }
      }
  