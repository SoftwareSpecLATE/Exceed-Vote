
public class ScoreBox {
	
	private static int[] team = new int[12];
	
	public void addScore(int select) {
		team[select]++;
		for(int i=0; i<12; i++)
		{
			System.out.println("Team " + (i+1) + " : " + team[i]);
		}
	}
}
