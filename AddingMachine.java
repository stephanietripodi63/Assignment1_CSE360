// Stephanie Tripodi
// CSE360 Assignmemt 1


package cse360assignment02;

public class AddingMachine {
  private int total;
  StringBuffer history;
  
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
    history = new StringBuffer("0";)
  }
  
  public int getTotal () {
    return total;
  }
  
  public void add (int value) { //add parameter from total
	  total = total+value;
	  history.append("+"+value);
  }

  public void subtract (int value) { //subtract parameter from total
	  total = total-value;
	  history.append("-"+value);
  }

  public String toString () {
    return history.toString();
  }

  public void clear() { //clears memory
	  return 0;
  }
}