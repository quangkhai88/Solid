package solid.is.after;

public class TennisPlayer implements IPlayer, ITennisPlayer{

	@Override
	public String getName() {
		return "Tennis player";
	}

	@Override
	public void playTenis() {
		System.out.print("Playing tennis");
	}
}
