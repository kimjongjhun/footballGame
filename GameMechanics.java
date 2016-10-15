package com.footballGame;

import java.util.Scanner;

public class GameMechanics extends GameVariables {
	GameVariables gv1;
	
	public static void start(){
		GameMechanics game = new GameMechanics();
	}
	public GameMechanics(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Welcome to the game! What is your name? ");
		setYourName(scanner.nextLine());
		System.out.println("Welcome " + getYourName() + "! What is your opponent's name?");
		setOpponentName(scanner.nextLine());
		System.out.println("Today's match features: " + getYourName() + " vs. " + getOpponentName() + "!");
		coinFlip();
	}
	
	public void coinFlip() {
		System.out.println("Let's flip a coin to see who will go first...");
		coinToss();
		if (getCoinToss() == 0) {
			System.out.println("Look's like " + getYourName() + " will have possession first!");
		} else {
			System.out.println("Look's like " + getOpponentName() + " will have the first possession!");
		}
	}
}
