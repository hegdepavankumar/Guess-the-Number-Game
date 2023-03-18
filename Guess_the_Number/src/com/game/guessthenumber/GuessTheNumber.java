package com.game.guessthenumber;

import java.util.Scanner;

class Game{
    int userNumber;
    int compNumber;
    int counter = 0;
    public Game(){
        compNumber = (int)(Math.random()*100);
        System.out.println(compNumber);
    }
    public void setNum(int n){
        userNumber = n;
    }
    public int isCorrect(){
        if(userNumber > compNumber) return -1;
        else if(userNumber < compNumber) return 1;
        else return 0;
    }
    public void Counter(){
        counter++;
    }
}

public class GuessTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Game obj = new Game();
	        Scanner sc = new Scanner(System.in);
	        int n = 0;
	        while(true){
	            System.out.println("Enter a number between 1-100: ");
	            n = sc.nextInt();
	            obj.setNum(n);

	            if(obj.isCorrect() == 0){
	                obj.Counter();
	                System.out.println("Congratulations, You've guessed the number.");
	                System.out.println("Number of counts: " + (obj.counter));
	                break;
	            }
	            else if(obj.isCorrect() == 1){
	                obj.Counter();
	                System.out.println("Higher number please!");
	            }
	            else if(obj.isCorrect() == -1){
	                obj.Counter();
	                System.out.println("Lower number please!");
	            }
	        }

	}

}







      
 
