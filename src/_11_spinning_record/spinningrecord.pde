int angle = 1000;
//1. Find an image of a record.
//     i) Save the image.
//     ii) Drop the image file onto your sketch.
//     iii) Load it with code like this...
  import ddf.minim.*;             //at the very top of your sketch
    Minim minim;        //as a member variable
  AudioPlayer song;      //as a member variable
  PImage pictureOfRecord;                        //as member variable
void setup(){
        size(569,570);                                 //in setup method
        pictureOfRecord= loadImage("record.png");      //in setup method
        pictureOfRecord.resize(height,width);     //in setup method
 minim = new Minim(this);    //in the setup method
  song = minim.loadFile("finishonsnowwinterwar.wav", 512);   //in the setup method
}
void draw(){
  if(mousePressed){ 
  rotateImage(pictureOfRecord, angle); 
 
  song.play();
  
  song.pause();
  
}
  image(pictureOfRecord, 0, -1);  //in draw method
  angle++;
}
//2. Set the size of your image to match the size of your canvas (after you have loaded it).
        
//3. Use this method to rotate your image. Make sure you use the image() command after you call rotateImage().
   void rotateImage(PImage image, int amountToRotate) {
        translate(width/2, height/2);
        rotate(amountToRotate*TWO_PI/360);
        translate(-image.width/2, -image.height/2);
    }

//5. Adjust the speed of the record player. Make the record spin.
    // i) Make a variable to keep track of the image angle.
     //ii) Increase this variable in the draw method.
     //iii) Use this variable when you call the rotateImage() method.

//6. Only spin the record when the user clicks the mouse button. Hint: use mousePressed

//7. Add a song. First drop the song file (ex. awesomeTrack.mp3) onto your sketch.

//8. Only play the song when the mouse is pressed. Hint: use the methods below.
 
//9. Make the record spin as fast as possible
