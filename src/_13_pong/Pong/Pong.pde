  import ddf.minim.*;
  Minim minim;
  AudioSample sound;
  PImage backgroundImage;
//1. Start a new sketch with draw and setup methods.

//2. Set your canvas size and background color in the setup method
void setup(){
    size(1000, 500);
    background(5, 5, 5);
   minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);
  backgroundImage = loadImage("pong.png");
}
//3. In your draw method, draw a ball on the screen.
void draw(){
  fill(255, 255, 255);
  stroke(5, 5, 5);
  ellipse(500, 250, 10, 10);
sound.trigger();
image(backgroundImage, 600, 500);
    image(backgroundImage, 1000, 500, 1000,500);
 rect(1, mouseY, 10, 100);
 rect(987, mouseY, 10, 100);
 rect(500, 0, 5, 800);
}
//4. Make the ball move across the screen (left to right).
     // Hint: make a variable for the ball's X position and change it in the draw method.


//5. Change the speed of the ball.
    // Hint: make a variable for the speed of the ball in the X direction (from left to right).
     //Changing this variable should change the speed of your ball.


//6. Bounce the ball off the side walls. Hint: Use the value width that Processing provides.


//7. Do the same for the top and bottom Hint: Use the value height that Processing provides.


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

     boolean intersects(int ballX, int ballY, int paddleX, int paddleY, int paddleLength) {
     if (ballY > paddleY && ballX > paddleX && ballX < paddleX + paddleLength)
          return true;
     else
          return false;
    }
