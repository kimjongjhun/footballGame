package com.footballGame;

public class GameVariables {
	
	private final int TOUCHDOWN = 6;
	private final int TRY_1 = 1;
	private final int TRY_2 = 2;
	
	
	private String yourName;
	private String opponentName;	
	public String getYourName(){
		return yourName;
	}
	public String getOpponentName(){
		return opponentName;
	}	
	public void setYourName(String s){
		this.yourName = s;
	}
	public void setOpponentName(String s){
		this.opponentName = s;
	}
	
	
	private int yourScore = 0;
	private int opponentScore = 0;	
	public int getYourScore(){
		return yourScore;
	}
	public int getOpponentScore(){
		return opponentScore;
	}
	public void setYourScore(String s){
		if (s.equalsIgnoreCase("1 extra")) {
			this.yourScore = this.yourScore + TRY_1;
		} else if (s.equalsIgnoreCase("2 extra")) {
			this.yourScore = this.yourScore + TRY_2;
		} else {
			this.yourScore = this.yourScore + TOUCHDOWN;
		};
	}
	public void setOpponentScore(String s){
		if (s.equalsIgnoreCase("1 extra")) {
			this.opponentScore = this.opponentScore + TRY_1;
		} else if (s.equalsIgnoreCase("2 extra")) {
			this.opponentScore = this.opponentScore + TRY_2;
		} else {
			this.opponentScore = this.opponentScore + TOUCHDOWN;
		};
	}
	
	
	private static int coinToss = 0;
	public static void coinToss(){
		coinToss = (int) (Math.random() * 2);
		setPossession();
	}
	public int getCoinToss() {
		return this.coinToss;
	}
	private static int possession = 0;
	public static void setPossession(){
		possession = possession + coinToss;
	}
	public void changePossession(){
		possession = possession + 1;
	}
	
	
	private int position = 0;
	public void setPosition() {
		this.position = this.position + yardsTraveled;
	}
	private int yardsToGo = 100;
	public void setYardsToGo() {
		this.yardsToGo = this.yardsToGo - yardsTraveled;
	}
	private int yardsTraveled;
	public void setYardsTraveled(int i) {
		this.yardsTraveled = this.yardsTraveled + i;
		setPosition();
		setYardsToGo();
	}
	
	
	private int down;
	public void setDown() {
		this.down = this.down + 1;
	}
	public void resetDown() {
		this.down = 1;
	}
}
