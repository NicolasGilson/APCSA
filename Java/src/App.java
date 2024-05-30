import java.util.Scanner;

import apple.MayWeekOne.TTT;


public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scann = new Scanner(System.in);
        System.out.print("What is the first player's name: ");
        String p1 = scann.nextLine();
        System.out.print("What is the second player's name: ");
        String p2 = scann.nextLine();
        TTT gameOne = new TTT(p1,p2);
        System.out.println("This is a 3x3 board, you may place your move in any coordinate ranging 0, 1, and 2.");
        while(gameOne.check() != true)
        {
            System.out.print("What row would you like to place it in (0, 1, 2): ");
            int row = scann.nextInt();
            System.out.print("What column would you like to place it in (0, 1, 2): ");
            int column = scann.nextInt();
            gameOne.UserTurn(row, column);
        }
        scann.close();
    }
}