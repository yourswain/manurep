package observer;

import java.util.Observable;

class MessageBoard extends Observable {
  private String message;

  public String getMessage() {
    return message;
  }

  public void changeMessage(String message) {
    this.message = message;
    setChanged();
    notifyObservers(message);
  }

  
}


