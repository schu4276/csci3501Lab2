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
	public static void main(String[] args){

		quickSort(a,1,a.length);
	}//end main
	public void quickSort(TestInteger[] a, int low, int high){
		if(a[low].compareTo(a[high]) <0){
			int q = partition(a, low, high);
			quickSort(a,low, q-1,);
			quickSort(a,q+1,high);
		}
	}//end quicksort

	//partition modeled after book example on page 171
	public int partition(TestInteger[] a, int low, int high){
		TestInteger pivot = a[high];
		int index = (low -1);
		TestInteger temp = TestInteger(0,0);
		for(int i = low; i< high-1; i++){
			// if curr element is smaller than pivot
			if(a[j].compareTo(pivot) <0){
				index++;
				temp = a[index];
				a[index] = a[j];
				a[j] = temp;
			}
		}
		temp = a[i+1];
		a[i+1] = a[high];
		a[high] = temp;
		return(i+1);
	}//end partition
	public TestInteger[] generateArray(int range, int n){
		TestInteger[] array = new TestInteger[n];
		for(int i =0; i<n; i++){
			Random rand = new Random();
			int randInt = rand.nextInt(range);
			array[i] = new TestInteger(randInt,0);
		}
	}//end generate array method
}//end Lab2