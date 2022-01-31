package solid.is.before;

public class FootballPlayer implements Player{

	@Override
	public String getName() {
		return "Football player";
	}

	@Override
	public void playTenis() {
		// not applicable
		// do nothing
	}

	@Override
	public void playFootball() {
		System.out.print("Playing football");
	}

}
