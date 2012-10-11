package GUI;

public class Vote {
	private static String ballot = "0";

	public String VoteBallot() {
		if (getType() == "student") {
			ballot = "1";
		} else if (getType() == "techer") {
			ballot = "2";
		}
		
		return ballot;
	}

	/**
	 * get ballot.
	 * @return ballot score
	 */
	public static String getBallot() {
		return ballot;
	}
	
	/**
	 * check type of user (student, techer, EC or admin)
	 * @return type of user
	 */
	public String getType() {
		return "student";
	}

	/**
	 * check team in exceedvote.
	 * @return team name
	 */
	
}
