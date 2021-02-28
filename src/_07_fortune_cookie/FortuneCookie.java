package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
public void showButton() {
	JFrame frame = new JFrame();
	frame.setVisible(true);
	
	JButton button = new JButton();
	frame.add(button);
	
	button.addActionListener(this);
	button.setText("Press for Fortune!");
	
	frame.pack();
	
	
	
}

@Override
public void actionPerformed(ActionEvent arg0) {
	// TODO Auto-generated method stub
	int rand = new Random().nextInt(5);
	if(rand == 0) {
		JOptionPane.showMessageDialog(null, "You will have a good day!");
	}else if(rand == 1) {
		JOptionPane.showMessageDialog(null, "You will have a bad day.");
	}else if(rand == 2) {
		JOptionPane.showMessageDialog(null, "You will win the lottery!");
	}else if(rand == 3) {
		JOptionPane.showMessageDialog(null, "You will meet new friends!");
	}else if(rand == 4) {
		JOptionPane.showMessageDialog(null, "You will get scammed.");
	}
	
}
}
