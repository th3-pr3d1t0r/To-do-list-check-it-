package classes;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Task extends JPanel  implements ActionListener{

	JLabel index;
	JTextField taskName;
	JButton done;

	private boolean checked;

	Task()
	{
		this.setPreferredSize(new Dimension(400,20));
		this.setBackground(new Color(243, 232, 219));

		this.setLayout(new BorderLayout());

		checked = false;

		index = new JLabel("");
		index.setPreferredSize(new Dimension(20,20));
		index.setHorizontalAlignment(JLabel.CENTER);
		this.add(index,BorderLayout.WEST);

		taskName = new JTextField("Add your task here...");

		taskName.setBorder(BorderFactory.createEmptyBorder());
		taskName.setBackground(new Color(118, 160, 207));

		this.add(taskName,BorderLayout.CENTER);

		done = new JButton("Done");
		done.setPreferredSize(new Dimension(40,20));
		done.setBorder(BorderFactory.createEmptyBorder());
		done.setFocusPainted(false);
		done.addActionListener(this);

		this.add(done,BorderLayout.EAST);


	}

	public void changeIndex(int num)
	{
		this.index.setText(num+"");
		this.revalidate();
	}


	public JButton getDone()
	{
		return done;
	}

	public boolean getState()
	{
		return checked;
	}

	public void changeState()
	{
		this.setBackground( new Color(243, 232, 219));
		taskName.setBackground( new Color(243, 232, 219));
		checked = true;
		revalidate();
	}
	private String characterToAdd = ".";


	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == done) {
			String taskText = taskName.getText();
			taskName.setText(taskText + characterToAdd);
			String[] textArray = TextToArrayList.getTextFromArray(taskName);

            try {
                TextToArrayList.writeArrayToFile(textArray, "output.txt", true); // Set append to true
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            // Handle potential file writing errors


		}
}}
