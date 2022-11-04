package proxy_pattern;

public class DoorManProxy extends DoorMan{

	public void 쫓아내(Animal a) {
		System.out.println(" 안녕");
		super.쫓아내(a);
	}
}
