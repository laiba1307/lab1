public class task1 {

	public static <E> void printArray(E[] inputArray) {
		for(int element=inputArray.length-1;element>=0;element--) {
			System.out.println(inputArray[element]);
		}
		
	}jghjjjhhjjjg
	public static void main(String[] args) {
		
		Integer[] intArray = { 1, 2, 3, 4, 6 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
		Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
		
		System.out.println("integerArray :");
		printArray(intArray);
		System.out.println("doubleArray :");
		printArray(doubleArray);
		System.out.println("characterArray :");
		printArray(charArray); 

	}
}
