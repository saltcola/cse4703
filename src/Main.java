import processing.core.PApplet;


public class Main extends PApplet {
	
	public void settings() {
		size(800, 600);
		}
	
	public void setup() {
		background(0);
		}

	public void draw() {
		stroke(255);
	    if (mousePressed) {
	      line(mouseX,mouseY,pmouseX,pmouseY);
	      }
	    }

	public static void main(String[] args) {
		
		PApplet.main("Main");

	}

}
