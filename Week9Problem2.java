public class Week9Problem2 {
	public static int Repeat(int arr[], int a) {
		for (int i = 0; i<a; i++) {
			for (int c = i+1; c<a; c++) {
				if (arr[i] == arr[c]) {
					return i;
					}
				}
			}
		return -1;
		}
	
	public static void main(String[] args) {
		
		int arr[] = { 10, 5, 3, 4, 3, 5, 6 };
		int a = arr.length;
		int element = Repeat(arr, a);
		int arrTwo[] = { 6, 10, 5, 4, 9, 120, 4, 6, 10 };
		int b = arrTwo.length;
		int elementTwo = Repeat(arrTwo, b);
		
		if (element == -1) {
			System.out.println("There is no repeating element");
			}
		else {
			System.out.println(arr[element] + " is the first element that repeats of Array 1");
		}
		if (elementTwo == -1) {
			System.out.println("There is no repeating element");
			}
		else {
			System.out.println(arrTwo[elementTwo] + " is the first element that repeats of Array 2");
		}
		
	}
}
