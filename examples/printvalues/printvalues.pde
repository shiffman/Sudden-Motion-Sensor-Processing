import sms.*;

void setup() {
  size(200, 200);
}

void draw() {  
  int[] vals = Unimotion.getSMSArray();
  println(vals[0] + " " + vals[1] + " " + vals[2]);
}

