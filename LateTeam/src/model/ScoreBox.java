
import org.apache.log4j.Logger;

public class ScoreBox {
	
	/** team of ExceedVote*/
	private static int[] team = new int[12];
	
	/** get class vote */
	private Vote v = new Vote();
	
	/** get result use static */
	private static Result result = new Result();
	
	/**
	 * add score of ExceedVote team
	 * @param select
	 */
	public void addScore(int select) {
		team[select]++;
		Logger logger = Logger.getLogger(this.getClass());
				logger.info(v.getType()+" vote for "+ "Team " + (select + 1));
				
		result.ShowResult();
	}
	
	/**
	 * get score of team.
	 * @return score of ExceedVote team
	 */
	public int[] getScore()
	{
		return team;
	}
}
