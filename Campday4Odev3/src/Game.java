
public class Game {

	private String GameName;
	private int GamePrice;
	private String Gametype;
	
	public Game(String GameName, String Gametype, int GamePrice) {
		this.GameName=GameName;
		this.Gametype=Gametype;
		this.GamePrice=GamePrice;
	}
	public String getGameName() {
		return GameName;
	}
	public void setGameName(String gameName) {
		this.GameName = gameName;
	}
	public int getGamePrice() {
		return GamePrice;
	}
	public void setGamePrice(int gamePrice) {
		this.GamePrice = gamePrice;
	}
	public String getGametype() {
		return Gametype;
	}
	public void setGametype(String gametype) {
		this.Gametype = gametype;
	}
}
