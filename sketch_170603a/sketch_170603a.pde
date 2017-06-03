boolean OnTheGround = false;
boolean GameStart = false;
int y = 560;
int x = 430;
int Y = 250;
int X = 100;
double birdYVelocity = 0;
double gravity = 0.2;
void setup() {
  size(500, 500);
}

void draw() {
  background(000, 170, 68);
  fill(153, 255, 0);
  ellipse(X, Y, 30, 30);
  if(GameStart){
  birdYVelocity = ( birdYVelocity + gravity);
  Y = (int) (Y + birdYVelocity);
  fill(000, 136, 17);
  rect(x, y, 50, 400);
  fill(000, 136,17);
  rect(x,y - 560,50,400);
  x -= 4;
  if (x < 0) {
    x = width;
    int random = (int) random(100, 400);
    y = random;
  }
  if (Y >= 500){
   OnTheGround = true;
   birdYVelocity = 0;
gravity = 0;
  }
  fill(250,000,000);
  text("score",450,10 );
  }
}
void mousePressed() {
  if (GameStart == false){
   GameStart = true; 
  }
    if (OnTheGround){

   birdYVelocity = 0;
gravity = 0;
  }
  else{
    birdYVelocity = -5;
  }

 
}

boolean intersects(int birdX, int birdY, int paddleX, int paddleY, int paddleLength) {
  if (birdY > paddleY - 4 && birdX > paddleX && birdX < paddleX + paddleLength)
    return true;
  else 
  return false;
}