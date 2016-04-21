package observer;

public class Client {
	
	public static void main(String[] args) {
	    MessageBoard board = new MessageBoard();
	    Student bob = new Student();
	    Student joe = new Student();
	    Student joe1 = new Student();
	    Student joe2 = new Student();
	    board.addObserver(bob);
	    board.addObserver(joe);
	    board.addObserver(joe2);
	    board.addObserver(joe1);
	    board.changeMessage("More Homework!");
	  }

}
