
public class edevletValidator implements UserCheckService{

	@Override
	public boolean CheckIfRealPerson(Gamer gamer) {
		System.out.println(gamer.getFirstName()+" adli Kullanici dogrulandi");
		return true;
	}

}
