package fuchimi;
import java.util.Scanner;

import fuchimi.Hand; 
import fuchimi.Paper;  
import fuchimi.Rock;  
import fuchimi.Scissors; 
 
public class FuchimiGameRulesTest { 
 
  public static void main(String[] args) {  
	  boolean end = false;
	  while(end == false){
		  int input = input();
		  
		  if(input == 0){
			  end = true;
			  break;
		  }
		  
		 Boolean youWin = updateGame(inputToHand(input),inputToHand((int)(Math.random()* (4-1)+1)));
		 output(youWin);
		 System.out.println("");
	  }
  } 
 
  private static int input(){
	  System.out.println("Enter 1 for Rock \n"+"Enter 2 for Paper \n"+"Enter 3 for Scissors\n"+"Enter 0 for Quit \n");
	  
	  Scanner in  =	new	Scanner(System.in);	
	  return in.nextInt();
  }
  
  private static Boolean updateGame(Hand yourHand, Hand computersHand){
	  System.out.println("You choose " + yourHand +"\n"+"Computer chooses " + computersHand);
	  return yourHand.beats(computersHand);
  }
  
  private static void output(Boolean youWin){
	  if(youWin == null){
		  System.out.println("Both Win");
	  }
	  else if(youWin == false){
		  System.out.println("You loose");
	  }
	  else{
		  System.out.println("You Win");
	  }
  }
  
  private static Hand inputToHand(int inputInt){
	  
	  switch(inputInt){ 
	      case 1: 
	    	  return new Rock();
	      case 2: 
	    	  return new Paper(); 
	      case 3:
	    	  return new Scissors();
	      default:
	    	  return null;
	  }
  }
  
  
  
  
  
  
  
  
  private static void givenTesting(){
	  	Hand hand1 = new Rock() ; 
	    Hand hand2 = new Paper() ; 
	    Hand hand3 = new Scissors() ; 
	     
	     
	    System.out.println(hand1 + " beats " + hand1 + "? " + hand1.beats(hand1)) ; 
	    System.out.println(hand1 + " beats " + hand2 + "? " + hand1.beats(hand2)) ; 
	    System.out.println(hand1 + " beats " + hand3 + "? " + hand1.beats(hand3)) ; 
	    System.out.println(hand2 + " beats " + hand1 + "? " + hand2.beats(hand1)) ; 
	    System.out.println(hand2 + " beats " + hand2 + "? " + hand2.beats(hand2)) ;  
	    System.out.println(hand2 + " beats " + hand3 + "? " + hand2.beats(hand3)) ;  
	    System.out.println(hand3 + " beats " + hand1 + "? " + hand3.beats(hand1)) ; 
	    System.out.println(hand3 + " beats " + hand2 + "? " + hand3.beats(hand2)) ;  
	    System.out.println(hand3 + " beats " + hand3 + "? " + hand3.beats(hand3)) ; 
  }
  
}