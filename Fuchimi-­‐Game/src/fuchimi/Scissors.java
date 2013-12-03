package fuchimi;

public class Scissors extends Hand{

	@Override
	public String toString(){
		return "Scissors";
	}

	@Override
	public Boolean beats(Hand hand) {
		return hand.loseAgainst(this);
	}

	
	@Override
	protected Boolean loseAgainst(Rock rock) {
		return true;
	}
	@Override
	protected Boolean loseAgainst(Paper paper) {
		return false;
	}
	@Override
	protected Boolean loseAgainst(Scissors scissor) {
		return null;
	}
	@Override
	protected Boolean loseAgainst(Spock spock){
		return true;
	}
	@Override
	protected Boolean loseAgainst(Lizzard lizzard){
		return false;
	}
}
