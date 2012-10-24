

public class Vote {
	/** Set ballot score */
	private static String ballot = "0";
	
	/**
	 * get ballot for type of user
	 * @return ballot point
	 */
	public String VoteBallot() 
	{	
		if (getType().toLowerCase() == "student") {
			ballot = "1";
		} else if (getType().toLowerCase() == "teacher") {
			ballot = "2";
		}	
		return ballot;
	}

	/**
	 * get scroe ballot.
	 * @return ballot score
	 */
	public static String getBallot() {
		return ballot;
	}
	
	/**
	 * check type of user (student, teacher, EC or admin)
	 * @return type of user
	 */
	public String getType() {
		return "student";
	}
}
