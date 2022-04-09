
package com.company;

        import java.util.Scanner;
        import java.util.Random;

public class RockPaperScissors {   //creating a class
    public static void main(String[] args) {

        Random rand=new Random(3);
        System.out.println("Welcome to Rock, Paper and Scissors");
        //For user input
        Scanner in=new Scanner(System.in);
        System.out.print("Enter your move in terms of R]ock, P]aper, S]cissor :-");

        String userChoice="";
        String computerChoice="";

        userChoice=in.nextLine();        //storing user input data

        // here we are storing the random number in the variable called num and then allocating the 3 random generated numbers a particular value among R,P and S
       int num = rand.nextInt();

        if (num == 0);
        {
        computerChoice="R";
        }
         if (num == 1);
        {
        computerChoice="P";
        }
         if (num == 2);
        {
        computerChoice="S";
        }

        //now to print what the computer chooses randomly

        if (computerChoice.equals("R")){
            System.out.println("The computer choose Rock");
        }
           else if(computerChoice.equals("P")){
                System.out.println("The computer choose Paper");
        }
               else if(computerChoice.equals("S")){
                      System.out.println("The computer choose Scissors");
            }
            // Now to determine the winner by comparing both the choices of computer and user and printing the result

            if (userChoice.equals("R") && computerChoice.equals("S")) {
            System.out.println("The user won");
        }
            else if (userChoice.equals("S") && computerChoice.equals("P")) {
                System.out.println("The user won");
        }
           else if (userChoice.equals("P") && computerChoice.equals("R")) {
                System.out.println("The user won");
        }
           else if (userChoice.equals("S") && computerChoice.equals("R")) {
            System.out.println("The Computer won");
        }
           else  if (userChoice.equals("P") && computerChoice.equals("S")) {
                System.out.println("The Computer won");
        }
           else  if (userChoice.equals("R") && computerChoice.equals("P")) {
                System.out.println("The Computer won");
            }
            else if (userChoice.equals(computerChoice)){                          // all the three tied conditions can be made just by equalizing the user input and computer input rather than looping it thrice
                System.out.println("Its a Tie!");
        }
            else {
                System.out.println("But Please Enter valid Input");
            }
    }}