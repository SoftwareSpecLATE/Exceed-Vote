package gui;

import org.apache.log4j.Logger;

public class ScoreBox {
	
	private static int[] team = new int[12];
	private Vote v = new Vote();
	public void addScore(int select) {
		team[select]++;
		Logger logger = Logger.getLogger(this.getClass());
				logger.info(v.getType()+" vote for "+ "Team " + (select + 1));
				
		////////// To check score //////////
		for(int i=0; i<12; i++)
		{
			System.out.println("Team " + (i+1) + " : " + team[i]);
			logger.info("Team " + (i+1) + " : " + team[i]);
		}
	}
}
