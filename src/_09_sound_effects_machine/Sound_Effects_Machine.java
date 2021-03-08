package _09_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import javax.swing.JPanel;

public class Sound_Effects_Machine implements ActionListener{
JFrame frame = new JFrame();
JPanel panel = new JPanel();
JButton button1 = new JButton("Cat");
JButton button2 = new JButton("Dog");
JButton button3 = new JButton("Fish");

public void createButtons() {
	frame.add(panel);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	frame.setVisible(true);
	frame.pack();
}








@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton buttonClicked = (JButton) e.getSource();
	if(buttonClicked.equals(button1)) {
		System.out.println("1");
	}else if(buttonClicked.equals(button2)) {
		System.out.println("2");
	}else if(buttonClicked.equals(button3)) {
		System.out.println("3");
	}
	
}
}
