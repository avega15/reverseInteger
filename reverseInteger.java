//Reversing an integer without using additional heap space
public class reverseInteger{
	public static void main(String[] args) {
		int integer[] ={ 3456, 4621, 984, 1235633};
		
		//Iterate through our method
		for(int i = 0; i < integer.length; i++){
			System.out.println(integer[i] + " reversed is: " + reverse(integer[i]));
		}
	}
	
	
	public static int reverse(int num) {
		int reversed = 0;
    
		//Iterate through every digit in the number
		while(num != 0){
			//This grabs the digit in the ones place of num and moves it to the leftmost place
			reversed = reversed * 10 + num % 10;
			//Removes the item in the ones place
			num = num / 10;
		}

		return reversed;
	}
}

