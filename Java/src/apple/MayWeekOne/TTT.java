package apple.MayWeekOne;
//tic tac toe
public class TTT 
{
    public String p1;
    public String p2;
    char[][] board = new char[3][3];
    public int turn = 1;
    
//run the parameters 
    public TTT(String p1, String p2)
    {
        this.p1 = p1;
        this.p2 = p2;
        for(int i=0; i< 3; i++)
        {
            for(int j=0; j<3; j++)
            {
                board[i][j] = '-';
            }
        }
        for(int p = 0; p < 3; p++)
        {
            for(int q = 0; q < 3; q++)
            {
                System.out.print(board[p][q]);
            }
            System.out.println();
        }
    }
    public void UserTurn(int row1, int column1)
    {
        if(board[row1][column1] == (char)(88)||board[row1][column1] == (char)(79))
        {
            System.out.println("That turn is not valid");
        }
        else
        {
            board[row1][column1] = (char)((int)((turn*4.5)+83.5));
            turn*=-1;
            for(int p = 0; p < 3; p++)
            {
                for(int q = 0; q < 3; q++)
                {
                    System.out.print(board[p][q]);
                }
                System.out.println();
            }
        }
    }
    public boolean check()
    {
        String w = p2;
        if(turn == -1)
        {
            w=p1;
        }
        for(int i = 0; i <board.length;i++)
        {
            if(board[i][0]==board[i][1]&&board[i][0]==board[i][2]&&board[i][0]!='-')
            {
                System.out.println(w+" Wins!");
                return true;
            }
            if(board[0][i]==board[1][i]&&board[0][i]==board[2][i]&&board[0][i]!='-')
            {
                System.out.println(w+" Wins!");
                return true;
            }
        }
        if(board[0][2] == board[1][1] && board[0][2] == board[2][0]&&board[0][2]!='-')
        {
            System.out.println(w+" Wins!");
            return true;
        }
        if(board[0][0] == board[1][1] && board[0][2] == board[2][2]&&board[0][0]!='-')
        {
            System.out.println(w+" Wins!");
            return true;
        }
        return false;
    }
}

