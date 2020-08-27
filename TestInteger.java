import java.util.Random; 
public class TestInteger implements Comparable<TestInteger>{
	private int value;
	private static long counter;

	//Constructor
	public TestInteger(int value, long counter){
		this.value =value;
		this.counter = counter; 
	}

	//Accessors
	public int getValue() { return value; }
    public long getCounter() { return counter; }

    // Mutators
    public void setValue(String newValue) { value = newValue; }
    public void setCounter(String newCounter) { counter = newCounter; }


   	//method compares two TestIntegers based on value
	public int compareTo(TestInteger other) {
		counter++;
		if(this.getValue() < other.getValue()){
			return -1;
		}
		else if(this.value,equals(other.getValue())){
			return 0;
		}
		else{
			return 1;
		}
    }//end compareTo method

}// end of class