import processing.core.PApplet;

/**
 * A program that draws a bird using methods with parameters and return values.
 * @author: Stephanie Tam
 */

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(173, 230, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    // Draw body
    drawBody(200, 200, 260, 230);

    // Draw stomach
    drawStomach(200, 265, 160, 100);

    // Draw right wing
    drawRWings(320, 190, 320, 240, 385, 190);

    // Draw left wing
    drawLWings(80, 190, 80, 240, 15, 190);

    // Draw beak
    drawBeak(170, 180, 200, 230, 230, 180);

    // Draw left eye
    drawLEye(185, 170, 20, 30);

    // Draw right eye
    drawREye(215, 170, 20, 30);
  }
  
  // define other methods down here.

  /**
   * Draws the bird's body
   * 
   * @param circleX x-coordinate of the ellipse
   * @param circleY y-coordinate of the ellipse
   * @param circleWidth width of the ellipse
   * @param circleHeight height of the ellipse
   */

  public void drawBody(float circleX, float circleY, float circleWidth, float circleHeight) {
    fill(242, 22, 84);
    ellipse(circleX, circleY, circleWidth, circleHeight);
  }

  /**
   * Draws the bird's stomach
   * 
   * @param circleX x-coordinate of the ellipse
   * @param circleY y-coordinate of the ellipse
   * @param circleWidth width of the ellipse
   * @param circleHeight height of the ellipse
   */

  public void drawStomach(float circleX, float circleY, float circleWidth, float circleHeight) {
    fill(173, 122, 245);
    ellipse(circleX, circleY, circleWidth, circleHeight);
  }

  /**
   * Draws the bird's right wing
   * 
   * @param triangleX1 x-coordinate of the first point
   * @param triangleY1 y-coordinate of the first point
   * @param triangleX2 x-coordinate of the second point
   * @param triangleY2 y-coordinate of the second point
   * @param triangleX3 x-coordinate of the third point
   * @param triangleY3 y-coordinate of the third point
   */

  public void drawRWings(float triangleX1, float triangleY1, float triangleX2, float triangleY2, float triangleX3, float triangleY3) {
    fill(92, 0, 222);
    triangle(triangleX1, triangleY1, triangleX2, triangleY2, triangleX3, triangleY3);
  }

  /**
   * Draws the bird's left wing
   * 
   * @param triangleX1 x-coordinate of the first point
   * @param triangleY1 y-coordinate of the first point
   * @param triangleX2 x-coordinate of the second point
   * @param triangleY2 y-coordinate of the second point
   * @param triangleX3 x-coordinate of the third point
   * @param triangleY3 y-coordinate of the third point
   */

  public void drawLWings(float triangleX1, float triangleY1, float triangleX2, float triangleY2, float triangleX3, float triangleY3) {
    fill(92, 0, 222);
    triangle(triangleX1, triangleY1, triangleX2, triangleY2, triangleX3, triangleY3);
  }

  /**
   * Draws the bird's beak
   * 
   * @param triangleX1 x-coordinate of the first point
   * @param triangleY1 y-coordinate of the first point
   * @param triangleX2 x-coordinate of the second point
   * @param triangleY2 y-coordinate of the second point
   * @param triangleX3 x-coordinate of the third point
   * @param triangleY3 y-coordinate of the third point
   */
  
  public void drawBeak(float triangleX1, float triangleY1, float triangleX2, float triangleY2, float triangleX3, float triangleY3) {
    fill(255, 233, 38);
    triangle(triangleX1, triangleY1, triangleX2, triangleY2, triangleX3, triangleY3);
  }

  /**
   * Draws the bird's left eye
   * 
   * @param circleX x-coordinate of the ellipse
   * @param circleY y-coordinate of the ellipse
   * @param circleWidth width of the ellipse
   * @param circleHeight height of the ellipse
   */

  public void drawLEye(float circleX, float circleY, float circleWidth, float circleHeight) {
    fill(24, 0, 102);
    ellipse(circleX, circleY, circleWidth, circleHeight);
  }

  /**
   * Draws the bird's right eye
   * 
   * @param circleX x-coordinate of the ellipse
   * @param circleY y-coordinate of the ellipse
   * @param circleWidth width of the ellipse
   * @param circleHeight height of the ellipse
   */

  public void drawREye(float circleX, float circleY, float circleWidth, float circleHeight) {
    fill(24, 0, 102);
    ellipse(circleX, circleY, circleWidth, circleHeight);
  }
}