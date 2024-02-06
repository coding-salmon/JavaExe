package ch10.collection01.ch15.sec02.exam01.ex01;

public class Game {
	private String gameName;
	private String gameContent;
	private int gameOpenDay;
	
	public Game(String gameName, String gameContent, int gameOpenDay) {
		this.gameName = gameName;
		this.gameContent = gameContent;
		this.gameOpenDay = gameOpenDay;
	}
	
	public String getGameName() {return gameName;}
	public void setGameName(String gameName) {this.gameName = gameName;}
	
	public String getGameContent() {return gameContent;}
	public void setGameContent(String gameContent) {this.gameContent = gameContent;}
	
	public int getGameOpenDay() {return gameOpenDay;}
	public void setGameOpenDay(int gameOpenDay) {this.gameOpenDay = gameOpenDay;}

}
