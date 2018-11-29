/** 
Alex Kowalczuk
Project 2: TicTacToe Game
CS112 - USFCA
*/

public class TicTacToe
{

    char[][] table = new char[3][3]; // Creates chart 3 by 3. (0,1,2) <- Column and row
    public void initializeGame() 
    {
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
            {
                table[i][j] = ' '; //empty spoots
            }
        }
    }

    public void displayBoard() 
    {
        System.out.println(" " + table[0][0] + "|" + table[0][1] + "|" + table[0][2]); //printing almost perfect board.
        System.out.println("-------");
        System.out.println(" " + table[1][0] + "|" + table[1][1] + "|" + table[1][2]);
        System.out.println("-------");
        System.out.println(" " + table[2][0] + "|" + table[2][1] + "|" + table[2][2]);
    }



    public boolean checkIfLegal(int row, int column) //checking if our input is valid.
    {
        if ((row > 2 || column > 2) || (row < 0 || column < 0))
        {
            return true;
        }

        else if (table[row][column] == 'x' || table[row][column] == 'o')
        {
            return true;
        }

        return false;
    }


    public void changeBoard(char player, int row, int column) //update our board
    {
        table[row][column] = player;
    }

    public char changePlayer(char player) //player changer
    {
        char newTurn = 'e';
        if (player == 'o')
        {
            newTurn = 'x';
        }

        if (player == 'x')
        {
            newTurn = 'o';
        }

        return newTurn;
    }


    public boolean WinnerCheck() //checking who is winner. If three the same symbols are in the same lineup then is win.
    {
        if (table[0][0] == table[1][0] && table[1][0] == table[2][0] && (table[0][0] == 'x' || table[0][0] == 'o'))
        {
            return true;
        }

        else if (table[0][1] == table[1][1] && table[1][1] == table[2][1] && (table[0][1] == 'x' || table[0][1] == 'o'))
        {
            return true;
        }

        else if (table[0][2] == table[1][2] && table[1][2] == table[2][2] && (table[0][2] == 'x' || table[0][2] == 'o'))
        {
            return true;
        }

        else if (table[0][0] == table[0][1] && table[0][1] == table[0][2] && (table[0][0] == 'x' || table[0][0] == 'o'))
        {
            return true;
        }

        else if (table[1][0] == table[1][1] && table[1][1] == table[1][2] && (table[1][0] == 'x' || table[1][0] == 'o'))
        {
            return true;
        }

        else if (table[2][0] == table[2][1] && table[2][1] == table[2][2] && (table[2][0] == 'x' || table[2][0] == 'o'))
        {
            return true;
        }

        else if (table[0][0] == table[1][1] && table[1][1] == table[2][2] && (table[0][0] == 'x' || table[0][0] == 'o'))
        {
            return true;
        }

        else if (table[2][0] == table[1][1] && table[1][1] == table[0][2] && (table[2][0] == 'x' || table[2][0] == 'o'))
        {
            return true;
        }

        else 
        {
            return false;
        }
    }


    public boolean TieCheck() //checking if is tie. if noone won. 
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (table[i][j] == ' ')
                {
                    return false;
                }
            }
        }

        return true;
    }


}