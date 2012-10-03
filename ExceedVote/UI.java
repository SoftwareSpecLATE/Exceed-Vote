import javax.swing.*;
import javax.swing.event.ListSelectionListener;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Rectangle;
import java.awt.Scrollbar;
import java.awt.Point;
import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.KeyEvent;
import javax.swing.event.ListSelectionEvent;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI {
	private JList list;
	private final JLabel label = new JLabel("Describe");
	private static final JMenuBar menuBar = new JMenuBar();
	private static final JMenu mnNewMenu = new JMenu("Menu");
	private final JLabel BallotLeftLabel = new JLabel("Ballot left  :");
	private static Vote v = new Vote();
	private static ScoreBox scorebox = new ScoreBox();
	private static String ballot = "0";

	public JPanel createContentPane() {
		final JPanel panel = new JPanel();
		panel.setLayout(null);
		JButton voteButton = new JButton("Vote");

		voteButton.setBounds(225, 275, 100, 30);
		panel.add(voteButton);

		String listData[] = { "Team 1", "Team 2", "Team 3", "Team 4", "Team 5",
				"Team 6", "Team 7", "Team 8", "Team 9", "Team 10", "Team 11",
				"Team 12" };

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
		typeOf.setBounds(450, 320, 50, 20);
		panel.add(typeOf);

		JLabel statusAns = new JLabel("0");
		statusAns.setForeground(Color.RED);
		statusAns.setBounds(500, 320, 50, 20);
		if (ballot == "1")
			statusAns.setText("Student");
		if (ballot == "2")
			statusAns.setText("Techer");
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

	private static void createAndShowGUI() {

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

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {

				String type = v.getType();
				if (type == "student") {
					ballot = "1";
				} else if (type == "techer") {
					ballot = "2";
				}
				createAndShowGUI();
			}
		});
	}
}