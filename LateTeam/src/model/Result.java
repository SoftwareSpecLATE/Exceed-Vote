
import org.apache.log4j.Logger;

public class Result {
	
	/** get ScoreBox class */
	private static ScoreBox score = new ScoreBox();

	/** show all team score result*/
	public void ShowResult() {
		
		int[] team = score.getScore();
		for (int i = 0; i < 12; i++) {
			System.out.println("Team " + (i + 1) + " : " + team[i]);
			
			Logger logger = Logger.getLogger(this.getClass());
				logger.info("Team " + (i + 1) + " : " + team[i]);
		}
	}
}
