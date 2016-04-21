package structural.decorator;

public class SimpleRoom implements Room {
	
	public SimpleRoom(){
		//
	}

	  @Override
	  public String showRoom() {
	    return "Normal Room";
	  }

	}