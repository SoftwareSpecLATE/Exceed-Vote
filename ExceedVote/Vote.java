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

	public static String getBallot() {
		return ballot;
	}
	
	public String getType() {
		return "student";
	}
}
