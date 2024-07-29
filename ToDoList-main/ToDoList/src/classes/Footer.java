package classes;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Footer extends JPanel{
	
	JButton addTask;
	JButton clear;
	
	
	Border emptyBorder = BorderFactory.createEmptyBorder();
	
	Footer()
	{
		this.setPreferredSize(new Dimension(500,90));
		
		addTask = new JButton("Add Task");
		addTask.setBorder(emptyBorder);
		this.setBackground( new Color(194, 139, 61));
		addTask.setBackground(new Color(194, 139, 61));
		addTask.setForeground(Color.white);



		addTask.setFont(new Font("Sans-serif",Font.PLAIN, 20));
		addTask.setVerticalAlignment(JButton.BOTTOM);
		//addTask.setBackground(Color.white);
		this.add(addTask);
		
		
		this.add(Box.createHorizontalStrut(20));//Space between buttons
		clear = new JButton("Clear finished tasks");
		clear.setFont(new Font("Sans-serif",Font.PLAIN, 20));
		clear.setBorder(emptyBorder);
		clear.setBackground(new Color(194, 139, 61));
		clear.setForeground(Color.white);
		//clear.setBackground();
		this.add(clear);
		
		
	}
	
	public JButton getNewTask(){
		return addTask;
	}
	
	public JButton getClear() {
		return clear;
	}
}
