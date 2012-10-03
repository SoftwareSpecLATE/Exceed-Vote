public class Main {
	
	private static Vote v = new Vote();
	private static String ballot = "0";
	
	public static void main(String[] args) {
		String type = v.getType();
		if (type == "student") {
			ballot = "1";
		} else if (type == "techer") {
			ballot = "2";
		}
		UI.createAndShowGUI();
	}

	public static String getBallot() {
		return ballot;
	}
}
