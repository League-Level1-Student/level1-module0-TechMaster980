package _10_cuteness_tv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class cutenesstv implements ActionListener {
	void henryisthenewfatalbertcalledit() {
	 JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setVisible(true);
 JButton button = new JButton();
 frame.add(button);
 frame.pack();
 button.addActionListener(this);
	frame.setVisible(true);
JButton button1 = new JButton();
frame.add(button);
frame.pack();
button.addActionListener(this);	frame.setVisible(true);
JButton button2 = new JButton();
frame.add(button);
frame.pack();
button.addActionListener(this);	frame.setVisible(true);
JButton button3 = new JButton();
frame.add(button);
frame.pack();
button.addActionListener(this);	frame.setVisible(true);
JButton button4 = new JButton();
frame.add(button);
frame.pack();
button.addActionListener(this);	frame.setVisible(true);
JButton button5 = new JButton();
frame.add(button);
frame.pack();
button.addActionListener(this);
	}
void cutevideo() {
	playVideo("https://www.youtube.com/watch?v=LNz8pWUKkYo");
}
private void playVideo(String string) {
	// TODO Auto-generated method stub
	}
void cutevideo1() {
	playVideo("https://www.youtube.com/watch?v=rTlcfyDRFXk");
}
void happyvideo(){
    playVideo("https://www.youtube.com/watch?v=ih8PWBHlbws");
}
void thisvideowillmakeyousmile( ) {
playVideo("https://www.youtube.com/watch?v=X-bogN0V8RM");
}
void bestdayever() {
playVideo("https://www.youtube.com/watch?v=fpNQsUQy95c");
}
void pufferfish() {
	playVideo("https://www.youtube.com/watch?v=wuB9gdWstEg");
}
void playVideo() {
   try {
         URI uri = new URI("videoID");
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	}
}