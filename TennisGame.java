
public class TennisGame {
	
	int score1, score2, advantages;
	
	public TennisGame() {
		score1 = 0;
		score2 = 0;
		advantages = 0;
	}


	public void player1Scored() throws TennisGameException {
		
		score1 = score1+15;
		if (score1 == 45)
			score1 = 40;
	}

	public void player2Scored() throws TennisGameException {
		
		score2 = score2+15;
		if (score2 == 45)
			score2 = 40;
	}

	public String getScore() {
		
		String str = "";
		
		str = score1 + " - " + score2;
		
		if (score1 == score2)
		{
			str = "deuce";
			
			if(score1 == 40)
				advantages = 1;
		}
		
		if (advantages == 0 && score1 == 55)
		{
			str = "game player1";
		}
		if (advantages == 0 && score2 == 55)
		{
			str = "game player2";
		}
		
		if (advantages == 1)
		{
			int dif = score1 - score2;
			
			switch(dif){
			case 0:
				str = "deuce";
				break;
			case 15:
				str = "advantage player1";
				break;
			case 30:
				str = "game player1";
				break;
			case -15:
				str = "advantage player2";
				break;
			case -30:
				str = "game player2";
				break;			
			}
		}
		
		
		// Here is the format of the scores: "player1Score - player2Score"
		// "0 - 0"
		// "15 - 15"
		// "30 - 30"
		// "deuce"
		// "15 - 0", "0 - 15"
		// "30 - 0", "0 - 30"
		// "40 - 0", "0 - 40"
		// "30 - 15", "15 - 30"
		// "40 - 15", "15 - 40"
		// "advantage player1"
		// "advantage player2"
		// "game player1"
		// "game player2" 

		// TO BE IMPLEMENTED
		return str;
	}
}
