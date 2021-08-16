
public class Main {

	public static void main(String[] args) {
		
		Gamer gamer1= new Gamer("Helin", "Sever", "12-01-1995", "256892314");
		Game game1= new Game("GTA","Action",500);
		
		Campaign campaign= new Campaign("Yilbasi",12,30);
		
		UserManager usermanager=new UserManager(new edevletValidator());
		
		usermanager.add(gamer1);
		
		CampaignManager campaignmanager= new CampaignManager();
		
		campaignmanager.add(campaign);
		
		GameManager gamemanager= new GameManager();
		gamemanager.add(game1);
		
		gamemanager.delete(game1);
		
		gamemanager.update(game1);
		
		

	}

}
