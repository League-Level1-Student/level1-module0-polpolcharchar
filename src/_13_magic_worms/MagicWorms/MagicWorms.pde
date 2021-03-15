void setup(){
  size(900, 900);
  background(255, 0, 0);
}

void draw(){
  makeMagical();
  fill(0, 0, 255);
  float x = random(900);
  float y = random(900);
  for(int i = 0; i<3000; i++){
    ellipse(getWormX(i), getWormY(i), 5, 5);
  }
  
  
}

float frequency = .002;
    float noiseInterval = PI;

    void makeMagical() {
        fill( 0, 0, 0, 10 );
        rect(0, 0, width, height);
        noStroke();
    }

    float getWormX(int i) {
        return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
    }

    float getWormY(int i) {
        return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
    }
