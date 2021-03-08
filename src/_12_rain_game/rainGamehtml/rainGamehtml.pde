int y = 0;
int randomNumber = (int) random(width);
int score = 0;
void setup(){
  size(500, 500);
  
}
void draw(){
  
  background(255, 0, 0);
  text("Score: " + score, 20, 20);
  fill(0, 20, 200);
  stroke(0, 0, 255);
  fill(50, 55, 55);
  stroke(0, 0, 0);
  rect(mouseX, 470, 50, 60);
  ellipse(randomNumber, y, 50, 75);
  
  y+=10;
  if(y>500){
    checkCatch(randomNumber);
    y=0;
    randomNumber = (int) random(width);
  }
}

void checkCatch(int x){
  if(x>mouseX && x<mouseX+100){
    score+=1;
    
  }else if(score>0){
    score--;
  }
  println("Your score is now: " + score);
  fill(0, 0, 0);
  textSize(16);
  
}
