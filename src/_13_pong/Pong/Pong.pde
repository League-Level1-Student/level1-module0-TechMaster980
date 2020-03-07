import ddf.minim.*;
Minim minim;
AudioSample sound;
int x = 500;
int y = 250;
int speedx = 1;
int speedy = 1;
PImage backgroundImage;
//1. Start a new sketch with draw and setup methods.

//2. Set your canvas size and background color in the setup method
int score = 0;
   void checkCatch(int x){
        if (x > mouseX && x < mouseX+100)
           score++;
         else if (score > 0) 
           score--;
       println("" + score);
   }
void setup() {
  size(1000, 490);

  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  backgroundImage = loadImage("pong.png");
}
//3. In your draw method, draw a ball on the screen.
void draw() {
  background(5, 5, 5);
  fill(255, 255, 255);
  stroke(5, 5, 5);
  rect(x, y, 10, 10);
  sound.trigger();
  image(backgroundImage, 600, 500);
  image(backgroundImage, 1000, 500, 1000, 500);
  rect(150, mouseY, 10, 50);
  rect(850, mouseY, 10, 50);
  rect(500, 4, 5, 10);
  rect(500, 20, 5, 10);
  rect(500, 36, 5, 10);
  rect(500, 52, 5, 10);
  rect(500, 68, 5, 10);
  rect(500, 84, 5, 10);
  rect(500, 100, 5, 10);
  rect(500, 116, 5, 10);
  rect(500, 132, 5, 10);
  rect(500, 148, 5, 10);
  rect(500, 164, 5, 10);
  rect(500, 180, 5, 10);
  rect(500, 196, 5, 10);
  rect(500, 212, 5, 10);
  rect(500, 228, 5, 10);
  rect(500, 244, 5, 10);
  rect(500, 260, 5, 10);
  rect(500, 276, 5, 10);
  rect(500, 292, 5, 10);
  rect(500, 308, 5, 10);
  rect(500, 324, 5, 10);
  rect(500, 340, 5, 10);
  rect(500, 356, 5, 10);
  rect(500, 372, 5, 10);
  rect(500, 388, 5, 10);
  rect(500, 404, 5, 10);
  rect(500, 420, 5, 10);
  rect(500, 436, 5, 10);
  rect(500, 452, 5, 10);
  rect(500, 468, 5, 10);
  rect(500, 484, 5, 10);
  //if (850==x || 150==x) {
  //  if (mouseY==y || mouseY==y ) {
  //    x-=3;
  //    y-=1;
  //  }
  //} else {
  //  x+=3;
  //  y+=1;
  //}
  x=x+speedx;
  y=y+speedy;
  textSize(100);
   text("" + score, 350, 90);
   textSize(100);
   text("" + score, 600, 90);
  //4. Make the ball move across the screen (left to right).
  // Hint: make a variable for the ball's X position and change it in the draw method.


  //5. Change the speed of the ball.
  // Hint: make a variable for the speed of the ball in the X direction (from left to right).
  //Changing this variable should change the speed of your ball.


  //6. Bounce the ball off the side walls. Hint: Use the value width that Processing provides.
  
  if (x<=0) {
     score=score+1;
    speedx=-speedx;
  }
  if (x>=1000) {
    score=score+1;
    speedx=-speedx;
  }

  //7. Do the same for the top and bottom Hint: Use the value height that Processing provides.
  if (y>=490) {
speedy=-speedy;
  }
  if (y<=0) {
  speedy=-speedy;
  
 }
boolean cccp = intersects(x, y, 150, mouseY, 10);
 if (cccp == true){
 speedx = -speedx;
 }
 boolean china = intersects(x, y, 850, mouseY, 10);
 if (china == true){
 speedx = -speedx;
 }
  //8. Make a sound when the ball falls on the ground. You will need to drop a sound file (pong.wav) on your sketch. Then add the following code. Note: You may need to import the Minim library into your sketch. Ask your teacher how to do this.

  //At the top of the sketch:



  //In the setup() method:


  //In the draw() method (when the ball hits the bottom):



  //9. Add a background image for your game. First drop the image file on your sketch.

  //At the top of the sketch:



  //In the setup() method:



  //In the draw() method:



  //10. Draw a paddle at the bottom of the screen


  //11. Make the paddle move over and back with the mouse. Hint: Use mouseX

  //12. Make the ball change Y direction when it hits the paddle. Figure it out by yourself, or use this method:
}
boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
  if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
    return true;
  else
    return false;
}
