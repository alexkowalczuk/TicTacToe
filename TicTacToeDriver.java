/** 
Alex Kowalczuk
Project 2: TicTacToe Driver
CS112 - USFCA
*/

import java.util.Scanner;

public class TicTacToeDriver {

    public static void main(String[] args) {
        char player = 'o';
        int row, col;
        Scanner scan = new Scanner(System.in);
        TicTacToe g = new TicTacToe();
        g.initializeGame();

        while (true) //while loop to do not break game without results, 
        {
            player = g.changePlayer(player);
            System.out.print("Player ~~" + player + "~~ Your turn. Please choose where do you want to put your x or o\n");

            System.out.print("Row: "); // taking input row
            row = scan.nextInt();
            System.out.print("Column: "); // taking input column
            col = scan.nextInt();

            while (g.checkIfLegal(row, col))
            {
                System.out.println("This slot is invalid. Please try again");
                g.displayBoard(); //Display board again

                System.out.print("Row: ");
                row = scan.nextInt(); //taking input if invalid

                System.out.print("Column: ");
                col = scan.nextInt(); // take input if invalid
            }

            g.changeBoard(player, row, col); //changing board, add sumbols etc.
            g.displayBoard();

            if (g.WinnerCheck())
            {
                System.out.println("\nThe winner is: " + player + " CONGRATULATION!"); //printing winner
                break;

            }
            if (g.TieCheck())
            {
                System.out.println("\nTIE!"); //printing tie
                break;
            }
        }


    }

}