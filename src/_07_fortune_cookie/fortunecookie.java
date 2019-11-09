package _07_fortune_cookie;

import javax.swing.JButton;

public class fortunecookie {
	 public void showButton() {
         System.out.println("Button clicked");
   
       JFrame frame = new JFrame();
		frame.setVisible(true);
         JButton button = new JButton();
         frame.add(button);
         frame.pack();
         button.addActionListener(this);
	 }
	
}
