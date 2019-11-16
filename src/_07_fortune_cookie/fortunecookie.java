package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class fortunecookie implements ActionListener {
	 public void showButton() {
         
		 JFrame frame = new JFrame();
			JPanel panel = new JPanel();
		 
		 System.out.println("Button clicked");
   
    

		frame.setVisible(true);
         JButton button = new JButton();
         frame.add(button);
         frame.pack();
         button.addActionListener(this);
         
     
	 
	 
	 
	 }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "wwwwwwwwwwwwwwwwwwwwwwwoooooooooooooooooooooooohhhhhhhhhhhooooooooooooooooooooooooooooooooooooooooooooooooooo");
	    
        int rand = new Random().nextInt(5);
        if(rand == 0) {
        JOptionPane.showMessageDialog(null,"henry sucks");
        }
        if(rand == 1) {
        JOptionPane.showMessageDialog(null,"china");
        }
        if(rand == 2) {
        JOptionPane.showMessageDialog(null,"america is winning trade war");
        }
        if(rand == 3) {
        JOptionPane.showMessageDialog(null,"russia");
        }
        if(rand == 4) {
        JOptionPane.showMessageDialog(null,"henry is the fattest person in the world");
        }
        
	}
}
