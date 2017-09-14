
public class Driver {

	public static void main(String[] args) throws TennisGameException {
		// TODO Auto-generated method stub
		TennisGame game = new TennisGame();
		
		int who = 1;
		
		while(1==1) 
		{
			
			int temp = (Math.random() <= 0.5)? 1: 2;
			if (temp == 1)
			{
				game.player1Scored();
				System.out.println("player 1 scores");
			}
				
			else
			{
				game.player2Scored();
				System.out.println("player 2 scores");
			}
			
			System.out.println(game.getScore());
			if(game.getScore().contains("game"))
				break;
		}
	
		
	}

}
