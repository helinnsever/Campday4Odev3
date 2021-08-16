
public class CampaignManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adli kampanyaniz baslamistir");
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" adli kampanyanizin suresi dolmustur");
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println(campaign.getDiscount()+" indirimi guncellenmistir.");
		
	}

	
}
