
public class UserManager implements UserService {

	UserCheckService userCheckservice;
	
	public UserManager(UserCheckService userCheckservice) {
		this.userCheckservice= userCheckservice;
	}
	@Override
	public void add(Gamer gamer) {
		if(this.userCheckservice.CheckIfRealPerson(gamer)) {
		System.out.println(gamer.getFirstName()+" adli Kullanici eklendi");
		}else {
			System.out.println(gamer.getFirstName()+" adli Kullanici eklenemedi");
		}
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" adli Kullanici silindi");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" adli Kullanici guncellendi");
		
	}
	
	

}
