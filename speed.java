/* 
Frances Anastasia 

  Net Time Calculator 
 For A Casual Speeder
     Or Slowpoke 

11/7/2012

*/

import java.io.*;
import java.util.*;

public class Speed {


  public static double result;
  public static double netTime;
  public static double newSpeed;
  public static double timeToDest;
  public static double milesPerMinu; 
  public static double newTimeToDest;
  public static double newMilesPerMin;

  public static void main(String [] args) {

    Double distance = Double.valueOf(args[0]);
    Double speedLimit = Double.valueOf(args[1]);
    Double speedAmount = Double.valueOf(args[2]);

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
