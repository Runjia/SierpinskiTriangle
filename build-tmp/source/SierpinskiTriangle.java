import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class SierpinskiTriangle extends PApplet {

public void setup()
{
	size(500,500);
}
public void draw()
{
	sierpinski(0,0,500);
}
public void mouseDragged()//optional
{

}
public void sierpinski(int x, int y, int len) 
{
	if (len>10){
		triangle(x, y, x+len/2, y, x+len/4, y+len/2);
		triangle(x+len/2,y,x+len,y,x+len/2+len/4,y+len/2);
		triangle(x+len/4,y+len/2,x+len/4+len/2,y+len/2,x+len/2,y+len);
		sierpinski(x,y,len/2);
		sierpinski(x+len/2,y,len/2);
		sierpinski(x+len/4,y+len/2,len/2);
	}
	else {
		triangle(x,y,x+len,y,x+len/2,y+len);
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "SierpinskiTriangle" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
