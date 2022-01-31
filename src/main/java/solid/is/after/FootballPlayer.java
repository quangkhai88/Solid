package solid.is.after;

public class FootballPlayer implements IPlayer, IFootballPlayer{

	@Override
	public String getName() {
		return "Football player";
	}

	@Override
	public void playFootball() {
		System.out.print("Playing football");
	}

}
