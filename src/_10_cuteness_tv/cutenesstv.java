package _10_cuteness_tv;

import java.net.URI;

public class cutenesstv {
	
	
void cutevideo() {
	playVideo("https://www.youtube.com/watch?v=LNz8pWUKkYo");
}
void cutevideo1() {
	playVideo("https://www.youtube.com/watch?v=rTlcfyDRFXk");
}
void playVideo(String videoID) {
    try {
         URI uri = new URI(videoID);
         java.awt.Desktop.getDesktop().browse(uri);
    } catch (Exception e) {
         e.printStackTrace();
    }
}


}
