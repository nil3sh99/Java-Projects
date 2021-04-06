import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Tictactoe game = new Tictactoe();
		game.initializeBoard();
		String player = "X";
		do{
			System.out.println(game.printBoard());
			System.out.println("Enter coordinates for rows: ");
			int row = input.nextInt();
			System.out.println("Enter coordinates for columns: ");
			int col = input.nextInt();			
			game.setPlay(row, col, player);
			
			if(game.isGameOver()) {
				System.out.println(game.printBoard() + "\n" + player + " wins!");
				break;
			}
			
			if(player == "X")
				player = "O";
			else
				player = "X";
		}while(true);
	}

}
