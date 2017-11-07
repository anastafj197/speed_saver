import java.io.*;
import java.util.*;

public class Speed {

  public static void main(String [] args) {
    int distance = args[0];
    int speedLimit = args[1];
    int speedAmount = args[2];
    
    calc(distance, speedLimit, speedAmount);
  }
    
    private static int calc(int distance, int speedLimit, int speedAmount) {
      System.out.println("Distance = " + distance);
      System.out.println("SpeedLimit = " + speedLimit);
      System.out.println("SpeedAmount = " + speedAmount);
      return 0;
    }
   
}
