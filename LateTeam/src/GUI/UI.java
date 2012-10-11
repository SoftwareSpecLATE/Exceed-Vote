package GUI;

import javax.swing.*;
import java.awt.Color;
import java.awt.Point;
import java.awt.ComponentOrientation;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI {
	private JList list;
	private final JLabel label = new JLabel("Describe");
	private static final JMenuBar menuBar = new JMenuBar();
	private static final JMenu mnNewMenu = new JMenu("Menu");
	private final JLabel BallotLeftLabel = new JLabel("Ballot left  :");
	
	private static ScoreBox scorebox = new ScoreBox();
	String ballot = Vote.getBallot();

	public JPanel createContentPane() {
		final JPanel panel = new JPanel();
		panel.setLayout(null);
		JButton voteButton = new JButton("Vote");

		voteButton.setBounds(225, 275, 100, 30);
		panel.add(voteButton);
		
		TeamTest teamtest = new TeamTest();
		String listData[] = teamtest.getTeam(); 
		
		list = new JList(listData);
		JScrollPane scrollPane = new JScrollPane(list);
		scrollPane.setBounds(50, 40, 200, 200);
		panel.add(scrollPane);
		label.setBounds(300, 40, 200, 200);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		label.setVerticalTextPosition(SwingConstants.TOP);
		label.setVerticalAlignment(SwingConstants.TOP);

		panel.add(label);
		label.setText("Add describe here...");
		BallotLeftLabel.setBounds(50, 275, 80, 25);

		panel.add(BallotLeftLabel);

		final JLabel BallotScore = new JLabel("0");
		BallotScore.setBounds(125, 275, 90, 25);
		BallotScore.setText(ballot);
		panel.add(BallotScore);

		JLabel typeOf = new JLabel("Status : ");
		typeOf.setForeground(Color.RED);
		typeOf.setBounds(450, 320, 100, 20);
		panel.add(typeOf);

		JLabel statusAns = new JLabel("0");
		statusAns.setForeground(Color.RED);
		statusAns.setBounds(500, 320, 50, 20);
		if (ballot == "1")
			statusAns.setText("Student");
		if (ballot == "2")
			statusAns.setText("Teacher");
		panel.add(statusAns);

		voteButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int bb = Integer.parseInt(ballot);

				int select = list.getSelectedIndex();
				int n = JOptionPane.showConfirmDialog(panel, "You Selected : "
						+ list.getSelectedValue(), "Confirm",
						JOptionPane.YES_NO_OPTION);
				if (n == 0) {	
					if (bb - 1 >= 0) {
						bb -= 1;
						ballot = "" + bb;
						scorebox.addScore(select);
						BallotScore.setText(ballot);
					} else {
						JOptionPane.showMessageDialog(null,
								"You don't have ballot.");
					}
				}
			}
		});
		return panel;
	}

	static void createAndShowGUI() {

		JFrame frame = new JFrame("Vote");
		frame.setLocation(new Point(500, 200));
		frame.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		frame.setVisible(true);

		UI ui = new UI();

		frame.setJMenuBar(menuBar);

		menuBar.add(mnNewMenu);
		frame.setContentPane(ui.createContentPane());

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);

	}
}