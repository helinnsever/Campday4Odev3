
public class Campaign {
	
	private String CampaignName;
	private int time;
	private int discount;
	public Campaign(String CampaignName, int time, int discount) {
		this.CampaignName=CampaignName;
		this.time=time;
		this.discount=discount;
	}
	public String getCampaignName() {
		return CampaignName;
	}
	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}

}
