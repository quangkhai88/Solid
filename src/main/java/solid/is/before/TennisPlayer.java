package solid.is.before;

/*
 * “do not force any client to implement an interface which is irrelevant to them“.
 * We should separate a common interface to specific interfaces
 */
public class TennisPlayer implements Player{

	@Override
	public String getName() {
		return "Tennis player";
	}

	@Override
	public void playTenis() {
		System.out.print("Playing tennis");
	}

	
	@Override
	public void playFootball() {
		// not applicable
		// do nothing
	}

}
