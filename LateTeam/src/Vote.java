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

	public String[] getTeam() {
		String listData[] = { "Team 1", "Team 2", "Team 3", "Team 4", "Team 5",
				"Team 6", "Team 7", "Team 8", "Team 9", "Team 10", "Team 11",
				"Team 12" };
		return listData;
	}
}
