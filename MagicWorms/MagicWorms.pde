float X=getWormX((int)random(230));
float Y=getWormY((int)random(230));
float[] xlist=new float[10];
float[] ylist=new float[10];
//float x=random(230);
//float y=random(230);
//float A=random(230);
//float B=random(230);
//float C=random(230);
//float D=random(230);
//float E=random(230);
//float F=random(230);
//float G=random(230);
//float H=random(230);
void createWorm(float x,float y,float r,float g,float b){
    fill(r,g,b);
  ellipse(x,y,50,50);
  
}
void setup(){
 size(500,500);
 background(0,255,26);
  for(int j=0;j<xlist.length;j++){
   xlist[j]=getWormX((int)random(450));
   ylist[j]=getWormY((int)random(450));
  }
  
  
  
  
}

void draw(){
  
  for(int j=0;j<xlist.length;j++){
   createWorm(xlist[j],ylist[j],255 , 20, 17); 
  }
  //fill(255,239,000);
  //ellipse(X,Y,50,50);
  //fill(239,000,255);
  //ellipse(x,y,50,50);
  //fill(000,213,255);
  //ellipse(A,B,50,50);
  //fill(255,00,00);
  //ellipse(C,D,50,50);
  //fill(255,227,112);
  //ellipse(E,F,50,50);
  //fill(15,108,24);
  //ellipse(G,H,50,50);
  makeMagical();
}
float frequency = .001;
float noiseInterval = PI; 
 
void makeMagical() {
  fill( 0, 0, 0, 10 );rect(0, 0, width, height);noStroke();
}
 
float getWormX(int i) {
  return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}
 
float getWormY(int i) {
  return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}