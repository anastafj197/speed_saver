/* 
Frances Anastasia 

  Net Time Calculator 
 For A Casual Speeder
     Or Slowpoke 

11/7/2012

*/

import java.io.*;
import java.util.*;

import java.awt.*;
import javax.swing.*;

public class Speed {


  public static double result;
  public static double netTime;
  public static double newSpeed;
  public static double timeToDest;
  public static double milesPerMinu; 
  public static double newTimeToDest;
  public static double newMilesPerMin;

  private JFrame frame;
  private JPanel panel; 
  private JButton button; 
  private JLabel label;

  public Speed() {
    gui();

  }

  public void gui() {

    frame = new JFrame("SpeedSaver");

    frame.setVisible(true);
    frame.setSize(600,400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    panel = new JPanel(new GridBagLayout());

    GridBagConstraints c = new GridBagConstraints();

    panel.setBackground(Color.GREEN);

    button = new JButton("No Stops?");
    label = new JLabel("This is a test label");

    panel.add(button);
    panel.add(label);

    frame.add(panel);

  }

  public static void main(String [] args) {

    new Speed();
 
    Scanner input = new Scanner(System.in);

    
    System.out.println();
    System.out.println("                   * Welcome to the SpeedSvaer Calculator *");
    System.out.println();
    System.out.println("               This app is primarily for long distance road trips");
    System.out.println("                 Enter in the number of stops you will be making  ");
    

    int numStops = input.nextInt();

    for (int n = 0; n < numStops; n++) {


    }

    
    System.out.println("          Please enter the following 3 numbers seperated by a space"); 
    System.out.println("                      For each stop you will be making");
    System.out.println();
    System.out.println("                 The DISTANCE in miles you wish to travel");
    System.out.println("                    The SPEEDLIMIT of the road your on");
    System.out.println("           The number of miles OVER / UNDER the speedLimit you wish");
    
    //String input = input.nextLine();
    
    double[] values = new double[3];

    for (int i = 0; i < 3; i++) {
      values[i] = input.nextDouble();
    }

    System.out.println("HERE");
    
    //String[] numbers = input.split(" ");
    
    System.out.println("HERE");
    
    Double distance = values[0];

    Double speedLimit = values[1];

    Double speedAmount = values[2];
    
    System.out.println("HERE");

    if (distance < 0 || speedLimit < 0) {
      System.out.println("No negative values here");
      System.exit(0);
    }
    
    calc(distance, speedLimit, speedAmount);

  }
    
    public static double calc(double distance, double speedLimit, double speedAmount) {

      newSpeed = speedAmount + speedLimit;

      milesPerMinu = distance / speedLimit;

      timeToDest = milesPerMinu * 60; // minutes in hour

      newMilesPerMin = distance / newSpeed;

      newTimeToDest = newMilesPerMin * 60; 

      netTime = timeToDest - newTimeToDest;

      //System.out.println("Distance = " + distance);
      //System.out.println("Speed_Limit = " + speedLimit);
      //System.out.println("Speed_Amount = " + speedAmount);
      System.out.println();
      System.out.println("netTime = " + netTime);

      return netTime;

    }   
}
