package fuchimi;

public class Spock extends Hand{

	@Override
	public String toString(){
		return "Spock";
	}

	@Override
	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}

	
	@Override
	protected Boolean loseAgainst(Rock rock) {
		return false;
	}
	@Override
	protected Boolean loseAgainst(Paper paper) {
		return true;
	}
	@Override
	protected Boolean loseAgainst(Scissors scissor) {
		return false;
	}
	@Override
	protected Boolean loseAgainst(Spock spock){
		return null;
	}
	@Override
	protected Boolean loseAgainst(Lizzard lizzard){
		return true;
	}
}
