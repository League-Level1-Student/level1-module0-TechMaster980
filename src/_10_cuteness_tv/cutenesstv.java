package _10_cuteness_tv;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
public class cutenesstv implements ActionListener {
void henryisthenewfatalbertcalledit() {
JFrame frame = new JFrame();
System.out.println("button clicked");
frame.setVisible(true);
JButton button = new JButton();
frame.add(button);
frame.pack();
button.addActionListener(this);
}
private void playVideo(String string) {
// TODO Auto-generated method stub
}
void playVideo() {
try {
URI uri = new URI("videoID");
java.awt.Desktop.getDesktop().browse(uri);
}catch (Exception e){
e.printStackTrace();
}
}
@Override
public void actionPerformed(ActionEvent e){
// TODO Auto-generated method stub
}
int rand = new Random().nextInt(3);
void showDucks() {
if(rand == 0) {	
playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
}
}
void showFrog() {
if(rand == 1) {
playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
}
}
void showFluffyUnicorns() {
if(rand == 2) {
playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
}
}
public void showButton() {
// TODO Auto-generated method stub
}
}