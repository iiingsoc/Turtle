import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {  
    World world = new World(1200,800);

    Turtle yertle = new Turtle(world);
    Turtle yertle2 = new Turtle(200,100, world);
    Turtle yertle3 = new Turtle(500,200, world);
    Turtle yertle4 = new Turtle(200,200, world);

    yertle.setName("Yertle");
    yertle2.setName("Yertle2");
    yertle3.setName("Yertle3");
    yertle4.setName("Yertle4");

    yertle.setColor(Color.RED);
    yertle2.setColor(Color.ORANGE);
    yertle3.setColor(Color.YELLOW);
    yertle4.setColor(Color.GREEN);

    // // Add your code here
    yertle.tree();
    yertle2.circle(10);
    yertle3.house();
    yertle4.snowMan();
    yertle4.telport(500, 500);
    yertle4.snowMan();

    yertle.turtleData("Tree");
    yertle2.turtleData("Circle");
    yertle3.turtleData("House");
    yertle4.turtleData("Snowman");



    // //world.setVisible(true);

    // World world2 = new World(true);
   
     
    // Turtle yertle2 = new Turtle(world2);
    // // Add your code here
    // yertle2.forward();
    // yertle2.turnRight();
    // yertle2.forward();

  
    //world.setVisible(true);
  }
}
