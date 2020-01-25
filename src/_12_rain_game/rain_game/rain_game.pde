int randomNumber = 420; 
//1. Start a new sketch with draw and setup methods.
int rainy = 50;
//2. Set your canvas size in the setup method
   int score = 0;
   void checkCatch(int x){
        if (x > mouseX && x < mouseX+100)
           score++;
         else if (score > 0) 
           score--;
       println("Your score is now: " + score);
   }
    void setup(){
    size(500, 500);
    }
      //and your background color in the draw method
    void draw(){
      
   background(10, 255, 249);
        fill(10, 73, 255);
    stroke(10, 255, 249);
   ellipse(randomNumber, rainy, 15, 15);
if(rainy >= 500){
 checkCatch(randomNumber);
  rainy = 50;
   randomNumber = (int) random(421);
}
rainy++;
 fill(188, 188, 188);
  rect(mouseX, 450, 40, 55);
textSize(16);
   text("Score: " + score, 20, 20);
}
//3. Draw a raindrop at the top of the screen in the draw() method.

//4. Make the rain fall down the screen.
    //Hint: make a variable for the raindrop's Y position and change it in the draw method.

//5. When the rain falls off the bottom of the canvas, start a new rain drop falling from the top.

//6. Make the rain start at a random position (X position) at the top. This code will give you a random number between 0 and the width of your sketch.
      

//7. Draw a bucket at the bottom of the screen.
    
    
     
    
//8. Make the bucket move over and back with the mouse. Hint: mouseX

//9. Add an int variable to hold the score (above the setup method). If the rain falls in the bucket increase the score by 1. If it doesn’t, decrease the score by 1, but don’t let the score go negative. Figure it out by yourself or use this method… 
   

//10. Print the score on the screen.
  
    
