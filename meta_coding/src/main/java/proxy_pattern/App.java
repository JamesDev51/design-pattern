package proxy_pattern;

public class App {
	public static void main(String[] args) {
		Mouse m = new Mouse();
		Cat c = new Cat();
		DoorMan dm = new DoorManProxy();
		DoorManProxy2 dmp = new DoorManProxy2(new DoorMan());

		dm.쫓아내(m);
		dm. 쫓아내(c);

		dmp.쫓아내(m);
		dmp.쫓아내(c);
	}
}
