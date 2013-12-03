package fuchimi;

public class Paper extends Hand{

	
	@Override
	public String toString(){
		return "Paper";
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
		return null;
	}
	@Override
	protected Boolean loseAgainst(Scissors scissor) {
		return true;
	}
}
